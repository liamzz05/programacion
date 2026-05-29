/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoexamencolecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAM104
 */
public class MediaMaraton {

    private List<Runner> corredores;
    private boolean realizada;
    private static int contador = 0;

    public MediaMaraton() {
        this.corredores = new ArrayList<Runner>();
        this.realizada = false;
    }

    public boolean añadirCorredor(Runner corredor) {
        return corredores.add(corredor);
    }
    
    public boolean borrarCorredor(String DNI) {
        return corredores.removeIf(a -> a.getDNI().equals(DNI));
    }
    
    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

}
