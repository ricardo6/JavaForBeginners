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
public class Ejemplo6 {
    public static void main(String []args){
       String v=JOptionPane.showInputDialog("Imtrodusca velocidad en km/h para saber m/s");
       double velocidad=Double.parseDouble(v);
       double ms=velocidad*1000/3600;
       JOptionPane.showMessageDialog(null, ms+"m/s");
    }
}
