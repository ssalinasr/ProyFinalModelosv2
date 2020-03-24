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
public class ScooterElectricidad extends Scooter {

    public ScooterElectricidad(String modelo, ImageIcon gif, ImageIcon icono, int potencia, int precio) {
        super(modelo, gif, icono, potencia, precio);
    }

    @Override
    public String mostrarCaracteristicas() {
       String desc = 
                 "Modelo: "+modelo
                + " de potencia: " + potencia;
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
