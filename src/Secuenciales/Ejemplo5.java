/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Secuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author drupal
 */
public class Ejemplo5 {
   public static void main(String []args){
       String ra=JOptionPane.showInputDialog("Introdusca radtio");
       double radio=Double.parseDouble(ra);
       double res=2*Math.PI*radio;
       JOptionPane.showMessageDialog(null, "LogituC="+res);
   }
}
