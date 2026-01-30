/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ej2;

/**
 *
 * @author DAM104
 */
public class Gato extends Mamifero implements Domestico, Felino {
    private String nombre;
    
    public Gato(String nombre, String raza, int patas, String alimento) {
        this.nombre=nombre;
        super(raza, patas, alimento);
    }

    @Override
    public String toString() {
        return "Gato{ nombre = " + nombre + '}'+ super.toString();
    }

    
    @Override
    public String obedecer() {
        return "*Obedece";
    }

    @Override
    public String arañar() {
        return "*Araña";
    }
    
}
