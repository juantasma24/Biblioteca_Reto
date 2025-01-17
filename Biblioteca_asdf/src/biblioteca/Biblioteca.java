package biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    List<Usuario> usuarios;
    List<Libro> libros;
    List<Prestamos> prestamos;
    List<Reserva> reservas;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Método para registrar un nuevo usuario
    public void registrarUsuario(String nombre, String id, String rol) {
        usuarios.add(new Usuario(nombre, id, rol));
        System.out.println("Usuario registrado con éxito.");
    }

    // Método para listar los usuarios registrados
    public void listarUsuarios() {
        System.out.println("Usuarios registrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.nombre + " (" + usuario.rol + ")");
        }
    }

    // Método para registrar un nuevo libro
    public void registrarLibro(String titulo, String autor, String id, int anioPublicacion, int copiasDisponibles) {
        libros.add(new Libro(titulo, autor, id, anioPublicacion, copiasDisponibles));
        System.out.println("Libro registrado con éxito.");
    }

    // Método para listar los libros disponibles
    public void listarLibros() {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            System.out.println(libro.titulo + " de " + libro.autor + " (" + libro.copiasDisponibles + " copias disponibles)");
        }
    }

    // Método para realizar un préstamo
    public void realizarPrestamo(String usuarioId, String libroId) {
        Usuario usuario = buscarUsuarioPorId(usuarioId);
        Libro libro = buscarLibroPorId(libroId);
        if (usuario != null && libro != null && libro.copiasDisponibles > 0 && usuario.puedePrestar()) {
            Prestamos prestamo = new Prestamos("P" + (prestamos.size() + 1), libroId, usuarioId);
            prestamos.add(prestamo);
            usuario.librosPrestados.add(libroId);
            libro.copiasDisponibles--;
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No se pudo realizar el préstamo.");
        }
    }

    // Método para marcar la devolución de un libro
    public void devolverLibro(String usuarioId, String libroId) {
        Prestamos prestamo = buscarPrestamoPorUsuarioYLibro(usuarioId, libroId);
        if (prestamo != null) {
            prestamo.marcarDevolucion();
            Libro libro = buscarLibroPorId(libroId);
            libro.copiasDisponibles++;
            Usuario usuario = buscarUsuarioPorId(usuarioId);
            usuario.librosPrestados.remove(libroId);
            System.out.println("Devolución realizada con éxito.");
 //           if (!libro.reservas.isEmpty()) {
//                System.out.println("El libro tiene reservas. Notificando al próximo usuario.");
//                libro.liberarReserva();
 //           }
 //       } else {
 //           System.out.println("No se encontró el préstamo.");
       }
   }

    // Búsqueda de usuario por ID
    private Usuario buscarUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.id.equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    // Búsqueda de libro por ID
    private Libro buscarLibroPorId(String id) {
        for (Libro libro : libros) {
            if (libro.id.equals(id)) {
                return libro;
            }
        }
        return null;
    }

    // Búsqueda de préstamo por usuario y libro
    private Prestamos buscarPrestamoPorUsuarioYLibro(String usuarioId, String libroId) {
        for (Prestamos prestamo : prestamos) {
            if (prestamo.usuarioId.equals(usuarioId) && prestamo.libroId.equals(libroId) && prestamo.fechaDevolucion == null) {
                return prestamo;
            }
        }
        return null;
    }

    // Método principal para ejecutar el menú interactivo
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú principal:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Registrar libro");
            System.out.println("4. Listar libros");
            System.out.println("5. Realizar préstamo");
            System.out.println("6. Devolver libro");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Rol (estudiante/profesor/invitado): ");
                    String rol = scanner.nextLine();
                    biblioteca.registrarUsuario(nombre, id, rol);
                    System.out.println();
                    break;
                case 2:
                    biblioteca.listarUsuarios();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ID: ");
                    String libroId = scanner.nextLine();
                    System.out.print("Año de publicación: ");
                    int anioPublicacion = scanner.nextInt();
                    System.out.print("Copias disponibles: ");
                    int copiasDisponibles = scanner.nextInt();
                    biblioteca.registrarLibro(titulo, autor, libroId, anioPublicacion, copiasDisponibles);
                    System.out.println();
                    break;
                case 4:
                    biblioteca.listarLibros();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("ID de usuario: ");
                    String userIdPrestamo = scanner.nextLine();
                    System.out.print("ID de libro: ");
                    String libroIdPrestamo = scanner.nextLine();
                    biblioteca.realizarPrestamo(userIdPrestamo, libroIdPrestamo);
                    System.out.println();
                    break;
                case 6:
                    System.out.print("ID de usuario: ");
                    String userIdDevolucion = scanner.nextLine();
                    System.out.print("ID de libro: ");
                    String libroIdDevolucion = scanner.nextLine();
                    biblioteca.devolverLibro(userIdDevolucion, libroIdDevolucion);
                    System.out.println();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
        System.out.println("Sistema cerrado.");
    }
}

