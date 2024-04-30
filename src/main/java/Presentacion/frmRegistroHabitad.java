/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;


import dto.HabitatDTO;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import objetosNegocio.Habitat;
import administrarAnimalesSubsistema.*;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Animal;

/**
 *
 * @author Gabriel
 */
public class frmRegistroHabitad extends javax.swing.JFrame {
  private FachadaAdministrarHabitat fachadaHabitat;
        
    /**
     * Creates new form ftmRegistroHabitad
     */
    public frmRegistroHabitad() {
        initComponents();
        this.setLocationRelativeTo(null);
                this.fachadaHabitat = new FachadaAdministrarHabitat();

    }
        public void activarCampos(){
        btnVerificar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        cmbVegetacion.setEnabled(true);
        cmbClimas.setEnabled(true);
       
        
    }
    public void desactivarCampos(){
        btnVerificar.setEnabled(true);
        btnRegistrar.setEnabled(false);
        cmbVegetacion.setEnabled(false);
        cmbClimas.setEnabled(false);
        Seleccionados.setEnabled(false);
    }
    public void mostrarHabitat(Habitat a){
        JOptionPane.showMessageDialog(this, "Habitat Encontrada! se mostrara la informacion de esta");
       
      
         
         cmbClimas.setSelectedItem(a.getClima());
         cmbVegetacion.setSelectedItem(a.getVegetacion());
     Seleccionados.setText(a.getContinentes());
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

        txtNombreHabitat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbVegetacion = new javax.swing.JComboBox<>();
        cmbClimas = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Disponibles = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Seleccionados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel3.setText("Vegetacion");

        jLabel8.setText("Seleccionados");

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Climas");

        btnVerificar.setBackground(new java.awt.Color(153, 255, 153));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel6.setText("Continentes");

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        btnRegistrar.setText("Registrar Habitat");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel7.setText("Disponibles");

        jLabel4.setText("Ingrese Nombre Habitats");

        jLabel5.setText("Continentes");

        jLabel9.setText("Primero  Verifica el nombre del habitat");

        jLabel10.setText("para habilitar campos");

        cmbVegetacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tropical", "Selvatica", "Frongoso" }));

        cmbClimas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humedo", "Seco", "Arido" }));

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

        Disponibles.setColumns(20);
        Disponibles.setRows(5);
        jScrollPane3.setViewportView(Disponibles);

        Seleccionados.setColumns(20);
        Seleccionados.setRows(5);
        jScrollPane4.setViewportView(Seleccionados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9)))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnVerificar)
                        .addGap(20, 20, 20)
                        .addComponent(jButton2))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbVegetacion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)))
                        .addGap(165, 165, 165)
                        .addComponent(btnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6))
                    .addComponent(cmbClimas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(57, 57, 57)
                            .addComponent(jLabel8))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVerificar)
                    .addComponent(jButton2))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbClimas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnRegistrar)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbVegetacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreHabitatActionPerformed

    private void txtNombreHabitatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreHabitatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreHabitatKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
       Habitat Habitats=new Habitat();
  
        
               java.util.List<Habitat> listaHabitat = fachadaHabitat.consultarTodasLasHabitat();

        // Llenar la tabla con los datos de los animales
        for (Habitat Habitat : listaHabitat) {
    
            System.out.println(listaHabitat);
            String z=Habitat.getNombre(),vb=txtNombreHabitat.getText();
           
           if (z.equalsIgnoreCase(vb)) {
                  if(Habitats!=null){
                mostrarHabitat(Habitat);
            }else{
             JOptionPane.showMessageDialog(this, "Se activaran los campos");
              activarCampos();
              txtNombreHabitat.setEnabled(false);
            }   
           
       }
        }
    
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
     String nombre=txtNombreHabitat.getText();
     String clima=(String) cmbClimas.getSelectedItem();
     String vegetacion=(String) cmbVegetacion.getSelectedItem();
     String continentes=Seleccionados.getText();
             System.out.println(nombre+clima+vegetacion+continentes);

        HabitatDTO a=new HabitatDTO(nombre,clima,vegetacion,continentes);
        
         
         
         
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmMenu f = new frmMenu();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Disponibles;
    private javax.swing.JTextArea Seleccionados;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cmbClimas;
    private javax.swing.JComboBox<String> cmbVegetacion;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtNombreHabitat;
    // End of variables declaration//GEN-END:variables
}
