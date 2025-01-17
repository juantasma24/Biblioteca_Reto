package prueba;

import java.util.Date;

public class Prestamo {
    String idPrestamo;// identificador unico de prestamo
    String libroId; // identificador del lbro prestado
    String usuarioId; // identificador del usuario que coge prestado el libro
    Date fechaPrestamo; //fecha cuando se realiza el prestamo
    Date fechaDevolucion; // fecha de su devolucion, hasta que no lo devuelva devolvera null.


