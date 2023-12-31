/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author Wendell
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        pn_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pn_btnDashboard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pn_btnAnggota = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pn_btnBuku = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pn_btnKategori = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pn_btnPenerbit = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pn_btnPetugas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pn_btnPeminjaman = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pn_btnPengembalian = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pn_btnLogout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(922, 600));

        pn_kiri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/book-logo.png"))); // NOI18N
        jLabel1.setText("Library ");
        jLabel1.setIconTextGap(10);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("DATA");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("TRANSAKSI");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("TRANSAKSI");

        pn_btnDashboard.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnDashboard.setPreferredSize(new java.awt.Dimension(161, 32));
        pn_btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnDashboardMouseExited(evt);
            }
        });

        jLabel3.setText("Dashboard");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnDashboardLayout = new javax.swing.GroupLayout(pn_btnDashboard);
        pn_btnDashboard.setLayout(pn_btnDashboardLayout);
        pn_btnDashboardLayout.setHorizontalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        pn_btnDashboardLayout.setVerticalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(10, 10, 10))
        );

        pn_btnAnggota.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnAnggota.setPreferredSize(new java.awt.Dimension(173, 32));
        pn_btnAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnAnggotaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnAnggotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnAnggotaMouseExited(evt);
            }
        });

        jLabel4.setText("Anggota");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnAnggotaLayout = new javax.swing.GroupLayout(pn_btnAnggota);
        pn_btnAnggota.setLayout(pn_btnAnggotaLayout);
        pn_btnAnggotaLayout.setHorizontalGroup(
            pn_btnAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnAnggotaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        pn_btnAnggotaLayout.setVerticalGroup(
            pn_btnAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnAnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pn_btnBuku.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnBuku.setPreferredSize(new java.awt.Dimension(185, 32));
        pn_btnBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnBukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnBukuMouseExited(evt);
            }
        });

        jLabel5.setText("Buku");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnBukuLayout = new javax.swing.GroupLayout(pn_btnBuku);
        pn_btnBuku.setLayout(pn_btnBukuLayout);
        pn_btnBukuLayout.setHorizontalGroup(
            pn_btnBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnBukuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        pn_btnBukuLayout.setVerticalGroup(
            pn_btnBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pn_btnKategori.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnKategori.setPreferredSize(new java.awt.Dimension(185, 32));
        pn_btnKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnKategoriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnKategoriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnKategoriMouseExited(evt);
            }
        });

        jLabel6.setText("Kategori");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnKategoriLayout = new javax.swing.GroupLayout(pn_btnKategori);
        pn_btnKategori.setLayout(pn_btnKategoriLayout);
        pn_btnKategoriLayout.setHorizontalGroup(
            pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        pn_btnKategoriLayout.setVerticalGroup(
            pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pn_btnPenerbit.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnPenerbit.setPreferredSize(new java.awt.Dimension(185, 32));
        pn_btnPenerbit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnPenerbitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnPenerbitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnPenerbitMouseExited(evt);
            }
        });

        jLabel15.setText("Penerbit");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPenerbitLayout = new javax.swing.GroupLayout(pn_btnPenerbit);
        pn_btnPenerbit.setLayout(pn_btnPenerbitLayout);
        pn_btnPenerbitLayout.setHorizontalGroup(
            pn_btnPenerbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPenerbitLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        pn_btnPenerbitLayout.setVerticalGroup(
            pn_btnPenerbitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPenerbitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pn_btnPetugas.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnPetugasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnPetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnPetugasMouseExited(evt);
            }
        });

        jLabel16.setText("Petugas");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPetugasLayout = new javax.swing.GroupLayout(pn_btnPetugas);
        pn_btnPetugas.setLayout(pn_btnPetugasLayout);
        pn_btnPetugasLayout.setHorizontalGroup(
            pn_btnPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPetugasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel16)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        pn_btnPetugasLayout.setVerticalGroup(
            pn_btnPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPetugasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pn_btnPeminjaman.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnPeminjaman.setPreferredSize(new java.awt.Dimension(173, 32));
        pn_btnPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnPeminjamanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnPeminjamanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnPeminjamanMouseExited(evt);
            }
        });

        jLabel8.setText("Peminjaman");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPeminjamanLayout = new javax.swing.GroupLayout(pn_btnPeminjaman);
        pn_btnPeminjaman.setLayout(pn_btnPeminjamanLayout);
        pn_btnPeminjamanLayout.setHorizontalGroup(
            pn_btnPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPeminjamanLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        pn_btnPeminjamanLayout.setVerticalGroup(
            pn_btnPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pn_btnPengembalian.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnPengembalian.setPreferredSize(new java.awt.Dimension(173, 32));
        pn_btnPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnPengembalianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnPengembalianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnPengembalianMouseExited(evt);
            }
        });

        jLabel9.setText("Pengembalian");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPengembalianLayout = new javax.swing.GroupLayout(pn_btnPengembalian);
        pn_btnPengembalian.setLayout(pn_btnPengembalianLayout);
        pn_btnPengembalianLayout.setHorizontalGroup(
            pn_btnPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPengembalianLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        pn_btnPengembalianLayout.setVerticalGroup(
            pn_btnPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pn_btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        pn_btnLogout.setPreferredSize(new java.awt.Dimension(173, 32));
        pn_btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_btnLogoutMouseExited(evt);
            }
        });

        jLabel11.setText("Logout");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_btnLogoutLayout = new javax.swing.GroupLayout(pn_btnLogout);
        pn_btnLogout.setLayout(pn_btnLogoutLayout);
        pn_btnLogoutLayout.setHorizontalGroup(
            pn_btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLogoutLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        pn_btnLogoutLayout.setVerticalGroup(
            pn_btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_kiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(pn_btnPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(pn_btnPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addGroup(pn_kiriLayout.createSequentialGroup()
                                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pn_kiriLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_btnKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addGroup(pn_kiriLayout.createSequentialGroup()
                                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pn_btnPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(pn_btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(pn_btnAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(pn_btnBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(pn_btnPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_dasar.setBackground(new java.awt.Color(250, 250, 250));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 7137, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pn_btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnDashboardMouseEntered
        pn_btnDashboard.setBackground(new Color(250,250,250));
        
    }//GEN-LAST:event_pn_btnDashboardMouseEntered

    private void pn_btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnDashboardMouseExited
        pn_btnDashboard.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnDashboardMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        pn_btnDashboard.setBackground(new Color(250,250,250));
        
        pn_utama.removeAll();
        pn_utama.add(new menuDashboard());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void pn_btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnDashboardMouseClicked
        pn_btnDashboard.setBackground(new Color(250,250,250));
        
        pn_utama.removeAll();
        pn_utama.add(new menuDashboard());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_pn_btnDashboardMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        pn_btnAnggota.setBackground(new Color(250,250,250));
        
        pn_utama.removeAll();
        pn_utama.add(new menuAnggota());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void pn_btnAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnAnggotaMouseClicked
        pn_btnAnggota.setBackground(new Color(250,250,250));
        
        pn_utama.removeAll();
        pn_utama.add(new menuAnggota());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_pn_btnAnggotaMouseClicked

    private void pn_btnAnggotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnAnggotaMouseEntered
        pn_btnAnggota.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnAnggotaMouseEntered

    private void pn_btnAnggotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnAnggotaMouseExited
        pn_btnAnggota.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnAnggotaMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        pn_btnBuku.setBackground(new Color(250,250,250));

    }//GEN-LAST:event_jLabel5MouseClicked

    private void pn_btnBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnBukuMouseClicked
        pn_btnBuku.setBackground(new Color(250,250,250));
        
        pn_utama.removeAll();
        pn_utama.add(new menuBuku());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_pn_btnBukuMouseClicked

    private void pn_btnBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnBukuMouseEntered
        pn_btnBuku.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnBukuMouseEntered

    private void pn_btnBukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnBukuMouseExited
        pn_btnBuku.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnBukuMouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        pn_btnKategori.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void pn_btnKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnKategoriMouseClicked
        pn_btnKategori.setBackground(new Color(250,250,250));
        
        pn_utama.removeAll();
        pn_utama.add(new menuKategori());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_pn_btnKategoriMouseClicked

    private void pn_btnKategoriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnKategoriMouseEntered
        pn_btnKategori.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnKategoriMouseEntered

    private void pn_btnKategoriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnKategoriMouseExited
        pn_btnKategori.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnKategoriMouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        pn_btnPeminjaman.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jLabel8MouseClicked

    private void pn_btnPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPeminjamanMouseClicked
        pn_btnPeminjaman.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnPeminjamanMouseClicked

    private void pn_btnPeminjamanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPeminjamanMouseEntered
        pn_btnPeminjaman.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnPeminjamanMouseEntered

    private void pn_btnPeminjamanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPeminjamanMouseExited
        pn_btnPeminjaman.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnPeminjamanMouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        pn_btnPengembalian.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jLabel9MouseClicked

    private void pn_btnPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPengembalianMouseClicked
        pn_btnPengembalian.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnPengembalianMouseClicked

    private void pn_btnPengembalianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPengembalianMouseEntered
        pn_btnPengembalian.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnPengembalianMouseEntered

    private void pn_btnPengembalianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPengembalianMouseExited
        pn_btnPengembalian.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnPengembalianMouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        pn_btnLogout.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jLabel11MouseClicked

    private void pn_btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnLogoutMouseClicked
        pn_btnLogout.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnLogoutMouseClicked

    private void pn_btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnLogoutMouseEntered
        pn_btnLogout.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnLogoutMouseEntered

    private void pn_btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnLogoutMouseExited
        pn_btnLogout.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnLogoutMouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        pn_btnLogout.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_jLabel15MouseClicked

    private void pn_btnPenerbitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPenerbitMouseClicked
        pn_btnPenerbit.setBackground(new Color(250,250,250));
        

    }//GEN-LAST:event_pn_btnPenerbitMouseClicked

    private void pn_btnPenerbitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPenerbitMouseEntered
        pn_btnPenerbit.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnPenerbitMouseEntered

    private void pn_btnPenerbitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPenerbitMouseExited
        pn_btnPenerbit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnPenerbitMouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        pn_btnLogout.setBackground(new Color(250,250,250));
        
        pn_utama.removeAll();
        pn_utama.add(new menuPetugas());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void pn_btnPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPetugasMouseClicked
        pn_btnPetugas.setBackground(new Color(250,250,250));
        
        pn_utama.removeAll();
        pn_utama.add(new menuPetugas());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_pn_btnPetugasMouseClicked

    private void pn_btnPetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPetugasMouseEntered
        pn_btnPetugas.setBackground(new Color(250,250,250));
    }//GEN-LAST:event_pn_btnPetugasMouseEntered

    private void pn_btnPetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_btnPetugasMouseExited
        pn_btnPetugas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_pn_btnPetugasMouseExited

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pn_btnAnggota;
    private javax.swing.JPanel pn_btnAnggota6;
    private javax.swing.JPanel pn_btnAnggota7;
    private javax.swing.JPanel pn_btnAnggota8;
    private javax.swing.JPanel pn_btnBuku;
    private javax.swing.JPanel pn_btnDashboard;
    private javax.swing.JPanel pn_btnKategori;
    private javax.swing.JPanel pn_btnLogout;
    private javax.swing.JPanel pn_btnPeminjaman;
    private javax.swing.JPanel pn_btnPenerbit;
    private javax.swing.JPanel pn_btnPengembalian;
    private javax.swing.JPanel pn_btnPetugas;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}
