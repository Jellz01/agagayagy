/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gay;

/**
 *
 * @author jellz
*/
import com.mycompany.gay.Doctor;

import java.util.Scanner;
import java.util.ArrayList;

public class VistaDoctor {
    
    public ArrayList<Doctor> doctores = new ArrayList<>();
    public ArrayList<Curso> cursosdoc = new ArrayList<>();
    
    public int ejecutarMenu() {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("1. Ingresar Doctor");
            System.out.println("2. Listar doctores");
            System.out.println("3. Ingresar Curso");
            System.out.println("4. Lista de cursos por doctor");
            System.out.println("5. Lista de cursos ordenados");
            opcion = sc.nextInt();
            
            return opcion;
        } while (opcion != 7);
    }
    
  
    
  

}
