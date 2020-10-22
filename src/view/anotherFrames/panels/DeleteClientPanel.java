package view.anotherFrames.panels;

import control.ClientsControll;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.ClientsM;

public class DeleteClientPanel extends javax.swing.JPanel {

    static int clientId;
    ArrayList<String> lss = new ArrayList<>();

    public DeleteClientPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextFieldProductName1 = new javax.swing.JTextField();
        jTextFieldBuyPrice1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldٍsellPrice = new javax.swing.JTextField();
        jTextFieldِsellprice_g = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldِamount = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCreadetor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDebtor = new javax.swing.JTextField();
        jComboBoxClient = new javax.swing.JComboBox();
        jTextFieldClientName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("اسم العميل");

        jTextFieldProductName1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldProductName1.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldProductName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldProductName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductName1ActionPerformed(evt);
            }
        });

        jTextFieldBuyPrice1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldBuyPrice1.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldBuyPrice1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldBuyPrice1.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextFieldBuyPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuyPrice1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("عنوان العميل");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("رقم العميل");

        jTextFieldٍsellPrice.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldٍsellPrice.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldٍsellPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldٍsellPrice.setMaximumSize(new java.awt.Dimension(100, 50));

        jTextFieldِsellprice_g.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldِsellprice_g.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldِsellprice_g.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldِsellprice_g.setMaximumSize(new java.awt.Dimension(100, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("مدين");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("دائن");

        jTextFieldِamount.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldِamount.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldِamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldِamount.setMaximumSize(new java.awt.Dimension(100, 50));

        setBackground(new java.awt.Color(0, 170, 170));
        setForeground(new java.awt.Color(0, 102, 51));
        setPreferredSize(new java.awt.Dimension(1000, 475));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 74));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("اسم العميل");

        jTextFieldAddress.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldAddress.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldAddress.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextFieldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddressActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("عنوان العميل");

        jTextFieldPhone.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldPhone.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldPhone.setMaximumSize(new java.awt.Dimension(100, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("رقم العميل");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add2.png"))); // NOI18N
        jButton1.setText("حذف");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("علية");

        jTextFieldCreadetor.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldCreadetor.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldCreadetor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldCreadetor.setMaximumSize(new java.awt.Dimension(100, 50));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jTextFieldCreadetor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jTextFieldDebtor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldClientName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCreadetor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDebtor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(0, 170, 170));
        jPanel6.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("حذف عميل");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ClientsControll pc = new ClientsControll();

        boolean b = pc.deleteClients(clientId);
        if (b) {
            jTextFieldClientName.setText("");
            jTextFieldAddress.setText("");
            jTextFieldPhone.setText("");
            jTextFieldCreadetor.setText("");
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
        jTextFieldAddress.setText(c.getAddress());
        jTextFieldPhone.setText(c.getPhone());
        jTextFieldCreadetor.setText(c.getCreditor() + "");
        jTextFieldDebtor.setText(c.getDebtor() + "");


    }//GEN-LAST:event_jComboBoxClientActionPerformed

    private void jTextFieldProductName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductName1ActionPerformed

    private void jTextFieldBuyPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuyPrice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuyPrice1ActionPerformed

    private void jTextFieldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddressActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldBuyPrice1;
    private javax.swing.JTextField jTextFieldClientName;
    private javax.swing.JTextField jTextFieldCreadetor;
    private javax.swing.JTextField jTextFieldDebtor;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldProductName1;
    private javax.swing.JTextField jTextFieldٍsellPrice;
    private javax.swing.JTextField jTextFieldِamount;
    private javax.swing.JTextField jTextFieldِsellprice_g;
    // End of variables declaration//GEN-END:variables
}
