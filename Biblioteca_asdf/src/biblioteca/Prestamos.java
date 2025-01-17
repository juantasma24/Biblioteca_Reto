package biblioteca;

import java.util.Date;

public class Prestamos {
    String idPrestamo; // Identificador único del préstamo
    String libroId; // ID del libro prestado
    String usuarioId; // ID del usuario que realizó el préstamo
    Date fechaPrestamo; // Fecha en la que se realizó el préstamo
    Date fechaDevolucion; // Fecha en la que se devolvió el libro (puede ser null si no se ha devuelto)

    Prestamos(String idPrestamo, String libroId, String usuarioId) {
        this.idPrestamo = idPrestamo;
        this.libroId = libroId;
        this.usuarioId = usuarioId;
        this.fechaPrestamo = new Date(); // Se establece la fecha actual como fecha del préstamo
        this.fechaDevolucion = null; // Inicialmente, no hay fecha de devolución
    }

    // Marca el préstamo como devuelto y establece la fecha de devolución
    void marcarDevolucion() {
        this.fechaDevolucion = new Date();
    }
}
// creamos una clase para prestamos y le ponemos un id unico para prestamo asi como si fuera un DNI
// Le ponemos stringa las clases, date para fecha y fecha devo.
// la fecha de prestamo es  la hora de cuando se realiza el prestamo.
// la fecha de devolucion se creara en el momento de su devolucion.
//algunos campos se mantendran null mientras no se haya generado una devolucion.
