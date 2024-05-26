import java.time.Duration;
public class Cancion {
    private final String titulo;
    private final Duration duracion;
    private final String artista;

    public Cancion(String titulo, Duration duracion, String artista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
    }

    /**
     * Prints a message indicating that the song is being played, along with the title of the song.
     *
     * @param  None
     * @return void
     */
    public void reproducir() {
        System.out.println("Reproduciendo Cancion..." + this.titulo);
    }

    /**
     * Retrieves the title of the object.
     *
     * @param  None
     * @return the title of the object as a string
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retrieves the duration of the object.
     *
     * @param  None
     * @return the duration of the object as a double value
     */
    public Duration getDuracion() {
        return duracion;
    }

    
}
