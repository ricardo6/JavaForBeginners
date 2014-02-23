/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo2 {
    public static void main(String[]args){
        System.out.println("Introduce unas serie de numeros");
        int suma=0;
        Scanner scanner=new Scanner(System.in);
        int []array=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("array["+i+"]=");
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i%2==0) {
                suma+=array[i];
            }
        }
        System.out.println("Promedio de:"+suma/5);
    }
}
