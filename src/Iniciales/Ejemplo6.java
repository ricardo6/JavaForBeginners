/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iniciales;

import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo6 {
    public static void main(String []args){
        System.out.println("Introduce un numero");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println((n<0)?"Negativo":"positivo");
    }
}
