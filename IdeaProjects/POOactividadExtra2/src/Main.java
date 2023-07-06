/*
Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
geométricas. Las figuras son las siguientes:
-Cuadrado
-Rectángulo
-Triangulo
-Circulo
-Hexágono
-Pentágono
-Rombo
El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y le debe
mostrar por pantalla el área y el perímetro.
Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los cálculos
para luego mostrar en pantalla.
 */

import figura.FiguraGeometrica;
import service.FiguraGeometricaService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FiguraGeometricaService fgs = new FiguraGeometricaService();
        Scanner read = new Scanner(System.in);

        System.out.println("\nSeleccione una de las figuras de la lista: "+
                "\n1. Cuadrado"+
                "\n2. Rectángulo"+
                "\n3. Triangulo"+
                "\n4. Circulo"+
                "\n5. Hexágono"+
                "\n6. Pentágono"+
                "\n7. Rombo");

        System.out.print("Ingrese la opcion: ");
        int eleccion = read.nextInt();

        if (eleccion > 7) {

            boolean opcionCorrecta = false;

            while (!opcionCorrecta) {
                System.out.println("Opcion no valida. Ingrese nuevamente un numero entre 1 y 7 dependiendo de la figura!");
                eleccion = read.nextInt();

                if (eleccion >=1 && eleccion <=7) {
                    opcionCorrecta = true;
                }
            }

        }

        switch (eleccion) {
            case 1:
                FiguraGeometrica cuadrado;
                cuadrado = fgs.datosCuadrado();
                System.out.println("El perimetro del cuadrado es: " + cuadrado.getPerimetro() + " y su area es: " + cuadrado.getArea());
                break;
            case 2:
                FiguraGeometrica rectangulo;
                rectangulo = fgs.datosRectangulo();
                System.out.println("El perimetro del rectangulo es: " + rectangulo.getPerimetro() + " y su area es: " + rectangulo.getArea());
                break;
            case 3:
                FiguraGeometrica triangulo;
                triangulo = fgs.datosTriangulo();
                System.out.println("El perimetro del triangulo es: " + triangulo.getPerimetro() + " y su area es: " + triangulo.getArea());
                break;
            case 4:
                FiguraGeometrica circulo;
                circulo = fgs.datosCirculo();
                System.out.println("El perimetro del circulo es: " + circulo.getPerimetro() + " y su area es: " + circulo.getArea());
                break;
            case 5:
                FiguraGeometrica hexagono;
                hexagono = fgs.datosHexagono();
                System.out.println("El perimetro del hexagono es: " + hexagono.getPerimetro() + " y su area es: " + hexagono.getArea());
                break;
            case 6:
                FiguraGeometrica pentagono;
                pentagono = fgs.datosPentagono();
                System.out.println("El perimetro del pentagono es: " + pentagono.getPerimetro() + " y su area es: " + pentagono.getArea());
                break;
            case 7:
                FiguraGeometrica rombo;
                rombo = fgs.datosRombo();
                System.out.println("El perimetro del rombo es: " + rombo.getPerimetro() + " y su area es: " + rombo.getArea());
                break;

        }
    }
}

