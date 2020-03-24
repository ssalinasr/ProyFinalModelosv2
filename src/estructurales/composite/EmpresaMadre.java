/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.composite;
import java.util.*;
/**
 *
 * @author Christian Galindo
 */
public class EmpresaMadre extends Empresa{

    protected List<Empresa> filiales = new ArrayList<Empresa>();

    @Override
    public boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }
     
}
