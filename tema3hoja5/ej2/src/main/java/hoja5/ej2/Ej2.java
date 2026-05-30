/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ej2;

/**
 *
 * @author DAM104
 */
public class Ej2 {

    public static void main(String[] args) {
        Usuario usuario=new Usuario("Julio","Santamaria","94284848");
        System.out.println(usuario.esDeCantabria());
        usuario.generaEmail();
        System.out.println(usuario.getEmail());
        char letra='a';
        System.out.println("Veces q contiene letra: "+usuario.contieneLetra(letra));
        usuario.setTelefono("955676767");
        System.out.println("Nuevo telefono: "+usuario.getTelefono());
    }
}
