/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.ej1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author DAM104
 */
public class Academia {
    private LinkedList<Curso> listaCursos;

    public Academia() {
        listaCursos=new LinkedList<Curso>();
    }
    
    public void annadirCursoFinal(Curso curso){
        listaCursos.addLast(curso);
    }
    
    public void annadirCurso(Curso curso, int pos){
        listaCursos.add(pos, curso);
    }
    
    public void borrarCurso(int codigo){
        Iterator<Curso> iterador=listaCursos.iterator();
        boolean encontrado=false;
        
        while(iterador.hasNext() && !encontrado){
            Curso c=iterador.next();
            if (c.getCodigo()==codigo) {
                iterador.remove();
                System.out.println("Curso eliminado");
                encontrado=true;
            }
        }
    }
    
    public Curso getCursoCodigo(int codigo){
        Iterator<Curso> iterador=listaCursos.iterator();
        boolean encontrado=false;
        Curso curso=null;
        
        while(iterador.hasNext() && !encontrado){
            Curso c=iterador.next();
            if(c.getCodigo()==codigo){
                curso=c;
            }
        }
        return curso;
    }
    
    public void modificarHoras(Curso curso, int horas){
        
    }
    
    public void mostrarCursos(){
        System.out.println(listaCursos);
    }
}
