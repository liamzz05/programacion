/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repaso.repasoexamencolecciones;

import java.util.ArrayList;

/**
 *
 * @author DAM104
 */
public interface Carrera {

    public static void generarDorsales(ArrayList<Runner> lista) {
        for (Runner c : lista) {
            if (c.getDorsal() == -1) {
                c.setDorsal(lista.indexOf(c));
            }
        }
    }

    public static void simularCarrera(ArrayList<Runner> lista) {
        for (Runner c : lista) {
            c.setTiempoMinutos((int)(Math.random()*(160-61)+60));
        }
    }
}
