/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1tema7.ej1;

import java.util.LinkedList;

/**
 *
 * @author DAM104
 */
public class Agenda extends LinkedList {

    private LinkedList<Persona> agenda = new LinkedList<>();

    public void annadirPersona(Persona persona) {
        agenda.add(persona);
    }

    public void borrarPersona(Persona persona) {
        agenda.remove(persona);
    }

    public void mostrarLista() {
        System.out.println(agenda);
    }

    public Persona buscarPersona(int numPersona) {
        return agenda.get(numPersona);
    }

    public Persona buscarPorDNI(String DNI) {
        Persona encontrada=null;
        for (Persona a : agenda) {
            if (a.getDNI().equals(DNI)) {
                encontrada=a;
            }
        }
        return encontrada;
    }

    public void editarPersona(String nombre, String apellidos, String DNI, Persona persona) {
        agenda.set(agenda.indexOf(persona), new Persona(nombre, apellidos, DNI));
    }
}
