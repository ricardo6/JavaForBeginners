/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el tamaño del arreglo");
        double suma=0;
        int n=scanner.nextInt();
        double[] serie=new double[n];
        for (int i = 0; i < n; i++) {
           System.out.print("serie["+i+"]=");
           serie[i]=scanner.nextDouble();
       }
        for (int i = 0; i < serie.length; i++) {
            suma+=serie[i];
        }
        System.out.println("Promedio:"+suma+"/"+serie.length+"="+suma/serie.length);
    }
}

