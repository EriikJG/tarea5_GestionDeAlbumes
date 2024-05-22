import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nombre;
    private int anio;
    private String disquera;
    private List<Cancion> canciones;

    public Album(String nombre, int anio, String disquera) {
        this.nombre = nombre;
        this.anio = anio;
        this.disquera = disquera;
        this.canciones = new ArrayList<>();
    }

    /**
     * Retrieves the name of the album.
     *
     * @return the name of the album as a String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre of the object.
     *
     * @param  nombre  the new nombre to be set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Prints the titles of all the songs in the album.
     *
     * This function iterates over each song in the album and prints its title.
     * It does not return any value.
     */
    public void listarCanciones() {
        for (Cancion cancion : canciones) {
            System.out.println(cancion.getTitulo());
        }
    }

    /**
     * Calculates the total duration of the album by summing the durations of all the songs in the album.
     *
     * @return the total duration of the album as a double value
     */
    public double duracionDelAlbum(){
        double duracion = 0;
        for (Cancion cancion : canciones) {
            duracion += cancion.getDuracion();
        }
        return duracion;
    }


    /**
     * Adds a song to the album.
     *
     * @param  cancion  the song to be added
     * @return          void
     */
    public void aniadirCancion(Cancion cancion) {
        if (verificarCancionRepetida(cancion)) {
            System.out.println("La cancion ya existe en el album");
        }else{
            canciones.add(cancion);
        }

    }

    /**
     * Retrieves the year of the album.
     *
     * @return the year of the album as an integer
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Returns a string representation of the album object, including its name, year, and record label.
     *
     * @return a string containing the album's name, year, and record label
     */
    @Override
    public String toString(){
        String datosDelAlbum = "Nombre: " + this.nombre+ " Año: "+ this.anio+ " Disquera: "+ this.disquera;
        return datosDelAlbum;
    }


    /**
     * Retrieves the list of songs in the album.
     *
     * @param  None
     * @return  an ArrayList of Cancion objects representing the songs in the album
     */
    public ArrayList<Cancion> getCanciones() {
        return (ArrayList<Cancion>) canciones;
    }

    /**
     * Checks if a given song is already present in the album's list of songs.
     *
     * @param  cancion  the song to be checked
     * @return          true if the song is already in the list, false otherwise
     */
    public boolean verificarCancionRepetida(Cancion cancion){
        return canciones.contains(cancion);
    }
}