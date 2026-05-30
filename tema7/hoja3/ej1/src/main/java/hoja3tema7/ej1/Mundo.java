package hoja3tema7.ej1;

import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM104
 */
public class Mundo extends HashSet {
    private HashSet<Pais> Paises;

    public Mundo() {
        Paises = new HashSet<Pais>();
    }
    
    public void insertarPais(String a){
        Paises.add(new Pais(a));
    }
    
    public void borrarPais(String pais){
        Paises.removeIf(a -> a.equals(pais));
    }
    @Override
    public String toString() {
        return "Paises:" + Paises;
    }
    
}
