package service;

import personas.Persona;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonaService {

    public Persona crearPersona() {

        Scanner read = new Scanner(System.in);
        Persona p1 = new Persona();

        System.out.print("\nIngrese su nombre: ");
        p1.setNombre(read.nextLine());

        System.out.print("Ingrese su dia de nacimiento: ");
        int dia = read.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mes = read.nextInt();

        System.out.print("Ingrese su año de nacimiento: ");
        int anio = read.nextInt();

        p1.setfechaDeNacimiento(LocalDate.of(anio, mes, dia));
        System.out.println("Su nombre es "+p1.getNombre()+" y su fecha de nacimiento es "+p1.getfechaDeNacimiento());

        return p1;
    }

    public int calcularEdad(Persona persona) {

        LocalDate fechaActual = LocalDate.now();

        int edad = Period.between(persona.getfechaDeNacimiento(),fechaActual).getYears();

        System.out.println("\nLa edad de "+persona.getNombre()+" es de "+edad+" años");
        return edad;
    }

    public void menorQue(int edad, String nombre) {

        Scanner read = new Scanner(System.in);

        System.out.print("\nIngrese la edad de una persona que conoces: ");
        int edad2 = read.nextInt();

        if (edad > edad2) {
            System.out.println(nombre+" es la persona mayor");
        } else {
            System.out.println("La otra persona es la mayor");
        }
    }

}
