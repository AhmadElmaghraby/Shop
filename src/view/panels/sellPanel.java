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
import control.SellAndBuyControl;
import java.awt.Desktop;
import java.awt.HeadlessException;
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
import model.BillsM;
import model.ClientsM;
import model.Item;

public class sellPanel extends javax.swing.JPanel {

    public static final String DEST = "E:/data/bills/";
    public static Font normal = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 12, Font.BOLD);
    public static Font big = FontFactory.getFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, 18, Font.BOLD);

    List<String> pList = new ArrayList<>();
    String ClientNameP = "A";
    int in = 0;
    int is_paid = 1;
    Item p = new Item();
    ClientsM client = new ClientsM();
    BillsM b = new BillsM();
    ArrayList<Item> productsList = new ArrayList<>();
    ArrayList<String> ls = new ArrayList<>();
    ArrayList<String> lss = new ArrayList<>();
    String bill = "1";
    String billp = "1";
    String note = "0";
    int all_bill = 0;
    double old = 0;
    String[] columnNames = {"الاسم",
        "سعر البيع",
        "العدد",
        "الاجمالى",
        "اسم العميل",
        "رقم الفاتورة"};
    DefaultTableModel model = new DefaultTableModel();

    public sellPanel() {
        initComponents();

        jRadioIn.setSelected(true);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        jTableSaledProducts.setModel(model);
    }

    public void createPdf(String dest, String client, String bill, double all, double old, List<String> a) throws DocumentException, FileNotFoundException {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String date2 = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ssss").format(new Date());
        dest += date2 + client + ".pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        document.add(new Paragraph("PLAY STORE\n", FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 80, Font.BOLD, BaseColor.LIGHT_GRAY)));
        document.add(new Paragraph(date, big));
        PdfPTable pTableClient = new PdfPTable(1);
        pTableClient.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);
        PdfPCell cell = new PdfPCell();
        Paragraph paragraph = new Paragraph("اسم العميل :  " + client, big);
        paragraph.setAlignment(PdfPCell.ALIGN_LEFT);
        cell.addElement(paragraph);
        cell.setBorder(Rectangle.NO_BORDER);
        PdfPCell cell2 = new PdfPCell();
        if (jCheckBox.isSelected()) {
            bill += "               أجل";
        }
        Paragraph paragraph2 = new Paragraph("رقم الفاتورة :  " + bill, big);
        paragraph2.setAlignment(PdfPCell.ALIGN_LEFT);
        cell2.addElement(paragraph2);
        cell2.setBorder(Rectangle.NO_BORDER);
        pTableClient.addCell(cell);
        pTableClient.addCell(cell2);
        document.add(pTableClient);
        document.add(new Paragraph(" "));
        PdfPTable pTable = new PdfPTable(4);
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
        for (int i = 0; i < a.size(); i++) {
            PdfPCell cella = new PdfPCell(new Phrase(a.get(i), normal));
            pTable.addCell(cella);
        }

        ////////////////
        PdfPTable pTableClient2 = new PdfPTable(1);
        pTableClient2.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);

        PdfPCell cell7 = new PdfPCell();
        Paragraph paragraph7 = new Paragraph("الاجمالى :  " + all, big);
        paragraph7.setAlignment(PdfPCell.ALIGN_LEFT);
        cell7.addElement(paragraph7);
        cell7.setBorder(Rectangle.NO_BORDER);

        PdfPCell cell8 = new PdfPCell();
        Paragraph paragraph8 = new Paragraph("الحساب السابق :  " + old, big);
        paragraph8.setAlignment(PdfPCell.ALIGN_LEFT);
        cell8.addElement(paragraph8);
        cell8.setBorder(Rectangle.NO_BORDER);

        PdfPCell cell9 = new PdfPCell();
        if (jCheckBox.isSelected()) {
            old += all;
        }
        Paragraph paragraph9 = new Paragraph("الحساب الحالى :  " + old, big);
        paragraph9.setAlignment(PdfPCell.ALIGN_LEFT);
        cell9.addElement(paragraph9);
        cell9.setBorder(Rectangle.NO_BORDER);
        pTableClient2.addCell(cell7);
        pTableClient2.addCell(cell8);
        pTableClient2.addCell(cell9);

