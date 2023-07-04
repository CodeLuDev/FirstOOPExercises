package CuentasBancarias;

import java.util.Random;

public class Cuenta {

    private int numeroCuenta;
    private int DNI;
    private double saldoActual;
    private int interes;
    private String nombre;
    private String apellido;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void crearCuenta(String nombre, String apellido, int DNI, int interes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.interes = interes;
        Random ran = new Random();
        this.numeroCuenta = Math.abs(ran.nextInt());
    }

    public void ingresar(double dineroIngresado) {
        this.saldoActual = saldoActual+dineroIngresado;
        System.out.println("Su saldo total en su cuenta es de "+(saldoActual));
    }

    public void retirar(double dineroARetirar) {
        if (dineroARetirar<saldoActual) {
            this.saldoActual = saldoActual-dineroARetirar;
            System.out.println("Su cuenta actualizada es de "+(saldoActual));
        } else {
            System.out.println("Su cuenta es 0");
        }
    }

    public void extraccionRapida(double dineroARetirar){
        if (dineroARetirar>(this.saldoActual*0.20)) {
            System.out.println("No se permiten retiros mayores del 20%, saldo actual: "+this.saldoActual);
        } else {
            this.saldoActual = saldoActual-dineroARetirar;
            System.out.println("Has retirado "+dineroARetirar+" y su saldo actual es de "+this.saldoActual);
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de "+this.saldoActual);
    }

    public void consultarDatos() {
        System.out.println("numeroCuenta= "+this.numeroCuenta+", DNI= "+this.DNI+", saldoActual= "+this.saldoActual+", nombre= "+this.nombre+", apellido= "+this.apellido);
    }

}
