/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;

import java.util.Arrays;
import javax.swing.ImageIcon;

/**
 *
 * @author sebas
 */
public class featuresSorterCar {
    
    private String marca = sortMarca();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public String sortMarca(){
        String [] m = {"Ford","Mazda","Toyota","Audi"};
        int rand = (int)Math.floor(Math.random()*4);
        return m[rand];
    }
    
    public String sortModelo(){
        String[] m = {"Estándar","Empresarial","Familiar"};
        int rand = (int)Math.floor(Math.random()*3);
        return m[rand];
    }
    
    public ImageIcon sortGif(){
        String marca = this.marca;
        ImageIcon g;
        switch (marca){
            case "Ford":
                g = new ImageIcon(getClass().getResource("/img/gifford.gif"));
                break;
            case "Mazda":
                g = new ImageIcon(getClass().getResource("/img/gifmazda.gif"));
                break;
            case "Toyota":
                g = new ImageIcon(getClass().getResource("/img/giftoyota.gif"));
                break;
            case "Audi":
                g = new ImageIcon(getClass().getResource("/img/gifaudi.gif"));
                break;
            default:
                g = new ImageIcon();
                break;
        }
        this.marca = sortMarca();
        return g;
    }
    
    public ImageIcon sortImage(){
        String marca = this.marca;
        int rand = (int)Math.floor(Math.random()*5);
        ImageIcon[] k = new ImageIcon[5];
        if(marca.equals("Ford")){
            k[0] = new ImageIcon(getClass().getResource("/img/ford1.jpg"));
            k[1] = new ImageIcon(getClass().getResource("/img/ford2.jpg"));
            k[2] = new ImageIcon(getClass().getResource("/img/ford3.jpg"));
            k[3] = new ImageIcon(getClass().getResource("/img/ford4.jpg"));
            k[4] = new ImageIcon(getClass().getResource("/img/ford5.jpg"));
        }
        if(marca.equals("Mazda")){
            k[0] = new ImageIcon(getClass().getResource("/img/mazda1.jpg"));
            k[1] = new ImageIcon(getClass().getResource("/img/mazda2.jpg"));
            k[2] = new ImageIcon(getClass().getResource("/img/mazda3.jpg"));
            k[3] = new ImageIcon(getClass().getResource("/img/mazda4.jpg"));
            k[4] = new ImageIcon(getClass().getResource("/img/mazda5.jpg"));
        }
        if(marca.equals("Toyota")){
            k[0] = new ImageIcon(getClass().getResource("/img/toyota1.jpg"));
            k[1] = new ImageIcon(getClass().getResource("/img/toyota2.jpg"));
            k[2] = new ImageIcon(getClass().getResource("/img/toyota3.jpg"));
            k[3] = new ImageIcon(getClass().getResource("/img/toyota4.jpg"));
            k[4] = new ImageIcon(getClass().getResource("/img/toyota5.jpg"));
        }
        if(marca.equals("Audi")){
            k[0] = new ImageIcon(getClass().getResource("/img/audi1.jpg"));
            k[1] = new ImageIcon(getClass().getResource("/img/audi2.jpg"));
            k[2] = new ImageIcon(getClass().getResource("/img/audi3.jpg"));
            k[3] = new ImageIcon(getClass().getResource("/img/audi4.jpg"));
            k[4] = new ImageIcon(getClass().getResource("/img/audi5.jpg"));
        }
        return k[rand];
    }
    
    public int sortPotencia(){
        int rand = 10+(int)Math.floor(Math.random()*60);
        return rand;
    }
    
    public int sortEspacio(){
        int rand = 1+(int)Math.floor(Math.random()*6);
        return rand;
    }
    
    public int sortPrecio(){
        int rand = 500+(int)Math.floor(Math.random()*1000);
        return rand;
    }
    
}
