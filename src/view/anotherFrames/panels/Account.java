package view.anotherFrames.panels;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import control.ClientsControll;
import control.SalesControll;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ClientsM;
import model.Payment;
import model.SalesM;
import view.frames.login;

public class Account extends javax.swing.JPanel {

    public static final String DEST = "E:/data/account/";
    public static Font normal = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 10, Font.BOLD);
    public static Font big = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 16, Font.BOLD);
    public static Font big2 = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 22, Font.BOLD);
    List<String> pList = new ArrayList<>();
    List<String> pList2 = new ArrayList<>();
    int ClientId = 1;
    String clientName;
    double creditor;
    double debtor;
    int in = 0;
    int sell = 0;
    String[] columnNames = {"الاسم",
        "العدد",
        "السعر",
        "الاجمالى",
        "اسم العميل",
        "الوفت",
        "ملاحظة",
        "رقم الفاتورة"};
    DefaultTableModel model = new DefaultTableModel();
    ArrayList<String> lss = new ArrayList<>();

    public Account() {
        initComponents();
        jRadioIn.setSelected(true);
        jRadiosell.setSelected(true);
        model.setColumnIdentifiers(columnNames);
        jTable1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jComboBoxClient = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jRadioIn = new javax.swing.JRadioButton();
        jRadioOut = new javax.swing.JRadioButton();
        jRadiosell = new javax.swing.JRadioButton();
        jRadioBuy = new javax.swing.JRadioButton();
        jTextFieldClientName = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 170, 170));

        jPanel4.setBackground(new java.awt.Color(0, 170, 170));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("كشف حساب ");

        check.setBackground(new java.awt.Color(0, 204, 204));
        check.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setSelected(true);
        check.setText("اجل ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(729, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242)
                .addComponent(check)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(check))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(710, 300));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("اسم العميل");

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

        jRadiosell.setBackground(new java.awt.Color(0, 204, 204));
        jRadiosell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadiosell.setForeground(new java.awt.Color(255, 255, 255));
        jRadiosell.setText("بيع");
        jRadiosell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiosellActionPerformed(evt);
            }
        });

        jRadioBuy.setBackground(new java.awt.Color(0, 204, 204));
        jRadioBuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioBuy.setForeground(new java.awt.Color(255, 255, 255));
        jRadioBuy.setText("شراء");
        jRadioBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBuyActionPerformed(evt);
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

        jButton15.setBackground(new java.awt.Color(0, 204, 204));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/book.png"))); // NOI18N
        jButton15.setText("طباعة");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 204, 204));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/mark (2).png"))); // NOI18N
        jButton16.setText("تصفية حساب");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addGap(201, 201, 201)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(75, 75, 75)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioBuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadiosell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioIn)
                            .addComponent(jRadioOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadiosell)
                            .addComponent(jRadioBuy)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxClient, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClientItemStateChanged
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxClientItemStateChanged

    private void jComboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientActionPerformed

        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
        ClientsControll pc = new ClientsControll();
        ClientsM c = pc.getselectedClient(jComboBoxClient.getSelectedItem().toString());
        this.ClientId = c.getId();
        jTextFieldClientName.setText(c.getName());

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        jTable1.setModel(model);
        pList.clear();
        ClientsControll cc = new ClientsControll();
        SalesControll sc = new SalesControll();
        ArrayList<SalesM> products = new ArrayList<>();

        if (in == 0) {
            if (sell == 0) {
                if (check.isSelected()) {
                    products = cc.checkClientSell_in(ClientId);
                } else if (!check.isSelected()) {
                    products = sc.getSalesClient_in(ClientId);
                }
            }
            if (sell == 1) {
                if (check.isSelected()) {
                    products = cc.checkClientBuy_in(ClientId);
                } else if (!check.isSelected()) {
                    products = sc.getBuyClient_in(ClientId);
                }
            }
        } else if (in == 1) {
            if (sell == 0) {
                if (check.isSelected()) {
                    products = cc.checkClientSell_out(ClientId);
                } else if (!check.isSelected()) {
                    products = sc.getSalesClient_out(ClientId);
                }
            }
            if (sell == 1) {
                if (check.isSelected()) {
                    products = cc.checkClientBuy_out(ClientId);
                } else if (!check.isSelected()) {
                    products = sc.getBuyClient_out(ClientId);
                }
            }
        }

        if (products.size() > 0) {
            clientName = products.get(0).getClient_name();
            creditor = products.get(0).getCreditor();
            debtor = products.get(0).getDebtor();
        }
        for (int i = 0; i < products.size(); i++) {
            model.addRow(new Object[]{products.get(i).getProduct_name(),
                products.get(i).getAmount(),
                products.get(i).getSell_price(),
                products.get(i).getAll_price(),
                products.get(i).getClient_name(),
                products.get(i).getCreated_at(),
                products.get(i).getNote(),
                products.get(i).getBill_id()
            });
            this.pList.add(products.get(i).getProduct_name());
            this.pList.add(products.get(i).getSell_price() + "");
            this.pList.add(products.get(i).getAmount() + "");
            this.pList.add(products.get(i).getAll_price() + "");
            this.pList.add(products.get(i).getNote());
            this.pList.add(products.get(i).getCreated_at());
            this.pList.add(products.get(i).getBill_id() + "");
        }

        ///////////// payment ///////////
        String[] columnNames2 = {"الاسم",
            "المدفوع",
            "الوفت"};
        DefaultTableModel model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(columnNames2);
        jTable.setModel(model2);
        pList2.clear();
        ArrayList<Payment> productsList = pc.getClientPayments(ClientId);
        for (int i = 0; i < productsList.size(); i++) {
            model2.addRow(new Object[]{productsList.get(i).getClientName(), productsList.get(i).getPayment(), productsList.get(i).getCreatedAt()});
            pList2.add(productsList.get(i).getClientName());
            pList2.add(productsList.get(i).getPayment() + "");
            pList2.add(productsList.get(i).getCreatedAt());
        }


    }//GEN-LAST:event_jComboBoxClientActionPerformed

    private void jRadioInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInActionPerformed
        in = 0;
        jRadioOut.setSelected(false);
    }//GEN-LAST:event_jRadioInActionPerformed

    private void jRadioOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOutActionPerformed
        in = 1;
        jRadioIn.setSelected(false);
    }//GEN-LAST:event_jRadioOutActionPerformed

    private void jRadiosellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiosellActionPerformed

        sell = 0;
        jRadioBuy.setSelected(false);
    }//GEN-LAST:event_jRadiosellActionPerformed

    private void jRadioBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBuyActionPerformed
        sell = 1;
        jRadiosell.setSelected(false);
    }//GEN-LAST:event_jRadioBuyActionPerformed

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

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        try {
            createPdf(DEST, clientName, creditor, debtor, pList, pList2);
        } catch (DocumentException | FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (login.is_admin) {
            ClientsControll cc = new ClientsControll();
            int x = JOptionPane.showConfirmDialog(null, "هل انت متاكد من تصفية حساب العميل");
            System.out.println("" + x);
            if (x == 0) {
                cc.closeAccount(ClientId);
            }
        }
    }

    public void createPdf(String dest, String client, double creditor, double debtor, List<String> a, List<String> b) throws DocumentException, FileNotFoundException {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String date2 = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ssss").format(new Date());
        dest += date2 + client + ".pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        document.add(new Paragraph("PLAY STORE\n", FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 80, Font.BOLD, BaseColor.LIGHT_GRAY)));
        document.add(new Paragraph(date, normal));
        PdfPTable pTableClient = new PdfPTable(1);
        pTableClient.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);

        PdfPCell cell = new PdfPCell();
        Paragraph paragraph = new Paragraph("اسم العميل :  " + client, big);
        paragraph.setAlignment(PdfPCell.ALIGN_LEFT);
        cell.addElement(paragraph);
        cell.setBorder(Rectangle.NO_BORDER);

        Paragraph paragraph7;
        PdfPCell cell7 = new PdfPCell();
        if (sell == 0) {
            paragraph7 = new Paragraph("المبلغ المطلوب :  " + creditor, normal);
        } else {
            paragraph7 = new Paragraph("مدين :  " + debtor, normal);
        }
        paragraph7.setAlignment(PdfPCell.ALIGN_LEFT);
        cell7.addElement(paragraph7);
        cell7.setBorder(Rectangle.NO_BORDER);

        if (sell == 0) {
            PdfPCell cell2 = new PdfPCell();
            Paragraph paragraph2 = new Paragraph("حساب عميل ", big2);
            paragraph2.setAlignment(PdfPCell.ALIGN_CENTER);
            cell2.addElement(paragraph2);
            cell2.setBorder(Rectangle.NO_BORDER);
            pTableClient.addCell(cell2);
        } else {
            PdfPCell cell2 = new PdfPCell();
            Paragraph paragraph2 = new Paragraph("المشتريات ", big2);
            paragraph2.setAlignment(PdfPCell.ALIGN_CENTER);
            cell2.addElement(paragraph2);
            cell2.setBorder(Rectangle.NO_BORDER);
        }
        pTableClient.addCell(cell);
        pTableClient.addCell(cell7);

        document.add(pTableClient);
        document.add(new Paragraph(" "));
        PdfPTable pTable = new PdfPTable(7);
        pTable.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        PdfPCell cella1 = new PdfPCell(new Phrase("الاسم", normal));
        cella1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella1);
        PdfPCell cella2 = new PdfPCell(new Phrase("السعر", normal));
        cella2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella2);
        PdfPCell cella3 = new PdfPCell(new Phrase("العدد", normal));
        cella3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella3);
        PdfPCell cella4 = new PdfPCell(new Phrase("الاجمالى", normal));
        cella4.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella4);
        PdfPCell cella5 = new PdfPCell(new Phrase("ملاحظة", normal));
        cella5.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella5);
        PdfPCell cella6 = new PdfPCell(new Phrase("الوقت", normal));
        cella6.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella6);
        PdfPCell cella7 = new PdfPCell(new Phrase("رقم الفاتورة", normal));
        cella7.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella7);
        for (int i = 0; i < a.size(); i++) {
            PdfPCell cella = new PdfPCell(new Phrase(a.get(i), normal));
            pTable.addCell(cella);
        }
        PdfPTable pTable2 = new PdfPTable(3);
        pTable2.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        PdfPCell cella11 = new PdfPCell(new Phrase("الاسم", normal));
        cella11.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable2.addCell(cella11);
        PdfPCell cella12 = new PdfPCell(new Phrase("المدفوع", normal));
        cella12.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable2.addCell(cella12);
        PdfPCell cella13 = new PdfPCell(new Phrase("الوقت", normal));
        cella13.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable2.addCell(cella13);
        for (int i = 0; i < b.size(); i++) {
            PdfPCell cella = new PdfPCell(new Phrase(b.get(i), normal));
            pTable2.addCell(cella);
        }
        //
        document.add(pTable);
        document.add(new Paragraph("\n", big));
        document.add(pTable2);
        document.close();
        try {
//constructor of file class having file as argument  
            File file = new File(dest);
            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
            {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) //checks file exists or not  
            {
                desktop.open(file);              //opens the specified file  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JComboBox jComboBoxClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioBuy;
    private javax.swing.JRadioButton jRadioIn;
    private javax.swing.JRadioButton jRadioOut;
    private javax.swing.JRadioButton jRadiosell;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldClientName;
    // End of variables declaration//GEN-END:variables
}
