/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import comportamentales.responsability.descrSort;
import comportamentales.responsability.descrSortSc;
import comportamentales.state.*;
import creacionales.abstractFactory.Catalogo;
import creacionales.factoryMethod.*;
import estructurales.decorator.*;
import estructurales.decorator.Vendible;
import estructurales.fachada.Facade;
import estructurales.proxy.Especificacion;
import estructurales.proxy.EspecificacionProxy;
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**

*
 * @author sebas
 */
public class FrameCatalogoUsuario extends javax.swing.JFrame {

    private String selection;
    private Vendible[] auto;
    private Vendible[] scooters;
    private int globalcounter;
    private ImageIcon[] imacars;
    private ImageIcon[] imascooters;
    private ImageIcon[] gifcars;
    private ImageIcon[] gifscooters;
    private context estado;
    Especificacion especificacion = new EspecificacionProxy();
   
    
    public FrameCatalogoUsuario(String selection) {
        initComponents();
        globalcounter = 0;
        this.selection = selection;
        setLocationRelativeTo(null);
        ejecucion();
        this.TablaCatalogoVehiculos.getTableHeader().setResizingAllowed(false);
        this.TablaCatalogoEscuters.getTableHeader().setResizingAllowed(false);
        this.LblStatus.setBackground(Color.red);
        estado = new context();
        
    }
    
    public void ejecucion(){
        Catalogo catalogo = new Catalogo();
        catalogo.solicita(this.selection);
        auto = catalogo.getAutos();
        scooters = catalogo.getScooters();
        imacars = catalogo.getImageCars();
        imascooters = catalogo.getImageScooters();
        gifcars = catalogo.getGifCars();
        gifscooters = catalogo.getGifScooters();
        this.TablaCatalogoVehiculos.setModel(catalogo.tableVehicle());
        this.TablaCatalogoEscuters.setModel(catalogo.tableScooter());
    }
    
