package service;

import entidad.Arreglo;
import java.util.Arrays;
import java.util.Random;

public class ArregloService {

    public void rellenarArreglo(Arreglo arreglo) {

        Random random = new Random();

        System.out.println("\nArreglo A");
        double[] arregloA = new double[50];

        for (int i=0; i<50; i++) {
            arregloA[i] = random.nextDouble();
        }

        arreglo.setArregloA(arregloA);

        System.out.println(Arrays.toString(arreglo.getArregloA()));

        System.out.println("\nArreglo B");
        double[] arregloB = new double[20];

        for (int i=0; i<20; i++) {
            arregloB[i] = random.nextDouble();
        }

        arreglo.setArregloB(arregloB);

        System.out.println(Arrays.toString(arreglo.getArregloB()));

        ordenarArregloA(arreglo);

    }

    private void ordenarArregloA(Arreglo arreglo) {

        Arrays.sort(arreglo.getArregloA());
        System.out.println("\nEl arreglo A ordenado de menor a mayor es asi: "+Arrays.toString(arreglo.getArregloA()));

        arregloCopiado(arreglo);
    }

    private void arregloCopiado(Arreglo arreglo) {

        //copiar los primeros 10 numeros ordenados del arreglo A
        double[] arregloCopiado = Arrays.copyOfRange(arreglo.getArregloA(), 0,10);
        System.out.println("\nLos primeros 10 numeros ordenados del arreglo A son: "+Arrays.toString(arregloCopiado));

        remplazarArreglo(arregloCopiado,arreglo);
    }

    private void remplazarArreglo(double[] arregloCopiado, Arreglo arreglo) {

        //remplazar los primeros 10 numeros del arreglo copiado en el arreglo B
        System.arraycopy(arregloCopiado, 0, arreglo.getArregloB(), 0, 10);

        //remplazar los ultimos 10 numeros del arreglo B
        for (int i = arreglo.getArregloB().length - 10; i < arreglo.getArregloB().length; i++) {
            arreglo.getArregloB()[i] = 0.5;
        }
        System.out.println("\nEl arreglo B despues del cambio queda asi: "+Arrays.toString(arreglo.getArregloB()));

    }
}
