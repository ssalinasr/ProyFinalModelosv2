/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.fachada;

import creacionales.prototype.*;

/**
 *
 * @author Christian Galindo
 */
public class Facade {

    private DocumentacionBlanco documentacionEnBlanco;
    private DocumentacionCliente documentacionCliente;

    public Facade(String usuario, String descripcion, int precio, String placa) {
        documentacionEnBlanco = DocumentacionBlanco.Instance();
        incluir();
        documentacionCliente = new DocumentacionCliente(usuario, descripcion, precio, placa);
    }

    public void incluir(){
        documentacionEnBlanco.incluye(new OrdenPedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
    }
    public void vender() {
        documentacionCliente.imprime();
        documentacionCliente.visualiza();
        //System.out.println("Vendido");
    }

}
