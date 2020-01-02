package Views;


import Controllers.AdminController;
import Controllers.EmployeeController;
import Models.Admin;
import Models.Employee;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author khopi
 */
public class loginForm extends javax.swing.JFrame {
    
    static String uname;
    
    public loginForm() {
        initComponents();
        this.setLocationRelativeTo(null); // to center the lgin form
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1minimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginUsernameTextfield = new javax.swing.JTextField();
        loginPasswordField = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();
        jButton2loginCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        adminRdBtn = new javax.swing.JRadioButton();
        empRdBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(206, 104, 8));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1minimize.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1minimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1minimize.setText("-");
        jLabel1minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1minimizeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login here");

        jLabel3close.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3close.setText("x");
        jLabel3close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3close)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2)
                    .addContainerGap(456, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3close)
                    .addComponent(jLabel1minimize))
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(33, 33, 33)))
        );

        jPanel2.setBackground(new java.awt.Color(42, 49, 66));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Password :");

        loginUsernameTextfield.setBackground(new java.awt.Color(87, 100, 132));
        loginUsernameTextfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginUsernameTextfield.setForeground(new java.awt.Color(204, 204, 255));

        loginPasswordField.setBackground(new java.awt.Color(87, 100, 132));
        loginPasswordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        loginPasswordField.setForeground(new java.awt.Color(204, 204, 255));

        jButtonlogin.setBackground(new java.awt.Color(59, 158, 229));
        jButtonlogin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonlogin.setText("Login");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });

        jButton2loginCancel.setBackground(new java.awt.Color(206, 28, 28));
        jButton2loginCancel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2loginCancel.setForeground(new java.awt.Color(0, 0, 0));
        jButton2loginCancel.setText("Cancel");
        jButton2loginCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2loginCancelMouseClicked(evt);
            }
        });
        jButton2loginCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2loginCancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Login as :");

        adminRdBtn.setBackground(new java.awt.Color(42, 49, 66));
        adminRdBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adminRdBtn.setForeground(new java.awt.Color(204, 204, 255));
        adminRdBtn.setText("Admin");
        adminRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRdBtnActionPerformed(evt);
            }
        });

        empRdBtn.setBackground(new java.awt.Color(42, 49, 66));
        empRdBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        empRdBtn.setForeground(new java.awt.Color(204, 204, 255));
        empRdBtn.setText("Employee");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginUsernameTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(loginPasswordField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2loginCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonlogin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(adminRdBtn)
                        .addGap(18, 18, 18)
                        .addComponent(empRdBtn)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(adminRdBtn)
                    .addComponent(empRdBtn))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUsernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2loginCancel)
                    .addComponent(jButtonlogin))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // to close the system
    private void jLabel3closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3closeMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_jLabel3closeMouseClicked

    // to minimize the system
    private void jLabel1minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1minimizeMouseClicked
        
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1minimizeMouseClicked

    private void jButton2loginCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2loginCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2loginCancelActionPerformed

    // to cancel the login
    private void jButton2loginCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2loginCancelMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_jButton2loginCancelMouseClicked

    private void adminRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRdBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminRdBtnActionPerformed

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        

        if(!adminRdBtn.isSelected() && !empRdBtn.isSelected()){
            JOptionPane.showMessageDialog(null,"Please select the account type admin or employee");
        }else{
            if(empRdBtn.isSelected()&& !adminRdBtn.isSelected()){
              
                String username = loginUsernameTextfield.getText();
                String password = new String(loginPasswordField.getPassword());
                
                uname = loginUsernameTextfield.getText();
                
                Employee e = new Employee();
                e.setFull_name(username);
                e.setPasswd(password);

                EmployeeController ec = new EmployeeController();
                
                ec.checkLogin(e);

                boolean res = ec.checkLogin(e);

                if (res) {
                    new employeeView().setVisible(true);
                    this.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Either username or password is wrong");
                    loginUsernameTextfield.setText("");
                    loginPasswordField.setText("");
                }
            }
            if(adminRdBtn.isSelected()&& !empRdBtn.isSelected()){
                
                String username = loginUsernameTextfield.getText();
                String password = new String(loginPasswordField.getPassword());

                Admin a = new Admin();
                a.setFull_name(username);
                a.setPasswd(password);
                      
                AdminController ac = new AdminController();

                boolean res = ac.checkLogin(a);

                if (res) {
                    new adminView().setVisible(true);
                    this.dispose();
       
                }else{
                    JOptionPane.showMessageDialog(null, "Either username or password is wrong");
                    loginUsernameTextfield.setText("");
                    loginPasswordField.setText("");
                }

            }
            if(adminRdBtn.isSelected()&& empRdBtn.isSelected()){
                
                JOptionPane.showMessageDialog(null, "Select only one account type");
                loginUsernameTextfield.setText("");
                loginPasswordField.setText("");
            }
                
               
                
        }
    }//GEN-LAST:event_jButtonloginActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminRdBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton empRdBtn;
    private javax.swing.JButton jButton2loginCancel;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1minimize;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3close;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JTextField loginUsernameTextfield;
    // End of variables declaration//GEN-END:variables
}
