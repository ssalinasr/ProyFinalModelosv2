/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.iterator;

import javax.swing.JLabel;

/**
 *
 * @author sebas
 */
public class VehiculoCreator {
    
    private String marca;
    private String nameVehiculo;
    
    public VehiculoCreator(String m, String n){
        this.marca = m;
        this.nameVehiculo = n;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getName(){
        return this.nameVehiculo;
    }
    
    public void print(){
        System.out.println(
                 "Marca: "+this.marca+", Vehículo: "+this.nameVehiculo
        );
    }
    
}
