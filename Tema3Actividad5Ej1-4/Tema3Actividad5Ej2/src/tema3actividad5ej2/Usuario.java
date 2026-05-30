/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad5ej2;

/**
 *
 * @author José Franciso Márquez Díaz
 */
public class Usuario {

    // Atributos
    private String nombre;
    private String apellido;
    private String telefono;

    // Constructor
    public Usuario(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    // Métodos selectores (getters)
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    // Métodos modificadores (setters)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método esDeCantabria
    public boolean esDeCantabria() {
        return telefono.startsWith("942");
    }

    // Método generaEmail
    public String generaEmail() {
        char ultimaCifra = telefono.charAt(telefono.length() - 1); // Última cifra del teléfono
        return (nombre + "_" + apellido + ultimaCifra + "@javamail.com").toLowerCase();
    }

    // Método contieneLetra
    public int contieneLetra(char letra) {
        int contador = 0; //cuenta las veces que encuentra una letra
        String apellidoMinusculas = apellido.toLowerCase();
        char letraMinuscula = Character.toLowerCase(letra);

        for (int i = 0; i < apellidoMinusculas.length(); i++) {
            if (apellidoMinusculas.charAt(i) == letraMinuscula) {
                contador++;
            }
        }
        /*
        for (char c : apellido.toLowerCase().toCharArray()) {
            if (c == Character.toLowerCase(letra)) {
                contador++;
            }
        }*/
        return contador;
    }

}
