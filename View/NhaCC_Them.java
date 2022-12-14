/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit.QuanLyCuaHangLapTop.View;

import codeptit.QuanLyCuaHangLapTop.Model.NhaCungCap;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NhaCC_Them extends javax.swing.JFrame {
    private ArrayList<NhaCungCap> list;
    private NhaCungCap ncc;
    /**
     * Creates new form ThemKH
     */
    public NhaCC_Them(ArrayList<NhaCungCap> list) {
        this.list = list;
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
        jTextField_TenNCC = new javax.swing.JTextField();
        jButton_Them = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm khách hàng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Thêm nhà cung cấp");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên nhà cung cấp:");

        jTextField_TenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Them.setBackground(new java.awt.Color(102, 0, 204));
        jButton_Them.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Them.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Them.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\math-add-icon.png")); // NOI18N
        jButton_Them.setText("Thêm");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jButton_Exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Exit.setIcon(new javax.swing.ImageIcon("D:\\Dai Hoc\\LapTrinhHuongDoiTuong\\QuanLyCuaHangMayTinh\\icon\\Close-2-icon.png")); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Exit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Them))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_TenNCC))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Them)
                    .addComponent(jButton_Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        // TODO add your handling code here:
        String maNCC;
        maNCC = String.valueOf(++NhaCC_DanhMucView.soMNCC);
        while (maNCC.length() < 3) maNCC = "0" + maNCC;
        maNCC = "NCC" + maNCC;
        String tenNCC = jTextField_TenNCC.getText();
        if(tenNCC == "") {
            JOptionPane.showMessageDialog(null, "Thông tin đã nhập chưa hợp lệ!", "Nhập sai dữ liệu", JOptionPane.ERROR_MESSAGE);
        } else {
            ncc = new NhaCungCap(maNCC, tenNCC);
            list.add(ncc);
            NhaCC_DanhMucView.showNCC(list);
            NhaCC_DanhMucView.jButton_Luu.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Đã thêm nhà cung cấp thành công!", "Nhập dữ liệu thành công", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton_ThemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Them;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_TenNCC;
    // End of variables declaration//GEN-END:variables
}
