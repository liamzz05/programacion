/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ej4;

/**
 *
 * @author DAM104
 */
public class Curso {

    private String nombre;
    private String[] alumnos;

    public Curso(String nombre, int num) {
        this.nombre = nombre;
        this.alumnos = new String[num];
    }

    public void iniciales(){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i].charAt(0)
            );
        }
    }
    
    public void desplaza() {
        String aux = alumnos[0];
        for (int i = 0; i < alumnos.length; i++) {
            if (i > alumnos.length) {
                alumnos[i] = alumnos[i + 1];
            } else {
                alumnos[alumnos.length] = aux;
            }
        }
    }
    
    public void verNombre(int posicion){
        System.out.println(alumnos[posicion]);
    }
    
    public boolean esDam(){
        return nombre.toUpperCase().contains("DAM")
                ;
    }
}
