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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void listarCanciones() {
        for (Cancion cancion : canciones) {
            System.out.println(cancion.getTitulo());
        }
    }

    public double duracionDelAlbum(){
        double duracion = 0;
        for (Cancion cancion : canciones) {
            duracion += cancion.getDuracion();
        }
        return duracion;
    }


    public void aniadirCancion(Cancion cancion) {
        if (verificarCancionRepetida(cancion)) {
            System.out.println("La cancion ya existe en el album");
        }else{
            canciones.add(cancion);
        }

    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString(){
        String datosDelAlbum = "Nombre: " + this.nombre+ " Año: "+ this.anio+ " Disquera: "+ this.disquera;
        return datosDelAlbum;
    }


    public ArrayList<Cancion> getCanciones() {
        return (ArrayList<Cancion>) canciones;
    }

    public boolean verificarCancionRepetida(Cancion cancion){
        return canciones.contains(cancion);
    }
}