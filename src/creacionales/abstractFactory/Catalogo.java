/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;
import estructurales.decorator.Vendible;
import java.util.*;
import comportamentales.iterator.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian Galindo
 */
public class Catalogo {
    
    public static int nAutos=20;
    public static int nScooters=10;
    private Automovil[] autos;
    private Scooter[] scooters;
    private Vendible[] autovendible;
    private Vendible[] scootervendible;
    private Vehiculo f;
    private Escuter z;
    private DefaultTableModel modelCar;
    private DefaultTableModel modelEsc;
    Iterator<VehiculoCreator> t;
    Iterator<EscuterCreator> is;
    private String [] cadenasvehiculos;
    private String [] cadenasescuters;    
    private String [] cadenasvehiculostipo;
    private String [] cadenasescuterstipo;
    
    private ImageIcon[] iconcars;
    private ImageIcon[] iconscooters;
    
    private featuresSorterCar fsc;
    private featuresSorterScooter fss;
    
    private ImageIcon [] gifcar;
    private ImageIcon [] gifscooter;
    
    
    public Catalogo(){
        fsc = new featuresSorterCar();
        fss = new featuresSorterScooter();
        
        iconcars = new ImageIcon[nAutos];
        iconscooters = new ImageIcon[nScooters];
          
        cadenasvehiculos = new String[nAutos];
        cadenasescuters = new String[nScooters];
        
        cadenasvehiculostipo = new String[nAutos];
        cadenasescuterstipo = new String[nScooters];
        
        gifcar = new ImageIcon[nAutos];
        gifscooter = new ImageIcon[nScooters];
    }
    
    public void solicita(String seleccion){
        FabricaVehiculo fabrica;
         autos = new Automovil[nAutos];
         scooters = new Scooter[nScooters];
         autovendible = new Automovil[nAutos];
         scootervendible = new Scooter[nScooters];
        String eleccion = seleccion;
        if(eleccion.equals("Eléctricos")){
            fabrica = new FabricaVehiculoElectricidad();
            f = new Vehiculo("Eléctrico");
            z = new Escuter("Eléctrico");
        }else{
            fabrica = new FabricaVehiculoGasolina();
            f = new Vehiculo("Gasolina");
            z = new Escuter("Gasolina");
        }
          
        t = f.iterator();
        is = z.iterator();
               
        for (int i = 0; i < nAutos; i++) {
            autos[i] = fabrica.creaAutomovil(fsc.getMarca(),fsc.sortModelo(),fsc.sortGif(), fsc.sortImage(),fsc.sortPotencia()
                    , fsc.sortEspacio(),fsc.sortPrecio());
            autovendible[i] = autos[i];
            iconcars[i] = autos[i].getIcon();
            gifcar[i] = autos[i].getGif();
        }
        

        
        for (int i = 0; i < nScooters; i++) {
           scooters[i] = fabrica.creaScooter(fss.sortModelo(), fss.sortGif(), fss.sortImage(), fss.sortPotencia(),fss.sortPrecio());
           scootervendible[i]= scooters[i];
           iconscooters[i] = scooters[i].getIcon();
           gifscooter[i] = scooters[i].getGif();
        }
        
        for(Vendible auto:autovendible){
            f.add(auto.getDescription());
            this.cadenasvehiculos[f.getId()-1] = auto.getDescription();

        }
        while(t.hasNext()){
            VehiculoCreator vb = t.next();
            this.cadenasvehiculostipo[0] = vb.getName();
            this.cadenasvehiculostipo[1] = vb.getName();
            this.cadenasvehiculostipo[2] = vb.getName();
            this.cadenasvehiculostipo[3] = vb.getName();
            this.cadenasvehiculostipo[4] = vb.getName();
            this.cadenasvehiculostipo[5] = vb.getName();
            this.cadenasvehiculostipo[6] = vb.getName();
            this.cadenasvehiculostipo[7] = vb.getName();
            this.cadenasvehiculostipo[8] = vb.getName();
            this.cadenasvehiculostipo[9] = vb.getName();
            this.cadenasvehiculostipo[10] = vb.getName();
            this.cadenasvehiculostipo[11] = vb.getName();
            this.cadenasvehiculostipo[12] = vb.getName();
            this.cadenasvehiculostipo[13] = vb.getName();
            this.cadenasvehiculostipo[14] = vb.getName();
            this.cadenasvehiculostipo[15] = vb.getName();
            this.cadenasvehiculostipo[16] = vb.getName();
            this.cadenasvehiculostipo[17] = vb.getName();
            this.cadenasvehiculostipo[18] = vb.getName();
            this.cadenasvehiculostipo[19] = vb.getName();
            
            
            
            //vb.print();  
    }
        for(Vendible scooter:scootervendible){
            z.add(scooter.getDescription());
            this.cadenasescuters[z.getId()-1] = scooter.getDescription();
        }
        
        while(is.hasNext()){
            EscuterCreator vs = is.next();
            this.cadenasescuterstipo[0] = vs.getName();
            this.cadenasescuterstipo[1] = vs.getName();
            this.cadenasescuterstipo[2] = vs.getName();
            this.cadenasescuterstipo[3] = vs.getName();
            this.cadenasescuterstipo[4] = vs.getName();
            this.cadenasescuterstipo[5] = vs.getName();
            this.cadenasescuterstipo[6] = vs.getName();
            this.cadenasescuterstipo[7] = vs.getName();
            this.cadenasescuterstipo[8] = vs.getName();
            this.cadenasescuterstipo[9] = vs.getName();
            
            //vs.print();
        
        }
    }
    
        
    public DefaultTableModel tableVehicle(){
        Object[] columnas = {"id","tipo","descripción"};
        modelCar = new DefaultTableModel(columnas,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };    
        for(int i = 0 ; i < nAutos; i++){
            String[] filax = new String[3];
            filax[0] = Integer.toString(i+1);
            filax[1] = this.cadenasvehiculos[i];
            filax[2] = this.cadenasvehiculostipo[i];
            modelCar.addRow(filax);      
        }
      
        return modelCar;
    }
    
public DefaultTableModel tableScooter(){
            Object[] columnas = {"id","tipo","descripción"};
            modelEsc = new DefaultTableModel(columnas,0){
                    @Override
                    public boolean isCellEditable(int row, int column){
                        return false;
                    }
            };

        for (int i = 0; i < nScooters; i++){
            String[] filax = new String[3];
            filax[0] = Integer.toString(i+1);
            filax[1] = this.cadenasescuters[i];
            filax[2] = this.cadenasescuterstipo[i];
            modelEsc.addRow(filax);
        }
        
        return modelEsc;
    }
    
    public Vendible[] getAutos() {
        return autovendible;
    }
    
    public Vendible[] getScooters(){
        return scootervendible;
    }    
    
    public ImageIcon[] getImageCars(){
        return iconcars;
    }
    
    public ImageIcon[] getImageScooters(){
        return iconscooters;
    }
    
    public ImageIcon[] getGifCars(){
        return gifcar;
    }
    
    public ImageIcon[] getGifScooters(){
        return gifscooter;
    }
    
}

