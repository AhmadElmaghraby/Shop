package view.panels;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import control.ProductsControll;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.anotherFrames.AddProductFrame;
import view.anotherFrames.CorruptProductFrame;
import view.anotherFrames.DeleteProductFrame;
import view.anotherFrames.UpdateProductFrame;
import view.frames.login;

public class inventory extends javax.swing.JPanel {

    public static final String DEST = "E:/data/products/";
    public static Font normal = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 18, Font.BOLD);
    public static Font big = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 24, Font.BOLD);

    int in = 0;

    String[] columnNames = {"الاسم",
        "اللون",
        "سعر الشراء",
        "سعر البيع",
        "سعر البيع جملة",
        "العدد"};

    String[] columnNames2 = {"الاسم",
        "اللون",
        "سعر البيع",
        "سعر البيع جملة",
        "العدد"};

    public inventory() {
        initComponents();
        jRadioIn.setSelected(true);
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        jDate1.setDateFormat(simpleDateFormat);
        jDate2.setDateFormat(simpleDateFormat);

        ProductsControll pc = new ProductsControll();
        ArrayList<Item> productsList = pc.getProducts_in();
        DefaultTableModel model = new DefaultTableModel();

        if (login.is_admin) {
            model.setColumnIdentifiers(columnNames);
            jTableProductsData.setModel(model);
            for (int i = 0; i < productsList.size(); i++) {
                model.addRow(new Object[]{productsList.get(i).getName(),
                    productsList.get(i).getColor(),
                    productsList.get(i).getBuy_price(),
                    productsList.get(i).getSell_price(),
                    productsList.get(i).getSell_big_price(),
                    productsList.get(i).getNumber()});
            }
        } else {
            model.setColumnIdentifiers(columnNames2);
            jTableProductsData.setModel(model);
            for (int i = 0; i < productsList.size(); i++) {
                model.addRow(new Object[]{productsList.get(i).getName(),
                    productsList.get(i).getColor(),
                    productsList.get(i).getSell_price(),
                    productsList.get(i).getSell_big_price(),
                    productsList.get(i).getNumber()});
            }
        }

    }

    public void createPdf(String dest, List<String> a) throws DocumentException, FileNotFoundException {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String date2 = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ssss").format(new Date());

        dest += date2 + ".pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        document.add(new Paragraph("PLAY STORE\n", FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 80, Font.BOLD, BaseColor.LIGHT_GRAY)));
        document.add(new Paragraph(date + "\n\n", normal));
        PdfPTable pTable = new PdfPTable(3);
        pTable.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);

        PdfPCell cella1 = new PdfPCell(new Phrase("الاسم", normal));
        cella1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella1);
        
        PdfPCell cella2 = new PdfPCell(new Phrase("اللون", normal));
        cella2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella2);
        
        PdfPCell cella3 = new PdfPCell(new Phrase("السعر", normal));
        cella3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        pTable.addCell(cella3);

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductsData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jDate1 = new datechooser.beans.DateChooserCombo();
        jDate2 = new datechooser.beans.DateChooserCombo();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextFieldSearchName = new javax.swing.JTextField();
        jLabelSearch = new javax.swing.JLabel();
        jRadioIn = new javax.swing.JRadioButton();
        jRadioOut = new javax.swing.JRadioButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 170, 170));

        jPanel5.setBackground(new java.awt.Color(0, 170, 170));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("المخزن");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(710, 300));

        jTableProductsData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableProductsData.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableProductsData);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

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
        jButton10.setText("بيان");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 204, 204));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/tool-5.png"))); // NOI18N
        jButton9.setText("جديد");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 204, 204));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/tool-5.png"))); // NOI18N
        jButton11.setText("تعديل");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 204, 204));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/tool-5.png"))); // NOI18N
        jButton12.setText("حذف");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 204, 204));
        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/tool-5.png"))); // NOI18N
        jButton13.setText("تالف");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 204, 204));
        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/tool-5.png"))); // NOI18N
        jButton14.setText("الغير كافى");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTextFieldSearchName.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldSearchName.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldSearchName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));

        jLabelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/tool-1 (2).png"))); // NOI18N
        jLabelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseClicked(evt);
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
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/1.png"))); // NOI18N
        jButton16.setText("طباعة المنتجات");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(96, 96, 96)
                .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioIn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioIn)
                            .addComponent(jRadioOut))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldSearchName)
                        .addComponent(jLabelSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 150, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 445, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseClicked

        ProductsControll pc = new ProductsControll();
        ArrayList<Item> productsList = new ArrayList<>();
        if (in == 0) {
            productsList = pc.getProductName_in(jTextFieldSearchName.getText());
        } else if (in == 1) {
            productsList = pc.getProductName_out(jTextFieldSearchName.getText());
        }
        DefaultTableModel model = new DefaultTableModel();
        if (login.is_admin) {
            model.setColumnIdentifiers(columnNames);
            jTableProductsData.setModel(model);
            for (int i = 0; i < productsList.size(); i++) {
                model.addRow(new Object[]{productsList.get(i).getName(),
                    productsList.get(i).getColor(),
                    productsList.get(i).getBuy_price(),
                    productsList.get(i).getSell_price(),
                    productsList.get(i).getSell_big_price(),
                    productsList.get(i).getNumber()});
            }
        } else {
            model.setColumnIdentifiers(columnNames2);
            jTableProductsData.setModel(model);
            for (int i = 0; i < productsList.size(); i++) {
                model.addRow(new Object[]{productsList.get(i).getName(),
                    productsList.get(i).getColor(),
                    productsList.get(i).getSell_price(),
                    productsList.get(i).getSell_big_price(),
                    productsList.get(i).getNumber()});
            }
        }
    }//GEN-LAST:event_jLabelSearchMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        String date1 = jDate1.getText();
        String date2 = jDate2.getText();

        date1 = date1.replace('/', '-');
        date2 = date2.replace('/', '-');
        ProductsControll pc = new ProductsControll();
        ArrayList<Item> productsList = new ArrayList<>();

        if (in == 0) {
            productsList = pc.getProductDate_in(date1, date2);
        } else if (in == 1) {
            productsList = pc.getProductDate_out(date1, date2);
        }
        DefaultTableModel model = new DefaultTableModel();

        if (login.is_admin) {
            model.setColumnIdentifiers(columnNames);
            jTableProductsData.setModel(model);
            for (int i = 0; i < productsList.size(); i++) {
                model.addRow(new Object[]{productsList.get(i).getName(),
                    productsList.get(i).getColor(),
                    productsList.get(i).getBuy_price(),
                    productsList.get(i).getSell_price(),
                    productsList.get(i).getSell_big_price(),
                    productsList.get(i).getNumber()});
            }
        } else {
            model.setColumnIdentifiers(columnNames2);
            jTableProductsData.setModel(model);
            for (int i = 0; i < productsList.size(); i++) {
                model.addRow(new Object[]{productsList.get(i).getName(),
                    productsList.get(i).getColor(),
                    productsList.get(i).getSell_price(),
                    productsList.get(i).getSell_big_price(),
                    productsList.get(i).getNumber()});
            }
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        AddProductFrame l = new AddProductFrame();
        l.setLocationRelativeTo(null);
        l.setResizable(false);
        l.setDefaultCloseOperation(HIDE_ON_CLOSE);
        l.getContentPane().setBackground(Color.WHITE);
        l.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (login.is_admin) {
            UpdateProductFrame l = new UpdateProductFrame();
            l.setLocationRelativeTo(null);
            l.setResizable(false);
            l.setDefaultCloseOperation(HIDE_ON_CLOSE);
            l.getContentPane().setBackground(Color.WHITE);
            l.setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (login.is_admin) {
            DeleteProductFrame l = new DeleteProductFrame();
            l.setLocationRelativeTo(null);
            l.setResizable(false);
            l.setDefaultCloseOperation(HIDE_ON_CLOSE);
            l.getContentPane().setBackground(Color.WHITE);
            l.setVisible(true);
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (login.is_admin) {
            CorruptProductFrame l = new CorruptProductFrame();
            l.setLocationRelativeTo(null);
            l.setResizable(false);
            l.setDefaultCloseOperation(HIDE_ON_CLOSE);
            l.getContentPane().setBackground(Color.WHITE);
            l.setVisible(true);

        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        ProductsControll pc = new ProductsControll();
        ArrayList<Item> productsList = new ArrayList<Item>();

        if (in == 0) {
            productsList = pc.getProductsMin_in();
        } else if (in == 1) {
            productsList = pc.getProductsMin_out();
        }
        DefaultTableModel model = new DefaultTableModel();
        if (login.is_admin) {
            model.setColumnIdentifiers(columnNames);
            jTableProductsData.setModel(model);
            for (int i = 0; i < productsList.size(); i++) {
                model.addRow(new Object[]{productsList.get(i).getName(),
                    productsList.get(i).getColor(),
                    productsList.get(i).getBuy_price(),
                    productsList.get(i).getSell_price(),
                    productsList.get(i).getSell_big_price(),
                    productsList.get(i).getNumber()});
            }
        } else {
            model.setColumnIdentifiers(columnNames2);
            jTableProductsData.setModel(model);
            for (int i = 0; i < productsList.size(); i++) {
                model.addRow(new Object[]{productsList.get(i).getName(),
                    productsList.get(i).getColor(),
                    productsList.get(i).getSell_price(),
                    productsList.get(i).getSell_big_price(),
                    productsList.get(i).getNumber()});
            }
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jRadioInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInActionPerformed
        in = 0;
        jRadioOut.setSelected(false);
        jTextFieldSearchName.setText("");
    }//GEN-LAST:event_jRadioInActionPerformed

    private void jRadioOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOutActionPerformed
        in = 1;
        jRadioIn.setSelected(false);
        jTextFieldSearchName.setText("");
    }//GEN-LAST:event_jRadioOutActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        MessageFormat messageFormat = new MessageFormat("aaaaaaaaaaaaaaaa");
        MessageFormat messageFormat1t = new MessageFormat("bbbbbbbbbbbbb");

        try {
            jTableProductsData.print(JTable.PrintMode.FIT_WIDTH, messageFormat, messageFormat);
        } catch (PrinterException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        List<String> pList = new ArrayList<>();

        ProductsControll pc = new ProductsControll();
        ArrayList<Item> p = new ArrayList<>();

        if (in == 0) {
            p = pc.getProducts_in();
        } else if (in == 1) {
            p = pc.getProducts_out();
        }

        for (int i = 0; i < p.size(); i++) {
            pList.add(p.get(i).getName());
            pList.add(p.get(i).getColor());
            pList.add(p.get(i).getSell_price() + "");
        }

        try {
            createPdf(DEST, pList);
        } catch (DocumentException | FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jButton16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton9;
    private datechooser.beans.DateChooserCombo jDate1;
    private datechooser.beans.DateChooserCombo jDate2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioIn;
    private javax.swing.JRadioButton jRadioOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductsData;
    private javax.swing.JTextField jTextFieldSearchName;
    // End of variables declaration//GEN-END:variables
}
