//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Usuario usuario = new Usuario("Pepito" , 18);
        //El usuario crea un nuevo album
        usuario.crearNuevoAlbum("Album-Salsa" , 18 , "DisqueraPro");

        //flujo
         //usuario.buscarCancion("Salsa");


        //Historia de usuario 3
        usuario.aniadirCancion("Salsa","Album-Salsa");
        usuario.aniadirCancion("Salsa","Album-Salsa");

         //Historia de usuario 4
         usuario.listarContenidoDeAlbum("Album-Salsa");
         //Historia de usuario 5
         usuario.listarAlbumesPorAnio( "18" );
    }
}