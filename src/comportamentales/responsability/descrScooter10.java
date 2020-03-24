/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.responsability;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class descrScooter10 implements descrManager{

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
    public void description(JLabel lbl, String description,int price, int id) {
        if (id == 10){
        lbl.setText("<html>"+description+"<br> Precio: "+price);
        }
        else{
            JOptionPane.showMessageDialog(null,"No se ha reconocido el elemento, intente de nuevo","Error",0);
        }
    }
    
}
