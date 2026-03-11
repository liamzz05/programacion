/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1tema7.ej2;

import java.util.ArrayList;

/**
 *
 * @author DAM104
 */
public class Ej2 {

    public static void main(String[] args) {
        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(new Partido("madrid","getafe",1,3));
        partidos.add(new Partido("madrid","atleti",3,3));
        partidos.add(new Partido("racing","madrid",5,3));
        
        System.out.println("Total partidos: "+partidos.size());
        System.out.println(partidos);
        
        for(Partido a:partidos){
            if(a.getGolesLocal()==a.getGolesVisitante()){
                partidos.remove(a);
            }
        }
        
        partidos.removeIf(p -> !p.esEmpate()); //expresion lambda
        
        System.out.println("Total partidos: "+partidos.size());
        System.out.println(partidos);
        
    }
}
