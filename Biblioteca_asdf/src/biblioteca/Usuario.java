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
boolean puedePrestar()
    {
        int maxPrestamos = rol.equalsIgnoreCase("estudiante") ? 3 :
                           rol.equalsIgnoreCase("profesor") ? 5 :
                           rol.equalsIgnoreCase("invitado") ? 1 : 0;
        return numLibrosPrestados < maxPrestamos;
    }

    void agregarPrestamo(String libroId)
    {
        if (numLibrosPrestados < librosPrestados.length)
        {
            librosPrestados[numLibrosPrestados++] = libroId;
        }
    }

    void devolverPrestamo(String libroId)
    {
        for (int i = 0; i < numLibrosPrestados; i++)
        {
            if (librosPrestados[i].equals(libroId))
            {
                librosPrestados[i] = librosPrestados[--numLibrosPrestados];
                librosPrestados[numLibrosPrestados] = null;
                break;
            }
        }
    }
static Usuario buscarPorId(Usuario[] usuarios, String id)
    {
        for (Usuario usuario : usuarios)
        {
            if (usuario != null && usuario.id.equals(id))
            {
                return usuario;
            }
        }
        return null;
    }
}
