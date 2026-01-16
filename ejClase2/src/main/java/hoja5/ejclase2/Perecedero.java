/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejclase2;

/**
 *
 * @author DAM104
 */
public class Perecedero extends Articulo{
    protected int mes;
    protected int anno;

    public Perecedero(int codigo, String descripcion, double precio, int mes, int anno) {
        super(codigo, descripcion, precio);
        this.mes=mes;
        this.anno=anno;
    }

    @Override
    public String toString() {
        return "Perecedero{" + "mes=" + mes + ", anno=" + anno + '}';
    }

}
