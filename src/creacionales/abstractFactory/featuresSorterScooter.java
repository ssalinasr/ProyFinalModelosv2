/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;

import javax.swing.ImageIcon;

/**
 *
 * @author sebas
 */
public class featuresSorterScooter {
    
    
    public String sortModelo(){
        String[] m = {"Estándar","Deportivo","Clásico"};
        int rand = (int)Math.floor(Math.random()*3);
        return m[rand];
    }
    
    public ImageIcon sortGif(){
        ImageIcon[] i = {new ImageIcon(getClass().getResource("/img/gifscooter1.gif")),
        new ImageIcon(getClass().getResource("/img/gifscooter2.gif")),
        new ImageIcon(getClass().getResource("/img/gifscooter3.gif"))};
        int rand = (int) Math.floor(Math.random()*3);
        return i[rand];
    }
    
    public ImageIcon sortImage(){
        ImageIcon[] i = {new ImageIcon(getClass().getResource("/img/scooter1.jpg")),
        new ImageIcon(getClass().getResource("/img/scooter2.jpg")),
        new ImageIcon(getClass().getResource("/img/scooter3.png")),
        new ImageIcon(getClass().getResource("/img/scooter4.jpg")),
        new ImageIcon(getClass().getResource("/img/scooter5.jpg")),
        new ImageIcon(getClass().getResource("/img/scooter6.jpg")),
        new ImageIcon(getClass().getResource("/img/scooter7.jpg")),
        new ImageIcon(getClass().getResource("/img/scooter8.jpg")),
        new ImageIcon(getClass().getResource("/img/scooter9.jpg")),
        new ImageIcon(getClass().getResource("/img/scooter10.jpg"))};
        int rand = (int)Math.floor(Math.random()*10);
        return i[rand];
    }
    
    public int sortPotencia(){
        int rand = 10+(int)Math.floor(Math.random()*60);
        return rand;
    }
    
    public int sortPrecio(){
        int rand = 500+(int)Math.floor(Math.random()*1000);
        return rand;
    }
    
}
