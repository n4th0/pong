/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.*;


public class EventoTeclado extends KeyAdapter {

    static boolean w, s, up, down;

    ///si la pulsas toma el valor de true    
    public void keyPressed(KeyEvent e) {

        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) {
            w = true;
        }
        if (id == KeyEvent.VK_S) {
            s = true;
        }
        if (id == KeyEvent.VK_UP) {
            up = true;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = true;
        }
    }
    ///si lo dejas de pulsar toma el valor false
  
    public void keyReleased(KeyEvent e) {

        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_UP) {
            up = false;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = false;
        }
    }

}
