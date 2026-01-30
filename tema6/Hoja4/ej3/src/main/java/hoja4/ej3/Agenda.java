/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ej3;

/**
 *
 * @author DAM104
 */
public class Agenda {
    private int contador;
    private Contacto[] contactos;

    public Agenda(int contador, int numContactos) {
        this.contador = contador;
        this.contactos = new Contacto[numContactos];
    }
    
    public boolean insertar(Contacto newContacto){
        boolean insertado=false;
        for (int i = 0; i < contador; i++) {
            if (contactos[i]==null) {
                contactos[i]=newContacto;
                insertado=true;
            }
        }
        return insertado;
    }
    
    public Contacto buscar(String nombre){
        boolean encontrado=false;
        for(Contacto contacto : contactos){
           if(contacto.getNombre()==nombre){
               encontrado=true;
               return contacto;
           }
        }
        return null;
    }
    
    public void eliminar(Contacto contacto){
        
    }
}
