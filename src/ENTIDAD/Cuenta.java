/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTIDAD;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private int cuenta;
    private long dni;
    private double saldoActual;
   

    public Cuenta() {
    }

    public Cuenta(int cuenta, long dni, int saldoActual) {
        this.cuenta = cuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cuenta=" + cuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
    
    
    
    
    
    
}
