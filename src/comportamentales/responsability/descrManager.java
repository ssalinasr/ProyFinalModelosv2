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
public interface descrManager {
    
    public void setNext(descrManager dm);
    public descrManager getManager();
    public void description(JLabel lbl, String desc, int price, int id);
    
}
