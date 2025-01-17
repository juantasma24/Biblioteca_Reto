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
    
    public void reservasAdd(String usuarioId) {
		for (int i = 0; i < reservas.length; i++) {
			if (reservas[i] == null ) 
			{
				reservas[i] = usuarioId;
				 break;
			}
		}
	}
    // Libera la primera reserva en la cola
    void liberarReserva() {
        reservas.poll();
    }
}
