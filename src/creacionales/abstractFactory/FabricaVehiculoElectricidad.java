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
public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public Automovil creaAutomovil(String marca,String modelo, ImageIcon gif, ImageIcon icon, int potencia, double espacio,int precio) {
        return new AutomovilElectricidad(marca,modelo,gif,icon,potencia,espacio,precio);
    }

    @Override
    public Scooter creaScooter(String modelo, ImageIcon gif, ImageIcon icon, int potencia, int precio) {
        return new ScooterElectricidad(modelo,gif, icon,potencia, precio);
    }



    
}
