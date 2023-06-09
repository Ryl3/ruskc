package crudInfo;

import config.dbconnector;
import dashboardinternal.userpage;
import home.dashboard;
import java.awt.Color;
import javax.swing.JOptionPane;

public class userInfo extends javax.swing.JFrame {

    public userInfo() {
        initComponents();
    }

    int validateregister() {
        int result;
        if (fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Required Inputs!");
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }

    public void close() {
        this.dispose();
        dashboard dash = new dashboard();
        dash.setVisible(true);
        userpage cp = new userpage();
        dash.dashboardpane.add(cp).setVisible(true);
    }

    Color o = new Color(153, 153, 255);
    Color ten = new Color(51, 51, 255);

    public String action;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        karl = new javax.swing.JPanel();
        caballero = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        minimize = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel2.setText("User Information");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel3.setText("User ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        lname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 270, 30));

        username.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 270, 30));

        userid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userid.setEnabled(false);
        jPanel1.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 270, 30));

        fname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 270, 30));

        email.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 270, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel9.setText("First Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        karl.setBackground(new java.awt.Color(153, 153, 255));
        karl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        karl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                karlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                karlMouseExited(evt);
            }
        });
        karl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caballero.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        caballero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caballero.setText("Caballero");
        karl.add(caballero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 30));

        jPanel1.add(karl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 160, 50));

        password.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 270, 30));

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("—");
        minimize.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 20));

        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 40, 40));

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X");
        close.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, -1));

        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void karlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karlMouseClicked
        if (action.equals("Add")) {

            int check = validateregister();
            if (check == 1) {
                dbconnector dbc = new dbconnector();
                int result = dbc.insertdata("INSERT INTO tbl_user(us_fname, us_lname, us_email, us_username, us_password ) "
                        + "VALUES ('" + fname.getText() + "', '" + lname.getText() + "', '" + email.getText() + "'"
                        + ", '" + username.getText() + "', '" + password.getText() + "')");
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Successfully Saved!");
                    close();
                } else {
                    JOptionPane.showMessageDialog(null, "Successfully Failed!");
                }
            } else {

            }

        } else if (action.equals("Edit")) {
            dbconnector dbc = new dbconnector();
            dbc.updatedata("UPDATE tbl_user SET us_fname = '" + fname.getText() + "'"
                    + ", us_lname = '" + lname.getText() + "', us_email = '" + email.getText() + "'"
                    + ", us_username = '" + username.getText() + "', us_password = '" + password.getText() + "'  "
                    + "WHERE us_id = '" + userid.getText() + "'   ");
            close();
        } else {
            JOptionPane.showMessageDialog(null, "No Actions Performed!");
            close();
        }
    }//GEN-LAST:event_karlMouseClicked

    private void karlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karlMouseEntered
        karl.setBackground(o);
    }//GEN-LAST:event_karlMouseEntered

    private void karlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karlMouseExited
        karl.setBackground(ten);
    }//GEN-LAST:event_karlMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setBackground(o);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setBackground(ten);
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        userpage lg = new userpage();
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(o);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(ten);
    }//GEN-LAST:event_closeMouseExited

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
            java.util.logging.Logger.getLogger(userInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel caballero;
    private javax.swing.JPanel close;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel karl;
    public javax.swing.JTextField lname;
    private javax.swing.JPanel minimize;
    public javax.swing.JTextField password;
    public javax.swing.JTextField userid;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
