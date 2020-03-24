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
public class EscuterCreator {
    
    private String marca;
    private String nameScooter;
    
    public EscuterCreator(String m, String n){
        this.marca = m;
        this.nameScooter = n;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getName(){
        return this.nameScooter;
    }
    
    public void print(){
        System.out.println(
                 "Modelo: "+this.marca+", "
                        + "Vehículo: "+this.nameScooter);
    }
    
}
