/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteServicio;

import java.util.Scanner;
import paqueteCuenta.cuenta;

/**
 *
 * @author mateo
 */
public class servicioCuentaBancaria {
    Scanner leer = new Scanner(System.in);
    public cuenta crearCuentaUsuario(){
        cuenta cuentaUsuario1 = new cuenta();
        
        System.out.println("Ingrese número de cuenta: ");
        cuentaUsuario1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI: ");
        cuentaUsuario1.setDNI(leer.nextLong());
        System.out.println("Ingrese saldo que posee actualmente");
        cuentaUsuario1.setSaldoActual(leer.nextInt());
        
        return cuentaUsuario1;
    }
    
    public void inglesar(){
        
        
    }
}
