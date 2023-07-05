package service;

import entidad.Meses;

import java.util.Random;
import java.util.Scanner;

public class MesesService {

    public void advinaMes(Meses mes) {

        Scanner read = new Scanner(System.in);

        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String respuesta = read.nextLine();

        if (respuesta.equals(mes.getMesSecreto())) {
            System.out.println("¡Acertaste el mes!");
        } else {
            System.out.println("No acertaste el mes");
        }

    }

    public String[] llenarArrayMeses(Meses mes) {

        String[] mesesDelAnno = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mes.setMeses(mesesDelAnno);

        return mesesDelAnno;
    }

    public void mesAleatorio(String[] mesesDelAnno, Meses mes) {

        Random random = new Random();

        int indiceAleatorio = random.nextInt(12);
        String mesEscogido = mesesDelAnno[indiceAleatorio];

        System.out.println("El mes secreto es: "+mesEscogido);
        mes.setMesSecreto(mesEscogido);
    }
}
