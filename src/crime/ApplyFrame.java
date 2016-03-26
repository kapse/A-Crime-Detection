/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crime;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author seabirds
 */
public class ApplyFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ApplyFrame
     */
    ClientFrame cf;

    public ApplyFrame(ClientFrame ce) {
        super("Apply", false, true, false, true);
        cf = ce;
        initComponents();
        try {
            loadCombo();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        dd = new javax.swing.JComboBox();
        mm = new javax.swing.JComboBox();
        yy = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(253, 245, 252));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        jLabel2.setText("Identity Crime Detection");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jLabel4.setText("Date of Birth");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jLabel6.setText("Phone No.");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jLabel8.setText("Unit No");

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        mm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmMouseClicked(evt);
            }
        });
        mm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mmItemStateChanged(evt);
            }
        });

        jLabel7.setText("yyyy-mm-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jTextField1)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(yy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField4, jTextField5, jTextField6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
//        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String fn = jTextField1.getText().trim();
            String ln = jTextField2.getText().trim();
            String db = dd.getSelectedItem().toString() + "-" + mm.getSelectedItem().toString() + "-" + yy.getSelectedItem().toString(); //jTextField3.getText().trim();
            String sn = jTextField4.getText().trim();
            String ph = jTextField5.getText().trim();
            String unit = jTextField6.getText().trim();

            Date dt = new Date();
            int d1 = dt.getDate();
            int m1 = dt.getMonth() + 1;
            int y1 = dt.getYear() + 1900;

            String g1 = d1 + "/" + m1 + "/" + y1;

            if (fn.equals("") || ln.equals("") || db.equals("") || sn.equals("") || ph.equals("")) {
                int year = Integer.parseInt(yy.getSelectedItem().toString());
                int month = Integer.parseInt(mm.getSelectedItem().toString());
                int date = Integer.parseInt(dd.getSelectedItem().toString());

                JOptionPane.showMessageDialog(this, "Enter all the Information");
            } else {
                DBConnection dbn = new DBConnection();
                Statement st = dbn.stt;
                ResultSet rs = st.executeQuery("select count(*) from Application");
                int rc = 0;
                if (rs.next()) {
                    rc = rs.getInt(1);
                }
                rc = rc + 1;
                st.executeUpdate("insert into Application values('" + rc + "','" + fn + "','" + ln + "','" + db + "','" + unit + "','" + sn + "','" + ph + "','" + g1 + "')");
                if (rc == 1) {
                    st.executeUpdate("insert into Status values('" + rc + "','Checked','Accepted')");
                } else {
                    st.executeUpdate("insert into Status values('" + rc + "','-','-')");
                }

                JOptionPane.showMessageDialog(this, "Application Received\nYour Id is " + rc);
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        try {
            if (!((Character.isDigit(character) || (character == KeyEvent.VK_BACK_SPACE)))) {
                getToolkit().beep();
                evt.consume();
            } else {
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        try {
            if (!((Character.isDigit(character) || (character == KeyEvent.VK_BACK_SPACE)))) {
                getToolkit().beep();
                evt.consume();
            } else {
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void mmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmMouseClicked
        // TODO add your handling code here:
//        String month = mm.getSelectedItem().toString();
//        String year = yy.getSelectedItem().toString();
//        if (month.equals("2")) {
//            for (int i = 1; i <= 28; i++) {
//                dd.addItem(i + "");
//            }
//        } else if (month.equals("2") && Integer.parseInt(year) % 4 == 0) {
//            for (int i = 1; i <= 29; i++) {
//                dd.addItem(i + "");
//            }
//        }
    }//GEN-LAST:event_mmMouseClicked

    private void mmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mmItemStateChanged
        // TODO add your handling code here:
        String month = mm.getSelectedItem().toString();
        String year = yy.getSelectedItem().toString();

        if (month.equals("2") && Integer.parseInt(year) % 4 == 0) {
            for (int i = 1; i <= 29; i++) {
                dd.addItem(i + "");
            }
        } else if (month.equals("2")) {
            for (int i = 1; i <= 28; i++) {
                dd.addItem(i + "");
            }
        } else {
            for (int i = 1; i <= 31; i++) {
                dd.addItem(i + "");
            }
        }
    }//GEN-LAST:event_mmItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox dd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JComboBox mm;
    private javax.swing.JComboBox yy;
    // End of variables declaration//GEN-END:variables

    private void loadCombo() {

        for (int i = 1900; i <= 2014; i++) {
            yy.addItem(i + "");
        }
        for (int i = 1; i <= 12; i++) {
            mm.addItem(i + "");
        }
        for (int i = 1; i <= 31; i++) {
            dd.addItem(i + "");
        }
    }

}
