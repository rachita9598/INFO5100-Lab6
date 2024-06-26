/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main_Form;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
   private ArrayList<User> users;
   private User selectedUser;
   
    public ViewPanel() {
        initComponents();
        populateTable();
    }
    
  /*  void setValues(){
        
         // jTextFieldFirstname.setText(user.getFirstname());
         /* firstnamejTextField1.setText(patient.getFirstName());
          lastnamejTextField1.setText(patient.getLastName());
          agejTextField1.setText(Integer.toString(patient.getAge()));
          emailjTextField1.setText(patient.getEmail());
          messagejTextField1.setText(patient.getMessage());*/
         
        //firstnamejLabel1.setText(patient.getFirstName());
       
       // agejLabel1.setText(Integer.toString(patient.getAge()));
       
        
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        namejLabel1 = new javax.swing.JLabel();
        agejLabel1 = new javax.swing.JLabel();
        namejTextField1 = new javax.swing.JTextField();
        agejTextField2 = new javax.swing.JTextField();
        editjButton1 = new javax.swing.JButton();
        deletejButton2 = new javax.swing.JButton();
        savejButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 400));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(2).setResizable(false);
        }

        namejLabel1.setText("Name");

        agejLabel1.setText("Age");

        editjButton1.setText("EDIT");
        editjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editjButton1ActionPerformed(evt);
            }
        });

        deletejButton2.setText("Delete");
        deletejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton2ActionPerformed(evt);
            }
        });

        savejButton3.setText("Save");
        savejButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(editjButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletejButton2)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namejLabel1)
                            .addComponent(agejLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namejTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(agejTextField2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savejButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editjButton1)
                            .addComponent(deletejButton2))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namejLabel1)
                            .addComponent(namejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agejLabel1)
                            .addComponent(agejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savejButton3)
                        .addGap(66, 66, 66))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex == -1){
            JOptionPane.showMessageDialog(this,"Please select a user to edit");
            return;
        }
            selectedUser=users.get(selectedIndex);
            namejTextField1.setText(selectedUser.getName());
            agejTextField2.setText(Integer.toString(selectedUser.getAge()));
    }//GEN-LAST:event_editjButton1ActionPerformed

    private void deletejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton2ActionPerformed
        // TODO add your handling code here:
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex == -1){
            JOptionPane.showMessageDialog(this,"Please select a user to delete");
            return;
        }
        try{
            selectedUser = users.get(selectedIndex);
            DatabaseConnector.deleteUser(selectedUser);
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
            clearFields(); 
            populateTable();
                       
        }catch(Exception e){
         JOptionPane.showMessageDialog(this,e.getMessage());   
        }

    }//GEN-LAST:event_deletejButton2ActionPerformed

    private void savejButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButton3ActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        try{
            newUser.setAge(Integer.parseInt(agejTextField2.getText()));
            newUser.setName(namejTextField1.getText());
            DatabaseConnector.editUser(selectedUser, newUser);
            JOptionPane.showMessageDialog(this,"User Edited Successfully");
            clearFields();
            populateTable();            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_savejButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agejLabel1;
    private javax.swing.JTextField agejTextField2;
    private javax.swing.JButton deletejButton2;
    private javax.swing.JButton editjButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel namejLabel1;
    private javax.swing.JTextField namejTextField1;
    private javax.swing.JButton savejButton3;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
public void populateTable(){
    try{
        this.users= DatabaseConnector.getAllusers();
        DefaultTableModel model=(DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        for(User u : users){
            Object[] row=new Object[3];
            row[0]=u.getId();
            row[1]=u.getName();
            row[2]= u.getAge();
            model.addRow(row);
        }
        clearFields();        
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());        
    }
}
public void clearFields(){
    namejTextField1.setText("");
    agejTextField2.setText("");
    selectedUser=null;
}
}
