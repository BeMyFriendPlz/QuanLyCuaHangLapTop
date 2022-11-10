/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit.QuanLyCuaHangLapTop.View;

import codeptit.QuanLyCuaHangLapTop.Model.TaiKhoan;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TaiKhoan_ChangePassView extends javax.swing.JFrame {
    private String tk;
    private TaiKhoan taiKhoan;
    /**
     * Creates new form ChangePassView
     */
    public TaiKhoan_ChangePassView(String tk) {
        this.tk = tk;
        taiKhoan = new TaiKhoan();
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_MKnew = new javax.swing.JTextField();
        jTextField_MKre = new javax.swing.JTextField();
        jTextField_MKold = new javax.swing.JTextField();
        jButton_Change = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đổi Mật Khẩu");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Mật khẩu đăng nhập");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Mật khẩu cũ:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Mật khẩu mới:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Xác nhận mật khẩu:");

        jTextField_MKnew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_MKnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MKnewActionPerformed(evt);
            }
        });

        jTextField_MKre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_MKre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MKreActionPerformed(evt);
            }
        });

        jTextField_MKold.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_MKold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MKoldActionPerformed(evt);
            }
        });

        jButton_Change.setBackground(new java.awt.Color(102, 102, 255));
        jButton_Change.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Change.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Change.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Reload-icon.png")); // NOI18N
        jButton_Change.setText("Đổi mật khẩu");
        jButton_Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChangeActionPerformed(evt);
            }
        });

        jButton_Exit.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Exit.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Button-Close-icon.png")); // NOI18N
        jButton_Exit.setText("Thoát");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(68, 68, 68)
                                        .addComponent(jTextField_MKold, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(61, 61, 61)
                                        .addComponent(jTextField_MKnew, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(24, 24, 24)
                                        .addComponent(jTextField_MKre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Exit)
                                .addGap(95, 95, 95)
                                .addComponent(jButton_Change))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jTextField_MKold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jTextField_MKnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jTextField_MKre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Change)
                    .addComponent(jButton_Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChangeActionPerformed
        // TODO add your handling code here:
        String mkcu = jTextField_MKold.getText();
        String mkmoi = jTextField_MKnew.getText();
        String mkre = jTextField_MKre.getText();
        taiKhoan.setTenTK(tk);
        taiKhoan.setMatKhau(mkcu);
        if(mkmoi.equals(mkre) && taiKhoan.doiMatKhau(mkmoi)) {
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công", "Change password successfully", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Mật khẩu không hợp lệ", "Change password failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_ChangeActionPerformed

    private void jTextField_MKoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MKoldActionPerformed
        // TODO add your handling code here:
        jTextField_MKnew.requestFocus();
    }//GEN-LAST:event_jTextField_MKoldActionPerformed

    private void jTextField_MKnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MKnewActionPerformed
        // TODO add your handling code here:
        jTextField_MKre.requestFocus();
    }//GEN-LAST:event_jTextField_MKnewActionPerformed

    private void jTextField_MKreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MKreActionPerformed
        // TODO add your handling code here:
        jButton_ChangeActionPerformed(evt);
    }//GEN-LAST:event_jTextField_MKreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Change;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_MKnew;
    private javax.swing.JTextField jTextField_MKold;
    private javax.swing.JTextField jTextField_MKre;
    // End of variables declaration//GEN-END:variables
}