/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.responsability;

import javax.swing.JLabel;

/**
 *
 * @author sebas
 */
public class descrSortSc implements descrManager {
    
    private descrManager manager_next;

    @Override
    public void setNext(descrManager dm) {
        this.manager_next = dm;
    }

    @Override
    public descrManager getManager() {
        return this.manager_next;
    }

    @Override
    public void description(JLabel lbl, String description, int price, int id) {
        descrScooter1 s1 = new descrScooter1();
        descrScooter2 s2 = new descrScooter2();
        descrScooter3 s3 = new descrScooter3();
        descrScooter4 s4 = new descrScooter4();
        descrScooter5 s5 = new descrScooter5();
        descrScooter6 s6 = new descrScooter6();
        descrScooter7 s7 = new descrScooter7();
        descrScooter8 s8 = new descrScooter8();
        descrScooter9 s9 = new descrScooter9();       
        descrScooter10 s10 = new descrScooter10();
     
       this.manager_next = s1;
        
        s1.setNext(s2);
        s2.setNext(s3);
        s3.setNext(s4);
        s4.setNext(s5);
        s5.setNext(s6);
        s6.setNext(s7);
        s7.setNext(s8);
        s8.setNext(s9);
        s9.setNext(s10);
        
        this.manager_next.description(lbl, description,price, id);
        
    }
    
    
    
}
