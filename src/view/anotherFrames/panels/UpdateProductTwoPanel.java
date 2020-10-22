package view.anotherFrames.panels;

import control.InventoryTwoControll;
import control.SellAndBuyControl;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Item;
import model.ItemTwo;

/**
 *
 * @author compucare
 */
public class UpdateProductTwoPanel extends javax.swing.JPanel {
    
    int in = 0;
    ArrayList<ItemTwo> productsList = new ArrayList<>();
    ArrayList<String> ls = new ArrayList<>();
    ItemTwo p = new ItemTwo();
    
    int productId;
    
    public UpdateProductTwoPanel() {
        initComponents();
        jRadioIn.setSelected(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldBuyPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldِamount = new javax.swing.JTextField();
        jRadioIn = new javax.swing.JRadioButton();
        jRadioOut = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jComboBoxProducts = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 170, 170));
        setForeground(new java.awt.Color(0, 102, 51));
        setPreferredSize(new java.awt.Dimension(1000, 475));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 74));

        jTextFieldBuyPrice.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldBuyPrice.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldBuyPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldBuyPrice.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextFieldBuyPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuyPriceActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" سعر الشراء");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add2.png"))); // NOI18N
        jButton1.setText("اضافة");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("الكمية");

        jTextFieldِamount.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldِamount.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldِamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldِamount.setMaximumSize(new java.awt.Dimension(100, 50));

        jRadioIn.setBackground(new java.awt.Color(0, 204, 204));
        jRadioIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioIn.setForeground(new java.awt.Color(255, 255, 255));
        jRadioIn.setText("داخلى");
        jRadioIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInActionPerformed(evt);
            }
        });

        jRadioOut.setBackground(new java.awt.Color(0, 204, 204));
        jRadioOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioOut.setForeground(new java.awt.Color(255, 255, 255));
        jRadioOut.setText("خارجى");
        jRadioOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("اسم المنتج");

        jTextFieldProductName.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldProductName.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldProductName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductNameActionPerformed(evt);
            }
        });
        jTextFieldProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProductNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldProductNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProductNameKeyTyped(evt);
            }
        });

        jComboBoxProducts.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProductsItemStateChanged(evt);
            }
        });
        jComboBoxProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductsActionPerformed(evt);
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
                        .addComponent(jRadioOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioIn)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldِamount, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioIn)
                    .addComponent(jRadioOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldِamount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(0, 170, 170));
        jPanel6.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("تعديل منتج");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
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

    private void jTextFieldBuyPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuyPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuyPriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        InventoryTwoControll pc = new InventoryTwoControll();
        boolean b = false;
        if (in == 0) {
            b = pc.updateProduct_in(productId, jTextFieldBuyPrice.getText(), jTextFieldِamount.getText());
        } else if (in == 1) {
            b = pc.updateProduct_out(productId, jTextFieldBuyPrice.getText(), jTextFieldِamount.getText());
        }
        if (b) {
            jTextFieldProductName.setText("");
            jTextFieldBuyPrice.setText("");
            jTextFieldِamount.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInActionPerformed
        in = 0;
        jRadioOut.setSelected(false);
        jTextFieldProductName.setText("");
        jTextFieldِamount.setText("");
        jTextFieldBuyPrice.setText("");
        jComboBoxProducts.setModel(new DefaultComboBoxModel());

    }//GEN-LAST:event_jRadioInActionPerformed

    private void jRadioOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOutActionPerformed
        in = 1;
        jRadioIn.setSelected(false);
        jTextFieldProductName.setText("");
        jTextFieldِamount.setText("");
        jTextFieldBuyPrice.setText("");
        jComboBoxProducts.setModel(new DefaultComboBoxModel());
    }//GEN-LAST:event_jRadioOutActionPerformed

    private void jComboBoxProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductsActionPerformed
        InventoryTwoControll sc = new InventoryTwoControll();
        if (in == 0) {
            p = sc.getProduct_id_in(productsList.get(jComboBoxProducts.getSelectedIndex()).getId());
        } else if (in == 1) {
            p = sc.getProduct_id_out(productsList.get(jComboBoxProducts.getSelectedIndex()).getId());
        }
        productId = p.getId();

        jTextFieldProductName.setText(p.getName());
        jTextFieldBuyPrice.setText(p.getBuy_price() + "");
        jTextFieldِamount.setText("" + p.getNumber());
    }//GEN-LAST:event_jComboBoxProductsActionPerformed

    private void jComboBoxProductsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProductsItemStateChanged
        jTextFieldProductName.setText(jComboBoxProducts.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxProductsItemStateChanged

    private void jTextFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameActionPerformed

    private void jTextFieldProductNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductNameKeyPressed

  InventoryTwoControll sc = new InventoryTwoControll();
        productsList = new ArrayList<>();
        if (in == 0) {
            productsList = sc.getProductName_in(jTextFieldProductName.getText().trim());
        } else if (in == 1) {
            productsList = sc.getProductName_out(jTextFieldProductName.getText().trim());
        }
        ArrayList<String> ls = new ArrayList<>();

        productsList.stream().forEach((productsList1) -> {
            ls.add(productsList1.getName() + "(" + productsList1.getColor() + ")");
        });
        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameKeyPressed

    private void jTextFieldProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductNameKeyReleased

  InventoryTwoControll sc = new InventoryTwoControll();
        productsList = new ArrayList<>();
        if (in == 0) {
            productsList = sc.getProductName_in(jTextFieldProductName.getText().trim());
        } else if (in == 1) {
            productsList = sc.getProductName_out(jTextFieldProductName.getText().trim());
        }
        ArrayList<String> ls = new ArrayList<>();

        productsList.stream().forEach((productsList1) -> {
            ls.add(productsList1.getName() + "(" + productsList1.getColor() + ")");
        });
        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameKeyReleased

    private void jTextFieldProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductNameKeyTyped

  InventoryTwoControll sc = new InventoryTwoControll();
        productsList = new ArrayList<>();
        if (in == 0) {
            productsList = sc.getProductName_in(jTextFieldProductName.getText().trim());
        } else if (in == 1) {
            productsList = sc.getProductName_out(jTextFieldProductName.getText().trim());
        }
        ArrayList<String> ls = new ArrayList<>();

        productsList.stream().forEach((productsList1) -> {
            ls.add(productsList1.getName() + "(" + productsList1.getColor() + ")");
        });
        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxProducts;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioIn;
    private javax.swing.JRadioButton jRadioOut;
    private javax.swing.JTextField jTextFieldBuyPrice;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldِamount;
    // End of variables declaration//GEN-END:variables
}
