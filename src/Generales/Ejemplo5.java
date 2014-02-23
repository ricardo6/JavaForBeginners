/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generales;

import com.sun.org.apache.bcel.internal.Constants;
import java.util.Scanner;

/**
 *
 * @author drupal
 */
public class Ejemplo5 {
   private boolean tiene=false;
   public boolean verificarDos(int n) {
        while (n>0) {            
            if (n%10==2) {
                tiene=true;
                break;
            }
            else{
                //para ver si un numero tiene un dos en cuaquier parte
                //tiene=false;
                //n=n/10;
                break;
            }
        }
        return tiene;
    }
    public void mostrar(){
        System.out.println(tiene?"termina en dos":"No termina en dos");
    }
    public static void main(String []args){
        System.out.println("Introduce un numero para vertificar si tiene un dos");
        Scanner scanner=new Scanner(System.in);
        int numero=scanner.nextInt();
        Ejemplo5 e5=new Ejemplo5();
        e5.verificarDos(numero);
        e5.mostrar();
    }
}
