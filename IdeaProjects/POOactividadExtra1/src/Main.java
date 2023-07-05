// Crear una clase "Vehículo" con atributos como "marca","modelo","año" y "tipo"
// (En tipo, vamos a indicar si es un automóvil, una motocicleta, o una bicicleta).
// El vehículo debe tener los métodos de moverse y frenar:
//Moverse: Es la cantidad de metros que avanzará por segundo.
//Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
//más metros. Referencias:
//Un automóvil avanza 3 metros por segundo.
//Una motocicleta avanza 2 metros por segundo.
//Una bicicleta avanza 1 metro por segundo.
//Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
//pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
//vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
//avanzó.

import entidad.Vehiculo;
import service.VehiculoService;

public class Main {
    public static void main(String[] args) {

        // Crear 3 vehículos
        VehiculoService vs = new VehiculoService();
        System.out.println("\nVehiculo 1");
        Vehiculo vehiculo1 = vs.crearVehiculo();
        System.out.println("\nVehiculo 2");
        Vehiculo vehiculo2 = vs.crearVehiculo();
        System.out.println("\nVehiculo 3");
        Vehiculo vehiculo3 = vs.crearVehiculo();

        int metrosTotales1 = 0;
        int metrosTotales2 = 0;
        int metrosTotales3 = 0;

        // Mover los vehículos por 5 seg, 10 seg, 1 min y 5 min
        for (int i = 0; i < 4; i++) {
            System.out.println("\nCaso " + (i + 1) + " de movimiento de los vehiculos");
            metrosTotales1 = vs.moverse(vehiculo1);
            metrosTotales2 = vs.moverse(vehiculo2);
            metrosTotales3 = vs.moverse(vehiculo3);
        }

        // Frenar los vehículos y obtener los metros totales después de frenar
        System.out.println("\nTotal de metros avanzados despues de frenar tras avanzar 5 minutos.");
        int metrosTotFrenar1 = vs.frenar(metrosTotales1, vehiculo1);
        int metrosTotFrenar2 = vs.frenar(metrosTotales2, vehiculo2);
        int metrosTotFrenar3 = vs.frenar(metrosTotales3, vehiculo3);

        // Comparar los metros totales después de frenar para determinar el vehículo con mayor distancia recorrida
        int maxMetrosTotales = Math.max(metrosTotFrenar1, Math.max(metrosTotFrenar2, metrosTotFrenar3));

        // Mostrar el vehículo con mayor distancia recorrida
        System.out.println("\nEl vehiculo con mayor distancia recorrida es:");

        if (maxMetrosTotales == metrosTotFrenar1) {
            System.out.println("Vehiculo 1 con un total de "+metrosTotFrenar1+" metros recorridos!");
        } else if (maxMetrosTotales == metrosTotFrenar2) {
            System.out.println("Vehiculo 2 con un total de "+metrosTotFrenar2+" metros recorridos!");
        } else {
            System.out.println("Vehiculo 3 con un total de "+metrosTotFrenar1+" metros recorridos!");
        }
    }
}
