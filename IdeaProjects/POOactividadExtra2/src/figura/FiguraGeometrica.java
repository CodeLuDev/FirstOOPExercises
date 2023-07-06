package figura;

public class FiguraGeometrica {

    private int lado1;
    private int lado2;
    private int lado3;
    private int altura;
    private int radio;
    private int diagonalMayor;
    private int diagonalMenor;
    private double perimetro;
    private double area;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(int lado1, int lado2, int lado3, int altura, int radio, int diagonalMayor, int diagonalMenor, double perimetro, double area) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        this.radio = radio;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.perimetro = perimetro;
        this.area = area;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
