/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3tema7.ej6;

import java.util.LinkedHashSet;

/**
 *
 * @author DAM104
 */
public class Tienda {
    private LinkedHashSet<Publicacion> lista;

    public Tienda() {
        this.lista = new LinkedHashSet<>();
    }
    
    public void insertarPublicacion(Publicacion publi){
        lista.add(publi);
    }
    
    public void borrarPublicacion(Publicacion publi){
        for(Publicacion p:lista){
            if (publi.equals(p)) {
                lista.remove(p);
            }
        }
    }
}
