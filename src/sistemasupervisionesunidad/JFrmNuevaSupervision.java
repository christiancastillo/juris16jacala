/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasupervisionesunidad;

import java.awt.Scrollbar;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import classes.JDBConnection;
import java.util.Date;


/**
 *
 * @author INVENTARIOS
 */
public class JFrmNuevaSupervision extends javax.swing.JFrame {
    /**
     * Creates new form JFrmNuevaSupervision
     */    
    public JFrmNuevaSupervision() {
        initComponents();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        dpFechaSupervision.setFormats(formatoFecha);
        txtPersona1.setEnabled(true);               
        txtPersona2.setEnabled(false);
        txtPersona3.setEnabled(false);
        txtPersona4.setEnabled(false);
        txtPersona5.setEnabled(false);
        txtPersona6.setEnabled(false);
        fillComboBoxWithNoValue(5);
        //abrir coneccion a SQLite
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        compoundPainter1 = new org.jdesktop.swingx.painter.CompoundPainter();
        defaultUserNameStore1 = new org.jdesktop.swingx.auth.DefaultUserNameStore();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dpFechaSupervision = new org.jdesktop.swingx.JXDatePicker();
        txtCLUES = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtActividadesSup = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivoSupervision = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbNumPersonas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbDepartamento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPersona1 = new javax.swing.JTextField();
        txtPersona2 = new javax.swing.JTextField();
        txtPersona3 = new javax.swing.JTextField();
        txtPersona4 = new javax.swing.JTextField();
        txtPersona5 = new javax.swing.JTextField();
        txtPersona6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("- Nueva Supervisión -");

        jContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Fecha de supervisión");

        dpFechaSupervision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpFechaSupervisionActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Clave CLUES");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Motivo de supervisión");

        jLabel5.setText("Descrpción de actividades");

        txtActividadesSup.setColumns(20);
        txtActividadesSup.setRows(5);
        jScrollPane2.setViewportView(txtActividadesSup);

        txtMotivoSupervision.setColumns(20);
        txtMotivoSupervision.setRows(5);
        jScrollPane1.setViewportView(txtMotivoSupervision);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre unidad");

        jLabel7.setText("Número de personas que acuden a la supervisión");

        cbNumPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 PERSONA", "2 PERSONAS", "3 PERSONAS", "4 PERSONAS", "5 PERSONAS", "6 PERSONAS" }));
        cbNumPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNumPersonasActionPerformed(evt);
            }
        });

        jLabel8.setText("Departamento");

        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATENCION INTEGRAL", "EPIDEMIOLOGIA", "ADMINISTRACION", "MIXTOS" }));
        cbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentoActionPerformed(evt);
            }
        });

        jLabel9.setText("Persona 1");

        jLabel10.setText("Persona 2");

        jLabel11.setText("Persona 3");

        jLabel12.setText("Persona 4");

        jLabel13.setText("Persona 5");

        jLabel14.setText("Persona 6");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("<html>Generar reporte</br> y guardar.</html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jContenedorLayout = new javax.swing.GroupLayout(jContenedor);
        jContenedor.setLayout(jContenedorLayout);
        jContenedorLayout.setHorizontalGroup(
            jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jContenedorLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dpFechaSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCLUES, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jContenedorLayout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addComponent(txtUnidad))))
                    .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbNumPersonas, 0, 147, Short.MAX_VALUE))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPersona1))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPersona2))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPersona3))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPersona4))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPersona5))
                        .addGroup(jContenedorLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPersona6))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jContenedorLayout.setVerticalGroup(
            jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dpFechaSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCLUES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbNumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPersona3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPersona4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPersona5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPersona6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillComboBoxWithNoValue(int cantidad){
        switch (cantidad) {
            case 6:
                txtPersona1.setText("");
                txtPersona2.setText("");
                txtPersona3.setText("");
                txtPersona4.setText("");
                txtPersona5.setText("");
                txtPersona6.setText("");                
                break;
            case 5: //cinco personas
                txtPersona2.setText("--");
                txtPersona3.setText("--");
                txtPersona4.setText("--");
                txtPersona5.setText("--");
                txtPersona6.setText("--");
                break;
            case 4:
                txtPersona2.setText("");
                txtPersona3.setText("--");
                txtPersona4.setText("--");
                txtPersona5.setText("--");
                txtPersona6.setText("--");
                break;
            case 3: 
                txtPersona2.setText("");
                txtPersona3.setText("");                
                txtPersona4.setText("--");
                txtPersona5.setText("--");
                txtPersona6.setText("--");                
                break;
            case 2:
                txtPersona2.setText("");
                txtPersona3.setText("");                
                txtPersona4.setText("");                
                txtPersona5.setText("--");
                txtPersona6.setText("--");                   
                break;
            case 1:
                txtPersona2.setText("");
                txtPersona3.setText("");                
                txtPersona4.setText("");                
                txtPersona5.setText("");                
                txtPersona6.setText("--");                   
                break;
            default: break;
        }
    }
    
    private void cbNumPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNumPersonasActionPerformed
        // TODO add your handling code here:
        //String itemCb = String.valueOf(jComboBox1.getSelectedItem());
        switch (cbNumPersonas.getSelectedIndex()) {
            case 0:
                //una
                fillComboBoxWithNoValue(5);
                txtPersona1.setEnabled(true);               
                txtPersona2.setEnabled(false);
                txtPersona3.setEnabled(false);
                txtPersona4.setEnabled(false);
                txtPersona5.setEnabled(false);
                txtPersona6.setEnabled(false);
                break;
            case 1:
                //dos
                fillComboBoxWithNoValue(4);
                txtPersona1.setEnabled(true);
                txtPersona2.setEnabled(true);
                txtPersona3.setEnabled(false);
                txtPersona4.setEnabled(false);
                txtPersona5.setEnabled(false);
                txtPersona6.setEnabled(false);   
                break;
            case 2:
                //tres
                fillComboBoxWithNoValue(3);
                txtPersona1.setEnabled(true);
                txtPersona2.setEnabled(true);
                txtPersona3.setEnabled(true);              
                txtPersona4.setEnabled(false);
                txtPersona5.setEnabled(false);
                txtPersona6.setEnabled(false); 
                break;
            case 3:
                //cuatro
                fillComboBoxWithNoValue(2);
                txtPersona1.setEnabled(true);
                txtPersona2.setEnabled(true);
                txtPersona3.setEnabled(true);
                txtPersona4.setEnabled(true);              
                txtPersona5.setEnabled(false);
                txtPersona6.setEnabled(false);   
                break;
            case 4:
                //cinco
                fillComboBoxWithNoValue(1);
                txtPersona1.setEnabled(true);
                txtPersona2.setEnabled(true);
                txtPersona3.setEnabled(true);
                txtPersona4.setEnabled(true);
                txtPersona5.setEnabled(true);                
                txtPersona6.setEnabled(false);
                break;
            case 5:
                //seis
                fillComboBoxWithNoValue(6);
                txtPersona1.setEnabled(true);
                txtPersona2.setEnabled(true);
                txtPersona3.setEnabled(true);
                txtPersona4.setEnabled(true);
                txtPersona5.setEnabled(true);
                txtPersona6.setEnabled(true);
                break;
            default: 
                JOptionPane.showMessageDialog(null,"Prueba de mensaje");
                break;
        }
    }//GEN-LAST:event_cbNumPersonasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaDMY = sdf.format(dpFechaSupervision.getDate());
        try {            
            JOptionPane.showMessageDialog(null, fechaDMY);
            JDBConnection.openConnection();
            JDBConnection.insertQuery("INSERT INTO supervision (fecha_super, clues_unidad, desc_activ, nombre_unidad, motivo_superv,num_personas, persona_uno, persona_dos, persona_tres, persona_cuatro, persona_cinco, persona_seis) VALUES ("
            +fechaDMY+","
            +txtCLUES.getText()+","
            +txtActividadesSup.getText()+","
            +txtUnidad.getText()+","
            +txtMotivoSupervision.getText()+","            
            +cbNumPersonas.getSelectedItem()+","
            +txtPersona1.getText()+","
            +txtPersona2.getText()+","
            +txtPersona3.getText()+","
            +txtPersona4.getText()+","
            +txtPersona5.getText()+","
            +txtPersona6.getText()+");");
            JDBConnection.closeConnection();
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dpFechaSupervisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpFechaSupervisionActionPerformed
        // TODO add your handling code here:
        //cambiar el formato de fecha a DD/mm/YYYY
    }//GEN-LAST:event_dpFechaSupervisionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDepartamentoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmNuevaSupervision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmNuevaSupervision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmNuevaSupervision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmNuevaSupervision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmNuevaSupervision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDepartamento;
    private javax.swing.JComboBox<String> cbNumPersonas;
    private org.jdesktop.swingx.painter.CompoundPainter compoundPainter1;
    private org.jdesktop.swingx.auth.DefaultUserNameStore defaultUserNameStore1;
    private org.jdesktop.swingx.JXDatePicker dpFechaSupervision;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jContenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtActividadesSup;
    private javax.swing.JTextField txtCLUES;
    private javax.swing.JTextArea txtMotivoSupervision;
    private javax.swing.JTextField txtPersona1;
    private javax.swing.JTextField txtPersona2;
    private javax.swing.JTextField txtPersona3;
    private javax.swing.JTextField txtPersona4;
    private javax.swing.JTextField txtPersona5;
    private javax.swing.JTextField txtPersona6;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
