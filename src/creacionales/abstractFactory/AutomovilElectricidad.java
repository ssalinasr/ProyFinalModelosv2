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
public class AutomovilElectricidad extends Automovil{

    public AutomovilElectricidad(String marca,String modelo,ImageIcon gif,ImageIcon icon, int potencia, double espacio,int precio) {
        super(marca,modelo, gif, icon, potencia, espacio,precio);
    }


    @Override
    public String getDescription() {
        String desc = (
                "Marca: "+ marca + " modelo: " + modelo);
        //System.out.println(desc);
        return desc;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
    
}
