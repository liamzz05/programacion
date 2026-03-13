/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.ej3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAM104
 */
public class Taller {

    private ArrayList<Vehiculo> noArreglados;
    private ArrayList<Vehiculo> siArreglados;
    private ArrayList<Vehiculo> retirados;
         // LinkedList
    
    public Taller() {
        this.noArreglados = new ArrayList<>();
        this.siArreglados = new ArrayList<>();
        this.retirados = new ArrayList<>();
    }
    
    public boolean insertarVehiculo(Vehiculo vehiculo){
        noArreglados.add(vehiculo);
        return true;
    }
    
    public boolean arreglarVehiculo(String codigo){
        Iterator<Vehiculo> it= noArreglados.iterator();
        boolean encontrado=false;
        
        while(it.hasNext() && !encontrado){
            Vehiculo vehiculo=it.next();
            if (vehiculo.getCodigo().equals(codigo)) {
                encontrado=true;
                vehiculo.setFechaResolucion(LocalDateTime.now());
                siArreglados.add(vehiculo);
                it.remove();
            }
        }
        return encontrado;
    }
    
    public boolean retirarVehiculo(String codigo){
        Iterator<Vehiculo> it= siArreglados.iterator();
        boolean encontrado=false;
        
        while(it.hasNext() && !encontrado){
            Vehiculo vehiculo=it.next();
            if (vehiculo.getCodigo().equals(codigo)) {
                encontrado=true;
                vehiculo.setFechaSalida(LocalDateTime.now());
                retirados.add(vehiculo);
                it.remove();
            }
        }
        return encontrado;
    }

    public String verNoArreglados() {
        return "Taller{" + "noArreglados=" + noArreglados + '}';
    }

    public String verArreglados() {
        return "Taller{" + "siArreglados=" + siArreglados + ", retirados=" + retirados + '}';
    }

    public String verRetirados() {
        return "Taller{" + "retirados=" + retirados + '}';
    }
}
