package service;

import entidad.Puntos;
import java.util.Scanner;

public class PuntosService {

    public Puntos crearPuntos(Puntos puntos) {

        Scanner read = new Scanner(System.in);
        Puntos p = new Puntos();

        System.out.println("Ingrese las cooordenadas del Punto 1");
        System.out.print("Coordenada x: ");
        p.setX1(read.nextInt());
        System.out.print("Coordenada y: ");
        p.setY1(read.nextInt());

        System.out.println("\nIngrese las cooordenadas del Punto 2");
        System.out.print("Coordenada x: ");
        p.setX2(read.nextInt());
        System.out.print("Coordenada y: ");
        p.setY2(read.nextInt());

        return p;
    }

    public Double distancia(Puntos puntos) {

        double distancia = Math.sqrt(Math.pow(puntos.getX2() - puntos.getX1(), 2) + Math.pow(puntos.getY2() - puntos.getY1(), 2));
        return distancia;

    }
}
