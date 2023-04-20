
package crudInfo;

import config.dbconnector;
import dashboardinternal.hotelpage;
import dashboardinternal.userpage;
import home.dashboard;
import java.awt.Color;
import javax.swing.JOptionPane;


public class hotelInfo extends javax.swing.JFrame {

    
    public hotelInfo() {
        initComponents();
    }

    int validateregister() {
        int result;
        if (status.getSelectedItem().equals(null) || desc.getText().isEmpty() || rent.getText().isEmpty()) {
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
        jLabel3 = new javax.swing.JLabel();
        hotelid = new javax.swing.JTextField();
        clientid = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Add = new javax.swing.JPanel();
        caballero = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        rent = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
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
        jLabel2.setText("Hotel Information");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel3.setText("Hotel ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        hotelid.setEditable(false);
        hotelid.setBackground(new java.awt.Color(245, 245, 245));
        hotelid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        hotelid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(hotelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 270, 30));

        clientid.setEditable(false);
        clientid.setBackground(new java.awt.Color(245, 245, 245));
        clientid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        clientid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(clientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 270, 30));

        userid.setEditable(false);
        userid.setBackground(new java.awt.Color(245, 245, 245));
        userid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel9.setText("Client ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        Add.setBackground(new java.awt.Color(153, 153, 255));
        Add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        Add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caballero.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        caballero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caballero.setText("Caballero");
        Add.add(caballero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 30));

        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 160, 50));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel5.setText("User ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel10.setText("First Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        fname.setEditable(false);
        fname.setBackground(new java.awt.Color(245, 245, 245));
        fname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 270, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        lname.setEditable(false);
        lname.setBackground(new java.awt.Color(245, 245, 245));
        lname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 270, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        email.setEditable(false);
        email.setBackground(new java.awt.Color(245, 245, 245));
        email.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 270, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel7.setText("Mobile");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 30));

        mobile.setEditable(false);
        mobile.setBackground(new java.awt.Color(245, 245, 245));
        mobile.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 270, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        address.setEditable(false);
        address.setBackground(new java.awt.Color(245, 245, 245));
        address.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 270, 30));

        rent.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        rent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 270, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel11.setText("Rent");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel12.setText("Status");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel13.setText("Description");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 30));

        desc.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 270, 30));

        status.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Onhold", "Cancelled" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 270, 30));

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

        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

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

        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        if (action.equals("Add")) {

            int check = validateregister();
            if (check == 1) {
                dbconnector dbc = new dbconnector();
                int result = dbc.insertdata("INSERT INTO tbl_hotel(h_id, cl_id, us_id, h_status, h_desc, h_rent) "
                        + "VALUES ('" + hotelid.getText() + "', '" + clientid.getText() + "', '" + userid.getText() + "',"
                        + " '" + status.getSelectedItem() + "', '" + desc.getText() + "', '" + rent.getText() + "')");
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Successfully Saved!");
                    close();
                } else {
                    JOptionPane.showMessageDialog(null, "Successfully Failed!");
                }
            } else {
            }
        } 
        else 
        if (action.equals("Edit")) {
            int check = validateregister();
             if (check == 1) {
            dbconnector dbc = new dbconnector();
            dbc.updatedata("UPDATE tbl_hotel SET h_status = '" + status.getSelectedItem() + "', h_desc = '" + desc.getText() + "', h_rent = '" + rent.getText() + "' "
                    + "WHERE h_id = " + hotelid.getText() + "', cl_id = " + clientid.getText() + "', us_id = " + userid.getText() + "'  ");
            close();
        } else {
            JOptionPane.showMessageDialog(null, "No Actions Performed!");
            close();
        }
        }
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(ten);
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(o);
    }//GEN-LAST:event_AddMouseExited

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
        hotelpage lg = new hotelpage();
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
            java.util.logging.Logger.getLogger(hotelInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotelInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotelInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotelInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotelInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    public javax.swing.JTextField address;
    public javax.swing.JLabel caballero;
    public javax.swing.JTextField clientid;
    private javax.swing.JPanel close;
    public javax.swing.JTextField desc;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    public javax.swing.JTextField hotelid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField lname;
    private javax.swing.JPanel minimize;
    public javax.swing.JTextField mobile;
    public javax.swing.JTextField rent;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
