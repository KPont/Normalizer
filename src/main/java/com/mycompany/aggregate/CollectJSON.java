/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aggregate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kasper
 */
public class CollectJSON {

    public void send(String jsonString) {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date time = new Date();
        System.out.println(df.format(time) + " Received: " + jsonString);
    }
}
