package view.panels;

import control.ClientsControll;
import control.SellAndBuyControl;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BillsM;
import model.ClientsM;
import model.*;

public class buyPanel extends javax.swing.JPanel {

    int in = 0;
    int is_paid = 1;
    Item p = new Item();
    ClientsM client = new ClientsM();
    BillsM b = new BillsM();
    ArrayList<Item> productsList;
    ArrayList<String> ls = new ArrayList<>();
    ArrayList<String> lss = new ArrayList<>();

    String[] columnNames = {"الاسم",
        "سعر الشراء",
        "العدد",
        "رقم الفاتورة",};

    DefaultTableModel model = new DefaultTableModel();

    public buyPanel() {
        initComponents();
        jRadioIn.setSelected(true);
        model.setColumnIdentifiers(columnNames);
        jTableSaledProducts.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBuyPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxProducts = new javax.swing.JComboBox();
        jRadioIn = new javax.swing.JRadioButton();
        jRadioOut = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxClient = new javax.swing.JComboBox();
        jCheckBox = new javax.swing.JCheckBox();
        jTextFieldProductName = new javax.swing.JTextField();
        jTextFieldClientName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSaledProducts = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTextName = new javax.swing.JTextField();
        jTextColor = new javax.swing.JTextField();
        jTextSellPrice = new javax.swing.JTextField();
        jTextSellBigPrice = new javax.swing.JTextField();
        jTextNumber = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 170, 170));
        setForeground(new java.awt.Color(0, 102, 51));
        setPreferredSize(new java.awt.Dimension(1000, 475));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 74));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("اسم المنتج");

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
        jLabel3.setText("السعر");

        jTextFieldAmount.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldAmount.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldAmount.setMaximumSize(new java.awt.Dimension(100, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("الكمية");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/add2.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        jLabel2.setText("اسم العميل");

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

        jCheckBox.setText("اجل");
        jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioIn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProducts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioIn)
                        .addComponent(jRadioOut)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox)))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(710, 300));

        jTableSaledProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTableSaledProducts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTableSaledProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableSaledProducts);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));
        jPanel4.setMaximumSize(new java.awt.Dimension(90, 500));
        jPanel4.setPreferredSize(new java.awt.Dimension(80, 319));

        jTextName.setEditable(false);
        jTextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        jTextColor.setEditable(false);
        jTextColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextColor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        jTextSellPrice.setEditable(false);
        jTextSellPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSellPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        jTextSellBigPrice.setEditable(false);
        jTextSellBigPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSellBigPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        jTextNumber.setEditable(false);
        jTextNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextName)
                    .addComponent(jTextSellPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextColor)
                    .addComponent(jTextSellBigPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextNumber))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextSellBigPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(0, 170, 170));
        jPanel6.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("شراء");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/1458935647_testimonials.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuyPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuyPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuyPriceActionPerformed

    private void jComboBoxProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductsActionPerformed
        SellAndBuyControl sc = new SellAndBuyControl();
        if (in == 0) {
            // p = sc.getselectedProductIn(productsList.get(jComboBoxProducts.getSelectedIndex()).getName(), productsList.get(jComboBoxProducts.getSelectedIndex()).getColor());
            p = sc.getselectedProductIn(productsList.get(jComboBoxProducts.getSelectedIndex()).getId());
        } else if (in == 1) {
            p = sc.getselectedProductOut(productsList.get(jComboBoxProducts.getSelectedIndex()).getId());
            //  p = sc.getselectedProductOut(productsList.get(jComboBoxProducts.getSelectedIndex()).getName(), productsList.get(jComboBoxProducts.getSelectedIndex()).getColor());
        }

        jTextColor.setText("اللون : " + p.getColor());
        jTextName.setText("الاسم  : " + p.getName());
        jTextSellPrice.setText("سعر البيع  : " + p.getSell_price() + "");
        jTextSellBigPrice.setText("سعر البيع جملة: " + p.getSell_big_price() + "");
        jTextNumber.setText("العدد:" + p.getNumber() + "");

        jTextFieldBuyPrice.setText(p.getBuy_price() + "");
        jTextFieldProductName.setText(p.getName());

    }//GEN-LAST:event_jComboBoxProductsActionPerformed

    private void jComboBoxProductsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProductsItemStateChanged
        jTextFieldProductName.setText(p.getName());
    }//GEN-LAST:event_jComboBoxProductsItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if (jCheckBox.isSelected()) {
                //اجل
                is_paid = 0;
            }
            double buy_Price = Double.parseDouble(jTextFieldBuyPrice.getText());
            int amount = Integer.parseInt(jTextFieldAmount.getText());
            double all_price = buy_Price * amount;
            int updated_amount = p.getNumber() + amount;
            SellAndBuyControl sc = new SellAndBuyControl();

            boolean b = false;
            if (in == 0) {
                b = sc.buy_product_in(jTextFieldProductName.getText(), jTextFieldBuyPrice.getText(),
                        all_price + "",
                        jTextFieldAmount.getText(), p.getId() + "", updated_amount + "", client.getId(), is_paid);
            }
            if (in == 1) {
                b = sc.buy_product_out(jTextFieldProductName.getText(), jTextFieldBuyPrice.getText(),
                        all_price + "",
                        jTextFieldAmount.getText(), p.getId() + "", updated_amount + "", client.getId(), is_paid);
            }

            if (b) {
                model.addRow(new Object[]{jTextFieldProductName.getText(),
                    jTextFieldBuyPrice.getText(),
                    amount,});

                jTextFieldProductName.setText("");
                jTextFieldBuyPrice.setText("");
                jTextFieldAmount.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "error\n");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error\n" + e.getMessage());
        }
        jCheckBox.setSelected(false);
        is_paid = 1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInActionPerformed
        in = 0;
        jRadioOut.setSelected(false);
        jTextColor.setText("");
        jTextName.setText("");
        jTextSellPrice.setText("");
        jTextSellBigPrice.setText("");
        jTextNumber.setText("");
        jTextFieldProductName.setText("");
        jTextFieldAmount.setText("");
        jTextFieldBuyPrice.setText("");
        productsList.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel());

    }//GEN-LAST:event_jRadioInActionPerformed

    private void jRadioOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOutActionPerformed
        in = 1;
        jRadioIn.setSelected(false);
        jTextColor.setText("");
        jTextName.setText("");
        jTextSellPrice.setText("");
        jTextSellBigPrice.setText("");
        jTextNumber.setText("");
        jTextFieldProductName.setText("");
        jTextFieldAmount.setText("");
        jTextFieldBuyPrice.setText("");
        productsList.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel());

    }//GEN-LAST:event_jRadioOutActionPerformed

    private void jComboBoxClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClientItemStateChanged
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxClientItemStateChanged

    private void jComboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientActionPerformed
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
        ClientsControll pc = new ClientsControll();
        client = pc.getselectedClient(jComboBoxClient.getSelectedItem().toString());
        jTextFieldClientName.setText(client.getName());
    }//GEN-LAST:event_jComboBoxClientActionPerformed

    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActionPerformed

        if (jCheckBox.isSelected()) {
            //اجل
            is_paid = 0;
        } else
            is_paid = 1;
    }//GEN-LAST:event_jCheckBoxActionPerformed

    private void jTextFieldProductNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldProductNameInputMethodTextChanged

    }//GEN-LAST:event_jTextFieldProductNameInputMethodTextChanged

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

        jComboBoxProducts.setModel(new DefaultComboBoxModel(ls.toArray()));
    }//GEN-LAST:event_jTextFieldProductNameKeyPressed

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
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JComboBox jComboBoxClient;
    private javax.swing.JComboBox jComboBoxProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioIn;
    private javax.swing.JRadioButton jRadioOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSaledProducts;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldBuyPrice;
    private javax.swing.JTextField jTextFieldClientName;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextNumber;
    private javax.swing.JTextField jTextSellBigPrice;
    private javax.swing.JTextField jTextSellPrice;
    // End of variables declaration//GEN-END:variables
}
