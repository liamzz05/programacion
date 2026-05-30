/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ejclase2;

/**
 *
 * @author DAM104
 */
public class EjClase2 {

    public static void main(String[] args) {
        Articulo a1= new Perecedero(1,"Queso",3.5,12,26);
        Articulo a2= new Perecedero(2,"Leche",2.5,11,26);
        Articulo a3= new Perecedero(3,"Pescao",4,11,26);
        Articulo a4= new Perecedero(4,"Agua",1,12,27);
        Articulo a5= new Perecedero(5,"Manzana",3,12,26);
        
        Articulo[] perecederos={a1,a2,a3,a4,a5};
        
        Articulo b1= new EnPromocion(1,"Cafe",3.5,30);
        Articulo b2= new EnPromocion(2,"Azucar",2.5,20);
        Articulo b3= new EnPromocion(3,"Hola",4,15);
        Articulo b4= new EnPromocion(4,"Zumo",1,35);
        Articulo b5= new EnPromocion(5,"Sal",3,10);
        
        Articulo[] enPromocion={b1,b2,b3,b4,b5};
        
        System.out.println("Visualizar articulos en promocion:");
        
        for(Articulo articulo : enPromocion){
            System.out.println(articulo.toString());
        }
        
        System.out.println("Visualizar codigo y descripcion de articulos caducados:");
        
        System.out.println("Visualizar que articulo ha tenido mas descuento:");
        
    }
}
