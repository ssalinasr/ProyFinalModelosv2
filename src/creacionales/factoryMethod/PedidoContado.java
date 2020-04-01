/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.factoryMethod;

import comportamentales.templatemethod.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Galindo
 */
public class PedidoContado extends Pedido{

    public PedidoContado(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public void paga() {
        calculateInterface calc;
        calc = new calculateViaContado();
        this.importe = calc.calcularImporte(importe);
        JOptionPane.showMessageDialog(null,"El pago del pedido por precio de "+
            importe +" se ha realizado.","Éxito",1);
        
        System.out.println("Acción ejecutada con éxito");
    }
    
}
