package home;

import dashboardinternal.clientpage;
import dashboardinternal.hotelpage;
import dashboardinternal.userpage;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class dashboard extends javax.swing.JFrame {

    
    public dashboard() {
        initComponents();
    }

        Color o  = new Color(153,153,255);
        Color ten = new Color(51,51,255);
        Color bolbol = new Color(0,0,102);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        clients = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        accounts = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        hotels = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        minimize = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dashboardpane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clients.setBackground(new java.awt.Color(51, 51, 255));
        clients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientsMouseExited(evt);
            }
        });
        clients.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clients");
        clients.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jPanel3.add(clients, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 90, 40));

        dashboard.setBackground(new java.awt.Color(51, 51, 255));
        dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dashboard");
        dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jPanel3.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 40));

        accounts.setBackground(new java.awt.Color(51, 51, 255));
        accounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        accounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountsMouseExited(evt);
            }
        });
        accounts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Account");
        accounts.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jPanel3.add(accounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 90, 40));

        users.setBackground(new java.awt.Color(51, 51, 255));
        users.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Users");
        users.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jPanel3.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 90, 40));

        hotels.setBackground(new java.awt.Color(51, 51, 255));
        hotels.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        hotels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotelsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hotelsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hotelsMouseExited(evt);
            }
        });
        hotels.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hotels");
        hotels.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jPanel3.add(hotels, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 90, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 450));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setBackground(new java.awt.Color(0, 0, 102));
        minimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 3));
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
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("—");
        minimize.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 20));

        jPanel4.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 40));

        close.setBackground(new java.awt.Color(0, 0, 102));
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 3));
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
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        close.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, -1));

        jPanel4.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 660, 40));

        dashboardpane.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout dashboardpaneLayout = new javax.swing.GroupLayout(dashboardpane);
        dashboardpane.setLayout(dashboardpaneLayout);
        dashboardpaneLayout.setHorizontalGroup(
            dashboardpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        dashboardpaneLayout.setVerticalGroup(
            dashboardpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel2.add(dashboardpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 660, 410));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

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
        minimize.setBackground(bolbol);
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
        close.setBackground(bolbol);
    }//GEN-LAST:event_closeMouseExited

    private void clientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsMouseEntered
        clients.setBackground(o);
    }//GEN-LAST:event_clientsMouseEntered

    private void clientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsMouseExited
        clients.setBackground(ten);
    }//GEN-LAST:event_clientsMouseExited

    private void clientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsMouseClicked
        clientpage db = new clientpage();
        dashboardpane.add(db).setVisible(true);
    }//GEN-LAST:event_clientsMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(o);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setBackground(ten);
    }//GEN-LAST:event_dashboardMouseExited

    private void accountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_accountsMouseClicked

    private void accountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseEntered
        accounts.setBackground(o);
    }//GEN-LAST:event_accountsMouseEntered

    private void accountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseExited
        accounts.setBackground(ten);
    }//GEN-LAST:event_accountsMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        userpage db = new userpage();
        dashboardpane.add(db).setVisible(true);
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setBackground(o);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBackground(ten);
    }//GEN-LAST:event_usersMouseExited

    private void hotelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotelsMouseClicked
        hotelpage db = new hotelpage();
        dashboardpane.add(db).setVisible(true);
    }//GEN-LAST:event_hotelsMouseClicked

    private void hotelsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotelsMouseEntered
        hotels.setBackground(o);
    }//GEN-LAST:event_hotelsMouseEntered

    private void hotelsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotelsMouseExited
        hotels.setBackground(ten);
    }//GEN-LAST:event_hotelsMouseExited

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accounts;
    private javax.swing.JPanel clients;
    private javax.swing.JPanel close;
    private javax.swing.JPanel dashboard;
    public javax.swing.JDesktopPane dashboardpane;
    private javax.swing.JPanel hotels;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel minimize;
    private javax.swing.JPanel users;
    // End of variables declaration//GEN-END:variables
}
