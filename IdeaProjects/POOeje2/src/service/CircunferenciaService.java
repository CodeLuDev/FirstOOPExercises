package service;

import entidad.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {

    public Circunferencia crearCircunferencia() {

        Scanner read = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia();

        System.out.print("Ingrese el radio de la cincunferencia: ");
        c1.setRadio(read.nextDouble());

        return c1;
    }

    public double area(Circunferencia circunferencia) {
        return Math.PI * Math.pow(circunferencia.getRadio(), 2);
    }

    public double perimetro(Circunferencia circunferencia) {
        return 2 * Math.PI * circunferencia.getRadio();
    }
}
