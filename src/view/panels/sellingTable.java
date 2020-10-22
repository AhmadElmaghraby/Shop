package view.panels;

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
import control.SellAndBuyControl;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.anotherFrames.UpdateSellFrame;
import view.frames.login;

public class sellingTable extends javax.swing.JPanel {

    public static final String DEST = "E:/data/salles/";
    public static Font normal = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 12, Font.BOLD);
    public static Font big = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 18, Font.BOLD);
    int in = 0;
    ArrayList<Item> productsList;
    ArrayList<Item> clientList;
    ClientsM client = new ClientsM();

    ArrayList<String> ls = new ArrayList<>();
    ArrayList<String> lss = new ArrayList<>();
    String[] columnNames = {"الاسم",
        "اللون",
        "العدد",
        "سعر البيع",
        "الاجمالى",
        "اسم العميل",
        "الوفت",
        "رقم الفاتورة",
        "ملاحظة",};
    String[] columnNames2 = {"الاسم",
        "اللون",
        "العدد",
        "سعر البيع",
        "الاجمالى",
        "اسم العميل",
        "الوفت",
        "رقم الفاتورة",
        "ملاحظة",
        "المكسب"
    };

    public sellingTable() {
        initComponents();
        jRadioIn.setSelected(true);

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        jDate1.setDateFormat(simpleDateFormat);
        jDate2.setDateFormat(simpleDateFormat);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jDate1 = new datechooser.beans.DateChooserCombo();
        jDate2 = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxProducts = new javax.swing.JComboBox();
        jRadioIn = new javax.swing.JRadioButton();
        jRadioOut = new javax.swing.JRadioButton();
        jTextFieldProductName = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabelClient = new javax.swing.JLabel();
        jTextFieldClientName = new javax.swing.JTextField();
        jComboBoxClient = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 170, 170));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("تاريخ الانتهاء");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("تاريخ البدء");

        jButton10.setBackground(new java.awt.Color(0, 204, 204));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/school-2 (2).png"))); // NOI18N
        jButton10.setText("طباعة المبيعات بالتاريخ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("اسم المنتج");

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

        jButton11.setBackground(new java.awt.Color(0, 204, 204));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/tool (4).png"))); // NOI18N
        jButton11.setText("مرتجع");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 204, 204));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/book.png"))); // NOI18N
        jButton15.setText("طباعة الجدول");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabelClient.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelClient.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClient.setText("اسم العميل");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelClient, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addComponent(jRadioOut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioIn)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDate2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioIn)
                                    .addComponent(jRadioOut))
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelClient))
                    .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel5.setBackground(new java.awt.Color(0, 170, 170));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" المبيعات");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        String date1 = jDate1.getText();
        String date2 = jDate2.getText();
        date1 = date1.replace('/', '-');
        date2 = date2.replace('/', '-');
        SalesControll pc = new SalesControll();
        ArrayList<SalesM> productsList2 = new ArrayList<>();
        if (in == 0) {
            productsList2 = pc.getSalesDate_in(date1, date2);
        } else if (in == 1) {
            productsList2 = pc.getSalesDate_out(date1, date2);
        }
        List<String> pList = new ArrayList<>();

        DefaultTableModel model = new DefaultTableModel();
        if (login.is_admin) {
            model.setColumnIdentifiers(columnNames2);
            jTable1.setModel(model);
            for (int i = 0; i < productsList2.size(); i++) {
                model.addRow(new Object[]{productsList2.get(i).getProduct_name(),
                    productsList2.get(i).getProduct_color(),
                    productsList2.get(i).getAmount(),
                    productsList2.get(i).getSell_price(),
                    productsList2.get(i).getAll_price(),
                    productsList2.get(i).getClient_name(),
                    productsList2.get(i).getCreated_at(),
                    productsList2.get(i).getBill_id(),
                    productsList2.get(i).getNote(),
                    productsList2.get(i).getGain()
                });
                int j;
                for (j = 0; j < pList.size(); j = j + 3) {
                    if (productsList2.get(i).getProduct_name().equals(pList.get(j)) && productsList2.get(i).getProduct_color().equals(pList.get(j + 2))) {
                        double a = Double.parseDouble(pList.get(j + 1));
                        a = (a + productsList2.get(i).getAmount());
                        pList.set(j + 1, a + "");
                        break;
                    }
                }
                if (j >= pList.size()) {
                    pList.add(productsList2.get(i).getProduct_name());
                    pList.add(productsList2.get(i).getAmount() + "");
                    pList.add(productsList2.get(i).getProduct_color());
                }
            }
        } else {
            model.setColumnIdentifiers(columnNames);
            jTable1.setModel(model);
            for (int i = 0; i < productsList2.size(); i++) {
                model.addRow(new Object[]{productsList2.get(i).getProduct_name(),
                    productsList2.get(i).getProduct_color(),
                    productsList2.get(i).getAmount(),
                    productsList2.get(i).getSell_price(),
                    productsList2.get(i).getAll_price(),
                    productsList2.get(i).getClient_name(),
                    productsList2.get(i).getCreated_at(),
                    productsList2.get(i).getBill_id(),
                    productsList2.get(i).getNote()
                });
                int j;
                for (j = 0; j < pList.size(); j = j + 3) {
                    if (productsList2.get(i).getProduct_name().equals(pList.get(j)) && productsList2.get(i).getProduct_color().equals(pList.get(j + 2))) {
                        double a = Double.parseDouble(pList.get(j + 1));
                        a = (a + productsList2.get(i).getAmount());
                        pList.set(j + 1, a + "");
                        break;
                    }
                }
                if (j >= pList.size()) {
                    pList.add(productsList2.get(i).getProduct_name());
                    pList.add(productsList2.get(i).getAmount() + "");
                    pList.add(productsList2.get(i).getProduct_color());
                }
            }
        }
        try {

            createPdf(DEST, date1, date2, pList);
        } catch (DocumentException | FileNotFoundException ex) {
            Logger.getLogger(sellingTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBoxProductsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProductsItemStateChanged
        jTextFieldProductName.setText(jComboBoxProducts.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxProductsItemStateChanged

    private void jComboBoxProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductsActionPerformed
        jTextFieldProductName.setText(productsList.get(jComboBoxProducts.getSelectedIndex()).getName());

        ///////
       
        SalesControll pc = new SalesControll();

        ArrayList<SalesM> productsList2 = new ArrayList<>();

        if (in == 0) {
            productsList2 = pc.getSalesName_in(productsList.get(jComboBoxProducts.getSelectedIndex()).getName());
        }
        if (in == 1) {
            productsList2 = pc.getSalesName_out(jComboBoxProducts.getSelectedItem().toString());
        }
        DefaultTableModel model = new DefaultTableModel();

        if (login.is_admin) {
            model.setColumnIdentifiers(columnNames2);
            jTable1.setModel(model);
            for (int i = 0; i < productsList2.size(); i++) {
                model.addRow(new Object[]{productsList2.get(i).getProduct_name(),
                    productsList2.get(i).getProduct_color(),
                    productsList2.get(i).getAmount(),
                    productsList2.get(i).getSell_price(),
                    productsList2.get(i).getAll_price(),
                    productsList2.get(i).getClient_name(),
                    productsList2.get(i).getCreated_at(),
                    productsList2.get(i).getBill_id(),
                    productsList2.get(i).getNote(),
                    productsList2.get(i).getGain()
                });
            }
        } else {
            model.setColumnIdentifiers(columnNames);
            jTable1.setModel(model);
            for (int i = 0; i < productsList2.size(); i++) {
                model.addRow(new Object[]{productsList2.get(i).getProduct_name(),
                    productsList2.get(i).getProduct_color(),
                    productsList2.get(i).getAmount(),
                    productsList2.get(i).getSell_price(),
                    productsList2.get(i).getAll_price(),
                    productsList2.get(i).getClient_name(),
                    productsList2.get(i).getCreated_at(),
                    productsList2.get(i).getBill_id(),
                    productsList2.get(i).getNote()
                });
            }
        }

    }//GEN-LAST:event_jComboBoxProductsActionPerformed

    private void jRadioInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInActionPerformed
        in = 0;
        jRadioOut.setSelected(false);
        jTextFieldProductName.setText("");
        jComboBoxProducts.setModel(new DefaultComboBoxModel());
    }//GEN-LAST:event_jRadioInActionPerformed

    private void jRadioOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOutActionPerformed
        in = 1;
        jRadioIn.setSelected(false);
        jTextFieldProductName.setText("");
        jComboBoxProducts.setModel(new DefaultComboBoxModel());
    }//GEN-LAST:event_jRadioOutActionPerformed

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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        UpdateSellFrame l = new UpdateSellFrame();
        l.setLocationRelativeTo(null);
        l.setResizable(false);
        l.setDefaultCloseOperation(HIDE_ON_CLOSE);
        l.getContentPane().setBackground(Color.WHITE);
        l.setVisible(true);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        MessageFormat messageFormat = new MessageFormat(date);
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, messageFormat, null);
        } catch (PrinterException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

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
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));

    }//GEN-LAST:event_jTextFieldClientNameKeyPressed

    private void jTextFieldClientNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientNameKeyReleased

        lss.clear();
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));
        ClientsControll pc = new ClientsControll();
        ArrayList<ClientsM> productsList = pc.getClients_name(jTextFieldClientName.getText().trim());
        productsList.stream().forEach((productsList1) -> {
            lss.add(productsList1.getName());
        });
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));

    }//GEN-LAST:event_jTextFieldClientNameKeyReleased

    private void jTextFieldClientNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientNameKeyTyped

        lss.clear();
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));
        ClientsControll pc = new ClientsControll();
        ArrayList<ClientsM> productsList = pc.getClients_name(jTextFieldClientName.getText().trim());
        productsList.stream().forEach((productsList1) -> {
            lss.add(productsList1.getName());
        });
        jComboBoxClient.setModel(new DefaultComboBoxModel(lss.toArray()));

    }//GEN-LAST:event_jTextFieldClientNameKeyTyped

    private void jComboBoxClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClientItemStateChanged
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxClientItemStateChanged

    private void jComboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientActionPerformed

