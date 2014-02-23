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
public class Ejemplo7 {
    public static void main(String[]args){
        System.out.println("introduce n, o tamaño del arreglo");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arrayAlturas=new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("ArrayAlturas["+i+"]=");
            arrayAlturas[i]=scanner.nextInt();
        }
        //promedio
        int sumaAlturas=0;
        for (int i = 0; i < n; i++) {
            sumaAlturas+=arrayAlturas[i];
        }
        int promedioAlturas=sumaAlturas/n;
        System.out.println("Promedio="+promedioAlturas);
        //superios y inferiores a la media
        int mayorAlaMedia=0;
        for (int i = 0; i < n; i++) {
            if (arrayAlturas[i]>promedioAlturas) {
                mayorAlaMedia++;
            }
        }
        //print
        System.out.println("Mayores a la media="+mayorAlaMedia);
        System.out.println("Menores a la media="+(n-mayorAlaMedia));
    }
}
