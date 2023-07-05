package service;

import entidad.NIF;
import java.util.Scanner;

public class NIFService {

    public NIF crearNif() {

        NIF nif = new NIF();
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese su DNI: ");
        nif.setDNI(read.nextLong());

        asignarLetra(nif);

        return nif;
    }

    private char asignarLetra(NIF nif) {

        char[] letras = new char[23];
        letras[0] = 'T';
        letras[1] = 'R';
        letras[2] = 'W';
        letras[3] = 'A';
        letras[4] = 'G';
        letras[5] = 'M';
        letras[6] = 'Y';
        letras[7] = 'F';
        letras[8] = 'P';
        letras[9] = 'D';
        letras[10] = 'X';
        letras[11] = 'B';
        letras[12] = 'N';
        letras[13] = 'J';
        letras[14] = 'Z';
        letras[15] = 'S';
        letras[16] = 'Q';
        letras[17] = 'V';
        letras[18] = 'H';
        letras[19] = 'L';
        letras[20] = 'C';
        letras[21] = 'K';
        letras[22] = 'E';

        int indiceCorrespondiente = (int) (nif.getDNI() % 23);
        char letraCorrespondiente = letras[indiceCorrespondiente];
        nif.setLetra(letraCorrespondiente);

        return letraCorrespondiente;
    }

    public String mostrar(NIF nif) {

        return nif.getDNI()+"-"+nif.getLetra();
    }
}
