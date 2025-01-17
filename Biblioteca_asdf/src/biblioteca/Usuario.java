package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario
{
    String nombre; // Nombre del usuario
    String id; // Identificador único del usuario
    String rol; // Rol del usuario (estudiante, profesor, invitado)
    List<String> librosPrestados; // Lista de IDs de libros que el usuario tiene prestados

    Usuario(String nombre, String id, String rol)
    {
        this.nombre = nombre;
        this.id = id;
        this.rol = rol;
        this.librosPrestados = new ArrayList<>();
    }

    // Verifica si el usuario puede realizar más préstamos basado en su rol
    boolean puedePrestar()
    {
        int maxPrestamos = switch (rol.toLowerCase())
        {
            case "estudiante" -> 3;
            case "profesor" -> 5;
            case "invitado" -> 1;
            default -> 0;
        };
        return librosPrestados.size() < maxPrestamos;
    }
}
//Prueba de commit -JuanDiego-
