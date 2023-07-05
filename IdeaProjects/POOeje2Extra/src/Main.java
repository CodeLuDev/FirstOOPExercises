//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos.

//d=√((x_2-x_1)²+(y_2-y_1)²)

import entidad.Puntos;
import service.PuntosService;

public class Main {
    public static void main(String[] args) {

        Puntos puntos = new Puntos();
        PuntosService ps = new PuntosService();

        puntos = ps.crearPuntos(puntos);

        System.out.println("\nLa distancia entre los dos puntos es de: "+ps.distancia(puntos));

    }
}