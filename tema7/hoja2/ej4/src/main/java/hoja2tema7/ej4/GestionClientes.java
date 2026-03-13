/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.ej4;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DAM104
 */
public class GestionClientes {

    private Queue<Cliente> listaEspera = new LinkedList<>();
    private LinkedList<Cliente> historial = new LinkedList();
    
    public void añadirCliente(Cliente cli){
        listaEspera.add(cli);
    }
    
    public void atenderCliente(){
        listaEspera.peek().setHoraAtendido(LocalDateTime.now());
        historial.add(listaEspera.peek());
        listaEspera.poll();
    }
    
    public void obtenerEsperaPendiente(){
        
    }
    
    public void mediaEspera(){
        LocalDateTime tiempo;
        for(Cliente cli : historial){
            
        }
    }
    
    public void mostrarCola(){
        System.out.println(listaEspera);
    }
}
