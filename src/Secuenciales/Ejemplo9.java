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
public class Ejemplo9 {
    public static void main(String []args){
        String b=JOptionPane.showInputDialog("inter base");
        String a=JOptionPane.showInputDialog("inter altura");
        double base=Double.parseDouble(b);
        double altura=Double.parseDouble(a);
        double area=base*altura/2;
        JOptionPane.showMessageDialog(null, "area="+area+"m2");
    }
}