///////////////////
        document.add(pTable);
        document.add(pTableClient2);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSellPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxProducts = new javax.swing.JComboBox();
        jRadioIn = new javax.swing.JRadioButton();
        jRadioOut = new javax.swing.JRadioButton();
        jLabelClient = new javax.swing.JLabel();
        jTextFieldClientName = new javax.swing.JTextField();
        jComboBoxClient = new javax.swing.JComboBox();
        jCheckBox = new javax.swing.JCheckBox();
        jTextFieldProductName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBill = new javax.swing.JTextField();
        jTextFieldNote = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPaid = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
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
        jButton2 = new javax.swing.JButton();

        jRadioButton3.setText("jRadioButton3");

        jTextField5.setText("jTextField1");

        setBackground(new java.awt.Color(0, 170, 170));
        setForeground(new java.awt.Color(0, 102, 51));
        setPreferredSize(new java.awt.Dimension(1000, 475));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 74));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("اسم المنتج");

        jTextFieldSellPrice.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldSellPrice.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldSellPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldSellPrice.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextFieldSellPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSellPriceActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("السعر");

        jTextFieldAmount.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldAmount.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldAmount.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextFieldAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmountActionPerformed(evt);
            }
        });

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

        jCheckBox.setBackground(new java.awt.Color(0, 204, 204));
        jCheckBox.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jCheckBox.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("رقم الفاتورة");

        jTextFieldBill.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldBill.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldBill.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextFieldBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBillActionPerformed(evt);
            }
        });

        jTextFieldNote.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldNote.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldNote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoteActionPerformed(evt);
            }
        });
        jTextFieldNote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNoteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNoteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNoteKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ملاحظة");

        jButton15.setBackground(new java.awt.Color(0, 204, 204));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/book.png"))); // NOI18N
        jButton15.setText("طباعة فاتورة");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("المدفوع");

        jTextFieldPaid.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextFieldPaid.setForeground(new java.awt.Color(0, 0, 102));
        jTextFieldPaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTextFieldPaid.setMaximumSize(new java.awt.Dimension(100, 50));
        jTextFieldPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPaidActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 204, 204));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/money-1.png"))); // NOI18N
        jButton16.setText("اضافة");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBill, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxClient, 0, 187, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClientName, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelClient, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNote))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioOut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioIn))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBoxProducts, 0, 244, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelClient)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldProductName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioIn)
                                .addComponent(jRadioOut)))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(710, 300));

        jTableSaledProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 170, 170), 2));
        jTableSaledProducts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));
        jPanel4.setMaximumSize(new java.awt.Dimension(90, 500));
        jPanel4.setPreferredSize(new java.awt.Dimension(80, 319));

        jTextName.setEditable(false);
        jTextName.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        jTextColor.setEditable(false);
        jTextColor.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextColor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        jTextSellPrice.setEditable(false);
        jTextSellPrice.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextSellPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSellPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        jTextSellBigPrice.setEditable(false);
        jTextSellBigPrice.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextSellBigPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSellBigPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        jTextNumber.setEditable(false);
        jTextNumber.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSellPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSellBigPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jTextNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1225, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(0, 170, 170));
        jPanel6.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("بــيــع");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/1458935647_testimonials.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/1.png"))); // NOI18N
        jButton2.setText("جديد");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSellPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSellPriceActionPerformed

    }//GEN-LAST:event_jTextFieldSellPriceActionPerformed

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

        jTextFieldSellPrice.setText(p.getSell_price() + "");
        jTextFieldProductName.setText(p.getName());

    }//GEN-LAST:event_jComboBoxProductsActionPerformed

    private void jComboBoxProductsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProductsItemStateChanged
