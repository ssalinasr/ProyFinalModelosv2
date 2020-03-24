/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales.proxy;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Galindo
 */
public class RealEspecificacion implements Especificacion {

    @Override
    public void dibuja(ImageIcon i) {
        ImageIcon img = i;
        Image escalada = img.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
       ImageIcon imgesc = new ImageIcon(escalada);
        JOptionPane.showMessageDialog(null, null, "Previsualizacion", 
                JOptionPane.INFORMATION_MESSAGE,carga(imgesc));
    }

    @Override
    public void click(ImageIcon i) {
    }

    public ImageIcon carga(ImageIcon i) {
        ImageIcon icono = i;
        return icono;
    }

}
