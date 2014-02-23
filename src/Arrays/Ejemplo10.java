/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import com.sun.corba.se.impl.orbutil.ORBConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Format;
import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo10 {
    public static void main(String[]args){
        System.out.println("introduce tamaño del arreglo");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double[]arrayAleatorio=new double[n];
        for (int i = 0; i < n; i++) {
            arrayAleatorio[i]=(double)Math.random()*n;
        }
        System.out.println("Lenado de arreglo de forma randónico");
        for (int i = 0; i < n; i++) {
            BigDecimal bd=new BigDecimal(arrayAleatorio[i]);
            System.out.println(bd.setScale(2,RoundingMode.HALF_UP));
        }
    }
}
