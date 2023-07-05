package service;

import personas.Persona;
import java.util.Scanner;

public class PersonaService {

    int mayorEdad = 0, menorEdad = 0, bajoPeso = 0, pesoNormal = 0, sobrepeso = 0;

    public Persona crearPersona() {

        Scanner read = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.print("Ingrese el nombre: ");
        persona.setNombre(read.nextLine());

        System.out.print("Ingrese la edad: ");
        persona.setEdad(read.nextInt());

        System.out.print("Ingrese el sexo('H' hombre, 'M' mujer, 'O' otro): ");
        String genero = read.next();
        genero(genero, persona);

        System.out.print("Ingrese el peso: ");
        persona.setPeso(read.nextDouble());

        System.out.print("Ingrese la altura en metros: ");
        persona.setAltura(read.nextDouble());

        return persona;
    }

    private String genero(String genero, Persona persona) {

        if (genero.equalsIgnoreCase("H") || genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("O")) {
            persona.setSexo(genero);
        } else {
            System.out.println("La letra introducida para definir el sexo de la persona no es correcta");
        }

        return genero;
    }

    public int calcularIMC(Persona persona) {

        int IMC = (int) (persona.getPeso() / (persona.getAltura()*2));

        if (IMC<20) {
            System.out.println("La persona está por debajo de su peso ideal");

        } else if (IMC>=20 && IMC<=25) {
            System.out.println("La persona está en su peso ideal");

        } else {
            System.out.println("La persona tiene sobrepeso");
        }

        conteoImc(IMC);

        return IMC;
    }

    public boolean esMayorDeEdad(Persona persona) {

        boolean isMayorDeEdad = false;

        if (persona.getEdad() >= 18) {
            isMayorDeEdad = true;
        }

        System.out.println("La persona es mayor de edad? "+isMayorDeEdad);
        conteoEdad(isMayorDeEdad);

        return isMayorDeEdad;
    }

    private void conteoImc(int imc) {

        if (imc < 20) {
            bajoPeso += 1;
        } else if (imc >= 20 && imc <= 25) {
            pesoNormal += 1;
        } else {
            sobrepeso += 1;
        }
    }

    private void conteoEdad(boolean edad) {

        if (edad) {
            mayorEdad += 1;
        } else {
            menorEdad += 1;
        }
    }

    public void estadistica() {
        System.out.println("El porcentaje de las personas mayores de edad es: "+calcularPorcentaje(mayorEdad, 4)+" %");
        System.out.println("El porcentaje de las personas menores de edad es: "+calcularPorcentaje(menorEdad, 4)+" %");
        System.out.println("El porcentaje de las personas bajo peso es: "+calcularPorcentaje(bajoPeso, 4)+" %");
        System.out.println("El porcentaje de las personas con peso normal es: "+calcularPorcentaje(pesoNormal, 4)+" %");
        System.out.println("El porcentaje de las personas con sobrepeso es: "+calcularPorcentaje(sobrepeso, 4)+" %");
    }

    private double calcularPorcentaje(int valorParcial, int valorTotal) {
        return (double) valorParcial/valorTotal*100;
    }

}
