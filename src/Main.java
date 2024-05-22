//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creacion del usuario
        Usuario usuario = new Usuario("Pepito", 18);

        // Historia de usuario 1
        System.out.println("Historia 1 - Crear albumes:");
        usuario.crearNuevoAlbum("Album-Salsa", 2018, "DisqueraPro", "Calimeño");
        usuario.crearNuevoAlbum("Album-Cumbia", 2020, "Tiny", "Sonora Dinamita");
        
        // Historia de usuario 2
        System.out.println("Historia 2 - agregar canciones a un album existente:");
        usuario.aniadirCancion("Salsa", "Album-Salsa");
        usuario.aniadirCancion("Amar", "Album-Salsa");
        usuario.aniadirCancion("Amar", "Album-No-Existente");

        // Historia de usuario 3 
        System.out.println("Historia 3 - Evitar agregar canciones repetidas:");
        usuario.aniadirCancion("Salsa", "Album-Salsa");

        // Historia de usuario 4
        System.out.println("Historia 4 - Mostrar contenido del album por su nombre junto con su duracion:");
        usuario.listarContenidoDeAlbum("Album-Salsa");

        // Historia de usuario 5
        System.out.println("Historia 5 - Busqueda de album por año:");
        usuario.listarAlbumesPorAnio("18");
    }
}