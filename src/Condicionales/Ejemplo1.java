/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author drupal
 */
public class Ejemplo1 {
    public static void main(String []args) {
        System.out.println("Introduce un nùmero:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%2==0)System.out.println("Es Par");
        else System.out.println("Es impar");
    }
}
