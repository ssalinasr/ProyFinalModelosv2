/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.prototype;
import java.util.*;
/**
 *
 * @author Christian Galindo
 */
public class DocumentacionCliente extends Documentacion{
    
    private String descripcion;
    private int precio;
    private String placa;

    public DocumentacionCliente(String informacion, String descripcion, int precio, String placa) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.placa = placa;
        documentos = new ArrayList<Documento>();
        DocumentacionBlanco documentacionBlanco = DocumentacionBlanco.Instance();
        List<Documento> documentosEnBlanco = documentacionBlanco.getDocumentos();
        for (Documento documento: documentosEnBlanco) {
            Documento copiaDocumento = documento.duplica();
            copiaDocumento.rellena(informacion);
            documentos.add(copiaDocumento);
        } 
    }
    
    public void visualiza(){
        for (Documento documento: documentos)
            documento.visualiza(descripcion, precio, placa);
    }

    public void imprime(){
        
        for (Documento documento: documentos)
            documento.imprime(descripcion, precio, placa);
    } 
    
}
