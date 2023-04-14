/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudInfo;


import config.dbconnector;
import dashboardinternal.clientpage;
import home.dashboard;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ellan
 */
public class clientInfo extends javax.swing.JFrame {

    /**
     * Creates new form clientInfo
     */
    public clientInfo() {
        initComponents();
    }
    
    public void close(){
        this.dispose();
        dashboard dash = new dashboard();
        dash.setVisible(true);
        clientpage cp = new clientpage();
        dash.dashboardpane.add(cp).setVisible(true);
   }
    
    int validateregister(){
            int result;
            if(fname.getText().isEmpty() || lname.getText().isEmpty() || mobile.getText().isEmpty() || 
                    gender.getSelectedItem().equals(null) || status.getSelectedItem().equals(null) || 
                    address.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null, "Required Inputs!");
                result = 0;
            }else{
                result = 1;
            }
                return result;
        }

        Color o  = new Color(153,153,255);
        Color ten = new Color(51,51,255);
        
    public String action;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        clientid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        caballero = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel2.setText("Client's Information");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        address.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 270, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel1.setText("Gender");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel3.setText("Client ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel5.setText("Mobile");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel7.setText("Status");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        mobile.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 270, 30));

        clientid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        clientid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clientid.setEnabled(false);
        jPanel1.add(clientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 270, 30));

        fname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 270, 30));

        lname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 270, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel9.setText("First Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        add.setBackground(new java.awt.Color(153, 153, 255));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caballero.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        caballero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caballero.setText("Caballero");
        add.add(caballero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 30));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 160, 50));

        status.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Couple", "Married", "Family", "Divorced" }));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 270, 30));

        gender.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if(action.equals("Add")){
           
           int check = validateregister(); 
        if(check == 1){
            
            dbconnector dbc = new dbconnector();
           int result = dbc.insertdata("INSERT INTO tbl_client(cl_fname, cl_lname,cl_mobile, cl_gender,cl_status, cl_address) "
                   + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+mobile.getText()+"', '"+gender.getSelectedItem()+"',"
                           + " '"+status.getSelectedItem()+"', '"+address.getText()+"' )");
           if(result==1){
                    JOptionPane.showMessageDialog(null, "Successfully Saved!");
               close();
           }else{
                    JOptionPane.showMessageDialog(null, "Successfully Failed!");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Required Inputs!");
                }
           
       }else if(action.equals("Edit")){
           dbconnector dbc = new dbconnector();
            dbc.updatedata("UPDATE tbl_client SET cl_fname = '"+fname.getText()+"', cl_lname =  '"+lname.getText()+"',"
                    + " cl_mobile =  '"+mobile.getText()+"', cl_gender =  '"+gender.getSelectedItem()+"',"
                            + " cl_status =  '"+status.getSelectedItem()+"', cl_address =  '"+address.getText()+"',    ");
               close();
            }else{
                  JOptionPane.showMessageDialog(null, "No Actions Performed!");
                close();
       }
    

    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(o);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(ten);
    }//GEN-LAST:event_addMouseExited

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
            java.util.logging.Logger.getLogger(clientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    public javax.swing.JTextField address;
    public javax.swing.JLabel caballero;
    public javax.swing.JTextField clientid;
    public javax.swing.JTextField fname;
    public javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField mobile;
    public javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
