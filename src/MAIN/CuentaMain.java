/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MAIN;

import ENTIDAD.Cuenta;
import SERVICIO.CuentaServicio;

/**
 *
 * @author Usuario
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaServicio cs = new CuentaServicio();
        Cuenta c = cs.crearCuenta();
        cs.ingresar();
        cs.retirar();
        cs.extraccionRapida();
        cs.consultarSaldo();
        cs.consultarDatos(c);
        
    }
    
    

 
    
    
    }
    
    
    
    

