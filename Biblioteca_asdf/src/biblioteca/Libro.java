package biblioteca;

public class Libro {
     String titulo;
    String autor;
    String id;
    int anioPublicacion;
    int copiasDisponibles;
    String[] reservas;
    int numReservas;

    Libro(String titulo, String autor, String id, int anioPublicacion, int copiasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.anioPublicacion = anioPublicacion;
        this.copiasDisponibles = copiasDisponibles;
        this.reservas = new String[10];
        this.numReservas = 0;
    }

    // Añade un usuario a la lista de reservas del libro
    void registrarReserva(String usuarioId) {
        reservas.add(usuarioId);
    }

    // Libera la primera reserva en la cola
    void liberarReserva() {
        reservas.poll();
    }
}
