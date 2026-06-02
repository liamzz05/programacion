/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoexamencolecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DAM104
 */
public class MediaMaraton {

    private ArrayList<Runner> corredores;
    private boolean realizada;
    private static int contador = 0;
    private ArrayList<Juez> jueces;

    public MediaMaraton() {
        this.corredores = new ArrayList<Runner>();
        this.realizada = false;
        this.jueces = new ArrayList<Juez>();
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

    public ArrayList<Runner> getCorredores() {
        return corredores;
    }

    public void mostrarCarrera() {
        if (realizada) {
            ArrayList<Runner> ordenados = new ArrayList<>(corredores);

            ordenados.sort(Comparator.comparingInt(Runner::getTiempoMinutos)
                    .thenComparingInt(Runner::getDorsal));

            for (Runner r : ordenados) {
                System.out.println(r);
            }

        } else {
            System.out.println("La carrera no fue realizada");
        }
    }

    public void mostrarVeteranos() {
        for (Juez juez : jueces) {
            if (juez.getFechaNac().isBefore(LocalDate.of(1980, 01, 01))) {
                System.out.println(juez.toString());
            }
        }
    }
}
