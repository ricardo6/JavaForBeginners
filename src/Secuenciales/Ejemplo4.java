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
public class Ejemplo4 {
    public static void main(String []args){
        String grados=JOptionPane.showInputDialog("Introdusca cº para saber Fº");
        double c=Double.parseDouble(grados);
        double f=32+(9*c/5);
        JOptionPane.showMessageDialog(null, f+"Fº");
    }
}
