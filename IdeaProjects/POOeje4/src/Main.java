/* Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2. */

import Forma.Rectangulo;
import service.RectanguloService;

public class Main {
    public static void main(String[] args) {

        Rectangulo rect1;
        RectanguloService rs = new RectanguloService();

        rect1 = rs.crearRectangulo();

        System.out.println("\nLa superficie del rectangulo es: "+rs.superficie(rect1)+" y su perimetro es: "+rs.perimetro(rect1));

        System.out.println("\nAqui esta el rectangulo dibujado");
        System.out.println(rs.dibujo(rect1));

    }
}