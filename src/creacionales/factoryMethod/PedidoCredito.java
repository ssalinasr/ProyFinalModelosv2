/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.factoryMethod;

import comportamentales.mediator.mediatorCredito;
import comportamentales.templatemethod.*;
import java.math.BigInteger;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Galindo
 */
public class PedidoCredito extends Pedido{

    public PedidoCredito(double importe) {
        super(importe);
    }
/*
   4455261600273262 Visa
   4766112373743631 Visa
   5159484379360088 Master Card
   5501985571257620 Master Card
   372750828187351  American Express
*/
    
    @Override
    public boolean valida() {
        mediatorCredito m = new mediatorCredito();
        try{
        BigInteger dit = new BigInteger(JOptionPane.showInputDialog(null,"Digite su número de "
                + "tarjeta de crédito",""));
        String pag = JOptionPane.showInputDialog(null,"Ingrese su medio de pago: (Visa, master Card"
                + ", American Express)","");
        if(m.verificarForm(dit, pag)==false){
            JOptionPane.showMessageDialog(null,"ups, el medio de pago o la tarjeta de crédito no es válido"
            ,"Error",0);
            return false;
        }else{
            return m.verificarForm(dit, pag);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Acción cancelada","Advertencia",2);
            return false;
        }
    }

    @Override
    public void paga() {
        calculateInterface calc;
        calc = new calculateExtranjero();
        this.importe = calc.calcularImporte(importe);
        JOptionPane.showMessageDialog(null,"El pago del pedido a crédito por "
                +importe+ " se ha realizado","Éxito",1);
        System.out.println("Acción realizada con éxito");
        
    }
    
}
