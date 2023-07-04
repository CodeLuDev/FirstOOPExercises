/* Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨). */

import entidad.Circunferencia;
import service.CircunferenciaService;

public class Main {
    public static void main(String[] args) {

        Circunferencia miCircunferencia;
        CircunferenciaService cs = new CircunferenciaService();

        miCircunferencia = cs.crearCircunferencia();
        System.out.println("El area es de: "+cs.area(miCircunferencia));
        System.out.println("El perimetro es de: "+cs.perimetro(miCircunferencia));
    }
}
