package biblioteca;

public class Usuario
{
    String nombre;
    String id;
    String rol;
    String[] librosPrestados;
    int numLibrosPrestados;

    Usuario(String nombre, String id, String rol)
    {
        this.nombre = nombre;
        this.id = id;
        this.rol = rol;
        this.librosPrestados = new String[5];
        this.numLibrosPrestados = 0;
    }

