package project1;

import koneksi.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormBarang extends javax.swing.JFrame {

    Connection conn;
    Statement st;
    ResultSet rs;
    Koneksi koneksi;

    DefaultTableModel dtm;

    String Kd_Brg, Nm_Brg;
    int Hrg, Jml;

    public FormBarang() {
        initComponents();
        koneksi = new Koneksi();
        conn = koneksi.getConnection();
        tampilTable();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        KdBrg = new javax.swing.JTextField();
        NamaBrg = new javax.swing.JTextField();
        Jumlah = new javax.swing.JTextField();
        Harga = new javax.swing.JTextField();
        Cari = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Jumlah");

        jLabel4.setText("Harga");

        KdBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KdBrgActionPerformed(evt);
            }
        });

        Cari.setText("Cari");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jumlah", "Harga"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Jumlah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(KdBrg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaBrg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Harga))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Keluar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Cari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Edit)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(KdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cari)
                        .addComponent(Simpan)
                        .addComponent(Edit)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(NamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hapus)
                        .addComponent(Keluar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        hapusData();
        clearForm();
        tampilTable();
    }//GEN-LAST:event_HapusActionPerformed
    
    private boolean hapusData(){
        try{
            st = conn.createStatement();
            
            int hapus = st.executeUpdate("DELETE from produk WHERE kd_brg = '"+Kd_Brg+"'");
            if(hapus == 1){
                JOptionPane.showMessageDialog(rootPane, "Data Terhapus");
            }
            return true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "error 2 : " +e.getMessage());
        }
        return false;
    }
    
    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_KeluarActionPerformed

    private void KdBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KdBrgActionPerformed
        
    }//GEN-LAST:event_KdBrgActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        Kd_Brg = KdBrg.getText();
        Nm_Brg = NamaBrg.getText();
        Jml = Integer.parseInt(Jumlah.getText());
        Hrg = Integer.parseInt(Harga.getText());
 
        SimpanData();
        clearForm();
        tampilTable();
    }//GEN-LAST:event_SimpanActionPerformed
        
    private boolean SimpanData() {
        try {
            st = conn.createStatement();
            int simpan = st.executeUpdate("insert into produk(kd_brg, nama_brg, jml, harga) "
                    + "values('" + Kd_Brg + "','" + Nm_Brg + "','" + Jml + "','" + Hrg + "')");

            if (simpan == 1) {
                JOptionPane.showMessageDialog(rootPane, "Data Tersimpan");
            }
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error 2 : " + e.getMessage());
        }
        return false;
    }
 
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Nm_Brg = NamaBrg.getText();
        Jml = Integer.parseInt(Jumlah.getText());
        Hrg = Integer.parseInt(Harga.getText());
        
        updateData();
        clearForm();
        tampilTable();
    }//GEN-LAST:event_EditActionPerformed

    private boolean updateData() {
        try {
            st = conn.createStatement();

            int update = st.executeUpdate("UPDATE produk SET nama_brg = '" + Nm_Brg + "',"
                    + "jml = '" + Jml + "',"
                    + "harga = '" + Hrg + "' "
                    + "WHERE kd_brg = '" + Kd_Brg + "'"
            );
            if (update == 1) {
                JOptionPane.showMessageDialog(rootPane, "Data Diubah");
            }
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error 2 :" + e.getMessage());
        }
        return false;
    }
    
    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        Kd_Brg = KdBrg.getText();
        
        cariBarang();
        tampilData();
    }//GEN-LAST:event_CariActionPerformed
    
    private void cariBarang() {
        String sql = "select * from produk where kd_brg = '" + Kd_Brg + "'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                Kd_Brg = rs.getString("kd_brg");
                Nm_Brg = rs.getString("nama_brg");
                Jml = rs.getInt("jml");
                Hrg = rs.getInt("harga");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Tidak Ada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void tampilData(){
        KdBrg.setText(Kd_Brg);
        NamaBrg.setText(Nm_Brg);
        Jumlah.setText(Integer.toString(Jml));
        Harga.setText(Integer.toString(Hrg));
    }
    
    private void clearForm() {
 
        KdBrg.setText("");
        NamaBrg.setText("");
        Jumlah.setText("");
        Harga.setText("");
    }

    private void tampilTable() {
        String sql = "SELECT * FROM produk";
        dtm = new DefaultTableModel();
        dtm.addColumn("Kode Barang");
        dtm.addColumn("Nama Barang");
        dtm.addColumn("Jumlah");
        dtm.addColumn("Harga");
        jTable2.setModel(dtm);

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{
                    rs.getString("kd_brg"),
                    rs.getString("nama_brg"),
                    rs.getString("jml"),
                    rs.getString("harga"),
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in tampilTable: " + e.getMessage());
        }
    }
 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormBarang().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cari;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JTextField KdBrg;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField NamaBrg;
    private javax.swing.JButton Simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
