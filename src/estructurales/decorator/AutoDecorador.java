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
public abstract class AutoDecorador implements Vendible{
    
    private Vendible vendible;

    public AutoDecorador(Vendible vendible) {
        setVendible(vendible);
    }

    public Vendible getVendible() {
        return vendible;
    }

    public void setVendible(Vendible vendible) {
        this.vendible = vendible;
    }
    
    
    
    
}
