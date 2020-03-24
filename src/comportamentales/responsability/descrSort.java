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
public class descrSort implements descrManager {
    
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
        descrVehicle1 v1 = new descrVehicle1();
        descrVehicle2 v2 = new descrVehicle2();
        descrVehicle3 v3 = new descrVehicle3();
        descrVehicle4 v4 = new descrVehicle4();
        descrVehicle5 v5 = new descrVehicle5();
        descrVehicle6 v6 = new descrVehicle6();
        descrVehicle7 v7 = new descrVehicle7();
        descrVehicle8 v8 = new descrVehicle8();
        descrVehicle9 v9 = new descrVehicle9();
        descrVehicle10 v10 = new descrVehicle10();
        descrVehicle11 v11 = new descrVehicle11();
        descrVehicle12 v12 = new descrVehicle12();
        descrVehicle13 v13 = new descrVehicle13();
        descrVehicle14 v14 = new descrVehicle14();
        descrVehicle15 v15 = new descrVehicle15();
        descrVehicle16 v16 = new descrVehicle16();
        descrVehicle17 v17 = new descrVehicle17();
        descrVehicle18 v18 = new descrVehicle18();
        descrVehicle19 v19 = new descrVehicle19();
        descrVehicle20 v20 = new descrVehicle20();
        
        this.manager_next = v1;
        
        v1.setNext(v2);
        v2.setNext(v3);
        v3.setNext(v4);
        v4.setNext(v5);
        v5.setNext(v6);
        v6.setNext(v7);
        v7.setNext(v8);
        v8.setNext(v9);
        v9.setNext(v10);
        v10.setNext(v11);
        v11.setNext(v12);
        v12.setNext(v13);
        v13.setNext(v14);
        v14.setNext(v15);
        v15.setNext(v16);
        v16.setNext(v17);
        v17.setNext(v18);
        v18.setNext(v19);
        v19.setNext(v20);
        
        this.manager_next.description(lbl, description,price, id);
        
    }
    
    
    
}
