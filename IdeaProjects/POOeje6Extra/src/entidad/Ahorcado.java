package entidad;

import java.util.ArrayList;

public class Ahorcado {

    private char[] palabraArray;
    private int letrasEncontradas;
    private int jugadasMax;

    public char[] getPalabraArray() {
        return palabraArray;
    }

    public void setPalabraArray(char[] palabraArray) {
        this.palabraArray = palabraArray;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadas) {
        this.jugadasMax = jugadas;
    }

}
