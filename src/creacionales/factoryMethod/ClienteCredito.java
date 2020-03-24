/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.factoryMethod;

/**
 *
 * @author Christian Galindo
 */
public class ClienteCredito extends Cliente{

    @Override
    public Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
    
}
