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
public class stateProceso implements stateVehicle{
    
    private String statep;

    @Override
    public void registrarEstado(JLabel state) {
        statep = state.getText();
        state.setText("Estado del proceso: "+statep);
    }
    
    
}
