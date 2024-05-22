import java.util.ArrayList;

public class Repositorio {

    ArrayList<Cancion> listaCanciones;

    public Repositorio() {
        listaCanciones = new ArrayList<Cancion>();
        this.poblarRepositorio();

    }

    /**
     * Searches for a song in the list of songs and returns it if found.
     *
     * @param  titulo  the title of the song to search for
     * @return         the song with the specified title, or null if not found
     */
    public Cancion buscarCancion(String titulo) {
        {
            for (Cancion cancion : listaCanciones) {
                if (cancion.getTitulo().equals(titulo)) {
                    return cancion;
                }
            }
            return null;
        }

    }

    /**
     * Populates the repository with sample songs.
     *
     * This function creates four instances of the Cancion class with different
     * titles, durations, and artists, and adds them to the listaCanciones list.
     *
     * @param  None
     * @return None
     */
    public void poblarRepositorio(){
        Cancion cancion = new Cancion("Salsa" , 3.98 , "Luis-Miguel" );
        Cancion cancion2 = new Cancion("Amar" , 3.98 , "JOSE" );
        Cancion cancion3 = new Cancion("Depecho" , 3.98 , "PEPE" );
        Cancion cancion4 = new Cancion("Salsa" , 3.98 , "PEDRO" );

        listaCanciones.add(cancion);
        listaCanciones.add(cancion2);
        listaCanciones.add(cancion3);
        listaCanciones.add(cancion4);
    }
}
