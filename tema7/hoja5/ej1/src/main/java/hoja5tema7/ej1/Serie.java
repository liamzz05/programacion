/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5tema7.ej1;

import java.util.HashMap;

/**
 *
 * @author DAM104
 */
public class Serie {

    private String nombre;
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada;
    private byte temporadas;
    private HashMap<String, Capitulo> caps;

    public Serie(String nombre, Tematica tematica, String nacionalidad, boolean finalizada, byte temporadas) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.temporadas = temporadas;
        this.caps=new HashMap<String,Capitulo>();
    }

    @Override
    public String toString() {
        return "Serie{" + "nombre=" + nombre + ", tematica=" + tematica + ", nacionalidad=" + nacionalidad + ", finalizada=" + finalizada + ", temporadas=" + temporadas + '}';
    }

    public String generaClaveCapitulo(int temporada, int capitulo) {
        String temp = String.valueOf(temporada);
        String cap = String.valueOf(capitulo);
        if (temporada <= 7) {
            temp = "0".concat(temp);
        }
        if (capitulo <= 7) {
            cap = "0".concat(cap);
        }
        return nombre.substring(1, 4).concat(temp).concat("X").concat(cap);
    }
    
    public void insertaCapitulo(Capitulo capitulo){
        caps.put(generaClaveCapitulo(capitulo.getNumTemp(),capitulo.getNumCap()), capitulo);
    }
    
    public void eliminaCapitulo(String clave){
        if (caps.remove(clave)==null) {
            System.out.println("Error, no se encontró");
        }
    }
    
    public void visualizaCapitulos(){
        System.out.println(caps);
    }
}
