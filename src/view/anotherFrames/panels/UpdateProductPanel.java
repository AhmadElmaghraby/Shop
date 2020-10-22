package view.anotherFrames.panels;

import control.ProductsControll;
import control.SellAndBuyControl;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Item;

public class UpdateProductPanel extends javax.swing.JPanel {

    int in = 0;
    ArrayList<Item> productsList = new ArrayList<>();
    ArrayList<String> ls = new ArrayList<>();
    String min = "1";
    int productId;

    public UpdateProductPanel() {
        initComponents();
        jRadioIn.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jTextFieldBuyPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldsellPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldsellprice_g = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldamount = new javax.swing.JTextField();
        jComboBoxProducts = new javax.swing.JComboBox();
        jRadioIn = new javax.swing.JRadioButton();
        jRadioOut = new javax.swing.JRadioButton();
        jTextFieldColor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldMin = new javax.swing.JTextField();
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
        jLabel1.setText("اسم المنتج");

        jTextFieldProductName.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldProductName.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldProductName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldProductName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldProductNameInputMethodTextChanged(evt);
            }
        });
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

        jTextFieldsellPrice.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldsellPrice.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldsellPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldsellPrice.setMaximumSize(new java.awt.Dimension(100, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("سعر البيع");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
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
        jLabel8.setText("سعر البيع ج");

        jTextFieldsellprice_g.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldsellprice_g.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldsellprice_g.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldsellprice_g.setMaximumSize(new java.awt.Dimension(100, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("الكمية");

        jTextFieldamount.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldamount.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldamount.setMaximumSize(new java.awt.Dimension(100, 50));

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

        jTextFieldColor.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldColor.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldColor.setMaximumSize(new java.awt.Dimension(100, 50));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("اللون");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("اقل كمية");

        jTextFieldMin.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldMin.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldMin.setMaximumSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jRadioOut)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioIn))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(jTextFieldBuyPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldsellPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(17, 17, 17))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jTextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldamount, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jTextFieldsellprice_g, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioIn)
                    .addComponent(jRadioOut))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldsellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldsellprice_g, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldamount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
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
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
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
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuyPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuyPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuyPriceActionPerformed

    private void jTextFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductNameActionPerformed

        SellAndBuyControl sc = new SellAndBuyControl();

        if (in == 0) {
            productsList = sc.getsearchProductIn(jTextFieldProductName.getText().trim());
        } else if (in == 1) {
            productsList = sc.getsearchProductOut(jTextFieldProductName.getText().trim());
        }

        productsList.stream().forEach((productsList1) -> {
            ls.add(productsList1.getName() + "(" + productsList1.getColor() + ")");
        });

        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));


    }//GEN-LAST:event_jTextFieldProductNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ProductsControll pc = new ProductsControll();
        boolean b = false;
        if (!jTextFieldMin.equals("")) {
            min = jTextFieldMin.getText();
        }
        if (in == 0) {
            b = pc.updateProduct_in(productId, jTextFieldProductName.getText(), jTextFieldBuyPrice.getText(), jTextFieldsellPrice.getText(), jTextFieldsellprice_g.getText(), jTextFieldamount.getText(), jTextFieldColor.getText(), min);
        } else if (in == 1) {
            b = pc.updateProduct_out(productId, jTextFieldProductName.getText(), jTextFieldBuyPrice.getText(), jTextFieldsellPrice.getText(), jTextFieldsellprice_g.getText(), jTextFieldamount.getText(), jTextFieldColor.getText(), min);
        }
        if (b) {
            jTextFieldProductName.setText("");
            jTextFieldBuyPrice.setText("");
            jTextFieldsellPrice.setText("");
            jTextFieldsellprice_g.setText("");
            jTextFieldamount.setText("");
            jTextFieldColor.setText("");
            jTextFieldMin.setText("");
            ls.clear();
            jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxProductsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProductsItemStateChanged
        jTextFieldProductName.setText(productsList.get(jComboBoxProducts.getSelectedIndex()).getName());
    }//GEN-LAST:event_jComboBoxProductsItemStateChanged

    private void jComboBoxProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductsActionPerformed
        SellAndBuyControl sc = new SellAndBuyControl();

        Item p = new Item();

        if (in == 0) {
            p = sc.getselectedProductIn(productsList.get(jComboBoxProducts.getSelectedIndex()).getName(), productsList.get(jComboBoxProducts.getSelectedIndex()).getColor());
        } else if (in == 1) {
            p = sc.getselectedProductOut(productsList.get(jComboBoxProducts.getSelectedIndex()).getName(), productsList.get(jComboBoxProducts.getSelectedIndex()).getColor());
        }

        productId = p.getId();

        jTextFieldProductName.setText(p.getName());
        jTextFieldColor.setText(p.getColor());
        jTextFieldBuyPrice.setText(p.getBuy_price() + "");
        jTextFieldsellPrice.setText(p.getSell_price() + "");
        jTextFieldsellprice_g.setText(p.getSell_big_price() + "");
        jTextFieldamount.setText(p.getNumber() + "");
        jTextFieldMin.setText(p.getMin() + "");


    }//GEN-LAST:event_jComboBoxProductsActionPerformed

    private void jRadioInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInActionPerformed
        in = 0;
        jRadioOut.setSelected(false);
        jTextFieldProductName.setText("");
        jTextFieldColor.setText("");
        jTextFieldBuyPrice.setText("");
        jTextFieldsellPrice.setText("");
        jTextFieldsellprice_g.setText("");
        jTextFieldamount.setText("");
        jTextFieldMin.setText("");
        productsList.clear();
        ls.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));

    }//GEN-LAST:event_jRadioInActionPerformed

    private void jRadioOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOutActionPerformed
        in = 1;
        jRadioIn.setSelected(false);
        jTextFieldProductName.setText("");
        jTextFieldColor.setText("");
        jTextFieldBuyPrice.setText("");
        jTextFieldsellPrice.setText("");
        jTextFieldsellprice_g.setText("");
        jTextFieldamount.setText("");
        jTextFieldMin.setText("");
        productsList.clear();
        ls.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));

    }//GEN-LAST:event_jRadioOutActionPerformed

    private void jTextFieldProductNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldProductNameInputMethodTextChanged

    }//GEN-LAST:event_jTextFieldProductNameInputMethodTextChanged

    private void jTextFieldProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductNameKeyTyped
        ls.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));
        SellAndBuyControl sc = new SellAndBuyControl();

        if (in == 0) {
            productsList = sc.getsearchProductIn(jTextFieldProductName.getText().trim());
        } else if (in == 1) {
            productsList = sc.getsearchProductOut(jTextFieldProductName.getText().trim());
        }

        productsList.stream().forEach((productsList1) -> {
            ls.add(productsList1.getName() + "(" + productsList1.getColor() + ")");
        });

        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));
    }//GEN-LAST:event_jTextFieldProductNameKeyTyped

    private void jTextFieldProductNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductNameKeyPressed
        ls.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));
        SellAndBuyControl sc = new SellAndBuyControl();

        if (in == 0) {
            productsList = sc.getsearchProductIn(jTextFieldProductName.getText().trim());
        } else if (in == 1) {
            productsList = sc.getsearchProductOut(jTextFieldProductName.getText().trim());
        }

        productsList.stream().forEach((productsList1) -> {
            ls.add(productsList1.getName() + "(" + productsList1.getColor() + ")");
        });

        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));    }//GEN-LAST:event_jTextFieldProductNameKeyPressed

    private void jTextFieldProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductNameKeyReleased
        ls.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));
        SellAndBuyControl sc = new SellAndBuyControl();

        if (in == 0) {
            productsList = sc.getsearchProductIn(jTextFieldProductName.getText().trim());
        } else if (in == 1) {
            productsList = sc.getsearchProductOut(jTextFieldProductName.getText().trim());
        }

        productsList.stream().forEach((productsList1) -> {
            ls.add(productsList1.getName() + "(" + productsList1.getColor() + ")");
        });

        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioIn;
    private javax.swing.JRadioButton jRadioOut;
    private javax.swing.JTextField jTextFieldBuyPrice;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldMin;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldamount;
    private javax.swing.JTextField jTextFieldsellPrice;
    private javax.swing.JTextField jTextFieldsellprice_g;
    // End of variables declaration//GEN-END:variables
}
