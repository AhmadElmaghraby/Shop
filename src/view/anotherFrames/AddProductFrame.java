/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.anotherFrames;

import java.awt.Color;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import view.frames.login;

/**
 *
 * @author elmaghraby
 */
public class AddProductFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddProductFrame
     */
    public AddProductFrame() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addProduct1 = new view.anotherFrames.panels.AddProductPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addProduct1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addProduct1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
        try {
            AddProductFrame l = new AddProductFrame();
            l.setLocationRelativeTo(null);
            l.setResizable(false);
            l.setDefaultCloseOperation(HIDE_ON_CLOSE);
            l.getContentPane().setBackground(Color.WHITE);
            l.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.anotherFrames.panels.AddProductPanel addProduct1;
    // End of variables declaration//GEN-END:variables
}