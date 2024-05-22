import java.sql.Array;
import java.util.ArrayList;

public class Usuario {
    private final String Nombre;
    private final int Edad;
    private ArrayList<Album> albums;
    private Repositorio repositorio;

    public Usuario(String Nombre, int edad) {
        albums = new ArrayList<Album>();
        this.Nombre = Nombre;
        this.Edad = edad;
        repositorio = new Repositorio();
    }


    public void crearNuevoAlbum(String nombreAlbum, int anio, String disquera, String artista) {
        Album album = new Album(nombreAlbum , anio , disquera, artista );
        albums.add(album);
    }

    public void aniadirCancion(String titulo, String nombreAlbum) {
        boolean albumEncontrado = false;
        for (Album album : albums) {
            if (album.getNombre().equals(nombreAlbum)) {
                albumEncontrado = true;
                Cancion cancionPorAgregar = repositorio.buscarCancion(titulo);
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
        for (Album album : albums) {
            if (album.getAnio() == Integer.parseInt(anio)) {
                System.out.println(album.toString());
            } else {
                System.out.println("Album no encontrado");
            }
        }
    }


 public void listarContenidoDeAlbum(String nombreAlbum){
        for (Album album : albums) {
            if (album.getNombre().equals(nombreAlbum)) {
                System.out.println("Album: " + album.getNombre());
                album.listarCanciones();
                System.out.println("Duracion total del album: " + album.duracionDelAlbum());
            }else{
                System.out.println("Album no encontrado");
            }
        }
    }

}
