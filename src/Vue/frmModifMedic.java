/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Entity.Famille;
import Tools.FonctionsMetier;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;

/**
 *
 * @author pheni
 */
public class frmModifMedic extends javax.swing.JFrame {
    
    FonctionsMetier fm;

    static int leMedicament;
    /**
     * Creates new form frmModifMedic
     */
    public frmModifMedic(int selectedRow) {
        initComponents();
        leMedicament = selectedRow;
    }

    private frmModifMedic() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomMedic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbmNomFamille = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComposition = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEffets = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrix = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tglBtnModif = new javax.swing.JToggleButton();
        btnConfirmer = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtContreIndic = new javax.swing.JTextArea();
        btnSupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Medicament");

        jLabel2.setText("Nom");

        txtNomMedic.setEditable(false);

        jLabel3.setText("Famille");

        cbmNomFamille.setEnabled(false);

        jLabel4.setText("Composition");

        txtComposition.setEditable(false);
        txtComposition.setColumns(20);
        txtComposition.setLineWrap(true);
        txtComposition.setRows(5);
        jScrollPane1.setViewportView(txtComposition);

        jLabel5.setText("Effets");

        txtEffets.setEditable(false);
        txtEffets.setColumns(20);
        txtEffets.setLineWrap(true);
        txtEffets.setRows(5);
        jScrollPane2.setViewportView(txtEffets);

        jLabel6.setText("Contre indication");

        jLabel7.setText("Prix");

        txtPrix.setEditable(false);

        jLabel8.setText("€");

        tglBtnModif.setText("Modifier");
        tglBtnModif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tglBtnModifMouseClicked(evt);
            }
        });

        btnConfirmer.setText("Confirmer");
        btnConfirmer.setEnabled(false);
        btnConfirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmerActionPerformed(evt);
            }
        });

        jLabel9.setText("Interraction");

        txtContreIndic.setEditable(false);
        txtContreIndic.setColumns(20);
        txtContreIndic.setLineWrap(true);
        txtContreIndic.setRows(5);
        jScrollPane3.setViewportView(txtContreIndic);

        btnSupprimer.setBackground(new java.awt.Color(255, 51, 51));
        btnSupprimer.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglBtnModif)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbmNomFamille, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNomMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 26, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbmNomFamille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(58, 58, 58)
                .addComponent(tglBtnModif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmer)
                    .addComponent(btnSupprimer))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        fm = new FonctionsMetier();
        
        for (Famille fam : fm.GetAllFamille()){
            cbmNomFamille.addItem(fam.getFam_libelle());
        }
        
        String nomMedic = fm.GetUnMedic(leMedicament).getMed_nomcommercial();
        String compo = fm.GetUnMedic(leMedicament).getMed_composition();
        String effet = fm.GetUnMedic(leMedicament).getMed_effets();
        String contreIndic = fm.GetUnMedic(leMedicament).getMed_contreindic();
        float prix = fm.GetUnMedic(leMedicament).getMed_prixechantillon();
        String nomFamille = fm.GetUnMedic(leMedicament).getFam_libelle();
        
        txtNomMedic.setText(nomMedic);
        cbmNomFamille.setSelectedItem(nomFamille);
        txtComposition.setText(compo);
        txtEffets.setText(effet);
        txtContreIndic.setText(contreIndic);
        txtPrix.setText(String.valueOf(prix));
        
    }//GEN-LAST:event_formWindowOpened

    private void tglBtnModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tglBtnModifMouseClicked
        // TODO add your handling code here:
        
        if(tglBtnModif.isSelected()){
            //Lorsque le bouton est appuyer - Modification en cours
            tglBtnModif.setText("Modifications en cours - Cliquer pour arreter");
            txtNomMedic.setEditable(true);
            txtComposition.setEditable(true);
            txtEffets.setEditable(true);
            txtContreIndic.setEditable(true);
            txtPrix.setEditable(true);
            cbmNomFamille.setEnabled(true);
            
            //Permettre la confirmation
            btnConfirmer.setEnabled(true);
        }else{
            //Lorsque le bouton est relacher
            tglBtnModif.setText("Modifier");
            txtNomMedic.setEditable(false);
            txtComposition.setEditable(false);
            txtEffets.setEditable(false);
            txtContreIndic.setEditable(false);
            txtPrix.setEditable(false);
            cbmNomFamille.setEnabled(false);
            
            //Bloquer la confirmation
            btnConfirmer.setEnabled(false);
        }
    }//GEN-LAST:event_tglBtnModifMouseClicked

    private void btnConfirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmerActionPerformed
        // TODO add your handling code here:
        //Insérer l'update
        if(fm.isNumeric(txtPrix.getText())){
            fm.SetModifMedic(leMedicament, txtNomMedic.getText(), cbmNomFamille.getSelectedItem().toString(), txtComposition.getText(), txtEffets.getText(), txtContreIndic.getText(), Float.parseFloat(txtPrix.getText()));
        }
        else{
            JOptionPane.showMessageDialog(this, "Merci de vérifier que le prix ne comporte que des chiffres"," Erreur ",JOptionPane.WARNING_MESSAGE);
        }
        
        int retour = JOptionPane.showConfirmDialog(this, "Votre modification à bien été prise en compte. Souaitez vous quitter cette fenêtre ?"," Modification effectuée", JOptionPane.OK_CANCEL_OPTION);
        if(retour == OK_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btnConfirmerActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
        int retour = JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir supprimer ce médicament ?"," Supprimer un médicament", JOptionPane.OK_CANCEL_OPTION);
        if(retour == OK_OPTION){
            fm.deleteMedic(leMedicament);
            dispose();
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

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
            java.util.logging.Logger.getLogger(frmModifMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModifMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModifMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModifMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModifMedic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmer;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JComboBox<String> cbmNomFamille;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton tglBtnModif;
    private javax.swing.JTextArea txtComposition;
    private javax.swing.JTextArea txtContreIndic;
    private javax.swing.JTextArea txtEffets;
    private javax.swing.JTextField txtNomMedic;
    private javax.swing.JTextField txtPrix;
    // End of variables declaration//GEN-END:variables
}
