/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICIO;

import ENTIDAD.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta c = new Cuenta();

    public Cuenta crearCuenta() {
        System.out.println("Introduzca el numero de cuenta");
        c.setCuenta(leer.nextInt());
        System.out.println("Introduzca el numero de DNI");
        c.setDni(leer.nextLong());
        System.out.println("Introduzca el saldo");
        c.setSaldoActual(leer.nextDouble());
        System.out.println("saldo actual es: " + c.getSaldoActual());

        return c;
    }

    public void ingresar() {
        double saldoActual = c.getSaldoActual();
        System.out.println("Ingrese el dinero");
        double ingresarDinero = leer.nextDouble();
        double saldoNuevo = saldoActual + ingresarDinero;
        c.setSaldoActual(saldoNuevo);
        System.out.println("saldo nuevo Actual despues del ingreso de dinero es: " + saldoNuevo);
    }

    /*e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/
    public void retirar() {
        double saldoActual = c.getSaldoActual();
        System.out.println("Ingrese el dinero que desea retirar");
        double dineroRetirado = leer.nextDouble();
        double saldoNuevo = saldoActual - dineroRetirado;
        c.setSaldoActual(saldoNuevo);
        System.out.println("Tu saldo despues del retiro ha quedado en: $ " + saldoNuevo);

    }

    /*Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/
    public void extraccionRapida() {
        double saldoNuevo;
        double saldoActual = c.getSaldoActual();
        double limiteDeRetiro = saldoActual * 0.2;
        System.out.println("Usted eligió extraccion rápida, recuerde que no puede extraer mas del 20% del saldo Actual que es: " + limiteDeRetiro + " ,ingrese la cantidad que desea retirar:   ");
        double cantidadDeRetiro = leer.nextDouble();

        if (cantidadDeRetiro <= limiteDeRetiro) {
            saldoNuevo = saldoActual - cantidadDeRetiro;
            c.setSaldoActual(saldoNuevo);
            System.out.println("La transaccion se realizó con exito!");
        } else {
            System.out.println("No se puede realizar la transaccion, excede el limite de extracción");
        }
    }

    /*Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.*/
    public void consultarSaldo() {

        double saldoActual = c.getSaldoActual();
        System.out.println("Su saldo actual de la cuenta es de: $" + saldoActual);

    }
    
    /*Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    
    public void consultarDatos(Cuenta c){
        System.out.println("Los datos de su cuenta son: ");
        System.out.println(c.toString());
    
    
    
    }
    
    
}
