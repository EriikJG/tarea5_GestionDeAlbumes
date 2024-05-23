import java.util.ArrayList;

public class Repositorio {

    ArrayList<Cancion> listaCanciones;
    ArrayList<Album> listaAlbumes;

    public Repositorio() {
        listaCanciones = new ArrayList<Cancion>();
        listaAlbumes = new ArrayList<Album>();
        this.poblarRepositorio();
    }

    public void crearNuevoAlbum(String nombreAlbum, int anio, String disquera, String artista) {
        Album album = new Album(nombreAlbum, anio, disquera, artista);
        listaAlbumes.add(album);
        System.out.println("Album: "+album.getNombre()+". Creado exitosamente");
    }

    public void aniadirCancion(String titulo, String nombreAlbum) {
        boolean albumEncontrado = false;
        for (Album album : listaAlbumes) {
            if (album.getNombre().equals(nombreAlbum)) {
                albumEncontrado = true;
                Cancion cancionPorAgregar = buscarCancion(titulo);
                if (cancionPorAgregar != null) {
                    album.aniadirCancion(cancionPorAgregar);
                } else {
                    System.out.println("Cancion no encontrada en el repositorio");
                }
                break;
            }
        }
        if (!albumEncontrado) {
            System.out.println("Cancion no agregada, Album no existente");
        }
    }
    
    public void listarAlbumesPorAnio(String anio) {
        boolean encontrado = false;
        for (Album album : listaAlbumes) {
            if (album.getAnio() == Integer.parseInt(anio)) {
                System.out.println("Album Encontrado:");
                System.out.println(album.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Album no encontrado");
        }
    }
    

    public void listarContenidoDeAlbum(String nombreAlbum) {
        boolean encontrado = false;
        for (Album album : listaAlbumes) {
            if (album.getNombre().equals(nombreAlbum)) {
                System.out.println("Album: " + album.getNombre());
                album.listarCanciones();
                System.out.println("Duracion total del album: " + album.duracionDelAlbum());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Album no encontrado");
        }
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
