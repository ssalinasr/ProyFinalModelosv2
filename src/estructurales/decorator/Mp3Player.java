/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.decorator;

/**
 *
 * @author Christian Galindo
 */
public class Mp3Player extends AutoDecorador{

    public Mp3Player(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescription() {
        return getVendible().getDescription() + " con Mp3 Player";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 1000;
    }
    
}
