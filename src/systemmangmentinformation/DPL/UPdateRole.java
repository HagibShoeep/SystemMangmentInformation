/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DPL;

import javax.swing.JOptionPane;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Static.UpdateRoleDB;
import systemmangmentinformation.DBL.Vews.VoUpdateRole;
/**
 *
 * @author shoeep
 */
public class UPdateRole extends javax.swing.JFrame {

    /**
     * Creates new form UPdateRole
     */
    public UPdateRole() {
        initComponents();
                    try {
       for(DisplayValueModel1 vo: UpdateRoleDB.getInstance().getFkFromTable())
         comSection.addItem(vo.toString());
          for(DisplayValueModel1 vo:UpdateRoleDB.getInstance().getFkFromTableUsers())
      comUserEmploee.addItem(vo.toString());    
           for(DisplayValueModel1 vo:UpdateRoleDB.getInstance().getFkFromTableType())
           comTypeUser.addItem(vo.toString());
         
          
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comUserEmploee = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comTypeUser = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comSection = new javax.swing.JComboBox<>();
        txtJopNew = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCloseJop = new javax.swing.JToggleButton();
        btnAddJop = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("????????????????");

        jLabel2.setText("????????  ");

        jLabel3.setText("??????????");

        jLabel4.setText("??????????????");

        btnCloseJop.setText("????????");
        btnCloseJop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseJopActionPerformed(evt);
            }
        });

        btnAddJop.setText("??????????");
        btnAddJop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comUserEmploee, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comTypeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtJopNew, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(comSection, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnCloseJop, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnAddJop, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comUserEmploee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(comTypeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJopNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCloseJop)
                    .addComponent(btnAddJop))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseJopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseJopActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseJopActionPerformed

    private void btnAddJopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJopActionPerformed
        // TODO add your handling code here:
        if(txtJopNew.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "name role is empty please fill in");
            return;
        }
        
        VoUpdateRole vo1=new VoUpdateRole();
        vo1.setDepartment(new DisplayValueModel1(comSection.getSelectedIndex(), comSection.getSelectedItem()));
        vo1.setIDTypeUser(new DisplayValueModel1(comTypeUser.getSelectedIndex(), comTypeUser.getSelectedItem()));
        vo1.setIdRole(new DisplayValueModel1(comUserEmploee.getSelectedIndex(), comUserEmploee.getSelectedItem()));
        vo1.setNmeRole(txtJopNew.getText());
        try {
       int rows=     UpdateRoleDB.getInstance().insert(vo1);
       if(rows>0){
            JOptionPane.showConfirmDialog(null, "inserted is sucessfuly"); 
            return;
       }
       JOptionPane.showConfirmDialog(null, "sume problem ");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAddJopActionPerformed

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
            java.util.logging.Logger.getLogger(UPdateRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UPdateRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UPdateRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UPdateRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UPdateRole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAddJop;
    private javax.swing.JToggleButton btnCloseJop;
    private javax.swing.JComboBox<String> comSection;
    private javax.swing.JComboBox<String> comTypeUser;
    private javax.swing.JComboBox<String> comUserEmploee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtJopNew;
    // End of variables declaration//GEN-END:variables
}
