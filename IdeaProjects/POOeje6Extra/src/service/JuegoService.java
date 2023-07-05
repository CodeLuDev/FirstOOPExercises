package service;

import entidad.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegoService {

    private ArrayList<Character> listaDeEncontradas = new ArrayList<>();

    Ahorcado juego;
    int intentoActual = 0;

    private Ahorcado crearJuego() {

        Scanner read = new Scanner(System.in);
        Ahorcado juego = new Ahorcado();

        System.out.print("Ingrese la palabra que debe buscar: ");
        String palabra = read.nextLine();

        juego.setPalabraArray(palabra.toLowerCase().toCharArray());
        System.out.println("La palabra a buscar es: " + palabra);

        System.out.print("Ingrese la cantidad maximas de jugadas para adivinar la palabra: ");
        int intentosMax = read.nextInt();
        juego.setJugadasMax(intentosMax);
        juego.setLetrasEncontradas(0);

        return juego;
    }

    private int longitud() {

        return this.juego.getPalabraArray().length;
    }

    private boolean buscar(char letra) {

        boolean encontrada = false;

        if (intentosRestantes() == 0) {
            System.out.println("Letras encontradas: "+listaDeEncontradas.size());
            System.out.println("Letras que faltan: "+(this.juego.getPalabraArray().length - listaDeEncontradas.size()));
        }

        //buscamos la letra dentro de la palabra
        for (int i = 0; i < this.juego.getPalabraArray().length; i++) {
            if (encontrada) break;
            if (this.juego.getPalabraArray()[i] == letra) {
                encontrada = true;
                this.juego.setLetrasEncontradas(this.juego.getLetrasEncontradas()+1);
                listaDeEncontradas.add(letra);
            }
        }

        this.intentoActual++;
        return encontrada;
    }

    private boolean encontradas() {

        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char letra = read.next().toLowerCase().charAt(0);

        return buscar(letra);
    }

    private int intentosRestantes() {

        return this.juego.getJugadasMax() - intentoActual;
    }

    public boolean juego() {

        this.juego = crearJuego();

        System.out.println("Longitud de la palabra: "+longitud());

        while (intentoActual < this.juego.getJugadasMax()) {
            System.out.println(encontradas() ? "La letra pertenece a la palabra" : "La letra no se encontro");
            System.out.println("Numero de intentos: "+intentosRestantes());
        }

        return  listaDeEncontradas.size() == longitud() ? true : false;
    }
}