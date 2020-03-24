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
public class DocumentacionBlanco extends Documentacion{
    private static DocumentacionBlanco _instance = null;

   private DocumentacionBlanco(){
        documentos = new ArrayList<Documento>();
    }

    public static DocumentacionBlanco Instance(){
        if (_instance == null)
            _instance = new DocumentacionBlanco();
        return _instance;
    }

    public void incluye(Documento doc){
        documentos.add(doc);
    }

    public void excluye(Documento doc){
        documentos.remove(doc);
    } 
}
