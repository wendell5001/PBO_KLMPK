package View;

import Koneksi.Koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menuAnggota extends javax.swing.JPanel {
    private final Connection conn;
    
    public menuAnggota() {
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
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbLaki = new javax.swing.JRadioButton();
        rbCewe = new javax.swing.JRadioButton();
        txtTanggal = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(690, 526));
        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setPreferredSize(new java.awt.Dimension(690, 448));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Email", "Telpon", "Jenis Kelamin", "Tanggal Bergabung"
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
        jLabel2.setText("Data Anggota Perpustakaan");

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
        txtSearch.setMinimumSize(new java.awt.Dimension(64, 30));
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
        jLabel1.setText("Tambah Data Anggota Perpustakaan");

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

        txtName.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtName.setMinimumSize(new java.awt.Dimension(64, 30));
        txtName.setPreferredSize(new java.awt.Dimension(71, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtEmail.setMinimumSize(new java.awt.Dimension(64, 30));
        txtEmail.setPreferredSize(new java.awt.Dimension(71, 30));

        txtTelepon.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtTelepon.setMinimumSize(new java.awt.Dimension(64, 30));
        txtTelepon.setPreferredSize(new java.awt.Dimension(71, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Telepon");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Jenis Kelamin");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tanggal Bergabung");

        rbJenisKelamin.add(rbLaki);
        rbLaki.setText("Laki-Laki");
        rbLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLakiActionPerformed(evt);
            }
        });

        rbJenisKelamin.add(rbCewe);
        rbCewe.setText("Perempuan");

        txtTanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTanggalPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelAddLayout.createSequentialGroup()
                            .addComponent(rbLaki)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rbCewe))
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(txtTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addGroup(panelAddLayout.createSequentialGroup()
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLaki)
                    .addComponent(rbCewe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
       
       txtID.setText(setIDAnggota());
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

    private void txtTanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTanggalPropertyChange

    }//GEN-LAST:event_txtTanggalPropertyChange

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

    private void rbLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLakiActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
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
    private javax.swing.JRadioButton rbCewe;
    private javax.swing.ButtonGroup rbJenisKelamin;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
       getData((DefaultTableModel) tblData.getModel());
       btnDelete.setVisible(false);
       btnCancel.setVisible(false);
    }
            private void showPanel() {
                panelMain.removeAll();
                panelMain.add(new menuAnggota());
                panelMain.repaint();
                panelMain.revalidate();
        
    }
    
        private void resetForm() {
            txtID.setText("");
            txtName.setText("");
            txtEmail.setText("");
            txtTelepon.setText("");
            rbJenisKelamin.clearSelection();
            txtTanggal.setDate(new Date()); 

        
    }

    private void getData(DefaultTableModel model) {
     model.setRowCount(0);
     
     try{
         String sql = "SELECT * FROM anggota";
         try (PreparedStatement st = conn.prepareStatement(sql)) {
         ResultSet rs = st.executeQuery();
             while (rs.next()) {
                 String idAnggota = rs.getString("ID_Anggota");
                 String namaAnggota = rs.getString("Nama_Anggota");
                 String emailAnggota = rs.getString("Email");
                 String telponAnggota = rs.getString("Telpon");
                 String jenisKelamin = rs.getString("Jenis_Kelamin");
                 String tanggalBergabung = rs.getString("Tanggal_Bergabung");
                 
                 Object[] rowData = {idAnggota,namaAnggota,emailAnggota,telponAnggota,jenisKelamin,tanggalBergabung};
                 model.addRow(rowData);
             }
         }catch (Exception e){
         }
        }catch (Exception e){
            Logger.getLogger(menuAnggota.class.getName()).log(Level.SEVERE,null,e);
       }
    }
    private String setIDAnggota(){
        String urutan = null ;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Anggota, 3) AS Nomor " +
                     "FROM anggota " +
                     "WHERE ID_Anggota LIKE 'AGT"+ no + "%' " +
                     "ORDER BY ID_Anggota DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)) {
                  ResultSet rs = st.executeQuery(); 
                  
             if(rs.next()) {
                 int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                 urutan = "AGT" + no + String.format("%03d", nomor);
            }else{
                 urutan = "AGT" + no + "001";
             }
        
        } catch (SQLException e){
            java.util.logging.Logger.getLogger(menuAnggota.class.getName()).log(Level.SEVERE, null,e);
        
        }
        return urutan;
    
    }

    private void insertData() {
        String idAnggota = txtID.getText();
        String namaAnggota = txtName.getText();
        String emailAnggota = txtEmail.getText();
        String telponAnggota = txtTelepon.getText();
        String jenisKelamin;
            if(rbLaki.isSelected()){
                jenisKelamin = rbLaki.getText();
            }else if (rbCewe.isSelected()){
                jenisKelamin = rbCewe.getText();
            }else {
                jenisKelamin = "" ;
            }
        
        
        if(idAnggota.isEmpty()|| namaAnggota.isEmpty()||emailAnggota.isEmpty()||telponAnggota.isEmpty()|| jenisKelamin.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (txtTanggal.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        try {
        String sql = "INSERT INTO anggota (ID_Anggota, Nama_Anggota, Email, Telpon, Jenis_Kelamin, Tanggal_Bergabung) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idAnggota);
            st.setString(2, namaAnggota);
            st.setString(3, emailAnggota);
            st.setString(4, telponAnggota);
            st.setString(5, jenisKelamin);

         
            Date tanggalBergabungDate = txtTanggal.getDate();
            java.sql.Date tanggalBergabung = new java.sql.Date(tanggalBergabungDate.getTime());

            st.setDate(6, tanggalBergabung);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                resetForm();
                loadData();
                showPanel();
            
            } 
        }
    } catch (SQLException e) {
           java.util.logging.Logger.getLogger(menuAnggota.class.getName()).log(Level.SEVERE, null,e);
    }
}

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tblData.getSelectedRow();
        jLabel1.setText("Perbarui Data Anggota Perpustakaan");
        
        txtID.setEnabled(false);
        txtTanggal.setEnabled(false);
        
        txtID.setText(tblData.getValueAt(row, 0).toString());
        txtName.setText(tblData.getValueAt(row, 1).toString());
        txtEmail.setText(tblData.getValueAt(row, 2).toString());
        txtTelepon.setText(tblData.getValueAt(row, 3).toString());
        
        String jenisKelamin = tblData.getValueAt(row, 4).toString();
            if(jenisKelamin.equals("Laki-Laki")){
                rbLaki.setSelected(true);
            }else if(jenisKelamin.equals("Perempuan")){
                rbCewe.setSelected(true);
            }
        
        try {
            String dateString = tblData.getValueAt(row, 5).toString();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
            txtTanggal.setDate(date);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Gagal mengonversi tanggal", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private void updateData() {
        String idAnggota = txtID.getText();
        String namaAnggota = txtName.getText();
        String emailAnggota = txtEmail.getText();
        String telponAnggota = txtTelepon.getText();
        String jenisKelamin;
            if(rbLaki.isSelected()){
                jenisKelamin = rbLaki.getText();
            }else if (rbCewe.isSelected()){
                jenisKelamin = rbCewe.getText();
            }else {
                jenisKelamin = "" ;
            }
        
        if(idAnggota.isEmpty()|| namaAnggota.isEmpty()||emailAnggota.isEmpty()||telponAnggota.isEmpty()|| jenisKelamin.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (txtTanggal.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        try {
        String sql = "UPDATE anggota SET Nama_Anggota=?, Email=?, Telpon=?, Jenis_Kelamin=?, Tanggal_Bergabung=? WHERE ID_Anggota=?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, namaAnggota);
            st.setString(2, emailAnggota);
            st.setString(3, telponAnggota);
            st.setString(4, jenisKelamin);

         
            Date tanggalBergabungDate = txtTanggal.getDate();
            java.sql.Date tanggalBergabung = new java.sql.Date(tanggalBergabungDate.getTime());

            st.setDate(5, tanggalBergabung);
            st.setString(6, idAnggota);

            int rowsUpdated = st.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetForm();
                loadData();
                showPanel();
            } 
        }
    } catch (SQLException e) {
           java.util.logging.Logger.getLogger(menuAnggota.class.getName()).log(Level.SEVERE, null,e);
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
                String sql = "DELETE FROM anggota WHERE ID_Anggota=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
            st.setString(1, id);
                
                int rowDeleted = st.executeUpdate();
                if (rowDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                
            } 
           }
        }catch (SQLException e) {
           java.util.logging.Logger.getLogger(menuAnggota.class.getName()).log(Level.SEVERE, null,e);
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
         String sql = "SELECT * FROM anggota WHERE Nama_Anggota LIKE ? OR Email LIKE ?";
         try (PreparedStatement st = conn.prepareStatement(sql)) {
             st.setString(1, "%" + katakunci + "%");
             st.setString(2, "%" + katakunci + "%");
             ResultSet rs = st.executeQuery();
             
             while (rs.next()) {
                 String idAnggota        = rs.getString("ID_Anggota");
                 String namaAnggota      = rs.getString("Nama_Anggota");
                 String emailAnggota     = rs.getString("Email");
                 String telponAnggota    = rs.getString("Telpon");
                 String jenisKelamin     = rs.getString("Jenis_Kelamin");
                 String tanggalBergabung = rs.getString("Tanggal_Bergabung");
                 
                 Object[] rowData = {idAnggota,namaAnggota,emailAnggota,telponAnggota,jenisKelamin,tanggalBergabung};
                 model.addRow(rowData);
             }
         }catch (Exception e){
         }
        }catch (Exception e){
            Logger.getLogger(menuAnggota.class.getName()).log(Level.SEVERE,null,e);
       }
    }

        
    }
