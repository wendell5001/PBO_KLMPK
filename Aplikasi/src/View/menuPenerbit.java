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

public class menuPenerbit extends javax.swing.JPanel {
    private final Connection conn;
    
    public menuPenerbit() {
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
        txtSitus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(690, 526));
        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setPreferredSize(new java.awt.Dimension(690, 448));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Kategori", "Situs"
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
        jLabel2.setText("Data Penerbit Buku ");

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
        jLabel1.setText("Tambah Data Penerbit Buku Perpustakaan");

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

        txtSitus.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSitus.setMinimumSize(new java.awt.Dimension(64, 30));
        txtSitus.setPreferredSize(new java.awt.Dimension(71, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Situs ");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(txtSitus, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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
                .addComponent(txtSitus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
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
       
       txtID.setText(setIDPenerbit());
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.ButtonGroup rbJenisKelamin;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSitus;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
       getData((DefaultTableModel) tblData.getModel());
       btnDelete.setVisible(false);
       btnCancel.setVisible(false);
    }
            private void showPanel() {
                panelMain.removeAll();
                panelMain.add(new menuPenerbit());
                panelMain.repaint();
                panelMain.revalidate();
        
    }
    
        private void resetForm() {
            txtID.setText("");
            txtName.setText("");
            txtSitus.setText("");

        
    }

    private void getData(DefaultTableModel model) {
     model.setRowCount(0);
     
     try{
         String sql = "SELECT * FROM penerbit";
         try (PreparedStatement st = conn.prepareStatement(sql)) {
         ResultSet rs = st.executeQuery();
             while (rs.next()) {
                 String idPenerbit = rs.getString("ID_Penerbit");
                 String namaPenerbit = rs.getString("Nama_Penerbit");
                 String situsPenerbit = rs.getString("Situs_Penerbit");
                 
                 Object[] rowData = {idPenerbit,namaPenerbit,situsPenerbit};
                 model.addRow(rowData);
             }
         }catch (Exception e){
         }
        }catch (Exception e){
            Logger.getLogger(menuPenerbit.class.getName()).log(Level.SEVERE,null,e);
       }
    }
    private String setIDPenerbit(){
        String urutan = null ;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Penerbit, 3) AS Nomor " +
                     "FROM penerbit " +
                     "WHERE ID_Penerbit LIKE 'PBT"+ no + "%' " +
                     "ORDER BY ID_Penerbit DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)) {
                  ResultSet rs = st.executeQuery(); 
                  
             if(rs.next()) {
                 int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                 urutan = "PBT" + no + String.format("%03d", nomor);
            }else{
                 urutan = "PBT" + no + "001";
             }
        
        } catch (SQLException e){
           Logger.getLogger(menuPenerbit.class.getName()).log(Level.SEVERE, null,e);
        
        }
        return urutan;
    
    }
    
    public boolean validasiNama(){
        boolean valid = false;
        String idPenerbit = txtID.getText();
        String namaPenerbit = txtName.getText();
        
        String sql = "SELECT Nama_Penerbit From penerbit WHERE ID_Penerbit!='"+ idPenerbit +"' AND Nama_Penerbit LIKE BINARY '"+ namaPenerbit +"'";
        try(PreparedStatement st = conn.prepareStatement(sql)){
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Nama Penerbit Sudah Ada\nSilahkan Input Nama Penerbit Yang Berbeda", 
                        "Peringatan",JOptionPane.WARNING_MESSAGE);
            }else {
                valid = true;
            }
                    
        }catch (SQLException e){
          Logger.getLogger(menuPenerbit.class.getName()).log(Level.SEVERE, null,e);
            
        }
        return valid;
    }

    private void insertData() {
        String idPenerbit = txtID.getText();
        String namaPenerbit = txtName.getText();
        String situsPenerbit = txtSitus.getText();
       
        if(idPenerbit.isEmpty()|| namaPenerbit.isEmpty()||situsPenerbit.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!validasiNama()){
            return;
        }
        
        
        try {
        String sql = "INSERT INTO penerbit (ID_Penerbit, Nama_Penerbit, Situs_Penerbit) VALUES (?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idPenerbit);
            st.setString(2, namaPenerbit);
            st.setString(3, situsPenerbit);
           
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                resetForm();
                loadData();
                showPanel();
            
            } 
        }
    } catch (SQLException e) {
           java.util.logging.Logger.getLogger(menuPenerbit.class.getName()).log(Level.SEVERE, null,e);
    }
}

    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tblData.getSelectedRow();
        jLabel1.setText("Perbarui Data Penerbit Perpustakaan");
        
        txtID.setEnabled(false);

        
        txtID.setText(tblData.getValueAt(row, 0).toString());
        txtName.setText(tblData.getValueAt(row, 1).toString());
        txtSitus.setText(tblData.getValueAt(row, 2).toString());

    }
    
    private void updateData() {
        String idPenerbit = txtID.getText();
        String namaPenerbit = txtName.getText();
        String situsPenerbit = txtSitus.getText();
       
        if(idPenerbit.isEmpty()|| namaPenerbit.isEmpty()||situsPenerbit.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try {
        String sql = "UPDATE penerbit SET Nama_Penerbit=?, Situs_Penerbit=? WHERE ID_Penerbit=?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, namaPenerbit);
            st.setString(2, situsPenerbit);
            st.setString(3, idPenerbit);

            int rowsUpdated = st.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetForm();
                loadData();
                showPanel();
            } 
        }
    } catch (SQLException e) {
           java.util.logging.Logger.getLogger(menuPenerbit.class.getName()).log(Level.SEVERE, null,e);
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
                String sql = "DELETE FROM penerbit WHERE ID_Penerbit=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
            st.setString(1, id);
                
                int rowDeleted = st.executeUpdate();
                if (rowDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                
            } 
           }
        }catch (SQLException e) {
           java.util.logging.Logger.getLogger(menuPenerbit.class.getName()).log(Level.SEVERE, null,e);
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
         String sql = "SELECT * FROM penerbit WHERE Nama_Penerbit LIKE ? OR Situs_Penerbit LIKE ?";
         try (PreparedStatement st = conn.prepareStatement(sql)) {
             st.setString(1, "%" + katakunci + "%");
             st.setString(2, "%" + katakunci + "%");
             ResultSet rs = st.executeQuery();
             
             while (rs.next()) {
                 String idPenerbit        = rs.getString("ID_Penerbit");
                 String namaPenerbit      = rs.getString("Nama_Penerbit");
                 String situsPenerbit     = rs.getString("Situs_Penerbit");
                
                 
                 Object[] rowData = {idPenerbit,namaPenerbit,situsPenerbit};
                 model.addRow(rowData);
             }
         }catch (Exception e){
         }
        }catch (Exception e){
            Logger.getLogger(menuPenerbit.class.getName()).log(Level.SEVERE,null,e);
       }
    }

        
    }
