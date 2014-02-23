/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo4 {
    public static void main(String []args){
        System.out.println("Hasta que numero quieres multiplicar?");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int j = 1; j <=n; j++) {
            for (int i = 1; i <=10 ; i++) {
                System.out.println(j+"X"+i+"="+(j*i));
            }
            System.out.println("------*********--------");
        }
    }
}
