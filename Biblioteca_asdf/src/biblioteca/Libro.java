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
        this.anioPublicacion = añoPublicacion;
        this.copiasDisponibles = copiasDisponibles;
        this.reservas = new String[10];
        this.numReservas = 0;
    }
    
     void registrarReserva(String usuarioId) {
        if (numReservas < reservas.length) {
            reservas[numReservas] = usuarioId;
            numReservas++;
        } else {
            System.out.println("No se pueden agregar mas reservas. Capacidad maxima alcanzada.");
        }
    }
    // Libera la primera reserva en la cola
    void liberarReserva() {
        
    }
}
