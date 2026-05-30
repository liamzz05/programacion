/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ej1;

/**
 *
 * @author DAM104
 */
public class CajaAhorro {
    private float saldo;
    private int transacciones;
    
    public void girar(float cantidad){
        if (cantidad > this.saldo) {
            System.out.println("No se puede realizar el giro NO dispone ese dinero");
        } else {
            this.saldo -= cantidad;
            transacciones++;
        }
    }
    
    public float obtenerSaldo(){
        return saldo;
    }
    
    public int obtenerTransacciones(){
        return transacciones;
    }
    
    public void cajaAhorro(){
        this.saldo=0;
        this.transacciones=0;
    }
}
