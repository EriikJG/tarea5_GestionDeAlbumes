//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creacion del usuario
        //Usuario usuario = new Usuario("Pepito", 18);
        Repositorio repositorioMusical = new Repositorio();
        // Historia de usuario 1
        System.out.println("******Historia 1 - Crear albumes:******");
        repositorioMusical.crearNuevoAlbum("Album-Salsa", 2018, "DisqueraPro", "Calimeño");
        repositorioMusical.crearNuevoAlbum("Album-Cumbia", 2010, "Tiny", "Sonora Dinamita");
        
        // Historia de usuario 2
        System.out.println("******Historia 2 - agregar canciones a un album existente:******");
        repositorioMusical.aniadirCancion("Salsa", "Album-Salsa");
        repositorioMusical.aniadirCancion("Amar", "Album-Salsa");
        repositorioMusical.aniadirCancion("Amar", "Album-No-Existente");

        // Historia de usuario 3 
        System.out.println("******Historia 3 - Evitar agregar canciones repetidas:******");
        repositorioMusical.aniadirCancion("Salsa", "Album-Salsa");

        // Historia de usuario 4
        System.out.println("******Historia 4 - Mostrar contenido del album por su nombre junto con su duracion:******");
        repositorioMusical.listarContenidoDeAlbum("Album-Salsa");

        // Historia de usuario 5
        System.out.println("******Historia 5 - Busqueda de album por año:******");
        repositorioMusical.listarAlbumesPorAnio("2024");
        repositorioMusical.listarAlbumesPorAnio("2018");
    }
}