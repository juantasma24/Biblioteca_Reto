package biblioteca;

import java.util.Date;

public class Reserva {
    String idReserva; // Identificador único de la reserva
    String usuarioId; // ID del usuario que realizó la reserva
    String libroId; // ID del libro reservado
    Date fechaReserva; // Fecha en la que se realizó la reserva

    Reserva(String idReserva, String usuarioId, String libroId) {
        this.idReserva = idReserva;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
        this.fechaReserva = new Date(); // Se establece la fecha actual como fecha de la reserva
    }
}
