
package View;

import Koneksi.Koneksi;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class FormLogin extends javax.swing.JFrame {
    private Connection conn;
   
    public FormLogin() {
        initComponents();
        conn = Koneksi.getConnection();
        setActionButton();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnKiri = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        pnKanan = new javax.swing.JPanel();
        BackgroundPic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        closeEye = new javax.swing.JLabel();
        OpenEye = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        lbPass = new javax.swing.JLabel();
        lbWelcome = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnKiri.setBackground(new java.awt.Color(240, 240, 240));
        pnKiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        pnKiri.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 110, 277, 30));

        pnKanan.setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Tak berjudul7_20231120063821.png"))); // NOI18N

        javax.swing.GroupLayout pnKananLayout = new javax.swing.GroupLayout(pnKanan);
        pnKanan.setLayout(pnKananLayout);
        pnKananLayout.setHorizontalGroup(
            pnKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKananLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackgroundPic)
                .addGap(20, 20, 20))
        );
        pnKananLayout.setVerticalGroup(
            pnKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKananLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackgroundPic)
                .addGap(20, 20, 20))
        );

        pnKiri.add(pnKanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/visible.png"))); // NOI18N
        pnKiri.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        lbUser.setText("Username");
        pnKiri.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, -1, -1));

        closeEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Close.png"))); // NOI18N
        pnKiri.add(closeEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        OpenEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/visible.png"))); // NOI18N
        OpenEye.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnKiri.add(OpenEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 20, 20));

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });
        pnKiri.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 172, 277, 30));

        lbPass.setText("Password");
        pnKiri.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, -1, -1));

        lbWelcome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbWelcome.setText("Welcome");
        pnKiri.add(lbWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 51, -1, -1));

        btnLogin.setText("LOGIN");
        btnLogin.setPreferredSize(new java.awt.Dimension(75, 30));
        pnKiri.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 230, 277, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnKiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed

    }//GEN-LAST:event_jPasswordKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundPic;
    private javax.swing.JLabel OpenEye;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel closeEye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JPanel pnKanan;
    private javax.swing.JPanel pnKiri;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void setActionButton() {
        OpenEye.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                OpenEye.setVisible(false);
                closeEye.setVisible(true);
                jPassword.setEchoChar((char)0);
    }
    });
         closeEye.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                closeEye.setVisible(false);
                OpenEye.setVisible(true);
                
                jPassword.setEchoChar('*'); 
            }
            });
            btnLogin.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    prosesLogin();
                }
            });
    
            jPassword.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    btnLogin.doClick();
                }

            }
        });
    
    }
    public String getMd5java(String message){
      String digest = null ; 
      try{
          MessageDigest md = MessageDigest.getInstance("MD5");
          byte[] hash = md.digest(message.getBytes("UTF-8"));
          
          StringBuilder sb = new StringBuilder(2 * hash.length);
            for(byte b : hash){
                sb.append(String.format("%02x", b & 0xff));
            }
            digest = sb.toString();
            
      }catch(Exception e){
          Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE,null, e);
      }
          return digest;   
    } 
    
    private boolean validasiInput(){
        boolean valid = false;
        if(txtUser.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Username Tidak Boleh Kosong");
        }else if(jPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Password Tidak Boleh Kosong");
        }else{
            valid = true;    
        }
        return valid;
    }
  
    private boolean checkLogin(String username, String password){
        if(conn !=null){
            try{
                String sql = "SELECT * FROM user WHERE Username=? AND Password=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, username);
                st.setString(2, password);
                
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    return true;
                }
                
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
      return false;  
    }
    
    private void prosesLogin(){
        if(validasiInput()){
            String username = txtUser.getText();
            String password = new String(jPassword.getPassword());
            String hashedPassword = getMd5java (password);
            
            if(checkLogin(username, hashedPassword)){
                Menu mn = new Menu();
                mn.setVisible(true);
                mn.revalidate();
                
                dispose();
            }else {
                JOptionPane.showMessageDialog(this, "Username dan Password Salah", 
                                              "Pesan",JOptionPane.INFORMATION_MESSAGE);
                
                
            }
            
        }
    }
}
