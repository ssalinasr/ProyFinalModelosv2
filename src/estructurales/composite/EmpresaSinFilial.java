/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.composite;

/**
 *
 * @author Christian Galindo
 */
public class EmpresaSinFilial extends Empresa{


    @Override
    public boolean agregaFilial(Empresa filial) {
        return false;
    }
    
}
