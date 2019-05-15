/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.basara.controller;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Rivaldo
 */
public class ClockController {
    
    public void clock(javax.swing.JLabel lb_date, javax.swing.JLabel lb_time){
        Thread clock = new Thread(){
            public void run(){
                try{
                    while(true){
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);
        
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);
                        lb_date.setText(year+"-"+month+"-"+day);
                        lb_time.setText(hour+":"+minute+":"+second);
                        sleep(1000);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        clock.start();
    }
    
}
