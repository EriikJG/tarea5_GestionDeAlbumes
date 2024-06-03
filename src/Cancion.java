import java.time.Duration;

/**
 * Representa una canción con un título, duración y artista.
 */
public class Cancion {
    private final String titulo;
    private final Duration duracion;
    private final String artista;

    /**
     * Crea una nueva instancia de Cancion.
     *
     * @param titulo el título de la canción
     * @param duracion la duración de la canción
     * @param artista el artista de la canción
     */
    public Cancion(String titulo, Duration duracion, String artista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
    }

    /**
     * Imprime un mensaje indicando que la canción se está reproduciendo, junto con el título de la canción.
     */
    public void reproducir() {
        System.out.println("Reproduciendo Cancion..." + this.titulo);
    }

    /**
     * Obtiene el título de la canción.
     *
     * @return el título de la canción como una cadena
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la duración de la canción.
     *
     * @return la duración de la canción como un objeto Duration
     */
    public Duration getDuracion() {
        return duracion;
    }
}
