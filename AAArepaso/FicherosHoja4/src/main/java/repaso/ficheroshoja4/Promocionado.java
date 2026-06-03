/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.ficheroshoja4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM104
 */
public class Promocionado implements Serializable {
    private int matricula;
    private String nombre;
    private double media;

    public Promocionado(int matricula, String nombre, double media) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.media = media;
    }
    
    public static void escribirAlumno(Promocionado p, ObjectOutputStream os) throws IOException {
        os.writeObject(p);
    }
  /*  public static void escribirAlumno(Promocionado p, File fichero) throws IOException{
       ObjectOutputStream os=null;
       try{
           os=new ObjectOutputStream(new FileOutputStream(fichero,true));
           os.writeObject(p);
           
       } catch (FileNotFoundException ex) {
            Logger.getLogger(Promocionado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Promocionado.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
           if(os!=null){
               os.close();
           }
       }
    } */
}
