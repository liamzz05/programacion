/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1tema7.ej1;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Persona Persona1 = new Persona("Guille", "Munoz", "1");
        Persona Persona2 = new Persona("Maya", "Garcia", "2");
        Persona Persona3 = new Persona("feo", "a", "3");
        agenda.annadirPersona(Persona1);
        agenda.annadirPersona(Persona2);
        agenda.annadirPersona(Persona3);
        agenda.mostrarLista();
        agenda.editarPersona("feo2", "b", "3", Persona3);
        agenda.mostrarLista();
        agenda.borrarPersona(agenda.buscarPorDNI("3"));
        agenda.mostrarLista();

    }
}
