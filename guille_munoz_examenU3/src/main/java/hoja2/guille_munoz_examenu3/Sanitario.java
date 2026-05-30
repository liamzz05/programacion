/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.guille_munoz_examenu3;

/**
 *
 * @author DAM104
 */
public class Sanitario {

    String nombre;
    int edad;
    Categoria categoria;

    public Sanitario(String nombre, int anno, Categoria categoria) {
        this.nombre = nombre;
        this.edad = 2025 - anno;
        this.categoria = categoria;
    }

    public String getClave() {
        String aux = nombre;
        boolean existe = false; // boolean para controlar si hay una a o no
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == 'a') {       //si el caracter es una A 
                for (int j = i+1; j < aux.length(); j++) {  // bucle q recorre solo desde el siguiente caracter a la 'a' y convierte en mayus
                    existe = true;
                    
                    aux=aux.substring(0, j).concat(nombre.substring(j).toUpperCase());
                    //nombre.charAt(j)=Character.toUpperCase(nombre.charAt(j));
                }
            }
        }
        if (!existe) {
            aux = aux.toUpperCase();
        }
        return edad + aux;
    }

    @Override
    public String toString() {
        return "Sanitario{" + "nombre: " + nombre + ", edad: " + edad + ", categoria: " + categoria + ", clave: " + this.getClave() + '}';
    }

    public int calcularSueldo(int numHijo) {
        int sueldo = 1134;  //lo inicializo por si hay q cambiarlo q sea mas sencillo
        if (categoria == Categoria.AUXILIAR) {
            sueldo += sueldo * 0.15;
        } else if (categoria == Categoria.ENFERMERO) {
            sueldo += sueldo * 0.35;
        } else if (categoria == Categoria.MEDICO) {
            sueldo += sueldo * 0.60;
        }
        return sueldo + (numHijo * 150);  //suma extra si tiene hijos
    }

    public String conjeturaDeUllman(){
        String cadena=edad+", "; //la cadena empieza con la edad y cada vuelta del bucle añade el siguiente valor
        int aux=edad; // variable auxiliar para no cambiar el valor de la edad
        do { 
            if (edad%2==0) { //compruebo si es par
                aux=aux/2;
            } else{
                aux=(aux*3)+1;
            }
            cadena.concat(aux+", ");
        } while (edad>1);
        return cadena.concat("1"); // concateno un 1 al final pq en el bucle no va a añadir el 1 (?
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
