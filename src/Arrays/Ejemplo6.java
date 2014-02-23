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
public class Ejemplo6 {

    public static void main(String[] args) {
        System.out.println("Introduce una serie de numeros");
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("array[" + i + "]=");
            array[i] = scanner.nextInt();
        }
        //media negativos y positivos
        double sumP = 0;
        double sumN = 0;
        int countP = 0;
        int countN = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                sumP += array[i];
                countP++;
            } else if(array[i]<0){
                sumN += array[i];
                countN++;
            }
        }
        if (countP == 10) {
            System.out.println("Media Positivos=" + sumP / 10);
        } else if (countN == 10) {
            System.out.println("Media Negativos=" + (sumN / 10));
        } else {
            System.out.println("Media Positivos=" + sumP / countP);
            System.out.println("Media Negativos=" + (sumN / countN));
        }
    }
}
