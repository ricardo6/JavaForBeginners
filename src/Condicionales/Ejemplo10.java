/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Condicionales;

import java.util.Scanner;

/**
 *Rango de entrada 1-12
 * salida  dependiendo si el mes lleva 30 21 o 28
 * 
 */
public class Ejemplo10 {
    public static void main(String[]args){
        System.out.println("Introduce el mes para saber los diaS");
        Scanner scanner=new Scanner(System.in);
        int mes=scanner.nextInt();
        if (mes<1||mes>12){
            System.out.println("No existe el mes "+mes+" en un año En esta planeta");
        }else{
            if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
            {
                System.out.println("Número de días:"+31);
            }
            if(mes==4||mes==6||mes==9||mes==11)
                System.out.println("Número de días:"+30);
            if(mes==2)
                System.out.println("Número de días:"+28);
        }
    }
}