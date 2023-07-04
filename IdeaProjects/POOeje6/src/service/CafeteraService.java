package service;

import nespresso.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {

        Scanner read = new Scanner(System.in);

        System.out.print("\nCuanto cafe quiere agregar?: ");
        int cafeAgregado = read.nextInt();

        if ((cafetera.getCapacidadMaxima() - cafetera.getCantidadActual()) > cafeAgregado) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cafeAgregado);
        } else {
            System.out.println("No se puede agregar mas liquido de la cantidad maxima");
        }
    }

    public void servirTaza(Cafetera cafetera) {

        Scanner read = new Scanner(System.in);

        System.out.print("\nCuanto mide la taza?: ");
        int tazaMisura = read.nextInt();

        if (tazaMisura <= cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tazaMisura);
            System.out.println("La taza se lleno de "+tazaMisura+" y en la cafetera aun queda: "+cafetera.getCantidadActual()+" de cafe");
        } else {
            int falta = tazaMisura - cafetera.getCantidadActual();
            tazaMisura = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("La taza no se lleno solo con "+tazaMisura+" de cafe, y falto llenarse de "+falta);
        }
    }

}
