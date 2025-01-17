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

  //Metodos
  public void registrarUsuario(String nombre, String id, String rol) 
  {
        if (numUsuarios < usuarios.length) 
        {
            usuarios[numUsuarios++] = new Usuario(nombre, id, rol);
            System.out.println("Usuario registrado con éxito.");
        }
   }

   public void listarUsuarios() 
  {
        System.out.println("Usuarios registrados:");
        for (int i = 0; i < numUsuarios; i++) 
        {
            System.out.println(usuarios[i].nombre + " (" + usuarios[i].rol + ")");
        }
   }
  
}

