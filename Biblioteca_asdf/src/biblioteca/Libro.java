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




  
}
