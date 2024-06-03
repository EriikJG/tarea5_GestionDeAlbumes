/**
 * Clase principal para ejecutar el programa de gestión de álbumes musicales.
 */
public class Main {
    /**
     * Método principal que ejecuta el programa de gestión de álbumes.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Creación del repositorio musical
        Repositorio repositorioMusical = new Repositorio();

        // Historia de usuario 1
        System.out.println("******Historia 1 - Crear álbumes:******");
        repositorioMusical.crearNuevoAlbum("Album-Salsa", 2018, "DisqueraPro", "Calimeño");
        repositorioMusical.crearNuevoAlbum("Album-Cumbia", 2010, "Tiny", "Sonora Dinamita");

        // Historia de usuario 2
        System.out.println("******Historia 2 - Agregar canciones a un álbum existente:******");
        repositorioMusical.aniadirCancion("Salsa", "Album-Salsa");
        repositorioMusical.aniadirCancion("Amar", "Album-Salsa");
        repositorioMusical.aniadirCancion("Amar", "Album-No-Existente");

        // Historia de usuario 3
        System.out.println("******Historia 3 - Evitar agregar canciones repetidas:******");
        repositorioMusical.aniadirCancion("Salsa", "Album-Salsa");

        // Historia de usuario 4
        System.out.println("******Historia 4 - Mostrar contenido del álbum por su nombre junto con su duración:******");
        repositorioMusical.listarContenidoDeAlbum("Album-Salsa");

        // Historia de usuario 5
        System.out.println("******Historia 5 - Búsqueda de álbum por año:******");
        repositorioMusical.listarAlbumesPorAnio("2024");
        repositorioMusical.listarAlbumesPorAnio("2018");
    }
}
