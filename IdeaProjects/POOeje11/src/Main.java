//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el dia de la fecha");
        int dia = read.nextInt();

        System.out.println("Ingrese el mes de la fecha");
        int mes = read.nextInt();

        System.out.println("Ingrese el año de la fecha");
        int anio = read.nextInt();

        LocalDate fecha = LocalDate.of(dia, mes, anio);

        LocalDate fechaActual = LocalDate.now();

        int aniosDiferencia = calcularAniosDiferencia(fecha, fechaActual);

        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("La diferencia en años entre la fecha ingresada y la fecha actual es: " + aniosDiferencia);
    }

    public static int calcularAniosDiferencia(LocalDate fecha1, LocalDate fecha2) {
        return Period.between(fecha1, fecha2).getYears();
    }
}