//        jTextFieldProductName.setText(jComboBoxProducts.getSelectedItem().toString());
        jTextFieldProductName.setText(p.getName());

    }//GEN-LAST:event_jComboBoxProductsItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jCheckBox.setEnabled(false);
        try {
            if (jCheckBox.isSelected()) {
                //اجل
                is_paid = 0;

            }
            if (!jTextFieldBill.getText().equals("")) {
                bill = jTextFieldBill.getText();
                billp = bill;
            }
            if (!jTextFieldNote.getText().equals("")) {
                note = jTextFieldNote.getText();
            }
            jTableSaledProducts.setModel(model);
            double sell_price = Double.parseDouble(jTextFieldSellPrice.getText());
            int amount = Integer.parseInt(jTextFieldAmount.getText());
            int updated_amount = p.getNumber() - amount;
            double all_price = sell_price * amount;
            SellAndBuyControl sc = new SellAndBuyControl();
            double gain = (sell_price - p.getBuy_price()) * amount;
            boolean b = false;
            if (in == 0) {
                b = sc.sell_product_in(jTextFieldProductName.getText(),
                        jTextFieldSellPrice.getText(),
                        jTextFieldAmount.getText(),
                        p.getId() + "",
                        gain,
                        updated_amount + "",
                        all_price + "",
                        client.getId(), is_paid, bill, note);
            } else if (in == 1) {
                b = sc.sell_product_out(jTextFieldProductName.getText(),
                        jTextFieldSellPrice.getText(),
                        jTextFieldAmount.getText(),
                        p.getId() + "",
                        gain,
                        updated_amount + "",
                        all_price + "",
                        client.getId(), is_paid, bill, note);
            }
            if (b) {
                all_bill += all_price;

                model.addRow(new Object[]{jTextFieldProductName.getText(),
                    jTextFieldSellPrice.getText(),
                    amount,
                    all_price,
                    client.getName(), bill});

                pList.add(jTextFieldProductName.getText());
                pList.add(jTextFieldSellPrice.getText());
                pList.add(jTextFieldAmount.getText());
                pList.add(all_price + "");

                jTextFieldProductName.setText("");
                jTextFieldSellPrice.setText("");
                jTextFieldAmount.setText("");
            } else {

                JOptionPane.showMessageDialog(null, "error\n");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "error\n" + e.getMessage());
        }
        is_paid = 1;
        bill = "1";
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmountActionPerformed


    private void jRadioInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInActionPerformed
        in = 0;
        jRadioOut.setSelected(false);
        jTextFieldProductName.setText("");
        jTextFieldAmount.setText("");
        jTextFieldSellPrice.setText("");
        jTextColor.setText("");
        jTextName.setText("");
        jTextSellPrice.setText("");
        jTextSellBigPrice.setText("");
        jTextNumber.setText("");
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
        jTextFieldSellPrice.setText("");
        productsList.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel());
    }//GEN-LAST:event_jRadioOutActionPerformed

    private void jTextFieldClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClientNameActionPerformed

    private void jComboBoxClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClientItemStateChanged
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxClientItemStateChanged

    private void jComboBoxClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientActionPerformed
        jTextFieldClientName.setText(jComboBoxClient.getSelectedItem().toString());
        ClientsControll pc = new ClientsControll();
        client = pc.getselectedClient(jComboBoxClient.getSelectedItem().toString());
        old = client.getCreditor();
        jTextFieldClientName.setText(client.getName());
        ClientNameP = client.getName();

        jComboBoxClient.disable();
        jTextFieldClientName.setEditable(false);


    }//GEN-LAST:event_jComboBoxClientActionPerformed

    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActionPerformed
        if (jCheckBox.isSelected()) {
            //اجل
            is_paid = 0;
            jCheckBox.setEnabled(false);
        }
        if (!jCheckBox.isSelected()) {
            //اجل
            is_paid = 1;
//            jCheckBox.setEnabled(false);
        }
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

    private void jTextFieldBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBillActionPerformed

    private void jTextFieldNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoteActionPerformed

    private void jTextFieldNoteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNoteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoteKeyPressed

    private void jTextFieldNoteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNoteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoteKeyReleased

    private void jTextFieldNoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNoteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoteKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        all_bill = 0;
        pList.clear();
        jComboBoxClient.enable(true);
        jTextFieldClientName.setEditable(true);
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        jTableSaledProducts.setModel(model);

        jCheckBox.setSelected(false);
        jCheckBox.setEnabled(true);
        jTextFieldProductName.setText("");
        jTextFieldAmount.setText("");
        jTextFieldSellPrice.setText("");
        jTextColor.setText("");
        jTextName.setText("");
        jTextSellPrice.setText("");
        jTextSellBigPrice.setText("");
        jTextNumber.setText("");
        jTextFieldClientName.setText("");

        productsList.clear();
        jComboBoxProducts.setModel(new DefaultComboBoxModel());
        jComboBoxClient.setModel(new DefaultComboBoxModel());

        SellAndBuyControl sabc = new SellAndBuyControl();
        jTextFieldBill.setText(sabc.getBillNumber() + "");

        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        try {
            createPdf(DEST, ClientNameP, billp, all_bill, old, pList);
        } catch (DocumentException | FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextFieldPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPaidActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        ClientsControll cc = new ClientsControll();
        if (cc.addPayment(client.getId(), jTextFieldPaid.getText())) {
            JOptionPane.showMessageDialog(null, "تمت الاضافة");
            jTextFieldClientName.setText("");
            jTextFieldPaid.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "error");
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JComboBox jComboBoxClient;
    private javax.swing.JComboBox jComboBoxProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioIn;
    private javax.swing.JRadioButton jRadioOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableSaledProducts;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldBill;
    private javax.swing.JTextField jTextFieldClientName;
    private javax.swing.JTextField jTextFieldNote;
    private javax.swing.JTextField jTextFieldPaid;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldSellPrice;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextNumber;
    private javax.swing.JTextField jTextSellBigPrice;
    private javax.swing.JTextField jTextSellPrice;
    // End of variables declaration//GEN-END:variables
}
