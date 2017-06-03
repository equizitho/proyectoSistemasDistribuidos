/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svtriqui;

import servidor.Servidor;
import servidor.Vista;

/**
 *
 * @author JM
 */
public class Svtriqui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Vista a = new Vista();
            a.setVisible(true);
       Servidor e = new Servidor();
       e.escuchar();
    }
    
}
