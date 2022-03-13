/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author OS
 */
public class DanhSach extends javax.swing.JFrame {

    /**
     * Creates new form DanhSach
     */
    public DanhSach() {
        initComponents();
    }

    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://MSI:1433; databaseName=Product";
    String user = "sa";
    String pass = "1234";
    Statement st;
    ResultSet rs;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbMSP = new javax.swing.JLabel();
        txtMSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        LbTenSP = new javax.swing.JLabel();
        BtThem = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        BtXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMain = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtMaLoaiSanPham = new javax.swing.JTextField();
        LbMaLoaiSP = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        LbGia = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        LbSLHC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbMSP.setText("MSP");

        txtMSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSPActionPerformed(evt);
            }
        });

        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        LbTenSP.setText("TenSP");

        BtThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtThem.setText("Thêm");
        BtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtThemActionPerformed(evt);
            }
        });

        btUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btUpdate.setText("Sửa");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        BtXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtXoa.setText("Xóa");
        BtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtXoaActionPerformed(evt);
            }
        });

        TableMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(TableMain);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quản lý sản phẩm");

        txtMaLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLoaiSanPhamActionPerformed(evt);
            }
        });

        LbMaLoaiSP.setText("maLoaiSP");

        LbGia.setText("Gia");

        LbSLHC.setText("SLHC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(BtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbSLHC, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LbMaLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbMSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtThem)
                    .addComponent(btUpdate)
                    .addComponent(BtXoa))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbMSP)
                            .addComponent(txtMSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbTenSP)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbMaLoaiSP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbGia)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbSLHC)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 590, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showDuLieu(){
        try {
            TableMain.removeAll();
            String[] arr = { "Msp","TenSanPham","MaLoaiSanPham","Gia","SoLuongHienCon"};
            DefaultTableModel model = new DefaultTableModel(arr,0);

            Connection connection = DBConnection.getConnection();

            String query = "SELECT *FROM dbo.[Product]";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("MSP"));
                vector.add(rs.getString("TenSP"));
                vector.add(rs.getString("MaLoaiSanPham"));
                vector.add(rs.getString("Gia"));
                vector.add(rs.getString("SoLuongHienCo"));
                model.addRow(vector);
            }
            TableMain.setModel(model);
        } catch (SQLException ex) {
                ex.printStackTrace();
            }
    }
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        showDuLieu();
    }//GEN-LAST:event_formComponentShown

    private void BtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtThemActionPerformed
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "insert into Product values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,txtMSP.getText());
            ps.setString(2,txtTenSP.getText());
            ps.setString(3,txtMaLoaiSanPham.getText());
            ps.setString(4,txtGia.getText());
            ps.setString(5,txtSoLuong.getText());
            ps.executeUpdate();
            showDuLieu();
            JOptionPane.showConfirmDialog(null,"Thêm thành công");
            if(txtMSP.getText().equals("")|txtTenSP.getText().equals("")|txtMaLoaiSanPham.getText().equals("")|txtGia.getText().equals("")|txtSoLuong.getText().equals("")){
                JOptionPane.showConfirmDialog(this,"Không để thông tin trống");                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_BtThemActionPerformed

    private void txtMSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSPActionPerformed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void txtMaLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLoaiSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLoaiSanPhamActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        try {
            Class.forName(driver);
            Connection con = DBConnection.getConnection();
            String sql = "Update Product set TenSP=?,MaLoaiSanPham=?,Gia=?,SoLuongHienCo=? where MSP=?";
            PreparedStatement ps = con.prepareStatement(sql);          
            ps.setString(1,txtTenSP.getText());
            ps.setString(2,txtMaLoaiSanPham.getText());
            ps.setString(3,txtGia.getText());
            ps.setString(4,txtSoLuong.getText());
            ps.setString(5,txtMSP.getText());
            ps.executeUpdate();
            showDuLieu();
            DBConnection.closeConnection(con);
            JOptionPane.showConfirmDialog(null,"Update thành công");
 
        } catch (Exception e) {
            e.printStackTrace();
        }              
    }//GEN-LAST:event_btUpdateActionPerformed

    private void BtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtXoaActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa?" );
        if(result ==0){
            int position = TableMain.getSelectedRow();
            String data = TableMain.getModel().getValueAt(position, 0).toString();
            try {
                Connection con = DBConnection.getConnection();
                String sql = "delete from Product where MSP=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, data);
                ps.executeUpdate();
                showDuLieu();
                DBConnection.closeConnection(con);
                JOptionPane.showConfirmDialog(null,"Xóa thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BtXoaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DanhSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtThem;
    private javax.swing.JButton BtXoa;
    private javax.swing.JLabel LbGia;
    private javax.swing.JLabel LbMSP;
    private javax.swing.JLabel LbMaLoaiSP;
    private javax.swing.JLabel LbSLHC;
    private javax.swing.JLabel LbTenSP;
    private javax.swing.JTable TableMain;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMSP;
    private javax.swing.JTextField txtMaLoaiSanPham;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
