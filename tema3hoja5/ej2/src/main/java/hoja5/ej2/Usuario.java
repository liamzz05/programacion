/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ej2;

/**
 *
 * @author DAM104
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    
    public Usuario(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.telefono = telefono;
    }
    
    public boolean esDeCantabria(){
        return telefono.substring(0, 3).equals("942");
        //telefono.startsWith("942")
    }
    
    public String generaEmail(){
        this.email=nombre+"_"+apellido+telefono.charAt(telefono.length()-1)+"@javamail.com".toLowerCase();
        return email;
    }
    
    public int contieneLetra(char letra){
        int contador=0;
        for (int i = 0; i < apellido.length(); i++) {
            if (apellido.charAt(i)==letra) {
                contador++;
            }
        }
        return contador;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}