    public String generatePlaca(){
        String placa = "";
        int randAlpha;
        int randNumber;
        int iterator = 0;
        while(iterator < 3){
            randAlpha = 1+(int) Math.floor(Math.random()*27);
            switch(randAlpha){
                case 1:
                    placa = placa + "A";
                    break;
                case 2:
                    placa = placa + "B";
                    break;
                case 3:
                    placa = placa + "C";
                    break;
                case 4:
                    placa = placa + "D";
                    break;
                case 5:
                    placa = placa + "E";
                    break;
                case 6:
                    placa = placa + "F";
                    break;
                case 7:
                    placa = placa + "G";
                    break;
                case 8:
                    placa = placa + "H";
                    break;
                case 9:
                    placa = placa + "I";
                    break;
                case 10:
                    placa = placa + "J";
                    break;
                case 11:
                    placa = placa + "K";
                    break;
                case 12:
                    placa = placa + "L";
                    break;
                case 13:
                    placa = placa + "M";
                    break;
                case 14:
                    placa = placa + "N";
                    break;
                case 15:
                    placa = placa + "O";
                    break;
                case 16:
                    placa = placa + "P";
                    break;
                case 17:
                    placa = placa + "Q";
                    break;
                case 18:
                    placa = placa + "R";
                    break;
                case 19:
                    placa = placa + "S";
                    break;
                case 20:
                    placa = placa + "T";
                    break;
                case 21:
                    placa = placa + "U";
                    break;
                case 22:
                    placa = placa + "V";
                    break;
                case 23:
                    placa = placa + "W";
                    break;
                case 24:
                    placa = placa + "X";
                    break;
                case 25:
                    placa = placa + "Y";
                    break;
                case 26:
                    placa = placa + "Z";
                    break;
                default:
                    placa = placa + "A";
                    break;
            }
        iterator++;
        }
        iterator = 0;
        while(iterator < 3){
            randNumber = (int) Math.floor(Math.random()*10);
            placa = placa + Integer.toString(randNumber);
            iterator++;
        }
        
        return placa;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCatalogoVehiculos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCatalogoEscuters = new javax.swing.JTable();
        LblTxtVe = new javax.swing.JLabel();
        LblTxtSc = new javax.swing.JLabel();
        BtnDescripcion = new javax.swing.JButton();
        BtnCompra = new javax.swing.JButton();
        BtnMuestra = new javax.swing.JButton();
        LblDescripcion = new javax.swing.JLabel();
        LblImage = new javax.swing.JLabel();
        LblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaCatalogoVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaCatalogoVehiculos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(TablaCatalogoVehiculos);

        TablaCatalogoEscuters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaCatalogoEscuters.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(TablaCatalogoEscuters);

        LblTxtVe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblTxtVe.setText("Catálogo de Vehículos");

        LblTxtSc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblTxtSc.setText("Catálogo de Scooters");

        BtnDescripcion.setText("Descripción");
        BtnDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDescripcionActionPerformed(evt);
            }
        });

        BtnCompra.setText("Compra");
        BtnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCompraActionPerformed(evt);
            }
        });

        BtnMuestra.setText("Muestra");
        BtnMuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMuestraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblTxtVe)
                            .addComponent(LblTxtSc, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                    .addComponent(LblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LblTxtVe)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(LblTxtSc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDescripcionActionPerformed
        descrSort descriptor = new descrSort();   
        descrSortSc descriptors = new descrSortSc();
        int id = this.TablaCatalogoVehiculos.getSelectedRow();
        int ids = this.TablaCatalogoEscuters.getSelectedRow();
        if(id != -1 && ids == -1){
        ImageIcon img = this.imacars[id];
        Image escalada = img.getImage().getScaledInstance(this.LblImage.getWidth(), this.LblImage.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon imgesc = new ImageIcon(escalada);
        this.LblImage.setIcon(imgesc);
        if(id % 2 == 0){
            AutoDecorador deco = new Mp3Player(auto[id]);
            descriptor.description(this.LblDescripcion, deco.getDescription(),deco.getPrecio(), id+1);
        }
        else{
            if(id % 3 == 0){
                AutoDecorador deco = new AireAcondicionado(auto[id]);
                descriptor.description(this.LblDescripcion, deco.getDescription(),deco.getPrecio(), id+1);   
            }
            else{
                AutoDecorador deco = new CdPlayer(auto[id]);
                descriptor.description(this.LblDescripcion, deco.getDescription(),deco.getPrecio(), id+1);  
            }
        }
        }
        else{
            if(ids != -1 && id == -1){
              ImageIcon img = this.imascooters[ids];
              Image escalada = img.getImage().getScaledInstance(this.LblImage.getWidth(), this.LblImage.getHeight(), Image.SCALE_DEFAULT);
              ImageIcon imgesc = new ImageIcon(escalada);
              this.LblImage.setIcon(imgesc);
               descriptors.description(this.LblDescripcion, scooters[ids].getDescription(),
                       scooters[ids].getPrecio(), ids+1);
            }
            else{
                JOptionPane.showMessageDialog(null,"Quiza hayan elementos seleccionados mutuamente "
                        + "en las dos tablas, intente de nuevo"
                        + "","Advertencia",2);
                 this.TablaCatalogoEscuters.clearSelection();
                 this.TablaCatalogoVehiculos.clearSelection();
            }
        }
    }//GEN-LAST:event_BtnDescripcionActionPerformed
    
    private String generateReferenceCode(){
        String code = "US";
        int iterator = 0;
        int rand;
        while (iterator < 7){
            rand = (int)Math.floor(Math.random()*9);
            code = code + Integer.toString(rand);
            iterator++;
        }
        return code;
    }
    private void BtnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCompraActionPerformed
        int id = this.TablaCatalogoVehiculos.getSelectedRow();
        int ids = this.TablaCatalogoEscuters.getSelectedRow();
        try {
            estado.iniciado(this.LblStatus);
        } catch (InterruptedException ex) {
            System.out.println("Error de hilo");
        }
        try {
            estado.proceso(this.LblStatus);
        } catch (InterruptedException ex) {
            System.out.println("Error de hilo");
        }
        if(id != -1 && ids == -1){
        String[] Options = {"Contado","Crédito"};
        ImageIcon icon = new ImageIcon();
        Cliente client;
        double currentprice = this.auto[id].getPrecio();
        int Selection = JOptionPane.showOptionDialog(null,"Medio de pago:",
                "Pago",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, Options, Options[0]);
        DefaultTableModel mod = (DefaultTableModel)this.TablaCatalogoVehiculos.getModel();
        if(Selection == 0){
            System.out.println("Paga de contado");
            client = new ClienteContado();
            client.nuevoPedido(currentprice);          
            mod.removeRow(id);
        }
        else{
            System.out.println("Paga a crédito");
            client = new ClienteCredito();
            client.nuevoPedido(currentprice);
            mod.removeRow(id);
        }
    Facade fac = new Facade("Petición usuario "+this.generateReferenceCode(),
            auto[id].getDescription(),auto[id].getPrecio(), generatePlaca());
    fac.incluir();
    fac.vender(); 
          try {
            estado.finalizado(this.LblStatus);
        } catch (InterruptedException ex) {
            System.out.println("Error de hilo");
        }
        }
        else{
            if(id == -1 && ids != -1){
    String[] Options = {"Contado","Crédito"};
        ImageIcon icon = new ImageIcon();
        Cliente client;
        try {
            estado.iniciado(this.LblStatus);
        } catch (InterruptedException ex) {
            System.out.println("Error de hilo");
        }
        try {
            estado.proceso(this.LblStatus);
        } catch (InterruptedException ex) {
            System.out.println("Error de hilo");
        }
        double currentprice = this.scooters[ids].getPrecio();
        int Selection = JOptionPane.showOptionDialog(null,"Medio de pago:",
                "Pago",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, Options, Options[0]);
        DefaultTableModel mod = (DefaultTableModel)this.TablaCatalogoEscuters.getModel();
        if(Selection == 0){
            System.out.println("Paga de contado");
            client = new ClienteContado();
            client.nuevoPedido(currentprice);          
            mod.removeRow(ids);
            
                      
        }
        else{
            System.out.println("Paga a crédito");
            client = new ClienteCredito();
            client.nuevoPedido(currentprice);
            mod.removeRow(ids);
        }
    Facade fac = new Facade("Petición usuario "+this.generateReferenceCode(),
            scooters[ids].getDescription(),scooters[ids].getPrecio(), generatePlaca());
    fac.incluir();
    fac.vender();
    try {
         estado.finalizado(this.LblStatus);
        } catch (InterruptedException ex) {
            System.out.println("Error de hilo");
        }
            }
            else{
                JOptionPane.showMessageDialog(null,"Quiza hayan elementos seleccionados mutuamente "
                        + "en las dos tablas, intente de nuevo"
                        + "","Advertencia",2);
        this.TablaCatalogoEscuters.clearSelection();
        this.TablaCatalogoVehiculos.clearSelection();
                
            }
            
        }
        this.globalcounter++;
        if(globalcounter > 2){
            JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de"
                    + " compras para un usuario individual","Advertencia",2);
            System.exit(0);
        }
        else{
            //do nothing :v
        }

        
    }//GEN-LAST:event_BtnCompraActionPerformed

    private void BtnMuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMuestraActionPerformed
        int id = this.TablaCatalogoVehiculos.getSelectedRow();
        int ids = this.TablaCatalogoEscuters.getSelectedRow();
        
        if(id!=-1 && ids == -1){
            especificacion.click(gifcars[id]);
            especificacion.dibuja(gifcars[id]);
        }    
        else{
            if(ids!= -1 && id == -1){           
                especificacion.click(gifscooters[ids]);
                especificacion.dibuja(gifscooters[ids]);
            }
            else{
                JOptionPane.showMessageDialog(null,"Quiza hayan elementos seleccionados mutuamente "
                        + "en las dos tablas, intente de nuevo"
                        + "","Advertencia",2);
                this.TablaCatalogoEscuters.clearSelection();
                this.TablaCatalogoVehiculos.clearSelection();
            }
        }
    }//GEN-LAST:event_BtnMuestraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCatalogoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCatalogoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCatalogoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCatalogoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCatalogoUsuario("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCompra;
    private javax.swing.JButton BtnDescripcion;
    private javax.swing.JButton BtnMuestra;
    private javax.swing.JLabel LblDescripcion;
    private javax.swing.JLabel LblImage;
    private javax.swing.JLabel LblStatus;
    private javax.swing.JLabel LblTxtSc;
    private javax.swing.JLabel LblTxtVe;
    private javax.swing.JTable TablaCatalogoEscuters;
    private javax.swing.JTable TablaCatalogoVehiculos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
