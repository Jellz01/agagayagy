/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gay;

/**
 *
 * @author jellz
 */
import java.util.ArrayList;

public class Doctor  {
    public String nombre;
    public String cedula;
    public ArrayList<Doctor> doctores;
    public ArrayList<Curso> cursos;

    public Doctor(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.doctores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void ingresarDoctor(String nombre, String cedula) {
        Doctor nuevoDoctor = new Doctor(nombre, cedula);
        doctores.add(nuevoDoctor);

        System.out.println("Los Doctores son: ");
        for (Doctor doctor : doctores) {
            System.out.println(doctor.getNombre() + " " + doctor.getCedula());
        }
    }

    public void ingresarCurso(String cur, String fecha) {
        Curso nuevoCurso = new Curso(cur, fecha);
        cursos.add(nuevoCurso);

        System.out.println("Los Cursos son: ");
        for (Curso curso : cursos) {
            System.out.println(curso.getCur() + " - " + curso.getFecha());
        }
    }
     public ArrayList<Curso> listarCursos() {
        for(int i = 0; i < cursos.size(); i++) {
            System.out.println(cursos.get(i).getCur());
        }
        return cursos;
    }
     public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

        public Doctor buscarDoctor(String cedula) {
    for (Doctor doctor : doctores) {
        if (doctor.getCedula().equals(cedula)) {
            return doctor;
        }
    }
    System.out.println("No se encontró un doctor con la cédula " + cedula);
    return null;
}
}

   