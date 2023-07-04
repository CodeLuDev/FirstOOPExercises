/* Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
  tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
  cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
  método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
  cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada. */

import nespresso.Cafetera;
import service.CafeteraService;

public class Main {
    public static void main(String[] args) {

        Cafetera cafetera = new Cafetera(10,4);
        CafeteraService cs = new CafeteraService();

        System.out.println("Cantidad actual: "+cafetera.getCantidadActual());

        cs.llenarCafetera(cafetera);
        System.out.println("\nDespues de que la cafetera se lleno completamente, la cantidad actual es: "+cafetera.getCantidadActual());

        cs.vaciarCafetera(cafetera);
        System.out.println("\nLa cafetera se vacio completamente, asi que la cantidad actual es: "+cafetera.getCantidadActual());

        cs.agregarCafe(cafetera);
        System.out.println("Despues de agregar cafe, la cantidad actual es: "+cafetera.getCantidadActual());

        cs.servirTaza(cafetera);
        System.out.println("La cantidad actual es: "+cafetera.getCantidadActual());

    }
}