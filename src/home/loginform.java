package home;

import config.dbconnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class loginform extends javax.swing.JFrame {

    public loginform() {
        initComponents();
    }

        Color o  = new Color(153,153,255);
        Color ten = new Color(51,51,255);
    
        Connection con = null;
        ResultSet rst = null;
        PreparedStatement pst = null;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lemail = new javax.swing.JTextField();
        lpassword = new javax.swing.JTextField();
        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimize = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createacc = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lemail.setBackground(new java.awt.Color(51, 51, 255));
        lemail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lemail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jPanel1.add(lemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 260, 40));

        lpassword.setBackground(new java.awt.Color(51, 51, 255));
        lpassword.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jPanel1.add(lpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 260, 40));

        login.setBackground(new java.awt.Color(51, 51, 255));
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 90, 40));

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

        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 40, 40));

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

        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 40));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("Login Form");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("KC Karl Candilasa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 40));

        createacc.setBackground(new java.awt.Color(51, 51, 255));
        createacc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        createacc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createaccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createaccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createaccMouseExited(evt);
            }
        });
        createacc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Create");
        createacc.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 20));

        jPanel1.add(createacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 90, 40));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("or");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 80, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        String user = lemail.getText();
        String pass = lpassword.getText();
        if (lemail.getText().isEmpty() || lpassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Required Inputs!");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteltracker", "root", "");
                dbconnector dbc = new dbconnector();
                ResultSet rs = dbc.getdata("SELECT * FROM tbl_user WHERE us_email= '" + lemail.getText() + "'AND us_password='" + lpassword.getText() + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "Successfully Login!!");
                    dashboard dash = new dashboard();
                    this.dispose();
                    dash.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Incorrect User or Password!!");
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(o);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(ten);
    }//GEN-LAST:event_loginMouseExited

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

    private void createaccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccMouseClicked
        registrationform rf = new registrationform();
        this.dispose();
        rf.setVisible(true);
    }//GEN-LAST:event_createaccMouseClicked

    private void createaccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccMouseEntered
        createacc.setBackground(o);
    }//GEN-LAST:event_createaccMouseEntered

    private void createaccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccMouseExited
        createacc.setBackground(ten);
    }//GEN-LAST:event_createaccMouseExited

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel close;
    private javax.swing.JPanel createacc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lemail;
    private javax.swing.JPanel login;
    private javax.swing.JTextField lpassword;
    private javax.swing.JPanel minimize;
    // End of variables declaration//GEN-END:variables
}
