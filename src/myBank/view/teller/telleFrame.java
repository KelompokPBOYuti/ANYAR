/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myBank.view.teller;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Fauzi
 */
public class telleFrame extends javax.swing.JFrame {
    kreditPanel kredit = new kreditPanel();
    debetPanel debet = new debetPanel();
    transferPanel transfer = new transferPanel();
    laporanTransaksiPanel laporan = new laporanTransaksiPanel();
    Border borderAktif = javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(255, 255, 255));
    
    /**
     * Creates new form telleFrame
     */
    public telleFrame() {
        initComponents();
        showPanel(laporan, "LAPORAN TRANSAKSI");
        resetBorderAktif();
        menuLaporan.setBorder(borderAktif);
        this.setLocationRelativeTo(null);
    }

    private void resetBorderAktif() {
        menuKredit.setBorder(null);
        menuDebet.setBorder(null);
        menuLaporan.setBorder(null);
        menuTransfer.setBorder(null);
    }

    private void showPanel(JPanel panel, String titleMenu) {
        contentPanel.removeAll();
        contentPanel.repaint();
        contentPanel.revalidate();
        contentPanel.add(panel);
        titleLabel.setText(titleMenu);
        contentPanel.repaint();
        contentPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        menuTransfer = new javax.swing.JPanel();
        transferLabel = new javax.swing.JLabel();
        menuKredit = new javax.swing.JPanel();
        kreditLabel = new javax.swing.JLabel();
        menuDebet = new javax.swing.JPanel();
        debetLabel = new javax.swing.JLabel();
        menuLaporan = new javax.swing.JPanel();
        laporanLabel = new javax.swing.JLabel();
        menuLogout = new javax.swing.JPanel();
        logOutLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(32, 103, 178));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(200, 465));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(32, 103, 178));
        jPanel7.setPreferredSize(new java.awt.Dimension(0, 150));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("nama teller");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myBank/resource/icon/user_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(32, 103, 178));
        jPanel8.setPreferredSize(new java.awt.Dimension(210, 200));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTransfer.setBackground(new java.awt.Color(32, 103, 178));
        menuTransfer.setPreferredSize(new java.awt.Dimension(200, 40));

        transferLabel.setBackground(new java.awt.Color(32, 103, 178));
        transferLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transferLabel.setForeground(new java.awt.Color(255, 255, 255));
        transferLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myBank/resource/icon/transferUang_30px.png"))); // NOI18N
        transferLabel.setText("TRANSFER");
        transferLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                transferLabelMouseMoved(evt);
            }
        });
        transferLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transferLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transferLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                transferLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout menuTransferLayout = new javax.swing.GroupLayout(menuTransfer);
        menuTransfer.setLayout(menuTransferLayout);
        menuTransferLayout.setHorizontalGroup(
            menuTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTransferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transferLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuTransferLayout.setVerticalGroup(
            menuTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transferLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel8.add(menuTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        menuKredit.setBackground(new java.awt.Color(32, 103, 178));
        menuKredit.setPreferredSize(new java.awt.Dimension(200, 40));

        kreditLabel.setBackground(new java.awt.Color(32, 103, 178));
        kreditLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kreditLabel.setForeground(new java.awt.Color(255, 255, 255));
        kreditLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kreditLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myBank/resource/icon/menabungUang_30px.png"))); // NOI18N
        kreditLabel.setText("KREDIT");
        kreditLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kreditLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                kreditLabelMouseMoved(evt);
            }
        });
        kreditLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kreditLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kreditLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kreditLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kreditLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout menuKreditLayout = new javax.swing.GroupLayout(menuKredit);
        menuKredit.setLayout(menuKreditLayout);
        menuKreditLayout.setHorizontalGroup(
            menuKreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuKreditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kreditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );
        menuKreditLayout.setVerticalGroup(
            menuKreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kreditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel8.add(menuKredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        menuDebet.setBackground(new java.awt.Color(32, 103, 178));
        menuDebet.setPreferredSize(new java.awt.Dimension(200, 40));

        debetLabel.setBackground(new java.awt.Color(32, 103, 178));
        debetLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        debetLabel.setForeground(new java.awt.Color(255, 255, 255));
        debetLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myBank/resource/icon/menarikUang_30px.png"))); // NOI18N
        debetLabel.setText("DEBET");
        debetLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        debetLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                debetLabelMouseMoved(evt);
            }
        });
        debetLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                debetLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                debetLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                debetLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                debetLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout menuDebetLayout = new javax.swing.GroupLayout(menuDebet);
        menuDebet.setLayout(menuDebetLayout);
        menuDebetLayout.setHorizontalGroup(
            menuDebetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuDebetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(debetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );
        menuDebetLayout.setVerticalGroup(
            menuDebetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(debetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel8.add(menuDebet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, -1));

        menuLaporan.setBackground(new java.awt.Color(32, 103, 178));
        menuLaporan.setPreferredSize(new java.awt.Dimension(200, 40));

        laporanLabel.setBackground(new java.awt.Color(32, 103, 178));
        laporanLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        laporanLabel.setForeground(new java.awt.Color(255, 255, 255));
        laporanLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myBank/resource/icon/laporanTransaksi_30px.png"))); // NOI18N
        laporanLabel.setText("LAPORAN");
        laporanLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laporanLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                laporanLabelMouseMoved(evt);
            }
        });
        laporanLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                laporanLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                laporanLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                laporanLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout menuLaporanLayout = new javax.swing.GroupLayout(menuLaporan);
        menuLaporan.setLayout(menuLaporanLayout);
        menuLaporanLayout.setHorizontalGroup(
            menuLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLaporanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(laporanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );
        menuLaporanLayout.setVerticalGroup(
            menuLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laporanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel8.add(menuLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        menuLogout.setBackground(new java.awt.Color(32, 103, 178));
        menuLogout.setPreferredSize(new java.awt.Dimension(200, 40));

        logOutLabel.setBackground(new java.awt.Color(32, 103, 178));
        logOutLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logOutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myBank/resource/icon/logOut_30px.png"))); // NOI18N
        logOutLabel.setText("LOG OUT");
        logOutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logOutLabelMouseMoved(evt);
            }
        });
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logOutLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logOutLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout menuLogoutLayout = new javax.swing.GroupLayout(menuLogout);
        menuLogout.setLayout(menuLogoutLayout);
        menuLogoutLayout.setHorizontalGroup(
            menuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );
        menuLogoutLayout.setVerticalGroup(
            menuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logOutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel8.add(menuLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, -1));

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(32, 103, 178));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 150));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Judul menu");
        titleLabel.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("jam / tangal");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel5.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contentPanel.setLayout(new java.awt.BorderLayout());
        jPanel5.add(contentPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(32, 103, 178));
        jPanel3.setPreferredSize(new java.awt.Dimension(5, 384));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(32, 103, 178));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 5));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(32, 103, 178));
        jPanel6.setPreferredSize(new java.awt.Dimension(5, 5));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kreditLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kreditLabelMouseMoved
        menuKredit.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_kreditLabelMouseMoved

    private void debetLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debetLabelMouseMoved
        menuDebet.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_debetLabelMouseMoved

    private void transferLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferLabelMouseMoved
        menuTransfer.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_transferLabelMouseMoved

    private void laporanLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanLabelMouseMoved
        menuLaporan.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_laporanLabelMouseMoved

    private void logOutLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseMoved
        menuLogout.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_logOutLabelMouseMoved

    private void kreditLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kreditLabelMouseExited
        menuKredit.setBackground(new Color(32, 103, 178));
    }//GEN-LAST:event_kreditLabelMouseExited

    private void debetLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debetLabelMouseExited
        menuDebet.setBackground(new Color(32, 103, 178));
    }//GEN-LAST:event_debetLabelMouseExited

    private void transferLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferLabelMouseExited
        menuTransfer.setBackground(new Color(32, 103, 178));
    }//GEN-LAST:event_transferLabelMouseExited

    private void laporanLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanLabelMouseExited
        menuLaporan.setBackground(new Color(32, 103, 178));
    }//GEN-LAST:event_laporanLabelMouseExited

    private void logOutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseExited
        menuLogout.setBackground(new Color(32, 103, 178));
    }//GEN-LAST:event_logOutLabelMouseExited

    private void kreditLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kreditLabelMousePressed
        menuKredit.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_kreditLabelMousePressed

    private void debetLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debetLabelMousePressed
        menuDebet.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_debetLabelMousePressed

    private void transferLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferLabelMousePressed
        menuTransfer.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_transferLabelMousePressed

    private void laporanLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanLabelMousePressed
        menuLaporan.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_laporanLabelMousePressed

    private void logOutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMousePressed
        menuLogout.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_logOutLabelMousePressed

    private void kreditLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kreditLabelMouseReleased
        menuKredit.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_kreditLabelMouseReleased

    private void debetLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debetLabelMouseReleased
        menuDebet.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_debetLabelMouseReleased

    private void transferLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferLabelMouseReleased
        menuTransfer.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_transferLabelMouseReleased

    private void laporanLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanLabelMouseReleased
        menuLaporan.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_laporanLabelMouseReleased

    private void logOutLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseReleased
        menuLogout.setBackground(new Color(35, 171, 226));
    }//GEN-LAST:event_logOutLabelMouseReleased

    private void kreditLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kreditLabelMouseClicked
        showPanel(kredit, "KREDIT");
        resetBorderAktif();
        menuKredit.setBorder(borderAktif);
    }//GEN-LAST:event_kreditLabelMouseClicked

    private void debetLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debetLabelMouseClicked
        showPanel(debet, "DEBET");
        resetBorderAktif();
        menuDebet.setBorder(borderAktif);
    }//GEN-LAST:event_debetLabelMouseClicked

    private void transferLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferLabelMouseClicked
        showPanel(transfer, "TRANSFER");
        resetBorderAktif();
        menuTransfer.setBorder(borderAktif);
    }//GEN-LAST:event_transferLabelMouseClicked

    private void laporanLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanLabelMouseClicked
        showPanel(laporan, "LAPORAN TRANSAKSI");
        resetBorderAktif();
        menuLaporan.setBorder(borderAktif);
    }//GEN-LAST:event_laporanLabelMouseClicked

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
            java.util.logging.Logger.getLogger(telleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel debetLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel kreditLabel;
    private javax.swing.JLabel laporanLabel;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JPanel menuDebet;
    private javax.swing.JPanel menuKredit;
    private javax.swing.JPanel menuLaporan;
    private javax.swing.JPanel menuLogout;
    private javax.swing.JPanel menuTransfer;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel transferLabel;
    // End of variables declaration//GEN-END:variables
}
