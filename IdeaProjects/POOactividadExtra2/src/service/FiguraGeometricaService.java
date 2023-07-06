package service;

import figura.FiguraGeometrica;
import java.util.Scanner;

public class FiguraGeometricaService {

    Scanner read = new Scanner(System.in);

    public FiguraGeometrica datosCuadrado() {

        FiguraGeometrica cuadrado = new FiguraGeometrica();

        System.out.print("Ingrese cuanto mide el lado del cuadrado: ");
        cuadrado.setLado1(read.nextInt());

        //perimetro 4 * Lado
        cuadrado.setPerimetro(calcularPerimetro(4, cuadrado));

        //area Lado^2
        cuadrado.setArea(cuadrado.getLado1() * cuadrado.getLado1());

        return cuadrado;
    }

    public FiguraGeometrica datosRectangulo() {

        FiguraGeometrica rectangulo = new FiguraGeometrica();

        System.out.print("Ingrese cuanto mide el rectangulo de largo: ");
        rectangulo.setLado1(read.nextInt());

        System.out.print("Ingrese cuanto mide el rectangulo de ancho: ");
        rectangulo.setLado2(read.nextInt());

        //perimetro 2 * (Largo + Ancho)
        rectangulo.setPerimetro(2 * (rectangulo.getLado1() + rectangulo.getLado2()));

        //area  Largo * Ancho
        rectangulo.setArea(rectangulo.getLado1() * rectangulo.getLado2());

        return rectangulo;
    }

    public FiguraGeometrica datosTriangulo() {

        FiguraGeometrica triangulo = new FiguraGeometrica();

        System.out.println("\nEl tiangulo es: "+
                "\n1. Triángulo equilátero "+
                "\n2. Triángulo isósceles "+
                "\n3. Triángulo escaleno ");

        System.out.print("Ingrese la opcion: ");
        int tipoTriangulo = read.nextInt();

        switch (tipoTriangulo) {
            case 1:
                System.out.print("Ingrese cuanto mide el lado del triangulo: ");
                triangulo.setLado1(read.nextInt());

                //perimetro 3 * Lado
                triangulo.setPerimetro(calcularPerimetro(3,triangulo));

                //area (lado^2 * √3) / 4
                triangulo.setArea((Math.pow(triangulo.getLado1(), 2) * Math.sqrt(3)) * 4);

                break;

            case 2:
                System.out.print("Ingrese cuanto mide la base del triangulo: ");
                triangulo.setLado1(read.nextInt());

                System.out.print("Ingrese cuanto mide uno de los dos lados iguales del triangulo: ");
                triangulo.setLado2(read.nextInt());

                System.out.print("Ingrese cuanto mide la altura del triangulo: ");
                triangulo.setAltura(read.nextInt());

                //perimetro 2 * lado + base
                triangulo.setPerimetro(2 * triangulo.getLado2() + triangulo.getLado1());

                //area  (Base * Altura) / 2
                triangulo.setArea((double) (triangulo.getLado1() * triangulo.getAltura()) / 2);

                break;

            case 3:
                System.out.print("Ingrese cuanto mide la base del triangulo: ");
                triangulo.setLado1(read.nextInt());

                System.out.print("Ingrese cuanto mide el primer lado del triangulo: ");
                triangulo.setLado2(read.nextInt());

                System.out.print("Ingrese cuanto mide el segundo lado del triangulo: ");
                triangulo.setLado3(read.nextInt());

                System.out.print("Ingrese cuanto mide la altura del triangulo: ");
                triangulo.setAltura(read.nextInt());

                //perimetro Lado1 + Lado2 + Lado3
                triangulo.setPerimetro(triangulo.getLado1() + triangulo.getLado2() + triangulo.getLado3());

                //area  (Base * Altura) / 2
                triangulo.setArea((double) (triangulo.getLado1() * triangulo.getAltura()) / 2);

                break;

        }

        return triangulo;
    }

    public FiguraGeometrica datosCirculo() {

        FiguraGeometrica circulo = new FiguraGeometrica();

        System.out.print("Ingrese cuanto mide el radio del circulo: ");
        circulo.setRadio(read.nextInt());

        //perimetro 2 * π * Radio
        circulo.setPerimetro(2 * Math.PI * circulo.getRadio());

        //area  π * Radio^2
        circulo.setArea(Math.PI * Math.pow(circulo.getRadio(), 2));

        return circulo;
    }

    public FiguraGeometrica datosHexagono() {

        FiguraGeometrica hexagono = new FiguraGeometrica();

        System.out.print("Ingrese cuanto mide el lado del hexagono: ");
        hexagono.setLado1(read.nextInt());

        //perimetro 6 * Lado
        hexagono.setPerimetro(calcularPerimetro(6, hexagono));

        //area  (3 * √3 * Lado^2) / 2
        hexagono.setArea((3  * Math.sqrt(3) * Math.pow(hexagono.getLado1(), 2)) / 2);

        return hexagono;
    }

    public FiguraGeometrica datosPentagono() {

        FiguraGeometrica pentagono = new FiguraGeometrica();

        System.out.print("Ingrese cuanto mide el lado del pentagono: ");
        pentagono.setLado1(read.nextInt());

        //perimetro 5 * Lado
        pentagono.setPerimetro(calcularPerimetro(5, pentagono));

        //area  (Lado^2 * (√25 + 10)) / 4
        pentagono.setArea(Math.pow(pentagono.getLado1(), 2) * (Math.sqrt(25) + 10) / 4);

        return pentagono;
    }

    public FiguraGeometrica datosRombo() {

        FiguraGeometrica rombo = new FiguraGeometrica();

        System.out.print("Ingrese cuanto mide el lado del rombo: ");
        rombo.setLado1(read.nextInt());

        System.out.print("Ingrese cuanto mide la diagonal mayor del rombo: ");
        rombo.setDiagonalMayor(read.nextInt());

        System.out.print("Ingrese cuanto mide la diagonal menor del rombo: ");
        rombo.setDiagonalMenor(read.nextInt());

        //perimetro 4 * Lado
        rombo.setPerimetro(calcularPerimetro(4, rombo));

        //area  (Diagonal Mayor * Diagonal Menor) / 2
        rombo.setArea((double) (rombo.getDiagonalMayor() * rombo.getDiagonalMenor()) / 2);

        return rombo;
    }

    private int calcularPerimetro(int numLados, FiguraGeometrica figuraGeometrica) {
        return numLados * figuraGeometrica.getLado1();
    }

}
