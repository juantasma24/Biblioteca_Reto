package prueba;

import java.util.Date;

public class Prestamo {
    String idPrestamo;// identificador unico de prestamo
    String libroId; // identificador del lbro prestado
    String usuarioId; // identificador del usuario que coge prestado el libro
    Date fechaPrestamo; //fecha cuando se realiza el prestamo
    Date fechaDevolucion; // fecha de su devolucion, hasta que no lo devuelva devolvera null.
    
 Prestamo(String idPrestamo, String libroId, String usuarioId) {
        this.idPrestamo = idPrestamo;
        this.libroId = libroId;
        this.usuarioId = usuarioId;
        this.fechaPrestamo = new Date();
        this.fechaDevolucion = null;

    } 
  void marcarDevolucion() {

        this.fechaDevolucion = new Date(); // aqui marcara cuando ha sido la fecha de devolucion.
    }
}



