package biblioteca;

import java.util.Scanner;

public class Biblioteca 
{
  //Atributos
  Usuario[] usuarios;
  Libro[] libros;
  Prestamo[] prestamos;
  Reserva[] reservas;
  int numUsuarios;
  int numLibros;
  int numPrestamos;
  int numReservas;

  //Constructor
  public Biblioteca() 
  {
        this.usuarios = new Usuario[100];
        this.libros = new Libro[100];
        this.prestamos = new Prestamo[100];
        this.reservas = new Reserva[100];
        this.numUsuarios = 0;
        this.numLibros = 0;
        this.numPrestamos = 0;
        this.numReservas = 0;
    }
  
}

