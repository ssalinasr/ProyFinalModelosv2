/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.prototype;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Galindo
 */
public class CertificadoCesion extends Documento{

    @Override
    public void imprime(String descripcion, int precio, String placa) {

        String infofinal = "<html>"
                + "Compra realizada...<br>"
                + "Vehículo: "+descripcion+"<br>"
                + "Precio: "+precio+"<br>"
                + "Placa: "+placa+"<br>"
                +"-----------------------<br>"
                + "Gracias por usar el sistema..."
                +"</html>";
    }

    @Override
    public void visualiza(String descripcion, int precio, String placa) {
        try {
            FileWriter f = new FileWriter("cesion.txt",true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter w = new PrintWriter(b);
            w.println("Certificado de cesión creado:");
            w.println("Del vehículo: "+descripcion);
            w.println("De precio: "+precio);
            w.println("Placa: "+placa);
            w.println("La petición de "+contenido+" se ha realizado la operación con éxito");
            w.println("Gracias por utilizar el sistema...");
            w.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"El documento no pudo ser creado, F","Error",0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"El documento no pudo ser creado, F","Error",0);
        }
    }
    
}
