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
public class EscuterIterator implements Iterator<EscuterCreator> {
    
    private EscuterCreator[] v;
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public EscuterIterator(EscuterCreator[] vv){
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
    public EscuterCreator next() {
        return v[id++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
    
}
