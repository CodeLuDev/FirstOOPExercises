package service;

import entidad.Cancion;
import java.util.Scanner;

public class CancionService {

    public Cancion conocerTituloYAutor() {

        Scanner read = new Scanner(System.in);
        Cancion c1 = new Cancion();

        System.out.print("Ingrese el titulo de la cancion: ");
        c1.setTitulo(read.nextLine());

        System.out.print("Ingrese el autor de la cancion: ");
        c1.setAutor(read.nextLine());

        return c1;
    }
}
