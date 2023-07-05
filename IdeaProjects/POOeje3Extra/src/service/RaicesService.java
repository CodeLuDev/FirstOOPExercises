package service;

import entidad.Raices;

public class RaicesService {

    public double getDiscriminante(Raices raices) {
        //(b^2)-4*a*c
        return  (Math.pow(raices.getB(),2) - 4*raices.getA()*raices.getC());
    }

    public boolean tieneRaices(double discriminante) {

        return discriminante >= 0;
    }

    public boolean tieneRaiz(double discriminante) {

        return discriminante == 0;
    }

    public void obtenerRaices(Raices raices, double discriminante) {
        //(-b±√((b^2)-(4*a*c)))/(2*a)

        if (tieneRaices(discriminante)){
            double solucion1 = (-raices.getB() + Math.sqrt(discriminante)) / (2 * raices.getA());
            double solucion2 = (-raices.getB() - Math.sqrt(discriminante)) / (2 * raices.getA());

            System.out.println("\nLas dos posibles soluciones son: "+
                    "\nSolucion 1: "+solucion1+
                    "\nSolucion 2: "+solucion2);

        } else {
            System.out.println("\nLa ecuacion no tiene dos soluciones reales y distintas.");
        }

    }

    public void obtenerRaiz(Raices raices, double discriminante) {
        //x = -b / (2a)
        if (tieneRaiz(discriminante)){
            double unicaSolucion = -raices.getB() / (2*raices.getA());
            System.out.println("\nLa unica raiz es: "+unicaSolucion);
        } else {
            System.out.println("\nLa ecuacion no tiene una unica solucion.");
        }
    }

    public void calcular(Raices raices, double discriminante) {

        tieneRaices(discriminante);
        tieneRaiz(discriminante);

        if (tieneRaices(discriminante)){
            obtenerRaices(raices, discriminante);
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz(raices, discriminante);
        } else {
            System.out.println("\nNo hay soluciones reales para esta ecuacion");
        }
    }

}
