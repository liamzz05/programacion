/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ej1;

/**
 *
 * @author DAM104
 */
public class Cadena {

    private String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena.trim();
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public void contarPalabras() {
        int contadorPalabras = 1;
        if (cadena.isEmpty()) {
            System.out.println("No hay frase");
        } else {
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' ') {
                    contadorPalabras++;
                }
            }
            /* if (cadena.length()>0 && contadorPalabras==0) {
                contadorPalabras++;
            } */
            System.out.println("Contador de palabras: " + contadorPalabras);
        }
    }

    public void contarMayusculas() {
        int contadorMayus = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                contadorMayus++;
            }
        }
        System.out.println("Contador de mayusculas: " + contadorMayus);
    }

    public void contarMinusculas() {
        int contadorMinus = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLowerCase(cadena.charAt(i))) {
                contadorMinus++;
            }
        }
        System.out.println("Contador de minusculas: " + contadorMinus);
    }
    
    public void contarCaracter(char car){
        int contadorCar=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==car) {
                contadorCar++;
            }
        }
        System.out.println("Contador de "+car+": "+contadorCar);
    }
    
    public void eliminarEspacios(){
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==' ') {
                cadena=cadena.substring(0, i).concat(cadena.substring(i+1, cadena.length()));
            }
        }
        System.out.println("Cadena sin espacios: "+cadena);
    }
    
    public void palindromo(){
        boolean igual=true;
        for (int i = 0; i < Math.ceil(cadena.length()/2); i++) {
            if (cadena.charAt(i)!=cadena.charAt(cadena.length()-i)) {
                igual=false;
            }
        }
        if (igual) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
    
    public void colocarMayus(char car){
      cadena=cadena.replace(car, Character.toUpperCase(car));
      System.out.println("Cadena nueva: "+cadena);
    }
}
