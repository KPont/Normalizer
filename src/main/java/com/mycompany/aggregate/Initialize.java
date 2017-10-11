/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aggregate;

/**
 *
 * @author Kasper
 */
public class Initialize {
    public static void main(String[] args) throws Exception {
        ReceiveJSON rj = new ReceiveJSON();
        ReceiveXML rx = new ReceiveXML();
        Thread t1 = new Thread(rj);
        Thread t2 = new Thread(rx);
        
        t1.start();
        t2.start();
    }
}
