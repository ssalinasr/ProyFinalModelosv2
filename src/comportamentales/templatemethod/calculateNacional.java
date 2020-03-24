/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.templatemethod;

/**
 *
 * @author sebas
 */
public class calculateNacional implements calculateInterface {

    @Override
    public double calcularImporte(double vehicleValue){
        double IVA = (vehicleValue * 19)/100;
        return (Math.floor(vehicleValue+IVA));
    }
    
}
