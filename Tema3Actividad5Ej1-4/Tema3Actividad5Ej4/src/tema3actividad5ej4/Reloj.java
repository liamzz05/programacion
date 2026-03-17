/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad5ej4;

/**
 *
 * @author José Franciso Márquez Díaz
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor sin argumentos: inicializa a 0:0:0
    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    // Constructor con argumentos: inicializa a valores específicos
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Métodos selectores (getters)
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Métodos modificadores (setters)
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    // Método horaValida: verifica si la hora es válida
    public boolean horaValida() {
        return hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60;
    }

    // Método horaMas: incrementa la hora en un segundo
    public void horaMas() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    // Método horaMenos: decrementa la hora en un segundo
    public void horaMenos() {
        segundo--;
        if (segundo < 0) {
            segundo = 59;
            minuto--;
            if (minuto < 0) {
                minuto = 59;
                hora--;
                if (hora < 0) {
                    hora = 23;
                }
            }
        }
    }

    // Método mostrar12: muestra la hora en formato de 12 horas
    public String mostrar12() {
        int hora12 = hora % 12;
        if (hora12 == 0) hora12 = 12; // Ajustar medianoche o mediodía
        String periodo = (hora < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hora12, minuto, segundo, periodo);
    }

    // Método mostrar24: muestra la hora en formato de 24 horas
    public String mostrar24() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

}
