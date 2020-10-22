package view.anotherFrames;

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
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ClientsM;
import model.Payment;
import static view.anotherFrames.panels.Account.DEST;

public class PaymentsFrame extends javax.swing.JFrame {

    public static final String DEST = "E:/data/account/";
    public static Font normal = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 12, Font.BOLD);
    public static Font big = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 18, Font.BOLD);
    public static Font big2 = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 24, Font.BOLD);

    List<String> pList = new ArrayList<>();
    ClientsM clientsM = new ClientsM();

    int ClientId = 1;
    int ClientId1 = 1;

    int in = 0;
    int sell = 0;
    ArrayList<String> lss = new ArrayList<>();
    ArrayList<String> lsss = new ArrayList<>();

    String[] columnNames = {"الاسم",
        "المدفوع",
        "الوفت"};

    public PaymentsFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jComboBoxClient = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldClientName = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jTextFieldClientName1 = new javax.swing.JTextField();
        jComboBoxClient1 = new javax.swing.JComboBox();
        jTextFieldpayment = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("اسم العميل");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 170, 170));

        jPanel4.setBackground(new java.awt.Color(0, 170, 170));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("مدفوعات العملاء");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

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
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/money-1.png"))); // NOI18N
        jButton15.setText("اضافة");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTextFieldClientName1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldClientName1.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldClientName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldClientName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClientName1ActionPerformed(evt);
            }
        });
        jTextFieldClientName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldClientName1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldClientName1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldClientName1KeyTyped(evt);
            }
        });

        jComboBoxClient1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxClient1ItemStateChanged(evt);
            }
        });
        jComboBoxClient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClient1ActionPerformed(evt);
            }
        });

        jTextFieldpayment.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldpayment.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldpayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpaymentActionPerformed(evt);
            }
        });
        jTextFieldpayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldpaymentKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldpaymentKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldpaymentKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("المدفوع");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("اسم العميل");

        jButton16.setBackground(new java.awt.Color(0, 204, 204));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/book.png"))); // NOI18N
        jButton16.setText("طباعة");
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
                .addContainerGap()
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jComboBoxClient1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldClientName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldpayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldClientName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jComboBoxClient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(710, 300));

        jTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1119, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClientItemStateChanged
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxClientItemStateChanged

    private void jComboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientActionPerformed
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
        ClientsControll pc = new ClientsControll();
        ClientsM c = pc.getselectedClient(jComboBoxClient.getSelectedItem().toString());
        this.ClientId = c.getId();
        clientsM = c;
        jTextFieldClientName.setText(c.getName());

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        jTable.setModel(model);
        pList.clear();
        ArrayList<Payment> productsList = pc.getClientPayments(ClientId);
        for (int i = 0; i < productsList.size(); i++) {
            model.addRow(new Object[]{productsList.get(i).getClientName(), productsList.get(i).getPayment(), productsList.get(i).getCreatedAt()});
            pList.add(productsList.get(i).getClientName());
            pList.add(productsList.get(i).getPayment() + "");
            pList.add(productsList.get(i).getCreatedAt());
        }


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

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        ClientsControll cc = new ClientsControll();
        if (cc.addPayment(ClientId1, jTextFieldpayment.getText())) {
            JOptionPane.showMessageDialog(null, "تمت الاضافة");
            jTextFieldClientName1.setText("");
            jTextFieldpayment.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "error");
        }

        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextFieldClientName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClientName1ActionPerformed


    }//GEN-LAST:event_jTextFieldClientName1ActionPerformed

    private void jTextFieldClientName1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientName1KeyPressed
        lsss.clear();
        jComboBoxClient1.setModel(new DefaultComboBoxModel(lss.toArray()));
        ClientsControll pc = new ClientsControll();
        ArrayList<ClientsM> productsList = pc.getClients_name(jTextFieldClientName1.getText().trim());
        productsList.stream().forEach((productsList1) -> {
            lsss.add(productsList1.getName());
        });
        jComboBoxClient1.setModel(new DefaultComboBoxModel(lsss.toArray()));         // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientName1KeyPressed

    private void jTextFieldClientName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientName1KeyReleased
        lsss.clear();
        jComboBoxClient1.setModel(new DefaultComboBoxModel(lss.toArray()));
        ClientsControll pc = new ClientsControll();
        ArrayList<ClientsM> productsList = pc.getClients_name(jTextFieldClientName1.getText().trim());
        productsList.stream().forEach((productsList1) -> {
            lsss.add(productsList1.getName());
        });
        jComboBoxClient1.setModel(new DefaultComboBoxModel(lsss.toArray()));        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientName1KeyReleased

    private void jTextFieldClientName1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClientName1KeyTyped
        lsss.clear();
        jComboBoxClient1.setModel(new DefaultComboBoxModel(lss.toArray()));
        ClientsControll pc = new ClientsControll();
        ArrayList<ClientsM> productsList = pc.getClients_name(jTextFieldClientName1.getText().trim());
        productsList.stream().forEach((productsList1) -> {
            lsss.add(productsList1.getName());
        });
        jComboBoxClient1.setModel(new DefaultComboBoxModel(lsss.toArray()));       // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientName1KeyTyped

    private void jComboBoxClient1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClient1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClient1ItemStateChanged

    private void jComboBoxClient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClient1ActionPerformed
        jTextFieldClientName1.setText(jComboBoxClient1.getSelectedItem().toString());
        ClientsControll pc = new ClientsControll();
        ClientsM c = pc.getselectedClient(jComboBoxClient1.getSelectedItem().toString());
        this.ClientId1 = c.getId();
        jTextFieldClientName1.setText(c.getName());

    }//GEN-LAST:event_jComboBoxClient1ActionPerformed

    private void jTextFieldpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpaymentActionPerformed

    private void jTextFieldpaymentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpaymentKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpaymentKeyPressed

    private void jTextFieldpaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpaymentKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpaymentKeyReleased

    private void jTextFieldpaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpaymentKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpaymentKeyTyped

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        try {
            createPdf(DEST, clientsM.getName(), clientsM.getCreditor(), pList);
        } catch (DocumentException | FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentsFrame().setVisible(true);
            }
        });
    }

    public void createPdf(String dest, String client, double creditor, List<String> a) throws DocumentException, FileNotFoundException {
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
        paragraph7 = new Paragraph("المبلغ المطلوب :  " + creditor, normal);
        paragraph7.setAlignment(PdfPCell.ALIGN_LEFT);
        cell7.addElement(paragraph7);
        cell7.setBorder(Rectangle.NO_BORDER);

        PdfPCell cell2 = new PdfPCell();
        Paragraph paragraph2 = new Paragraph("مدفوعات عميل ", big2);
        paragraph2.setAlignment(PdfPCell.ALIGN_CENTER);
        cell2.addElement(paragraph2);
        cell2.setBorder(Rectangle.NO_BORDER);
        pTableClient.addCell(cell2);

        pTableClient.addCell(cell);
        pTableClient.addCell(cell7);

        document.add(pTableClient);
        document.add(new Paragraph(" "));
        PdfPTable pTable = new PdfPTable(3);
        pTable.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        PdfPCell cella1 = new PdfPCell(new Phrase("الاسم", normal));
        cella1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella1);
        PdfPCell cella2 = new PdfPCell(new Phrase("السعر", normal));
        cella2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella2);
        PdfPCell cella6 = new PdfPCell(new Phrase("الوقت", normal));
        cella6.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella6);
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
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JComboBox jComboBoxClient;
    private javax.swing.JComboBox jComboBoxClient1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldClientName;
    private javax.swing.JTextField jTextFieldClientName1;
    private javax.swing.JTextField jTextFieldpayment;
    // End of variables declaration//GEN-END:variables
}
