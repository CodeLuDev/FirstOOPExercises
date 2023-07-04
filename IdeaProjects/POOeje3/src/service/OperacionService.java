package service;

import Operaciones.Operacion;
import java.util.Scanner;

public class OperacionService {

    public Operacion crearOperacion() {

        Scanner read = new Scanner(System.in);
        Operacion operacion = new Operacion();

        System.out.print("Ingrese el primer numero: ");
        operacion.setNum1(read.nextInt());

        System.out.print("Ingrese el segundo numero: ");
        operacion.setNum2(read.nextInt());

        return operacion;
    }

    public int sumar(Operacion operacion) {
        return operacion.getNum1() + operacion.getNum2();
    }

    public int restar(Operacion operacion) {
        return operacion.getNum1() - operacion.getNum2();
    }

    public int multiplicar(Operacion operacion) {

        if (operacion.getNum1() == 0 || operacion.getNum2() == 0){
            System.out.println("Error, uno de los dos numeros es 0");
            return 0;
        }

        return operacion.getNum1() * operacion.getNum2();
    }

    public  double dividir(Operacion operacion) {

        if (operacion.getNum1() == 0 || operacion.getNum2() == 0){
            System.out.println("Error, uno de los dos numeros es 0");
            return 0;
        }

        return (double) operacion.getNum1() / operacion.getNum2();
    }
}
