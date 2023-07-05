// Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
//definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
//vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
//además definir los métodos getters y setters correspondientes.

import entidad.Cancion;
import service.CancionService;

public class Main {
    public static void main(String[] args) {

        Cancion cancion;
        CancionService cs = new CancionService();

        cancion = cs.conocerTituloYAutor();

        System.out.print("\nEl titulo de la cancion es: "+cancion.getTitulo()+
                "\nEl autor de la cancion es: "+cancion.getAutor());

    }
}