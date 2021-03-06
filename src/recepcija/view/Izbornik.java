/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recepcija.view;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;
import javax.swing.JOptionPane;
import recepcija.model.Operater;
import recepcija.model.Soba;

/**
 *
 * @author Petar
 */
public class Izbornik extends javax.swing.JFrame {

    private Operater operater;

    public Izbornik() {
        initComponents();

        this.operater = operater;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        DatePicker dp = new DatePicker();
        dp.setSize(jPanel2.getSize());
        jPanel2.add(dp);

        DatePicker dp2 = new DatePicker();
        dp2.setSize(jPanel1.getSize());
        jPanel1.add(dp2);

        DatePickerSettings dateSettings = new DatePickerSettings();

        dp.setLocale(new Locale("hr", "HR"));
        dp2.setLocale(new Locale("hr", "HR"));

        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRezerviraj = new javax.swing.JButton();
        btnTraži = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        btnIzlaz = new javax.swing.JButton();
        btnObrišiRez = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RecepcijaAPP");
        setMinimumSize(new java.awt.Dimension(836, 540));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recepcija/view/Hotel room.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 830, 240);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Datum prijave");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 260, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Datum odjave");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 260, 100, 20);

        btnRezerviraj.setText("Rezerviraj");
        btnRezerviraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRezervirajActionPerformed(evt);
            }
        });
        getContentPane().add(btnRezerviraj);
        btnRezerviraj.setBounds(620, 340, 140, 23);

        btnTraži.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTraži.setText("Pretraži sobe");
        btnTraži.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTražiActionPerformed(evt);
            }
        });
        getContentPane().add(btnTraži);
        btnTraži.setBounds(200, 300, 190, 30);

        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 340, 520, 130);

        btnIzlaz.setText("Izlaz");
        btnIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlazActionPerformed(evt);
            }
        });
        getContentPane().add(btnIzlaz);
        btnIzlaz.setBounds(620, 420, 140, 23);

        btnObrišiRez.setText("Obriši rezervaciju");
        btnObrišiRez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrišiRezActionPerformed(evt);
            }
        });
        getContentPane().add(btnObrišiRez);
        btnObrišiRez.setBounds(620, 380, 140, 23);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 250, 160, 40);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 250, 160, 40);

        jMenu1.setText("Sobe");

        jMenuItem1.setText("Dodaj nove sobe");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlazActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnIzlazActionPerformed

    private void btnRezervirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRezervirajActionPerformed
        Rezervacija r = new Rezervacija();
        r.setVisible(true);
    }//GEN-LAST:event_btnRezervirajActionPerformed

    private void btnObrišiRezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrišiRezActionPerformed

        Rezervacija r = lista.getSelectedValue();
        if (r == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }


    }//GEN-LAST:event_btnObrišiRezActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new DodajSobu().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnTražiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTražiActionPerformed

    }//GEN-LAST:event_btnTražiActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzlaz;
    private javax.swing.JButton btnObrišiRez;
    private javax.swing.JButton btnRezerviraj;
    private javax.swing.JButton btnTraži;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Rezervacija> lista;
    // End of variables declaration//GEN-END:variables

}
