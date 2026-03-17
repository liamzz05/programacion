/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3tema7.ej2;

import java.util.HashSet;

/**
 *
 * @author DAM104
 */
public class Almacen {

    private HashSet<Articulo> lista;

    public Almacen() {
        lista = new HashSet<Articulo>();
    }

    public void insertar(Articulo art) {
        if (buscar(art.getCodigo()) == null) {
            lista.add(art);
        } else {
            System.out.println("Ya existe un articulo con ese codigo");
        }

    }
    
    public Articulo buscar(int codigo) {
        Articulo encontrado=null;
        for(Articulo articulo:lista){
            if(articulo.equals(new Articulo(codigo))){
                encontrado=articulo;
            }
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "Almacen{" + "lista=" + lista + '}';
    }
    
}
