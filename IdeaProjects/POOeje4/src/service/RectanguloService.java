package service;

import Forma.Rectangulo;
import java.util.Scanner;

public class RectanguloService {

    public Rectangulo crearRectangulo() {

        Scanner read = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.print("Ingrese la base del rectangulo: ");
        rectangulo.setBase(read.nextInt());

        System.out.print("Ingrese la altura del rectangulo: ");
        rectangulo.setAltura(read.nextInt());

        return rectangulo;
    }

    public int superficie(Rectangulo rectangulo) {
        return rectangulo.getBase() * rectangulo.getAltura();
    }

    public int perimetro(Rectangulo rectangulo) {
        return (rectangulo.getBase() + rectangulo.getAltura()) * 2;
    }

    public String dibujo(Rectangulo rectangulo) {

        StringBuilder dibujo = new StringBuilder();

        for (int i=0; i<rectangulo.getAltura(); i++) {

            for (int j=0; j<rectangulo.getBase(); j++) {

                if (i == 0 || i == rectangulo.getAltura() - 1 || j == 0 || j == rectangulo.getBase() - 1) {
                    dibujo.append("* ");
                } else {
                    dibujo.append("  ");
                }
            }
            dibujo.append("\n");
        }

        return dibujo.toString();
    }
}
