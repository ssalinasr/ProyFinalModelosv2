/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.state;

import javax.swing.JLabel;

/**
 *
 * @author sebas
 */
public class stateIniciado implements stateVehicle{
    
    private String statei;

    @Override
    public void registrarEstado(JLabel state) {
        statei = state.getText();
        state.setText("Estado del proceso: " +statei);
    }
    
    
}
