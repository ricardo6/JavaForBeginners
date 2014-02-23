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
public class Ejemplo8 {
   public static void main(String []args){
       String v=JOptionPane.showInputDialog("Inter radio para calcula en volumende una esfera");
       double vol=Double.parseDouble(v);
       double volumen=Math.PI*vol*vol*vol*4/3;
       JOptionPane.showMessageDialog(null, "Volumen="+volumen+"m3");
   }
}
