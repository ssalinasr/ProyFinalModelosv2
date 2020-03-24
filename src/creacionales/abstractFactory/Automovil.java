/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;
import estructurales.decorator.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Christian Galindo
 */
public abstract class Automovil implements Vendible{
    
    protected String marca;
    protected String modelo;
    protected ImageIcon icono;
    protected int potencia;
    protected double espacio;
    protected int precio;
    protected ImageIcon gif;

    public ImageIcon getIcono() {
        return icono;
    }

    public void setIcono(ImageIcon icono) {
        this.icono = icono;
    }

    public ImageIcon getGif() {
        return gif;
    }

    public void setGif(ImageIcon gif) {
        this.gif = gif;
    }

    public Automovil(String marca,String modelo, ImageIcon gif, ImageIcon icono, int potencia, double espacio,int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.icono = icono;
        this.potencia = potencia;
        this.espacio = espacio;
        this.precio = precio;
        this.gif = gif;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public ImageIcon getIcon() {
        return icono;
    }

    public int getPotencia() {
        return potencia;
    }

    public double getEspacio() {
        return espacio;
    }
    
    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setIcon(ImageIcon icon) {
        this.icono = icon;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setEspacio(double espacio) {
        this.espacio = espacio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
