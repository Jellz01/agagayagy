/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gay;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jellz
 */
public class Controlador {
    Scanner sc = new Scanner(System.in);
    ArrayList<Doctor>doctores = new ArrayList();
    ArrayList<Curso>cursos = new ArrayList();
    int opcion;
    public void controladorMEnu(){
     do{
        VistaDoctor vd1 = new VistaDoctor();
        vd1.ejecutarMenu();
        int opcion = vd1.ejecutarMenu();
                    switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del doctor");
                    String nombre = sc.next();
                    System.out.println("Ingrese la cedula");
                    String cedula = sc.next();
                    ingresarDoctor(nombre, cedula);
                    break;
                case 2:
                    listarDoctores();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del curso");
                    String cur = sc.next();
                    System.out.println("Ingrese la fecha del curso");
                    String fecha = sc.next();
                    System.out.println("Ingrese la cedula del doctor al que pertenece el curso");
                    String cedulaDoctor = sc.next();
                    ingresarCurso(cur, fecha, cedulaDoctor);
                    break;
                case 4:
                    System.out.println("Ingrese la cedula del doctor");
                    String cedulaBusqueda = sc.next();
                    listarCursosPorDoctor(cedulaBusqueda);
                    break;
                case 5:
                    System.out.println("Ingrese el numero de cedula del doctor");
                    String ced1 = sc.nextLine(); 
                    listarCursosPorDoctorOrdenado(ced1);
                    break;
                case 6:
                    System.out.println("Ingrese el numero de cedula del doctor");
                    String ced2 = sc.nextLine(); 
                    listarCursosPorDoctor(ced2);
                default:
                
                    System.out.println("Opcion invalida. Intente de nuevo");
                    break;
            }
    }while(opcion !=6);
     }
       public void ingresarDoctor(String nombre, String cedula) {
    boolean encontrado = false;
    for (Doctor doctor : doctores) {
        if (doctor.getCedula().equals(cedula)) {
            System.out.println("El número de cédula ingresado ya existe en nuestros datos");
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        Doctor nuevoDoctor = new Doctor(nombre, cedula);
        doctores.add(nuevoDoctor);
        System.out.println("Doctor ingresado correctamente");
    }

     }
         public void listarDoctores() {
        if (doctores.isEmpty()) {
            System.out.println("No hay doctores en la lista");
        } else {
            System.out.println("--- Lista de doctores ---");
            for (Doctor doctor : doctores) {
                System.out.println(doctor.getNombre() + " - " + doctor.getCedula());
            }
        }
    }
    
    public void ingresarCurso(String cur, String fecha, String cedulaDoctor) {
    boolean encontrado = false;
    for (Doctor doctor : doctores) {
        if (doctor.getCedula().equals(cedulaDoctor)) {
            Curso nuevoCurso = new Curso(cur, fecha);
            doctor.agregarCurso(nuevoCurso);
            System.out.println("Curso ingresado correctamente");
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontro un doctor con esa cedula");
    }
}


    
   public void listarCursosPorDoctor(String cedula) {
    boolean encontrado = false;
    for (Doctor doctor : doctores) {
        if (doctor.getCedula().equals(cedula)) {
            ArrayList<Curso> cursosDoctor = doctor.listarCursos();
            if (cursosDoctor.isEmpty()) {
                System.out.println("El doctor no tiene cursos registrados");
            } else {
                System.out.println("--- Lista de Cursos del Doctor " + doctor.getNombre() + " ---");
                for (Curso curso : cursosDoctor) {
                    System.out.println(curso.getCur()+ " - " + curso.getFecha());
                }
            }
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontro un doctor con esa cedula");
    }
}

   public void listarCursosPorDoctorOrdenado(String cedula) {
    boolean encontrado = false;
    for (Doctor doctor : doctores) {
        if (doctor.getCedula().equals(cedula)) {
            ArrayList<Curso> cursosDoctor = doctor.listarCursos();
            if (cursosDoctor.isEmpty()) {
                System.out.println("El doctor no tiene cursos registrados");
            } else {
                // Ordenar los cursos alfabéticamente usando el método de burbuja
                for (int i = 0; i < cursosDoctor.size() - 1; i++) {
                    for (int j = 0; j < cursosDoctor.size() - i - 1; j++) {
                        if (cursosDoctor.get(j).getCur().compareTo(cursosDoctor.get(j + 1).getCur()) > 0) {
                            Curso temp = cursosDoctor.get(j);
                            cursosDoctor.set(j, cursosDoctor.get(j + 1));
                            cursosDoctor.set(j + 1, temp);
                        }
                    }
                }
                System.out.println("--- Lista de Cursos del Doctor " + doctor.getNombre() + " ---");
                for (Curso curso : cursosDoctor) {
                    System.out.println(curso.getCur() + " - " + curso.getFecha());
                }
            }
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("No se encontro un doctor con esa cedula");
    }
}
   


    
}
