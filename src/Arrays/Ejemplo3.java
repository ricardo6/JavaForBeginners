/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.Scanner;

/**
 * Leer por teclado la nota de los alumnos de una 
 * clase y calcular la nota media del grupo
 * Mostar los alumnos con notas superiores a la media.
 * 
 */
public class Ejemplo3 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce cantidad de alumnos de una clase");
        int numAlumnos=scanner.nextInt();
        int []arrayAlumnos=new int[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Alumno:["+i+"]=");
            arrayAlumnos[i]=scanner.nextInt();
        }
        System.out.print("-----Promedio del curso:.......");
        int notasCurso=0;
        for (int i = 0; i < arrayAlumnos.length; i++) {
            notasCurso+=arrayAlumnos[i];
        }
        int promedioCurso=notasCurso/numAlumnos;
        System.out.println(promedioCurso);
        
        System.out.println("-------Notas de alumnos mayor al promedio");
        for (int i = 0; i < numAlumnos; i++) {
            if(arrayAlumnos[i]>promedioCurso){
                System.out.println("Alunmo"+i+" Nota: "+arrayAlumnos[i]);
            }
        }
    }
}
