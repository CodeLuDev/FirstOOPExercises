package service;

import entidad.Vehiculo;
import java.util.Scanner;

public class VehiculoService {

    public Vehiculo crearVehiculo() {

        Scanner read = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();

        System.out.print("\nIngrese la marca del vehiculo: ");
        vehiculo.setMarca(read.nextLine());

        System.out.print("Ingrese el modelo del vehiculo: ");
        vehiculo.setModelo(read.nextLine());

        System.out.print("Ingrese el año del vehiculo: ");
        vehiculo.setAnno(read.nextInt());

        System.out.print("Ingrese el tipo de vehiculo (automovil, motocicleta, o bicicleta): ");
        read.nextLine();
        String respuestaTipo = read.nextLine();
        tipoVehiculo(respuestaTipo,vehiculo,read);

        return vehiculo;
    }

    private void tipoVehiculo(String respuestaTipo, Vehiculo vehiculo, Scanner read) {

        boolean respuestaCorrecta = false;

        if (respuestaTipo.equalsIgnoreCase("automovil") || respuestaTipo.equalsIgnoreCase("auto")){
            vehiculo.setTipo(respuestaTipo);
            respuestaCorrecta = true;
        } else if (respuestaTipo.equalsIgnoreCase("motocicleta") || respuestaTipo.equalsIgnoreCase("moto")) {
            vehiculo.setTipo(respuestaTipo);
            respuestaCorrecta = true;
        } else if (respuestaTipo.equalsIgnoreCase("bicicleta") || respuestaTipo.equalsIgnoreCase("bici")) {
            vehiculo.setTipo(respuestaTipo);
            respuestaCorrecta = true;
        }

        while (!respuestaCorrecta) {

            System.out.print("\nEl tipo de vehiculo ingresado no es correcto. Ingrese nuevamente el tipo: ");
            respuestaTipo = read.nextLine();

            if (respuestaTipo.equalsIgnoreCase("automovil") || respuestaTipo.equalsIgnoreCase("auto")) {
                vehiculo.setTipo(respuestaTipo);
                respuestaCorrecta = true;
            } else if (respuestaTipo.equalsIgnoreCase("motocicleta") || respuestaTipo.equalsIgnoreCase("moto")) {
                vehiculo.setTipo(respuestaTipo);
                respuestaCorrecta = true;
            } else if (respuestaTipo.equalsIgnoreCase("bicicleta") || respuestaTipo.equalsIgnoreCase("bici")) {
                vehiculo.setTipo(respuestaTipo);
                respuestaCorrecta = true;
            }
        }
    }

    public int moverse(Vehiculo vehiculo) {

        //cantidad de metros que avanzará por segundo
        Scanner read = new Scanner(System.in);

        System.out.println("\nPor cuanto tiempo manejò su vehiculo?");
        System.out.print("Horas: ");
        int horas = read.nextInt();
        System.out.print("Minutos: ");
        int minutos = read.nextInt();
        System.out.print("Segundos: ");
        int segundos = read.nextInt();

        int totalsegundos = convertirASegundos(horas, minutos, segundos);
        int metrosTotales = 0;

        if (vehiculo.getTipo().equalsIgnoreCase("automovil") || vehiculo.getTipo().equalsIgnoreCase("auto")){
            //Un automóvil avanza 3 metros por segundo
            metrosTotales = totalsegundos*3;
            System.out.println("Su automovil avanzó "+metrosTotales+" metros en total despues de: "+minutos+" minutos y "+segundos+" segundos.");

        } else if (vehiculo.getTipo().equalsIgnoreCase("motocicleta") || vehiculo.getTipo().equalsIgnoreCase("moto")){
            //Una motocicleta avanza 2 metros por segundo
            metrosTotales = totalsegundos*2;
            System.out.println("Su motocicleta avanzó "+metrosTotales+" metros en total despues de: "+minutos+" minutos y "+segundos+" segundos.");

        } else if (vehiculo.getTipo().equalsIgnoreCase("bicicleta") || vehiculo.getTipo().equalsIgnoreCase("bici")){
            //Una bicicleta avanza 1 metro por segundo
            metrosTotales = totalsegundos;
            System.out.println("Su bicicleta avanzó "+metrosTotales+" metros en total despues de: "+minutos+" minutos y "+segundos+" segundos.");

        } else {
            System.out.println("No se pudo calcular los metros totales para su vehiculo");
        }

        return metrosTotales;
    }

    private int convertirASegundos(int horas, int minutos, int segundos) {

        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
        return totalSegundos;
    }

    public int frenar(int metrosTotales, Vehiculo vehiculo) {

        int metrosTotFrenar = 0;

        if (vehiculo.getTipo().equalsIgnoreCase("automovil") || vehiculo.getTipo().equalsIgnoreCase("auto")){
            //Un automóvil avanza 2 metros despues de frenar
            metrosTotFrenar = metrosTotales+2;
            System.out.println("Su automovil avanzó en total "+metrosTotFrenar+" metros despues de frenar.");

        } else if (vehiculo.getTipo().equalsIgnoreCase("motocicleta") || vehiculo.getTipo().equalsIgnoreCase("moto")){
            //Una motocicleta avanza 2 metros despues de frenar
            metrosTotFrenar = metrosTotales+2;
            System.out.println("Su motocicleta avanzó en total "+metrosTotFrenar+" metros despues de frenar.");

        } else if (vehiculo.getTipo().equalsIgnoreCase("bicicleta") || vehiculo.getTipo().equalsIgnoreCase("bici")){
            //Una bicicleta avanza 0 metros despues de frenar
            metrosTotFrenar = metrosTotales;
            System.out.println("Su bicicleta avanzó en total "+metrosTotFrenar+" metros despues de frenar.");

        } else {
            System.out.println("No se pudo calcular los metros totales para su vehiculo");
        }

        return metrosTotFrenar;
    }
}
