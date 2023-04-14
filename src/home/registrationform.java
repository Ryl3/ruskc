/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import config.dbconnector;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ellan
 */
public class registrationform extends javax.swing.JFrame {

    /**
     * Creates new form registrationform
     */
    public registrationform() {
        initComponents();
    }

        Color o  = new Color(153,153,255);
        Color ten = new Color(51,51,255);
        
    int validateregister(){
            int result;
            if(rfname.getText().isEmpty() || rlname.getText().isEmpty() || remail.getText().isEmpty() || 
                    rusername.getText().isEmpty() || rpassword.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null, "Required Inputs!");
                result = 0;
            }else{
                result = 1;
            }
                return result;
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rpassword = new javax.swing.JTextField();
        rfname = new javax.swing.JTextField();
        rlname = new javax.swing.JTextField();
        remail = new javax.swing.JTextField();
        rusername = new javax.swing.JTextField();
        register = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimize = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        old = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rusell Caballero");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, 40));

        rpassword.setBackground(new java.awt.Color(51, 51, 255));
        rpassword.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jPanel1.add(rpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 260, 40));

        rfname.setBackground(new java.awt.Color(51, 51, 255));
        rfname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rfname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jPanel1.add(rfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 40));

        rlname.setBackground(new java.awt.Color(51, 51, 255));
        rlname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rlname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jPanel1.add(rlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 260, 40));

        remail.setBackground(new java.awt.Color(51, 51, 255));
        remail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        remail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jPanel1.add(remail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, 40));

        rusername.setBackground(new java.awt.Color(51, 51, 255));
        rusername.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rusername.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jPanel1.add(rusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 260, 40));

        register.setBackground(new java.awt.Color(51, 51, 255));
        register.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        register.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 30));

        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, 50));

        minimize.setBackground(new java.awt.Color(51, 51, 255));
        minimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("—");
        minimize.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 20));

        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 40, 40));

        close.setBackground(new java.awt.Color(51, 51, 255));
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        close.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, -1));

        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 40, 40));

        old.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        old.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        old.setText("Already have an account? Click here.");
        old.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oldMouseClicked(evt);
            }
        });
        jPanel1.add(old, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 300, 20));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("Registration Form");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(o);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(ten);
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Confirm Exit");
        if(x== JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(o);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(ten);
    }//GEN-LAST:event_closeMouseExited

    private void oldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oldMouseClicked
        loginform lg = new loginform();
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_oldMouseClicked

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        register.setBackground(o);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setBackground(ten);
    }//GEN-LAST:event_registerMouseExited

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
       int check = validateregister(); 
        if(check == 1){
        dbconnector dbc = new dbconnector();
          int result = dbc.insertdata("INSERT INTO tbl_user (user_fname, user_lname, user_email, user_username, user_password)"
                  + " VALUES ('"+rfname.getText()+"', '"+rlname.getText()+"', '"+remail.getText()+"', '"+rusername.getText()+"',"
                          + " '"+rpassword.getText()+"')");                                                                              
               if(result==1){
                  JOptionPane.showMessageDialog(null, "Successfully Registered!");
                  loginform lg = new loginform();
                  this.dispose();
                  lg.setVisible(true);
           }else{
                  JOptionPane.showMessageDialog(null, "Successfully Failed!");
               }
        }else{
            JOptionPane.showMessageDialog(null, "Required Inputs!");
        }
    
    }//GEN-LAST:event_registerMouseClicked

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
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel minimize;
    private javax.swing.JLabel old;
    private javax.swing.JPanel register;
    private javax.swing.JTextField remail;
    private javax.swing.JTextField rfname;
    private javax.swing.JTextField rlname;
    private javax.swing.JTextField rpassword;
    private javax.swing.JTextField rusername;
    // End of variables declaration//GEN-END:variables
}
