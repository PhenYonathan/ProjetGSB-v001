/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Model.ModelMedicament;
import Model.ModelTypeIndividu;
import Tools.FonctionsMetier;

/**
 *
 * @author maxim
 */
public class frmMenuPrincipal extends javax.swing.JFrame {
    
    FonctionsMetier fm;
    ModelMedicament mdlMedicament;
    ModelTypeIndividu mdlTypeIndividu;
    static String nomUser;
    
    public frmMenuPrincipal() {
        initComponents();
    }

    frmMenuPrincipal(String leUser) {
        initComponents();
        nomUser = leUser;
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
        tblMedicament = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTypeIndividu = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPlusPrescrit = new javax.swing.JTextField();
        txtMoinsPrescrit = new javax.swing.JTextField();
        btnAddMedic = new javax.swing.JButton();
        btnAddType = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddPrescription = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBonjour = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        btnRaffraichir = new javax.swing.JButton();
        btnInterraction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 51));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblMedicament.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMedicament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicamentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicament);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Gestion Médicaments");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 0));

        tblTypeIndividu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTypeIndividu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTypeIndividuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTypeIndividu);

        panel1.setBackground(new java.awt.Color(204, 255, 204));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Le plus prescrit");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Le moins prescrit");

        txtPlusPrescrit.setEditable(false);

        txtMoinsPrescrit.setEditable(false);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlusPrescrit)
                    .addComponent(txtMoinsPrescrit)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlusPrescrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMoinsPrescrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnAddMedic.setBackground(new java.awt.Color(153, 255, 153));
        btnAddMedic.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAddMedic.setText("+");
        btnAddMedic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMedicMouseClicked(evt);
            }
        });

        btnAddType.setBackground(new java.awt.Color(153, 255, 153));
        btnAddType.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAddType.setText("+");
        btnAddType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddTypeMouseClicked(evt);
            }
        });
        btnAddType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTypeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Type individu");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("Médicaments");

        btnAddPrescription.setBackground(new java.awt.Color(153, 255, 153));
        btnAddPrescription.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAddPrescription.setText("Nouvelles prescription");
        btnAddPrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPrescriptionMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/statistiques-gif.gif"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Fonctionnalité en cours de développement");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(47, 47, 47))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/medicament_icone.png"))); // NOI18N

        lblBonjour.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBonjour.setForeground(new java.awt.Color(0, 153, 102));
        lblBonjour.setText("Bonjour,");

        btnQuit.setBackground(new java.awt.Color(255, 102, 102));
        btnQuit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Fermer la session");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnRaffraichir.setBackground(new java.awt.Color(204, 255, 204));
        btnRaffraichir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rafraichir (Personnalisé).png"))); // NOI18N
        btnRaffraichir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRaffraichir.setBorderPainted(false);
        btnRaffraichir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaffraichirActionPerformed(evt);
            }
        });

        btnInterraction.setBackground(new java.awt.Color(153, 255, 153));
        btnInterraction.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnInterraction.setText("Ajouter interraction");
        btnInterraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterractionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddType, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddMedic)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBonjour, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRaffraichir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInterraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddPrescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuit)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblBonjour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addComponent(btnRaffraichir))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20)
                                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddPrescription)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAddMedic)
                                        .addComponent(btnInterraction))
                                    .addComponent(btnAddType)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuit)))
                        .addGap(19, 19, 19))
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTypeActionPerformed

    private void btnAddTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTypeMouseClicked
        // Ici ajouter un type individu
        
        frmAjoutTypeIndividu frm = new frmAjoutTypeIndividu();
        frm.setVisible(true);
      
    }//GEN-LAST:event_btnAddTypeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        fm = new FonctionsMetier();
        mdlMedicament = new ModelMedicament();
        mdlMedicament.loadDatas(fm.GetAllMedicament());
        tblMedicament.setModel(mdlMedicament);
        
        mdlTypeIndividu = new ModelTypeIndividu();
        mdlTypeIndividu.loadDatas(fm.GetAllTypeIndividu());
        tblTypeIndividu.setModel(mdlTypeIndividu);
        
        lblBonjour.setText("Bonjour, " + nomUser);
        
    }//GEN-LAST:event_formWindowOpened

    private void tblMedicamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicamentMouseClicked
        // TODO add your handling code here:
        
        int selectedMedic = Integer.parseInt(tblMedicament.getValueAt(tblMedicament.getSelectedRow(), 0).toString());
        
        frmModifMedic frm = new frmModifMedic(selectedMedic);
        frm.setVisible(true);
        
        
    }//GEN-LAST:event_tblMedicamentMouseClicked

    private void btnAddMedicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMedicMouseClicked
        // TODO add your handling code here:
        
        frmAjoutMedic frm = new frmAjoutMedic();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnAddMedicMouseClicked

    private void btnAddPrescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPrescriptionMouseClicked
        // TODO add your handling code here:
        frmAjoutPrescription frm = new frmAjoutPrescription();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnAddPrescriptionMouseClicked

    private void tblTypeIndividuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTypeIndividuMouseClicked
        // TODO add your handling code here:
        
        int selectedType = Integer.parseInt(tblTypeIndividu.getValueAt(tblTypeIndividu.getSelectedRow(), 0).toString());
        frmModifType frm = new frmModifType(selectedType);
        frm.setVisible(true);
    }//GEN-LAST:event_tblTypeIndividuMouseClicked
  
    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnRaffraichirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaffraichirActionPerformed
        // TODO add your handling code here:
        
        mdlMedicament.loadDatas(fm.GetAllMedicament());
        tblMedicament.setModel(mdlMedicament);
        
        
        mdlTypeIndividu.loadDatas(fm.GetAllTypeIndividu());
        tblTypeIndividu.setModel(mdlTypeIndividu);
        
    }//GEN-LAST:event_btnRaffraichirActionPerformed

    private void btnInterractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterractionActionPerformed
        // TODO add your handling code here:
        
        frmInterraction frm = new frmInterraction();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnInterractionActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedic;
    private javax.swing.JButton btnAddPrescription;
    private javax.swing.JButton btnAddType;
    private javax.swing.JButton btnInterraction;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRaffraichir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBonjour;
    private java.awt.Panel panel1;
    private javax.swing.JTable tblMedicament;
    private javax.swing.JTable tblTypeIndividu;
    private javax.swing.JTextField txtMoinsPrescrit;
    private javax.swing.JTextField txtPlusPrescrit;
    // End of variables declaration//GEN-END:variables
}
