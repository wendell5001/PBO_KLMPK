package View;

import Koneksi.Koneksi;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class menuBuku extends javax.swing.JPanel {
  
    private final Connection conn;
    private String idKategori;
    private String idPenerbit;
            
    public menuBuku() {
        initComponents();
        
        conn = Koneksi.getConnection();
       
        
        loadData();

        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbJenisKelamin = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        panelAdd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel2 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxKategori = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxPenerbit = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(690, 526));
        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setPreferredSize(new java.awt.Dimension(690, 448));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Buku", "Judul Buku", "Pengarang", "Tahun Terbit", "ID Kategori", "Nama Kategori", "ID Penerbit", "Nama Penerbit"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Data Buku  Perpustakaan");

        btnAdd.setBackground(new java.awt.Color(0, 102, 153));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("TAMBAH");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("HAPUS");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("BATAL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSearch.setMinimumSize(new java.awt.Dimension(64, 25));
        txtSearch.setPreferredSize(new java.awt.Dimension(64, 25));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setPreferredSize(new java.awt.Dimension(690, 448));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Tambah Data Buku Perpustakaan");

        btnSave.setBackground(new java.awt.Color(0, 102, 153));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SIMPAN");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel2.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel2.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel2.setText("KEMBALI");
        btnCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel2ActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtID.setMinimumSize(new java.awt.Dimension(64, 30));
        txtID.setPreferredSize(new java.awt.Dimension(71, 30));

        txtJudul.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtJudul.setMinimumSize(new java.awt.Dimension(64, 30));
        txtJudul.setPreferredSize(new java.awt.Dimension(71, 30));
        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });

        txtPengarang.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtPengarang.setMinimumSize(new java.awt.Dimension(64, 30));
        txtPengarang.setPreferredSize(new java.awt.Dimension(71, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Judul");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Pengarang");

        txtTahun.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtTahun.setMinimumSize(new java.awt.Dimension(64, 30));
        txtTahun.setPreferredSize(new java.awt.Dimension(71, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tahun");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Kategori");

        cbxKategori.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Penerbit");

        cbxPenerbit.setPreferredSize(new java.awt.Dimension(64, 30));

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(txtTahun, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txtJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)))
                    .addComponent(cbxKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxPenerbit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel2ActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btnCancel2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       panelMain.removeAll();
       panelMain.add(panelAdd);
       panelMain.repaint();
       panelMain.revalidate();
       
       txtID.setText(setIDBuku());
       if(btnAdd.getText().equals("UBAH")){
           dataTabel();
           btnSave.setText("PERBARUI");
           
       }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        showPanel();
        loadData();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(btnSave.getText().equals("TAMBAH"))
        {
            btnSave.setText("SIMPAN");
        }
        else if(btnSave.getText().equals("TAMBAH"))
        {
            insertData();
        }
        else if(btnSave.getText().equals("PERBARUI"))
        {
            updateData();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if(btnSave.getText().equals("TAMBAH"))
        {
            btnSave.setText("SIMPAN");
        }
        else if(btnSave.getText().equals("SIMPAN"))
        {
            insertData();
        }
        else if(btnSave.getText().equals("PERBARUI"))
        {
            updateData();
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if(btnAdd.getText().equals("TAMBAH")){
            btnAdd.setText("UBAH");
            btnDelete.setVisible(true);
            btnCancel.setVisible(true);
            
        }
        
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxKategori;
    private javax.swing.JComboBox<String> cbxPenerbit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.ButtonGroup rbJenisKelamin;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables

    private void loadData(){
        getKategori();
        getPenerbit();
       getData((DefaultTableModel) tblData.getModel());
       btnDelete.setVisible(false);
       btnCancel.setVisible(false);
    }
            private void showPanel() {
                panelMain.removeAll();
                panelMain.add(new menuBuku());
                panelMain.repaint();
                panelMain.revalidate();
        
    }
    
        private void resetForm() {
            txtID.setText("");
            txtJudul.setText("");
            txtPengarang.setText("");

        
    }

    private void getData(DefaultTableModel model) {
     model.setRowCount(0);
     
     
     try{
         String sql = "SELECT bk.ID_Buku, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, \n" +
                      "ktg.ID_Kategori, ktg.Nama_Kategori, \n" +
                      "pnb.ID_Penerbit, pnb.Nama_Penerbit\n" +
                      "FROM buku bk\n" +
                      "INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori\n" +
                      "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit ORDER BY bk.ID_Buku ASC";
         
         try (PreparedStatement st = conn.prepareStatement(sql)) {
         ResultSet rs = st.executeQuery();
             while (rs.next()) {
                 String idBuku = rs.getString("ID_Buku");
                 String judulBuku = rs.getString("Judul_Buku");
                 String pengarangBuku = rs.getString("Pengarang_Buku");
                 String tahunTerbit         = rs.getString("Tahun_Terbit");
                 String idKategori      = rs.getString("ID_Kategori");
                 String namaKategori      = rs.getString("Nama_Kategori");
                 String idPenerbit      = rs.getString("ID_Penerbit");
                 String namaPenerbit      = rs.getString("Nama_Penerbit");
                                  
                 Object[] rowData = {idBuku, judulBuku, pengarangBuku, tahunTerbit, idKategori,namaKategori, idPenerbit, namaPenerbit};
                 model.addRow(rowData);
             }
         }catch (Exception e){
         }
        }catch (Exception e){
            Logger.getLogger(menuBuku.class.getName()).log(Level.SEVERE,null,e);
       }
    }
    

    
    private String setIDBuku(){
        String urutan = null ;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Buku, 4) AS Nomor " +
                     "FROM Buku " +
                     "WHERE ID_Buku LIKE 'BK"+ no + "%' " +
                     "ORDER BY ID_Buku DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)) {
                  ResultSet rs = st.executeQuery(); 
                  
             if(rs.next()) {
                 int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                 urutan = "BK" + no + String.format("%04d", nomor);
            }else{
                 urutan = "BK" + no + "0001";
             }
        
        } catch (SQLException e){
           Logger.getLogger(menuBuku.class.getName()).log(Level.SEVERE, null,e);
        
        }
        return urutan;
    
    }
    
    public boolean validasiNama(){
        boolean valid = false;
        String idBuku = txtID.getText();
        String judulBuku = txtJudul.getText();
        
        String sql = "SELECT Judul_Buku From buku WHERE ID_Buku!='"+ idBuku +"' AND Judul_Buku LIKE BINARY '"+ judulBuku +"'";
        try(PreparedStatement st = conn.prepareStatement(sql)){
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Nama Buku Sudah Ada\nSilahkan Input Nama Buku Yang Berbeda", 
                        "Peringatan",JOptionPane.WARNING_MESSAGE);
            }else {
                valid = true;
            }
                    
        }catch (SQLException e){
          Logger.getLogger(menuBuku.class.getName()).log(Level.SEVERE, null,e);
            
        }
        return valid;
    }

    private void getKategori() {
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Kategori");
            
            String sql = "SELECT ID_Kategori, Nama_Kategori FROM kategori";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String namaKategori = rs.getString("Nama_Kategori");
                model.addElement(namaKategori);
                 
            }
            cbxKategori.setModel(model);
            cbxKategori.addActionListener(e -> {
                int selectIndex = cbxKategori.getSelectedIndex();
                if(selectIndex > 0){
                    try {
                        rs.absolute(selectIndex);
                        idKategori = rs.getString("ID_Kategori");
                        
                    } catch (SQLException ex) {
                    }
                }
                
            });
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void getPenerbit() {
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Penerbit");
            
            String sql = "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String namaKategori = rs.getString("Nama_Penerbit");
                model.addElement(namaKategori);
                 
            }
            cbxPenerbit.setModel(model);
            cbxPenerbit.addActionListener(e -> {
                int selectIndex = cbxPenerbit.getSelectedIndex();
                if(selectIndex > 0){
                    try {
                        rs.absolute(selectIndex);
                        idPenerbit = rs.getString("ID_Penerbit");
                        
                    } catch (SQLException ex) {
                    }
                }
                
            });
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    
    private void insertData() {
        String idBuku = txtID.getText();
        String judulBuku = txtJudul.getText();
        String pengarangBuku = txtPengarang.getText();
        String tahunTerbit = txtTahun.getText();
       
        if(idBuku.isEmpty()|| judulBuku.isEmpty()||pengarangBuku.isEmpty()||tahunTerbit.isEmpty()
                ||cbxKategori.getSelectedItem().toString().equals("Pilih Kategori")||cbxPenerbit.getSelectedItem().toString().equals("Pilih Penerbit")){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try {
        String sql = "INSERT INTO buku (ID_Buku, Judul_Buku, Pengarang_Buku, Tahun_Terbit, ID_Kategori, ID_Penerbit) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idBuku);
            st.setString(2, judulBuku);
            st.setString(3, pengarangBuku);
            st.setString(4, tahunTerbit);
            st.setString(5, idKategori);
            st.setString(6, idPenerbit);
            
           
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                resetForm();
                loadData();
                showPanel();
            
            } 
        }
    } catch (SQLException e) {
           java.util.logging.Logger.getLogger(menuBuku.class.getName()).log(Level.SEVERE, null,e);
    }
}

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tblData.getSelectedRow();
        jLabel1.setText("Perbarui Data Buku Perpustakaan");
        
        txtID.setEnabled(false);

        
        txtID.setText(tblData.getValueAt(row, 0).toString());
        txtJudul.setText(tblData.getValueAt(row, 1).toString());
        txtPengarang.setText(tblData.getValueAt(row, 2).toString());
        txtTahun.setText(tblData.getValueAt(row, 3).toString());
       idKategori = tblData.getModel().getValueAt(row, 4).toString();
       idPenerbit = tblData.getModel().getValueAt(row, 6).toString();
       
        getKategoriID(idKategori);
        getPenerbitID(idPenerbit);

    }
    
    private void getKategoriID(String id){
        try {
            String sql = "SELECT ID_Kategori, Nama_Kategori FROM kategori";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String idKat = rs.getString("ID_Kategori");
                String namaKat = rs.getString("Nama_Kategori");
                
                if(id.equals(idKat)){
                    cbxKategori.setSelectedItem(namaKat);
                }  
            }
            cbxKategori.addItemListener(new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent e){
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        String selectedKat = cbxKategori.getSelectedItem().toString();
                        updateKategoriID(selectedKat);
                        
                    }
                }
                
            });
            
            
        }  catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    private void updateKategoriID(String selectedKat){
        try {
            String sql = "SELECT ID_Kategori, Nama_Kategori FROM kategori WHERE Nama_Kategori=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, selectedKat);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                String idKat = rs.getString("ID_Kategori");
            }
            
        }  catch (Exception e) {
        e.printStackTrace();
        }
        
    }
    
    private void getPenerbitID(String id){
            try {
            String sql = "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String idPnb = rs.getString("ID_Penerbit");
                String namaPnb = rs.getString("Nama_Penerbit");
                
                if(id.equals(idPnb)){
                    cbxPenerbit.setSelectedItem(namaPnb);
                }  
            }
            cbxPenerbit.addItemListener(new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent e){
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        String selectedPenerbit = cbxPenerbit.getSelectedItem().toString();
                        updatePenerbitID(selectedPenerbit);
                        
                    }
                }
                
            });
            
            
        }  catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    private void updatePenerbitID(String selectedPenerbit){
        try {
            String sql = "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit WHERE Nama_Penerbit=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, selectedPenerbit);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                String idPnb = rs.getString("ID_Penerbit");
            }
            
        } catch (Exception e) {
        e.printStackTrace();
    
        }
        
    }
    
    private void updateData() {
        String idBuku = txtID.getText();
        String judulBuku = txtJudul.getText();
        String pengarangBuku = txtPengarang.getText();
        String tahunTerbit = txtTahun.getText();
       
        if(idBuku.isEmpty()|| judulBuku.isEmpty()||pengarangBuku.isEmpty()||tahunTerbit.isEmpty()
                ||cbxKategori.getSelectedItem().toString().equals("Pilih Kategori")||cbxPenerbit.getSelectedItem().toString().equals("Pilih Penerbit")){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Dipilih dan Diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
        try {
        String sql = "UPDATE buku SET Judul_Buku=?, Pengarang_Buku=?, Tahun_Terbit=?, ID_Kategori=?, ID_Penerbit=?, WHERE ID_Buku=?";
        
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, judulBuku);
            st.setString(2, pengarangBuku);
            st.setString(3, tahunTerbit);
            st.setString(4, idKategori);
            st.setString(5, idPenerbit);
            st.setString(6, idBuku);

            int rowsUpdated = st.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetForm();
                loadData();
                showPanel();
            } 
        }
    } catch (SQLException e) {
         Logger.getLogger(menuBuku.class.getName()).log(Level.SEVERE, null,e);
    }
}

    private void deleteData() {
        int selectedRow = tblData.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah Yakin Ingin Menghapus Data Ini?",
                "Konfirmasi Hapus Data",
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tblData.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM buku WHERE ID_Buku=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
            st.setString(1, id);
                
                int rowDeleted = st.executeUpdate();
                if (rowDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                
            } 
           }
        }catch (SQLException e) {
           java.util.logging.Logger.getLogger(menuBuku.class.getName()).log(Level.SEVERE, null,e);
        }
        }
        resetForm();
        loadData();
        showPanel();
     } 

    private void searchData() {
        String katakunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
     
     try{
         String sql = "SELECT bk.ID_Buku, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, "
                     + "ktg.ID_Kategori, ktg.Nama_Kategori, pnb.ID_Penerbit, pnb.Nama_Penerbit\n" +
                      "FROM buku bk\n" +
                      "INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori\n" +
                      "INNER JOIN penerbit pnb ON pnb.ID_Penerbit = bk.ID_Penerbit\n" +
                      "WHERE bk.Judul_Buku LIKE ? OR bk.Pengarang_Buku LIKE ?";
         
         try (PreparedStatement st = conn.prepareStatement(sql)) {
             st.setString(1, "%" + katakunci + "%");
             st.setString(2, "%" + katakunci + "%");
             ResultSet rs = st.executeQuery();
             
             while (rs.next()) {
                String idBuku = rs.getString("ID_Buku");
                 String judulBuku = rs.getString("Judul_Buku");
                 String pengarangBuku = rs.getString("Pengarang_Buku");
                 String tahunTerbit         = rs.getString("Tahun_Terbit");
                 String idKategori      = rs.getString("ID_Kategori");
                 String namaKategori      = rs.getString("Nama_Kategori");
                 String idPenerbit      = rs.getString("ID_Penerbit");
                 String namaPenerbit      = rs.getString("Nama_Penerbit");
                                  
                 Object[] rowData = {idBuku, judulBuku, pengarangBuku, tahunTerbit, idKategori,namaKategori, idPenerbit, namaPenerbit};
                 model.addRow(rowData);
             }        
         }catch (Exception e){
         }
        }catch (Exception e){
            Logger.getLogger(menuBuku.class.getName()).log(Level.SEVERE,null,e);
       }
    }

 
        
    }
