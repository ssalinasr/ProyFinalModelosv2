/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.iterator;

import java.util.Iterator;

/**
 *
 * @author sebas
 */
public class VehiculoIterator implements Iterator<VehiculoCreator> {
    
    private VehiculoCreator[] v;
    private int id = 0;
    
    public VehiculoIterator(VehiculoCreator[] vv){
        this.v = vv;
    }

    @Override
    public boolean hasNext() {
        if(this.id < v.length && v[id] != null){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public VehiculoCreator next() {
        return v[id++];
    }

    public int getId() {
        return id;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
    
}
