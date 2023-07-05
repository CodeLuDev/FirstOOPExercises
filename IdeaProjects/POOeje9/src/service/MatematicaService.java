package service;

import materias.Matematica;

public class MatematicaService {

    public void devolverMayor(Matematica mat) {

        if (mat.getNum1() > mat.getNum2()) {
            System.out.println("El numero mayor es: "+mat.getNum1());
        } else {
            System.out.println("El numero mayor es: "+mat.getNum2());
        }
    }

    public void calcularPotencia(Matematica mat) {

        double numR1 = Math.round(mat.getNum1());
        double numR2 = Math.round(mat.getNum2());

        if (numR1 > numR2) {
            double pot1 = Math.pow(numR1,numR2);
            System.out.println("La potencia del primer numero elevado al segundo numero es: "+pot1);
        } else {
            double pot2 = Math.pow(numR2,numR1);
            System.out.println("La potencia del segundo numero elevado al primer numero es: "+pot2);
        }
    }

    public void calculaRaiz(Matematica mat) {

        double numAbs1 = Math.abs(mat.getNum1());
        double numAbs2 = Math.abs(mat.getNum2());

        if (numAbs1 < numAbs2) {
            double raiz1 = Math.sqrt(numAbs1);
            System.out.println("La raiz cuadrada del primer numero es: "+raiz1);
        } else {
            double raiz2 = Math.sqrt(numAbs2);
            System.out.println("La raiz cuadrada del segundo numero es: "+raiz2);
        }
    }
}
