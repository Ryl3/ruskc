package dashboardinternal;

import config.dbconnector;
import crudInfo.userInfo;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class userpage extends javax.swing.JInternalFrame {

    public userpage() {
        initComponents();
        
        displaydata();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI)this.getUI();
        bif.setNorthPane(null);
    }
    
    public void displaydata(){
             try{
                 dbconnector dbc = new dbconnector();
                 ResultSet rs = dbc.getdata("SELECT * FROM tbl_user");
                 usertable.setModel(DbUtils.resultSetToTableModel(rs));
                 rs.close();
             }catch(SQLException e){
                 System.out.println("Errors" +e.getMessage());
             }
         }

        Color o  = new Color(153,153,255);
        Color ten = new Color(51,51,255);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        find = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(660, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("User Page");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add.setBackground(new java.awt.Color(51, 51, 255));
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

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add");
        add.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        edit.setBackground(new java.awt.Color(51, 51, 255));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edit");
        edit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, 30));

        display.setBackground(new java.awt.Color(51, 51, 255));
        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayMouseExited(evt);
            }
        });
        display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Display");
        display.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 80, 30));

        find.setBackground(new java.awt.Color(51, 51, 255));
        find.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findMouseExited(evt);
            }
        });
        find.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Find");
        find.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        jPanel1.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 60, 30));

        delete.setBackground(new java.awt.Color(51, 51, 255));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Delete");
        delete.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 80, 30));

        searchbar.setBackground(new java.awt.Color(240, 240, 240));
        searchbar.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        searchbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 160, 30));

        usertable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setViewportView(usertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 640, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        userInfo uri = new userInfo();
        uri.setVisible(true);
        uri.action = "Add";
        uri.caballero.setText("Save");
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(o);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(ten);
    }//GEN-LAST:event_addMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowindex = usertable.getSelectedRow();
       if(rowindex<0){
           JOptionPane.showMessageDialog(null, "Please Select an Item!");
       }else{
            TableModel model = usertable.getModel();
            userInfo uri = new userInfo();
                uri.userid.setText(""+model.getValueAt(rowindex, 0));
                uri.fname.setText(""+model.getValueAt(rowindex, 1));
                uri.lname.setText(""+model.getValueAt(rowindex, 2));
                uri.email.setText(""+model.getValueAt(rowindex, 3));
                uri.username.setText(""+model.getValueAt(rowindex, 4));
                uri.password.setText(""+model.getValueAt(rowindex, 5));
                uri.setVisible(true);
                uri.action = "Edit";
                uri.caballero.setText("Update");
                JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
                mainFrame.dispose();
       }
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(o);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(ten);
    }//GEN-LAST:event_editMouseExited

    private void displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseClicked
        displaydata();
    }//GEN-LAST:event_displayMouseClicked

    private void displayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseEntered
        display.setBackground(o);
    }//GEN-LAST:event_displayMouseEntered

    private void displayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseExited
        display.setBackground(ten);
    }//GEN-LAST:event_displayMouseExited

    private void findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_findMouseClicked

    private void findMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseEntered
        find.setBackground(o);
    }//GEN-LAST:event_findMouseEntered

    private void findMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseExited
        find.setBackground(ten);
    }//GEN-LAST:event_findMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
       int rowindex = usertable.getSelectedRow();
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please select data first from the table.");
        }else{
            TableModel model = usertable.getModel();
            Object value = model.getValueAt(rowindex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to Delete ID: " +id);
                if(a == JOptionPane.YES_OPTION){
                    dbconnector dbc = new dbconnector(); 
                    int u_id = Integer.parseInt(id);
                    dbc.deletedata(u_id, "tbl_user", "us_id");
                    displaydata();
                }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(o);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(ten);
    }//GEN-LAST:event_deleteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel display;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel find;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchbar;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
