package biblioteca;

public class Libro {
  String titulo;
    String autor;
    String id;
    int añoPublicacion;
    int copiasDisponibles;
    String[] reservas;
    int numReservas;

 Libro(String titulo, String autor, String id, int añoPublicacion, int copiasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.añoPublicacion = añoPublicacion;
        this.copiasDisponibles = copiasDisponibles;
        this.reservas = new String[10]; 
        this.numReservas = 0;
    }
void registrarReserva(String usuarioId) {
        if (numReservas < reservas.length) {
            reservas[numReservas++] = usuarioId;
        }

    }
String liberarReserva() {
        if (numReservas > 0) {
            String usuarioId = reservas[0];
            System.arraycopy(reservas, 1, reservas, 0, --numReservas);
            reservas[numReservas] = null;
            return usuarioId;
        }
        return null;
    }
  
 static Libro buscarPorId(Libro[] libros, String id) {
        for (Libro libro : libros) {
            if (libro != null && libro.id.equals(id)) {
                return libro;
            }
        }
        return null;
    }

}

  
}
