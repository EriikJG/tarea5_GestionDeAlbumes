import java.time.Duration;
import java.util.ArrayList;

/**
 * Clase que representa un repositorio de canciones y álbumes musicales.
 */
public class Repositorio {

    ArrayList<Cancion> listaCanciones;
    ArrayList<Album> listaAlbumes;

    /**
     * Crea una nueva instancia de Repositorio y pobla el repositorio con canciones de ejemplo.
     */
    public Repositorio() {
        listaCanciones = new ArrayList<Cancion>();
        listaAlbumes = new ArrayList<Album>();
        this.poblarRepositorio();
    }

    /**
     * Crea un nuevo álbum y lo agrega a la lista de álbumes.
     *
     * @param nombreAlbum el nombre del álbum a crear
     * @param anio el año de lanzamiento del álbum
     * @param disquera la disquera del álbum
     * @param artista el artista del álbum
     */
    public void crearNuevoAlbum(String nombreAlbum, int anio, String disquera, String artista) {
        Album album = new Album(nombreAlbum, anio, disquera, artista);
        listaAlbumes.add(album);
        System.out.println("Álbum: " + album.getNombre() + ". Creado exitosamente");
    }

    /**
     * Agrega una canción a un álbum existente en el repositorio.
     *
     * @param titulo el título de la canción a agregar
     * @param nombreAlbum el nombre del álbum al que se agregará la canción
     */
    public void aniadirCancion(String titulo, String nombreAlbum) {
        boolean albumEncontrado = false;
        for (Album album : listaAlbumes) {
            if (album.getNombre().equals(nombreAlbum)) {
                albumEncontrado = true;
                Cancion cancionPorAgregar = buscarCancion(titulo);
                if (cancionPorAgregar != null) {
                    album.aniadirCancion(cancionPorAgregar);
                } else {
                    System.out.println("Canción no encontrada en el repositorio");
                }
                break;
            }
        }
        if (!albumEncontrado) {
            System.out.println("Canción no agregada, álbum no existente");
        }
    }

    /**
     * Lista los álbumes que fueron lanzados en un año específico.
     *
     * @param anio el año para el cual se desea listar los álbumes
     */
    public void listarAlbumesPorAnio(String anio) {
        boolean encontrado = false;
        for (Album album : listaAlbumes) {
            if (album.getAnio() == Integer.parseInt(anio)) {
                System.out.println("Álbum Encontrado:");
                System.out.println(album.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Álbum no encontrado");
        }
    }

    /**
     * Lista el contenido de un álbum por su nombre junto con su duración total.
     *
     * @param nombreAlbum el nombre del álbum del cual se desea listar el contenido
     */
    public void listarContenidoDeAlbum(String nombreAlbum) {
        boolean encontrado = false;
        for (Album album : listaAlbumes) {
            if (album.getNombre().equals(nombreAlbum)) {
                System.out.println("Álbum: " + album.getNombre());
                album.listarCanciones();
                System.out.println("Duración total del álbum: " + album.getDuracionTotalFormato());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Álbum no encontrado");
        }
    }

    /**
     * Busca una canción en la lista de canciones y la devuelve si se encuentra.
     *
     * @param titulo el título de la canción que se desea buscar
     * @return la canción con el título especificado, o null si no se encuentra
     */
    public Cancion buscarCancion(String titulo) {
        for (Cancion cancion : listaCanciones) {
            if (cancion.getTitulo().equals(titulo)) {
                return cancion;
            }
        }
        return null;
    }

    /**
     * Puebla el repositorio con canciones de ejemplo.
     *
     * Este método crea cuatro instancias de la clase Cancion con diferentes
     * títulos, duraciones y artistas, y las agrega a la listaCanciones.
     */

        public void poblarRepositorio(){
        Cancion cancion = new Cancion("Salsa" , Duration.ofMinutes(3).plusSeconds(45) , "Luis-Miguel" );
        Cancion cancion2 = new Cancion("Amar" , Duration.ofMinutes(2).plusSeconds(22) , "JOSE" );
        Cancion cancion3 = new Cancion("Depecho" , Duration.ofMinutes(4).plusSeconds(13) , "PEPE" );
        Cancion cancion4 = new Cancion("Salsa" , Duration.ofMinutes(1).plusSeconds(52) , "PEDRO" );

        listaCanciones.add(cancion);
        listaCanciones.add(cancion2);
        listaCanciones.add(cancion3);
        listaCanciones.add(cancion4);
    }
}
