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
 
    void registrarReserva(String usuarioId) {
        if (numReservas < reservas.length) {
            reservas[numReservas] = usuarioId;
            numReservas++;
        } else {
            System.out.println("No se pueden agregar más reservas. Capacidad máxima alcanzada.");
        }
    }

    void liberarReserva() {
        if (numReservas > 0) {
            System.out.println("Reserva liberada: " + reservas[0]);
            for (int i = 1; i < numReservas; i++) {
                reservas[i - 1] = reservas[i];
            }
            reservas[numReservas - 1] = null;
            numReservas--;
        } else {
            System.out.println("No hay reservas para liberar.");
        }
    }

    void mostrarReservas() {
        System.out.print("Reservas actuales: ");
        if (numReservas == 0) {
            System.out.println("No hay reservas.");
        } else {
            for (int i = 0; i < numReservas; i++) {
                System.out.print(reservas[i] + " ");
            }
            System.out.println();
        }
    }
    
    }
}
