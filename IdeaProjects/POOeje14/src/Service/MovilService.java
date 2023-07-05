package Service;
//Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para instanciar un objeto Celular y poder cargarlo en nuestro programa.
//Método ingresarCodigo(): este método permitirá ingresar el código completo de siete números de un celular. Para ello, puede utilizarse un bucle repetitivo

import entidad.Movil;
import java.util.Scanner;

public class MovilService {

    public Movil cargarCelular() {

        Scanner read = new Scanner(System.in);
        Movil m1 = new Movil();

        System.out.print("Cual es la marca del celular? ");
        m1.setMarca(read.nextLine());

        System.out.print("\nCuanto cuesta este celular? ");
        m1.setPrecio(read.nextDouble());

        System.out.print("\nQue modelo es? ");
        read.nextLine();
        m1.setModelo(read.nextLine());

        System.out.print("\nDe cuanto es su memoria RAM? ");
        m1.setMemoriaRam(read.nextDouble());

        System.out.print("\nDe cuanto es su almacenamiento? ");
        m1.setAlmacenamiento(read.nextDouble());

        return m1;
    }

    public int[] ingresarCodigo(Movil movil) {

        Scanner read = new Scanner(System.in);

        int[] codigo = new int[7];

        System.out.println("\nIngrese el codigo del celular de 7 numeros: ");

        for (int i=0; i<7; i++){
            System.out.print("Numero "+(i+1)+": ");
            int numero = read.nextInt();
            codigo[i] = numero;
        }

        movil.setCodigo(codigo);
        return codigo;
    }

}
