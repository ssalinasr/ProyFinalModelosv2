/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;

import javax.swing.ImageIcon;

/**
 *
 * @author Christian Galindo
 */
public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, ImageIcon gif, ImageIcon icon, int potencia, int precio) {
        super(modelo, gif ,icon, potencia, precio);
    }

    @Override
    public String mostrarCaracteristicas() {
        String desc = 
                 "Modelo: "+modelo
                 +" de potencia: " + potencia;
        return desc;
    }

    @Override
    public String getDescription() {
        String desc = 
                 "Modelo: "+modelo
                 + " de potencia: " + potencia;
        return desc;
        
    }

    @Override
    public int getPrecio() {
        return precio;
    }
    
}
