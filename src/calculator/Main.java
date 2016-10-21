/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.SwingUtilities;

/**
 *
 * @author Carmen_Lucia3
 */
public class Main {
    public static void main(String[] args) {
        Calculator ui = new Calculator();
        SwingUtilities.invokeLater((Runnable) ui);
    }     
}
