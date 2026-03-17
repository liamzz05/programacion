/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package hoja5.ej1;

/**
 *
 * @author DAM104
 */
public class PasswordIncorrectException extends Exception {

    /**
     * Creates a new instance of <code>PasswordIncorrectException</code> without
     * detail message.
     */
    public PasswordIncorrectException() {
    }

    /**
     * Constructs an instance of <code>PasswordIncorrectException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public PasswordIncorrectException(String msg) {
        super(msg);
    }
}
