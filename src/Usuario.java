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


    public void crearNuevoAlbum(String nombreAlbum, int anio, String disquera) {
        Album album = new Album(nombreAlbum , anio , disquera );
        albums.add(album);
    }

    public void aniadirCancion(String titulo, String nombreAlbum){
        for (Album album : albums) {
            if (album.getNombre().equals(nombreAlbum)) { // aqui tenemos el album
                Cancion cancionPorAgregar = repositorio.buscarCancion(titulo);
                if(cancionPorAgregar!= null){
                    album.aniadirCancion(cancionPorAgregar);
                }else{
                    System.out.println("Cancion no encontrada");
                }
            }else{
                System.out.println("Album no encontrado");
            }
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


    private Album encontrarAlbum(String anio) {
        for (Album album : albums) {
            if (album.getAnio() == Integer.parseInt(anio)) {
                return album;
            }
        }
        return null;
    }

 public void listarContenidoDeAlbum(String nombreAlbum){
        for (Album album : albums) {
            if (album.getNombre().equals(nombreAlbum)) {
                album.listarCanciones();
                System.out.println("Duracion total del album: " + album.duracionDelAlbum());
            }else{
                System.out.println("Album no encontrado");
            }
        }
    }

}
