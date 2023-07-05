package service;

import cadenas.Cadena;
import java.util.Scanner;
public class CadenaService {

    Scanner read = new Scanner(System.in);

    public void mostrarVocales(Cadena cadena) {

        int contador = 0;
        char[] letras = cadena.getFrase().toCharArray();

        for (char letra : letras) {
            if (esVocal(letra)) {
                contador ++;
            }
        }
        System.out.println("\nLa frase contiene "+contador+" vocal/vocales.");

        invertirFrase(cadena);
    }

    private boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    private void invertirFrase(Cadena cadena) {

        char[] letras = cadena.getFrase().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i=letras.length-1; i>=0; i-- ) {
            sb.append(letras[i]);
        }

        System.out.println("\nLa frase invertida seria asi: "+ sb);

        vecesRepetido(cadena);
    }

    private void vecesRepetido(Cadena cadena) {

        System.out.print("\nIngrese una letra para saber cuantas veces se repite dentro de la frase: ");
        String letra = read.next();

        char l = letra.toCharArray()[0];
        char[] letrasFrase = cadena.getFrase().toCharArray();
        int contadorRepetidas = 0;
        for (char caracter : letrasFrase) {
            if (l == caracter) {
                contadorRepetidas ++;
            }
        }
        System.out.println("La letra ingresada se repite "+contadorRepetidas+" vez/veces");

        compararLongitud(cadena);
    }

    private void compararLongitud(Cadena cadena) {

        System.out.print("\nIngrese una palabra/frase para comparar su longitud con la palabra/frase anterior: ");
        read.nextLine();
        String frase1 = read.nextLine();

        int longi =  frase1.length();
        System.out.println("La primera palabra/frase es larga "+cadena.getFrase().length()+" caracteres y la secunda ingresada es larga "+longi+" caracteres");

        unirFrases(cadena);
    }

    private void unirFrases(Cadena cadena) {
        System.out.print("\nIngrese una palabra/frase para unirla con la palabra/frase anterior: ");
        String frase2 = read.nextLine();

        System.out.println("Las dos frases unidas se ven asi: "+cadena.getFrase()+" "+frase2);

        reemplazar(cadena);
    }

    private void reemplazar(Cadena cadena) {

        System.out.println("\nIngrese un caracter para remplazar la letra 'a'");
        char car = read.next().charAt(0);

        char[] letras = cadena.getFrase().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<cadena.getFrase().length(); i++) {
            if (letras[i] == 'a') {
                letras[i] = car;
                sb.append(letras[i]);
            } else {
                sb.append(letras[i]);
            }
        }
        System.out.println("La nueva frase seria asi "+sb);

        contiene(cadena);
    }

    private void contiene(Cadena cadena) {

        System.out.print("\nIngrese una letra para averiguar si se encuentra en la frase: ");
        char letraBuscar = read.next().charAt(0);

        boolean encontrada = false;
        char[] letras = cadena.getFrase().toCharArray();

        for (int i=0; i<cadena.getFrase().length(); i++) {
            if (letras[i] == letraBuscar) {
                encontrada = true;
                break;
            } else {
                encontrada = false;
            }
        }

        System.out.println("La letra se encontro en la frase? "+encontrada);

    }

}
