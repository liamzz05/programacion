/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ej2;

/**
 *
 * @author DAM104
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;

    public Persona(String nombre, String apellido1, String apellido2, String DNI) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
    }
    
    public String contraseña(){
        String contraseña=nombre.substring(0, 1).concat(apellido1.substring(0, 3).concat(apellido2.substring(apellido2.length()-2,apellido2.length()-1)));
        return contraseña;
    }
    
    public boolean dniValido(){
        boolean valido=false;
        String cadena="TRWAGMYFPDXBNJZSQVHLCKE";
        String letraBien= // for q suma los nums y /23;
        if (DNI.length()=9 && DNI.charAt(9)==  ) {
            valido=true;
        }
        return valido;
    }
}
