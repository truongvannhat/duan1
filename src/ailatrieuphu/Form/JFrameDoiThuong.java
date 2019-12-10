/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ailatrieuphu.Form;

import ailatrieuphu.Dao.TaiKhoanDao;
import ailatrieuphu.Helper.DialogHelper;
import ailatrieuphu.Helper.ShareHelper;

/**
 *
 * @author admin
 */
public class JFrameDoiThuong extends javax.swing.JInternalFrame {
    TaiKhoanDao TaiKhoanDao = new TaiKhoanDao();
    
    /**
     * Creates new form FormDoiThuong
     */
    public boolean checkDiem(int diem){
        if(ShareHelper.USER.getDiem()<diem){
            return false;
        }
        return true;
    }
    public void doiThuong(int diem){
        if (checkDiem(diem)) {
            int diemSauDoiThuong=ShareHelper.USER.getDiem()-diem;
            TaiKhoanDao.updateDiem(diemSauDoiThuong,ShareHelper.USER.getUsername());
            DialogHelper.alert(Panel, "Đổi thành công");
            refreshUser();
        }else{
            DialogHelper.alert(Panel, "Không đủ điểm để đổi phần thưởng, 1000 điểm tương đương 1000 VND");
        }
    }
    public void refreshUser(){
        ShareHelper.refreshUser(TaiKhoanDao.findID(ShareHelper.USER.getUsername()));
    }
    public JFrameDoiThuong() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        Panel = new javax.swing.JPanel();
        btnThe50 = new javax.swing.JButton();
        btnThe500 = new javax.swing.JButton();
        btnThe20 = new javax.swing.JButton();
        btnThe200 = new javax.swing.JButton();
        btnThe100 = new javax.swing.JButton();
        btnThe10 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setClosable(true);
        setVisible(false);

        Panel.setLayout(null);

        btnThe50.setBackground(java.awt.Color.blue);
        btnThe50.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThe50.setForeground(new java.awt.Color(255, 255, 255));
        btnThe50.setText("Thẻ 50.000");
        btnThe50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThe50ActionPerformed(evt);
            }
        });
        Panel.add(btnThe50);
        btnThe50.setBounds(600, 130, 210, 100);

        btnThe500.setBackground(java.awt.Color.blue);
        btnThe500.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThe500.setForeground(new java.awt.Color(255, 255, 255));
        btnThe500.setText("Thẻ 500.000");
        btnThe500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThe500ActionPerformed(evt);
            }
        });
        Panel.add(btnThe500);
        btnThe500.setBounds(600, 300, 210, 100);

        btnThe20.setBackground(java.awt.Color.blue);
        btnThe20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThe20.setForeground(new java.awt.Color(255, 255, 255));
        btnThe20.setText("Thẻ 20.000");
        btnThe20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThe20ActionPerformed(evt);
            }
        });
        Panel.add(btnThe20);
        btnThe20.setBounds(330, 130, 210, 100);

        btnThe200.setBackground(java.awt.Color.blue);
        btnThe200.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThe200.setForeground(new java.awt.Color(255, 255, 255));
        btnThe200.setText("Thẻ 200.000");
        btnThe200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThe200ActionPerformed(evt);
            }
        });
        Panel.add(btnThe200);
        btnThe200.setBounds(330, 300, 210, 100);

        btnThe100.setBackground(java.awt.Color.blue);
        btnThe100.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThe100.setForeground(new java.awt.Color(255, 255, 255));
        btnThe100.setText("Thẻ 100.000");
        btnThe100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThe100ActionPerformed(evt);
            }
        });
        Panel.add(btnThe100);
        btnThe100.setBounds(60, 300, 210, 100);

        btnThe10.setBackground(java.awt.Color.blue);
        btnThe10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnThe10.setForeground(new java.awt.Color(255, 255, 255));
        btnThe10.setText("Thẻ 10.000");
        btnThe10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThe10ActionPerformed(evt);
            }
        });
        Panel.add(btnThe10);
        btnThe10.setBounds(60, 130, 210, 100);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Đổi Thưởng");
        Panel.add(lblTitle);
        lblTitle.setBounds(360, 20, 210, 40);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ailatrieuphu/Form/Img/1.png"))); // NOI18N
        Panel.add(lblLogo);
        lblLogo.setBounds(-260, -40, 1530, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThe100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThe100ActionPerformed
        // TODO add your handling code here:
        doiThuong(100000);
    }//GEN-LAST:event_btnThe100ActionPerformed

    private void btnThe10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThe10ActionPerformed
        // TODO add your handling code here:
        doiThuong(10000);
    }//GEN-LAST:event_btnThe10ActionPerformed

    private void btnThe20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThe20ActionPerformed
        // TODO add your handling code here:
        doiThuong(20000);
    }//GEN-LAST:event_btnThe20ActionPerformed

    private void btnThe50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThe50ActionPerformed
        // TODO add your handling code here:
        doiThuong(50000);
    }//GEN-LAST:event_btnThe50ActionPerformed

    private void btnThe200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThe200ActionPerformed
        // TODO add your handling code here:
        doiThuong(200000);
    }//GEN-LAST:event_btnThe200ActionPerformed

    private void btnThe500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThe500ActionPerformed
        // TODO add your handling code here:
        doiThuong(500000);
    }//GEN-LAST:event_btnThe500ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnThe10;
    private javax.swing.JButton btnThe100;
    private javax.swing.JButton btnThe20;
    private javax.swing.JButton btnThe200;
    private javax.swing.JButton btnThe50;
    private javax.swing.JButton btnThe500;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
