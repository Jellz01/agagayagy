/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gay;

import java.util.ArrayList;

/**
 *
 * @author jellz
 */
public class Curso {
    public String cur;
    public String fecha;

    public ArrayList<Curso> cursos = new ArrayList<>();
    
    public Curso(){
    }
    

    public Curso(String cur, String fecha) {
        this.cur = cur;
        this.fecha = fecha;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void eliminarCurso(Curso curso) {
        cursos.remove(curso);
    }

    public ArrayList<Curso> listarCursos() {
        for(int i = 0; i < cursos.size(); i++) {
            System.out.println(cursos.get(i).getCur());
        }
        return cursos;
    }

    public ArrayList<Curso> ordenarCursos() {
        Curso temp;
        for(int i = 0; i < cursos.size() - 1; i++) {
            for(int j = 0; j < cursos.size() - i - 1; j++) {
                if(cursos.get(j).getCur().compareTo(cursos.get(j + 1).getCur()) > 0) {
                    temp = cursos.get(j);
                    cursos.set(j, cursos.get(j + 1));
                    cursos.set(j + 1, temp);
                }
            }
        }
        return cursos;
    }

}

    
    

