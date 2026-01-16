/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejclase2;

/**
 *
 * @author DAM104
 */
public class EnPromocion extends Articulo{
    private int descuento; //en porcentaje

    public EnPromocion(int codigo, String descripcion, double precio, int descuento) {
        super(codigo, descripcion, precio);
        this.descuento=descuento;
        this.precio=precio-(precio/100*descuento);
    }

    @Override
    public String toString() {
        return "EnPromocion{" + "descuento=" + descuento + '}';
    }
    
}
