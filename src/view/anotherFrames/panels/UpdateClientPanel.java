package view.anotherFrames.panels;

import control.ClientsControll;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.ClientsM;

public class UpdateClientPanel extends javax.swing.JPanel {

    static int clientId;
    ArrayList<String> lss = new ArrayList<>();

    public UpdateClientPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextClientAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldClientPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCreditor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDebtor = new javax.swing.JTextField();
        jComboBoxClient = new javax.swing.JComboBox();
        jTextFieldClientName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 170, 170));
        setForeground(new java.awt.Color(0, 102, 51));
        setPreferredSize(new java.awt.Dimension(1000, 475));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 74));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("اسم العميل");

        jTextClientAddress.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextClientAddress.setForeground(new java.awt.Color(0, 0, 102));
        jTextClientAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextClientAddress.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextClientAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextClientAddressActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("عنوان العميل");

        jTextFieldClientPhone.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldClientPhone.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldClientPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldClientPhone.setMaximumSize(new java.awt.Dimension(100, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("رقم العميل");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add2.png"))); // NOI18N
        jButton1.setText("تعديل");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("علية");

        jTextFieldCreditor.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldCreditor.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldCreditor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldCreditor.setMaximumSize(new java.awt.Dimension(100, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("لة");

        jTextFieldDebtor.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldDebtor.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldDebtor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldDebtor.setMaximumSize(new java.awt.Dimension(100, 50));

        jComboBoxClient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxClientItemStateChanged(evt);
            }
        });
        jComboBoxClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClientActionPerformed(evt);
            }
        });

        jTextFieldClientName.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldClientName.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldClientName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClientNameActionPerformed(evt);
            }
        });
        jTextFieldClientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldClientNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldClientNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClientNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCreditor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldDebtor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextClientAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jTextFieldClientPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldClientName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCreditor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDebtor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(0, 170, 170));
        jPanel6.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("تعديل عميل");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextClientAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextClientAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextClientAddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ClientsControll pc = new ClientsControll();
        boolean b = pc.updateClients(clientId, jTextFieldClientName.getText(), jTextFieldCreditor.getText(), jTextFieldDebtor.getText(), jTextClientAddress.getText(), jTextFieldClientPhone.getText());
        if (b) {
            jTextFieldClientName.setText("");
            jTextClientAddress.setText("");
            jTextFieldClientPhone.setText("");
            jTextFieldCreditor.setText("");
            jTextFieldDebtor.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClientItemStateChanged
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxClientItemStateChanged

    private void jComboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientActionPerformed
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
        ClientsControll pc = new ClientsControll();
        ClientsM c = pc.getselectedClient(jComboBoxClient.getSelectedItem().toString());

        clientId = c.getId();

        jTextFieldClientName.setText(c.getName());
        jTextClientAddress.setText(c.getAddress());
        jTextFieldClientPhone.setText(c.getPhone());
        jTextFieldCreditor.setText(c.getCreditor() + "");
        jTextFieldDebtor.setText(c.getDebtor() + "");


    }//GEN-LAST:event_jComboBoxClientActionPerformed

    private void jTextFieldClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientNameActionPerformed

    private void jTextFieldClientNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientNameKeyPressed
        lss.clear();
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));
        ClientsControll pc = new ClientsControll();
        ArrayList<ClientsM> productsList = pc.getClients_name(jTextFieldClientName.getText().trim());
        productsList.stream().forEach((productsList1) -> {
            lss.add(productsList1.getName());
        });
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientNameKeyPressed

    private void jTextFieldClientNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientNameKeyReleased
        lss.clear();
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));
        ClientsControll pc = new ClientsControll();
        ArrayList<ClientsM> productsList = pc.getClients_name(jTextFieldClientName.getText().trim());
        productsList.stream().forEach((productsList1) -> {
            lss.add(productsList1.getName());
        });
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientNameKeyReleased

    private void jTextFieldClientNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientNameKeyTyped
        lss.clear();
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));
        ClientsControll pc = new ClientsControll();
        ArrayList<ClientsM> productsList = pc.getClients_name(jTextFieldClientName.getText().trim());
        productsList.stream().forEach((productsList1) -> {
            lss.add(productsList1.getName());
        });
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientNameKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextClientAddress;
    private javax.swing.JTextField jTextFieldClientName;
    private javax.swing.JTextField jTextFieldClientPhone;
    private javax.swing.JTextField jTextFieldCreditor;
    private javax.swing.JTextField jTextFieldDebtor;
    // End of variables declaration//GEN-END:variables
}
