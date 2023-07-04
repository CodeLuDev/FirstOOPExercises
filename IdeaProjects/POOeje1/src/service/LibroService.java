package service;

import Entidad.Libro;
import java.util.Scanner;

public class LibroService {

    public Libro registarInformacion() {
        Scanner read = new Scanner(System.in);
        Libro l1 = new Libro();

        System.out.print("Ingrese el ISBN del libro: ");
        String respuesta = read.nextLine();
        isbnCorrecto(respuesta,l1,read);

        System.out.print("Cual es el titulo del libro?: ");
        l1.setTitulo(read.nextLine());

        System.out.print("Cual el su autor?: ");
        l1.setAutor(read.nextLine());

        System.out.print("Cuantas paginas tiene el libro?: ");
        l1.setNumeroDePaginas(read.nextInt());

        return l1;
    }

    private String isbnCorrecto(String respuesta, Libro l1, Scanner read) {

        if (respuesta.length() == 13) {
            l1.setISBN(respuesta);
        } else {
            System.out.print("ISBN incorrecto. Digite nuevamente el ISBN de 13 números: ");
            respuesta = read.nextLine();
            respuesta = isbnCorrecto(respuesta, l1, read); // Llamada recursiva para verificar el nuevo ISBN ingresado
        }
        return respuesta;
    }

    public void mostrarInformacion (Libro libro) {

        System.out.print("\nLa informacion completa del libro ingresado es la siguiente:"+
                "\nISBN: "+libro.getISBN()+
                "\nTitulo: "+libro.getTitulo()+
                "\nAutor: "+libro.getAutor()+
                "\nNumero de paginas: "+libro.getNumeroDePaginas());
    }

}
