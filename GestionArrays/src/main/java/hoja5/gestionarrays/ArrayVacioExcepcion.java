/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package hoja5.gestionarrays;

/**
 *
 * @author DAM104
 */
public class ArrayVacioExcepcion extends Exception {

    /**
     * Creates a new instance of <code>ArrayVacio</code> without detail message.
     */
    public ArrayVacioExcepcion() {
    }

    /**
     * Constructs an instance of <code>ArrayVacio</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ArrayVacioExcepcion(String msg) {
        super(msg);
    }
}
