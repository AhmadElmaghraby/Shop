package view.frames;

import control.userControl;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.UserM;

public class login extends javax.swing.JFrame {

    String user;
    String pass;
    userControl control;
    mainframe main;
    public static boolean is_admin = false;

    public login() {
        initComponents();
        control = new userControl();
        control.delete();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("اسم المستخدم");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 40, 100, 30);

        btnLogin.setBackground(new java.awt.Color(0, 150, 150));
        btnLogin.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/079582-blue-white-pearl-icon-business-lock6-sc48.png"))); // NOI18N
        btnLogin.setText("دخول");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(102, 135, 120, 40);

        txtuser.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtuser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        txtuser.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(txtuser);
        txtuser.setBounds(70, 40, 180, 30);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("كلمة السر");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 90, 100, 30);

        txtpassword.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtpassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        txtpassword.setMargin(new java.awt.Insets(5, 10, 5, 10));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword);
        txtpassword.setBounds(70, 90, 180, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/TT16s.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 480, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        this.user = txtuser.getText();
        this.pass = txtpassword.getText();
        boolean isUser = control.isUser(user, pass);
        UserM userM = control.getUser(user);
        String created_at = userM.getCreated_at();
        String fullName = userM.getUsername();
        login.is_admin = userM.getIs_Admin();
        try {
            if (isUser == true) {
                this.dispose();
                this.main = new mainframe(fullName);
                this.main.setResizable(true);
                this.main.setExtendedState(this.main.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                this.main.setLocationRelativeTo(null);
                this.main.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong user name or password ");
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "helll");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");

            login l = new login();
            l.setSize(390, 230);
            l.setTitle("تسجيل الدخول");
            l.setLocationRelativeTo(null);
            l.setResizable(false);
            l.setDefaultCloseOperation(EXIT_ON_CLOSE);
            l.getContentPane().setBackground(Color.WHITE);
            l.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
