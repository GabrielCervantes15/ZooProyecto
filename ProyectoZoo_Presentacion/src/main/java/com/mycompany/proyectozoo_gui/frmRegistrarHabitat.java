/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectozoo_gui;


import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import Logica.FabricaLogica;
import Logica.ILogica;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

/**
 *
 * @author diego
 */
public class frmRegistrarHabitat extends javax.swing.JFrame {
        DefaultListModel<Continente> modeloListaContinentesDisponibles = new DefaultListModel<>();
        DefaultListModel<Continente> modeloListaContinentesSeleccionados = new DefaultListModel<>();
        ILogica logica;
    /**
     * Creates new form RegistrarHabitat
     */
    public frmRegistrarHabitat() {
        
        logica =FabricaLogica.crearInstancia();
        initComponents();
        listaContinentesDisponibles.setModel(modeloListaContinentesDisponibles);
        listaContinentesSeleccionados.setModel(modeloListaContinentesSeleccionados);
       
    }
    
    public frmRegistrarHabitat(List<Continente> lcl,List<Clima> lc,List<Vegetacion> lv) {
        logica =FabricaLogica.crearInstancia();
        initComponents();
        listaContinentesDisponibles.setModel(modeloListaContinentesDisponibles);
        listaContinentesSeleccionados.setModel(modeloListaContinentesSeleccionados);
        this.llenarDatos(lcl, lc, lv);
    }
    
