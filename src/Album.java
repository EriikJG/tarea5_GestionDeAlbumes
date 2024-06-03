import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un álbum de música con un nombre, año, disquera, artista y una lista de canciones.
 */
public class Album {

    private String nombre;
    private int anio;
    private String disquera;
    private String artista;
    private List<Cancion> canciones;

    /**
     * Crea una nueva instancia de Album.
     *
     * @param nombre el nombre del álbum
     * @param anio el año de lanzamiento del álbum
     * @param disquera la disquera del álbum
     * @param artista el artista del álbum
     */
    public Album(String nombre, int anio, String disquera, String artista) {
        this.nombre = nombre;
        this.anio = anio;
        this.disquera = disquera;
        this.artista = artista;
        this.canciones = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del álbum.
     *
     * @return el nombre del álbum como String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del álbum.
     *
     * @param nombre el nuevo nombre del álbum
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Imprime los títulos de todas las canciones del álbum.
     */
    public void listarCanciones() {
        System.out.println("Canciones del álbum: ");
        for (Cancion cancion : canciones) {
            System.out.println(cancion.getTitulo());
        }
    }

    /**
     * Calcula la duración total del álbum sumando las duraciones de todas las canciones del álbum.
     *
     * @return la duración total del álbum como un objeto Duration
     */
    public Duration duracionDelAlbum() {
        Duration duracionTotal = Duration.ZERO;
        for (Cancion cancion : canciones) {
            duracionTotal = duracionTotal.plus(cancion.getDuracion());
        }
        return duracionTotal;
    }

    /**
     * Obtiene la duración total del álbum en formato de minutos y segundos.
     *
     * @return una cadena que representa la duración total del álbum en el formato "mm:ss"
     */
    public String getDuracionTotalFormato() {
        Duration duracionTotal = duracionDelAlbum();
        long minutos = duracionTotal.toMinutes();
        long segundos = duracionTotal.getSeconds() % 60;
        return String.format("%d:%02d", minutos, segundos);
    }

    /**
     * Agrega una canción al álbum.
     *
     * @param cancion la canción a agregar
     */
    public void aniadirCancion(Cancion cancion) {
        if (verificarCancionRepetida(cancion)) {
            System.out.println("La canción ya existe en el álbum");
        } else {
            System.out.println("Se agregó la canción: " + cancion.getTitulo() + ", al álbum: " + this.getNombre());
            canciones.add(cancion);
        }
    }

    /**
     * Obtiene el año del álbum.
     *
     * @return el año del álbum como un entero
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Devuelve una representación en cadena del objeto álbum, incluyendo su nombre, año y disquera.
     *
     * @return una cadena que contiene el nombre, año y disquera del álbum
     */
    @Override
    public String toString() {
        String datosDelAlbum = "Nombre: " + this.nombre + "\nAño: " + this.anio + "\nDisquera: " + this.disquera + "\nArtista: " + this.artista;
        return datosDelAlbum;
    }

    /**
     * Obtiene la lista de canciones del álbum.
     *
     * @return una lista de objetos Cancion que representan las canciones del álbum
     */
    public ArrayList<Cancion> getCanciones() {
        return (ArrayList<Cancion>) canciones;
    }

    /**
     * Verifica si una canción dada ya está presente en la lista de canciones del álbum.
     *
     * @param cancion la canción a verificar
     * @return true si la canción ya está en la lista, false en caso contrario
     */
    public boolean verificarCancionRepetida(Cancion cancion) {
        return canciones.contains(cancion);
    }
}
