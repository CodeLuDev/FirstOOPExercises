/* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.*
b) Agregar los métodos getters y setters correspondientes*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.*
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.*
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
   la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
   pondrá el saldo actual en 0.**
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */

import CuentasBancarias.Cuenta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();

        boolean terminado = false;

        do {

            System.out.println("MENU");
            System.out.println("1: Crear una nueva cuenta ");
            System.out.println("2: Ingresar dinero a tu cuenta ");
            System.out.println("3: Retirar dinero de tu cuenta ");
            System.out.println("4: Extraccion rapida de dinero ");
            System.out.println("5: Consultar saldo ");
            System.out.println("6: Consultar datos ");

            int risp = menu.nextInt();
            String r;

                switch (risp) {
                    case 1:
                        System.out.println("Ingrese su nombre, apellido, DNI, tasa de interes");
                        cuenta1.crearCuenta(menu.next(),menu.next(),menu.nextInt(), menu.nextInt());
                        System.out.println("Nombre "+cuenta1.getNombre()+" ,Apellido: "+cuenta1.getApellido()+" ,Saldo actual: "+cuenta1.getSaldoActual()+" ,DNI= "+cuenta1.getDNI()+" ,numero de cuenta "+cuenta1.getNumeroCuenta());
                        System.out.println("Desea continuar (S/N)?");
                        r=menu.next();
                        if (!r.equalsIgnoreCase("s")) {
                            terminado= true;
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de dinero que quiere ingresar");
                        cuenta1.ingresar(menu.nextDouble());
                        System.out.println("Desea continuar (S/N)?");
                        r=menu.next();
                        if (!r.equalsIgnoreCase("s")) {
                            terminado= true;
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de dinero que quiere retirar");
                        cuenta1.retirar(menu.nextDouble());
                        System.out.println("Desea continuar (S/N)?");
                        r=menu.next();
                        if (!r.equalsIgnoreCase("s")) {
                            terminado= true;
                        }
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad de dinero que quiere extraer");
                        cuenta1.extraccionRapida(menu.nextDouble());
                        System.out.println("Desea continuar (S/N)?");
                        r=menu.next();
                        if (!r.equalsIgnoreCase("s")) {
                            terminado= true;
                        }
                        break;
                    case 5:
                        cuenta1.consultarSaldo();
                        System.out.println("Desea continuar (S/N)?");
                        r=menu.next();
                        if (!r.equalsIgnoreCase("s")) {
                            terminado= true;
                        }
                        break;
                    case 6:
                        cuenta1.consultarDatos();
                        System.out.println("Desea continuar (S/N)?");
                        r=menu.next();
                        if (!r.equalsIgnoreCase("s")) {
                            terminado= true;
                        }
                        break;
                    default:
                        System.out.println("El numero ingresado no es una opcion");
                        terminado = true;
                        break;
                }

        } while (!terminado);

    }
}