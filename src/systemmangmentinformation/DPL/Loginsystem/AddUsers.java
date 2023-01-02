/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DPL.Loginsystem;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import systemmangmentinformation.DBL.Static.UserLogin.LoginSystemDB;
import systemmangmentinformation.DBL.Vews.AdminVews.VoLoginAdmin;

/**
 *
 * @author shoeep
 */
public class AddUsers extends javax.swing.JFrame {

    /**
     * Creates new form AddUsers
     */
    public AddUsers() {
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
        txtNameUsers = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comSectionUsers = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comAdminlog = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnLoginSystem = new javax.swing.JToggleButton();
        txtPassword1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setAutoscrolls(true);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.setLayout(null);

        txtNameUsers.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtNameUsers);
        txtNameUsers.setBounds(30, 30, 400, 30);

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(30, 70, 160, 28);

        jLabel4.setText("الاسم");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(480, 40, 29, 14);

        jLabel1.setText("تاكيد رمز");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 70, 50, 30);

        jPanel1.add(comSectionUsers);
        comSectionUsers.setBounds(160, 128, 273, 30);

        jLabel2.setText("القسم");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 130, 40, 30);

        comAdminlog.setMaximumRowCount(20);
        comAdminlog.setToolTipText("");
        comAdminlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comAdminlogActionPerformed(evt);
            }
        });
        jPanel1.add(comAdminlog);
        comAdminlog.setBounds(160, 187, 273, 30);

        jLabel3.setText("نوع الدخول");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 190, 60, 23);

        jToggleButton1.setText("خروج");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(190, 250, 75, 35);

        btnLoginSystem.setText("اضافة ");
        btnLoginSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginSystemActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoginSystem);
        btnLoginSystem.setBounds(300, 250, 75, 35);

        txtPassword1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtPassword1);
        txtPassword1.setBounds(270, 70, 160, 28);

        jLabel5.setBackground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("رمز الدخول");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 70, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comAdminlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comAdminlogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comAdminlogActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_jToggleButton1ActionPerformed
 int check;
    private void btnLoginSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginSystemActionPerformed
        // TODO add your handling code here:
                         
    if(txtNameUsers.getText().isEmpty()){
          JOptionPane.showConfirmDialog(null, "please insert user name filed");
            return;
        }
        if(txtPassword.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "please insert user password  filed");
            return;
        }
        VoLoginAdmin vo=new VoLoginAdmin();
        vo.setNameUser(txtNameUsers.getText());
        vo.setPassword(txtPassword.getText());
        try {
            VoLoginAdmin vo1=        LoginSystemDB.getInstance().search(vo);
            if(vo1==null){
                check++;
                return;
            }
            else{
                this.setVisible(false);
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginSystem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnLoginSystemActionPerformed

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
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLoginSystem;
    private javax.swing.JComboBox<String> comAdminlog;
    private javax.swing.JComboBox<String> comSectionUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtNameUsers;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    // End of variables declaration//GEN-END:variables
}