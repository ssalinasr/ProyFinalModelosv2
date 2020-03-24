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
public class context {
    
    private stateVehicle state;
    
    public void iniciado(JLabel status) throws InterruptedException{
        this.state = new stateIniciado();
        status.setText("iniciado...");
        state.registrarEstado(status);
        Thread.sleep(1000);
    }
    
    public void proceso(JLabel status) throws InterruptedException{
        this.state = new stateProceso();
        status.setText("en proceso...");
        state.registrarEstado(status);
        Thread.sleep(1000);
    }
    
    public void finalizado(JLabel status) throws InterruptedException{
        this.state = new stateFinalizado();
        status.setText("finalizado...");
        state.registrarEstado(status);
        Thread.sleep(1000);
    }
    
}
