/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.iterator;

/**
 *
 * @author sebas
 */
public class Escuter {
    
    private EscuterCreator[] scooters = new EscuterCreator[10];
    private int id = 0;
    private String scootername;
    
    public Escuter(String n){
        this.scootername = n;
    }

    public int getId() {
        return id;
    }
    
    public String getnameVehicle(){
        return this.scootername;
    }
    
    public void add(String marca){
        EscuterCreator v = new EscuterCreator(marca, this.scootername);
        this.scooters[id++] = v;
    }
    
    public EscuterIterator iterator(){
        return new EscuterIterator(scooters);
    }
    
}
