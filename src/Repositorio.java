import java.util.ArrayList;

public class Repositorio {

    ArrayList<Cancion> listaCanciones;

    public Repositorio() {
        listaCanciones = new ArrayList<Cancion>();
        this.poblarRepositorio();

    }


    /*
    public void setCancion(Cancion cancion) {
        listaCanciones.add(cancion);
    }
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

    public void poblarRepositorio(){
        Cancion cancion = new Cancion("Salsa" , 3.98 , "Luis-Miguel" );
        Cancion cancion2 = new Cancion("Amar" , 3.98 , "JOSE" );
        Cancion cancion3 = new Cancion("Alv" , 3.98 , "PEPE" );
        Cancion cancion4 = new Cancion("Salsa" , 3.98 , "PEDRO" );

        listaCanciones.add(cancion);
        listaCanciones.add(cancion2);
        listaCanciones.add(cancion3);
        listaCanciones.add(cancion4);
    }
}
