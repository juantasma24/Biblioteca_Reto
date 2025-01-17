package biblioteca;

import java.util.LinkedList;
import java.util.Queue;

public class Libro {
    String titulo; // Título del libro
    String autor; // Autor del libro
    String id; // Identificador único del libro
    int anioPublicacion; // Año de publicación del libro
    int copiasDisponibles; // Número de copias disponibles del libro
    Queue<String> reservas; // Cola de reservas para el libro

    Libro(String titulo, String autor, String id, int anioPublicacion, int copiasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.anioPublicacion = anioPublicacion;
        this.copiasDisponibles = copiasDisponibles;
        this.reservas = new LinkedList<>();
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
