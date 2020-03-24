/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.decorator;

import javax.swing.ImageIcon;

/**
 *
 * @author Christian Galindo
 */
public class AireAcondicionado extends AutoDecorador{

    public AireAcondicionado(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescription() {
        return getVendible().getDescription() + "con Aire acondicionado";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 1500;
    }

    
}
