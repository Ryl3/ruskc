/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudInfo;

import config.dbconnector;
import dashboardinternal.userpage;
import home.dashboard;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ellan
 */
public class hotelInfo extends javax.swing.JFrame {

    /**
     * Creates new form clientInfo
     */
    public hotelInfo() {
        initComponents();
    }
    int validateregister(){
            int result;
            if(hotelname.getText().isEmpty() || type.getSelectedItem().equals(null) || desc.getText().isEmpty() || rent.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Required Inputs!");
                result = 0;
            }else{
                result = 1;
            }
                return result;
        }
    
    public void close(){
        this.dispose();
        dashboard dash = new dashboard();
        dash.setVisible(true);
        userpage cp = new userpage();
        dash.dashboardpane.add(cp).setVisible(true);
   }
    
        Color o  = new Color(153,153,255);
        Color ten = new Color(51,51,255);
        
    public String action;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hotelid = new javax.swing.JTextField();
        clientid = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Add = new javax.swing.JPanel();
        caballero = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        desc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hotelname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel2.setText("Hotel Information");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        rent.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        rent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 270, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel1.setText("Type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel3.setText("Hotel ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setText("Hotel Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel7.setText("Description");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel8.setText("Rent");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        hotelid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        hotelid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        hotelid.setEnabled(false);
        jPanel1.add(hotelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 270, 30));

        clientid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        clientid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clientid.setEnabled(false);
        jPanel1.add(clientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 270, 30));

        userid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        userid.setEnabled(false);
        jPanel1.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 270, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel9.setText("Client ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

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

        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 160, 50));

        type.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartment", "Condo", "Commercial", "Room" }));
        type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 270, 30));

        desc.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 270, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel5.setText("User ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        hotelname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        hotelname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(hotelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        if(action.equals("Add")){
            
        int check = validateregister(); 
        if(check == 1){
            dbconnector dbc = new dbconnector();
           int result = dbc.insertdata("INSERT INTO tbl_hotel(h_id, cl_id, us_id, h_hotelname, h_type, h_desc, h_rent ) "
                   + "VALUES ('"+hotelid.getText()+"', '"+clientid.getText()+"', '"+userid.getText()+"'"
                           + ", '"+hotelname.getText()+"', '"+type.getSelectedItem()+"','"+desc.getText()+"', '"+rent.getText()+"')");
           if(result==1){
                  JOptionPane.showMessageDialog(null, "Successfully Saved!");
               close();
            }else{
                  JOptionPane.showMessageDialog(null, "Successfully Failed!");
              }
            }else{
                  
              }
        
       }else if(action.equals("Edit")){
           dbconnector dbc = new dbconnector();
            dbc.updatedata("UPDATE tbl_hotel SET , h_hotelname = '"+hotelname.getText()+"', h_type = '"  +type.getSelectedItem()+ "' ,h_desc =  '"+desc.getText()+"',"
                                    + "h_rent = '"+rent.getText()+"'WHERE h_id = '"+hotelid.getText()+"', cl_id = '"+clientid.getText()+"',"
                                            + " us_id = '"+userid.getText()+"',   ");
               close();
            }else{
                  JOptionPane.showMessageDialog(null, "No Actions Performed!");
                close();
       }
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(o);
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(ten);
    }//GEN-LAST:event_AddMouseExited

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
    public javax.swing.JLabel caballero;
    public javax.swing.JTextField clientid;
    public javax.swing.JTextField desc;
    public javax.swing.JTextField hotelid;
    public javax.swing.JTextField hotelname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField rent;
    public javax.swing.JComboBox<String> type;
    public javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