//          jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
        ClientsControll cc = new ClientsControll();
        client = cc.getselectedClient(jComboBoxClient.getSelectedItem().toString());
        jTextFieldClientName.setText(client.getName());
        ////////////////////

        
        SalesControll pc = new SalesControll();

        ArrayList<SalesM> productsList2 = new ArrayList<>();

        if (in == 0) {
            productsList2 = pc.getSalesClient_in(client.getId());
        }
        if (in == 1) {
            productsList2 = pc.getSalesClient_out(client.getId());
        }
        DefaultTableModel model = new DefaultTableModel();

        if (login.is_admin) {
            model.setColumnIdentifiers(columnNames2);
            jTable1.setModel(model);
            for (int i = 0; i < productsList2.size(); i++) {
                model.addRow(new Object[]{productsList2.get(i).getProduct_name(),
                    productsList2.get(i).getProduct_color(),
                    productsList2.get(i).getAmount(),
                    productsList2.get(i).getSell_price(),
                    productsList2.get(i).getAll_price(),
                    productsList2.get(i).getClient_name(),
                    productsList2.get(i).getCreated_at(),
                    productsList2.get(i).getBill_id(),
                    productsList2.get(i).getNote(),
                    productsList2.get(i).getGain()
                });
            }
        } else {
            model.setColumnIdentifiers(columnNames);
            jTable1.setModel(model);
            for (int i = 0; i < productsList2.size(); i++) {
                model.addRow(new Object[]{productsList2.get(i).getProduct_name(),
                    productsList2.get(i).getProduct_color(),
                    productsList2.get(i).getAmount(),
                    productsList2.get(i).getSell_price(),
                    productsList2.get(i).getAll_price(),
                    productsList2.get(i).getClient_name(),
                    productsList2.get(i).getCreated_at(),
                    productsList2.get(i).getBill_id(),
                    productsList2.get(i).getNote()
                });
            }
        }

        
        
    }//GEN-LAST:event_jComboBoxClientActionPerformed

    public void createPdf(String dest, String date_from, String date_to, List<String> a) throws DocumentException, FileNotFoundException {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String date2 = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ssss").format(new Date());
        dest += date2 + ".pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        document.add(new Paragraph("PLAY STORE\n", FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 80, Font.BOLD, BaseColor.LIGHT_GRAY)));
        document.add(new Paragraph(date, normal));
        PdfPTable pTableClient = new PdfPTable(1);
        pTableClient.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);

        PdfPCell cell = new PdfPCell();
        Paragraph paragraph = new Paragraph("من  :  " + date_from, big);
        paragraph.setAlignment(PdfPCell.ALIGN_LEFT);
        cell.addElement(paragraph);
        cell.setBorder(Rectangle.NO_BORDER);

        PdfPCell cell2 = new PdfPCell();
        Paragraph paragraph2 = new Paragraph("الى  :  " + date_to, big);
        paragraph2.setAlignment(PdfPCell.ALIGN_LEFT);
        cell2.addElement(paragraph2);
        cell2.setBorder(Rectangle.NO_BORDER);

        pTableClient.addCell(cell);
        pTableClient.addCell(cell2);
        document.add(pTableClient);
        document.add(new Paragraph(" "));
        PdfPTable pTable = new PdfPTable(3);
        pTable.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        PdfPCell cella1 = new PdfPCell(new Phrase("الاسم", normal));
        cella1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella1);

        PdfPCell cella3 = new PdfPCell(new Phrase("العدد", normal));
        cella3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella3);

        PdfPCell cella2 = new PdfPCell(new Phrase("اللون", normal));
        cella2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella2);
        for (int i = 0; i < a.size(); i++) {
            PdfPCell cella = new PdfPCell(new Phrase(a.get(i), normal));
            pTable.addCell(cella);
        }
        document.add(pTable);
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

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JComboBox jComboBoxClient;
    private javax.swing.JComboBox jComboBoxProducts;
    private datechooser.beans.DateChooserCombo jDate1;
    private datechooser.beans.DateChooserCombo jDate2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelClient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioIn;
    private javax.swing.JRadioButton jRadioOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldClientName;
    private javax.swing.JTextField jTextFieldProductName;
    // End of variables declaration//GEN-END:variables
}