    public void llenarDatos(List<Continente> lcl,List<Clima> lc,List<Vegetacion> lv){
        modeloListaContinentesSeleccionados.removeAllElements();
        for (Continente con:lcl) {
            modeloListaContinentesDisponibles.addElement(con);
        }
        for (Clima cli:lc) {
            cmbClimas.addItem(cli);
        }
        for (Vegetacion vege:lv) {
            cmbVegetacion.addItem(vege);
        }
    }
    public void activarCampos(){
        btnVerificar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        cmbVegetacion.setEnabled(true);
        cmbClimas.setEnabled(true);
        listaContinentesSeleccionados.setEnabled(true);
        listaContinentesDisponibles.setEnabled(true);
        
    }
    public void desactivarCampos(){
        btnVerificar.setEnabled(true);
        btnRegistrar.setEnabled(false);
        cmbVegetacion.setEnabled(false);
        cmbClimas.setEnabled(false);
        listaContinentesSeleccionados.setEnabled(false);
        listaContinentesDisponibles.setEnabled(false);
        for (int i = 0; i < modeloListaContinentesSeleccionados.size(); i++) {
            
        }
        
    }
    public void mostrarHabitat(Habitat habitat){
        JOptionPane.showMessageDialog(this, "Habitat Encontrada! se mostrara la informacion de esta");
         for (Continente c :habitat.getContinentes()) {
             for (int i = 0; i < modeloListaContinentesDisponibles.size(); i++) {
                 if (modeloListaContinentesDisponibles.get(i).equals(c)) {
                     modeloListaContinentesSeleccionados.addElement(c);
                     modeloListaContinentesDisponibles.remove(i);
                 }
             }
 
         }
         cmbClimas.setSelectedItem(habitat.getClima());
         cmbVegetacion.setSelectedItem(habitat.getVegetacion());
         desactivarCampos();
            
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombreHabitat = new javax.swing.JTextField();
        cmbVegetacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaContinentesDisponibles = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        cmbClimas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaContinentesSeleccionados = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreHabitatActionPerformed(evt);
            }
        });
        txtNombreHabitat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreHabitatKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 71, 169, -1));

        cmbVegetacion.setEnabled(false);
        jPanel1.add(cmbVegetacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 198, 136, -1));

        jLabel3.setText("Vegetacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 173, -1, -1));

        jLabel8.setText("Seleccionados");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 258, -1, -1));

        listaContinentesDisponibles.setEnabled(false);
        listaContinentesDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaContinentesDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaContinentesDisponibles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 281, 100, 120));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 102, 251, 10));

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 70, -1, -1));

        jLabel2.setText("Climas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 119, -1, -1));

        btnVerificar.setBackground(new java.awt.Color(153, 255, 153));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 70, -1, -1));

        cmbClimas.setEnabled(false);
        cmbClimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClimasActionPerformed(evt);
            }
        });
        jPanel1.add(cmbClimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 142, 136, -1));

        jLabel6.setText("Continentes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 235, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        btnRegistrar.setText("Registrar Habitat");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 184, -1, -1));

        listaContinentesSeleccionados.setEnabled(false);
        listaContinentesSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaContinentesSeleccionadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaContinentesSeleccionados);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 99, 120));

        jLabel7.setText("Disponibles");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 258, -1, -1));

        jLabel4.setText("Ingrese Nombre Habitats");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 47, -1, -1));

        jLabel5.setText("Continentes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 235, -1, -1));

        jLabel9.setText("Primero  Verifica el nombre del habitat");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 1, -1, 34));

        jLabel10.setText("para habilitar campos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Habitat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (!txtNombreHabitat.getText().isEmpty()) {
            Habitat habitat=logica.verificaNombreHabitat(txtNombreHabitat.getText());
            reiniciarContinentes();
            if(habitat!=null){
                mostrarHabitat(habitat);
            }else{
             JOptionPane.showMessageDialog(this, "Se activaran los campos");
              activarCampos();
              txtNombreHabitat.setEnabled(false);
            }
        }

    }//GEN-LAST:event_btnVerificarActionPerformed

    private void listaContinentesDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaContinentesDisponiblesMouseClicked
                if (evt.getClickCount() == 2) {
                    Continente selectedValue = listaContinentesDisponibles.getSelectedValue();
                    if (selectedValue != null) {
                        modeloListaContinentesSeleccionados.addElement(selectedValue);
                        modeloListaContinentesDisponibles.removeElement(selectedValue);
                    }
                }
    }//GEN-LAST:event_listaContinentesDisponiblesMouseClicked

    private void listaContinentesSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaContinentesSeleccionadosMouseClicked
       if (evt.getClickCount() == 2) {
                    Continente selectedValue = listaContinentesSeleccionados.getSelectedValue();
                    if (selectedValue != null) {
                        modeloListaContinentesDisponibles.addElement(selectedValue);
                        modeloListaContinentesSeleccionados.removeElement(selectedValue);
                    }
                }
    }//GEN-LAST:event_listaContinentesSeleccionadosMouseClicked

    private void txtNombreHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreHabitatActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validadCampos()) {
            registrarHabitat();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         frmPrincipalP f = new frmPrincipalP();
        f.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    txtNombreHabitat.setText("");
    desactivarCampos();
    txtNombreHabitat.setEnabled(true);
    reiniciarContinentes();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbClimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClimasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClimasActionPerformed

    private void txtNombreHabitatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreHabitatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreHabitatKeyTyped
    public void registrarHabitat(){
        Habitat h = new Habitat();
        h.setNombre(txtNombreHabitat.getText());
        List<Continente> seleccionados = new ArrayList<>();
        for (int i = 0; i < modeloListaContinentesSeleccionados.size(); i++) {
            seleccionados.add(modeloListaContinentesSeleccionados.get(i));
        }
        h.setContinentes(seleccionados);
        h.setClima((Clima) cmbClimas.getSelectedItem());
        h.setVegetacion((Vegetacion) cmbVegetacion.getSelectedItem());
        
        
        if (logica.guardarHabitat(h)) {
            JOptionPane.showMessageDialog(this, "Registro Exitoso");
           frmPrincipalP f = new frmPrincipalP();
        f.setVisible(true);
        this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(this, "Error al Registrar");
        }
        
    }
    public void reiniciarContinentes(){
        while(!modeloListaContinentesSeleccionados.isEmpty()){
            modeloListaContinentesDisponibles.addElement(modeloListaContinentesSeleccionados.get(0));
            modeloListaContinentesSeleccionados.remove(0);
        }
        cmbClimas.setSelectedIndex(0);
        cmbVegetacion.setSelectedIndex(0);
        
    }
   
    public boolean validadCampos(){
        if (txtNombreHabitat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Indique un Nombre de Habitat,Porfavor");
            return false;
        }
        if (modeloListaContinentesSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione minimo 1 Continente");
            return false; 
        }   
        return true;
    }
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
            java.util.logging.Logger.getLogger(frmRegistrarHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarHabitat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<Clima> cmbClimas;
    private javax.swing.JComboBox<Vegetacion> cmbVegetacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<Continente> listaContinentesDisponibles;
    private javax.swing.JList<Continente> listaContinentesSeleccionados;
    private javax.swing.JTextField txtNombreHabitat;
    // End of variables declaration//GEN-END:variables
}