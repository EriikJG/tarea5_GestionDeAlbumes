public class Cancion {
    private final String titulo;
    private final double duracion;
    private final String artista;

    public Cancion(String titulo, double duracion, String artista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
    }

    public void reproducir() {
        System.out.println("Reproduciendo Cancion..." + this.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }
}
