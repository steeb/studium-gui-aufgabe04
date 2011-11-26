/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIAufgabe04.java
 *
 * Created on 17.11.2011, 11:40:41
 */
package se.edu.gui.aufgabe04;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JTextField;

/**
 *
 * @author steeb
 */
public class GUIAufgabe04 extends javax.swing.JFrame {

    /** Creates new form GUIAufgabe04 */
    public GUIAufgabe04() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PanelPreisUmrechner = new javax.swing.JPanel();
        lblFlaschengroesse = new javax.swing.JLabel();
        lblFlaschenpreis = new javax.swing.JLabel();
        lblPreisProL = new javax.swing.JLabel();
        cbFlaschengroesse = new javax.swing.JComboBox();
        btnUmrechnenDown = new javax.swing.JButton();
        btnUmrechnenUp = new javax.swing.JButton();
        lblEuro0 = new javax.swing.JLabel();
        lblEuro1 = new javax.swing.JLabel();
        tfFlaschenpreis = new javax.swing.JTextField();
        tfPreisProL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPreisUmrechner.setLayout(new java.awt.GridBagLayout());

        lblFlaschengroesse.setText("Flaschengröße:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelPreisUmrechner.add(lblFlaschengroesse, gridBagConstraints);

        lblFlaschenpreis.setText("Flaschenpreis:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelPreisUmrechner.add(lblFlaschenpreis, gridBagConstraints);

        lblPreisProL.setText("Preis pro L:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelPreisUmrechner.add(lblPreisProL, gridBagConstraints);

        cbFlaschengroesse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0,187l", "0,25l", "0,375l", "0,5l", "0,62l", "0,75l", "0,8l", "1l", "1,5l" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelPreisUmrechner.add(cbFlaschengroesse, gridBagConstraints);

        btnUmrechnenDown.setText("↓");
        btnUmrechnenDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmrechnenDownActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelPreisUmrechner.add(btnUmrechnenDown, gridBagConstraints);

        btnUmrechnenUp.setText("↑");
        btnUmrechnenUp.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelPreisUmrechner.add(btnUmrechnenUp, gridBagConstraints);

        lblEuro0.setText("€");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        PanelPreisUmrechner.add(lblEuro0, gridBagConstraints);

        lblEuro1.setText("€");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        PanelPreisUmrechner.add(lblEuro1, gridBagConstraints);

        tfFlaschenpreis.setDocument(new PreisDocument());
        tfFlaschenpreis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfFlaschenpreis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldMarkAll(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelPreisUmrechner.add(tfFlaschenpreis, gridBagConstraints);

        tfPreisProL.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfPreisProL.setInputVerifier(new PreisVerifier());
        tfPreisProL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textfieldMarkAll(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PanelPreisUmrechner.add(tfPreisProL, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(PanelPreisUmrechner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(PanelPreisUmrechner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUmrechnenDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmrechnenDownActionPerformed
        NumberFormat nf = NumberFormat.getNumberInstance();
        double flaschenpreis;
        double flaschengroeße;
        try {
            flaschenpreis = nf.parse(tfFlaschenpreis.getText()).doubleValue();
            flaschengroeße = nf.parse(cbFlaschengroesse.getItemAt(cbFlaschengroesse.getSelectedIndex()).toString()).doubleValue();
            tfPreisProL.setText(new DecimalFormat("#.00").format(1 / flaschengroeße * flaschenpreis));
        } catch (ParseException ex) {
            //Logger.getLogger(GUIAufgabe04.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnUmrechnenDownActionPerformed

    private void textfieldMarkAll(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textfieldMarkAll
        ((JTextField)evt.getComponent()).selectAll();
    }//GEN-LAST:event_textfieldMarkAll

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GUIAufgabe04().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPreisUmrechner;
    private javax.swing.JButton btnUmrechnenDown;
    private javax.swing.JButton btnUmrechnenUp;
    private javax.swing.JComboBox cbFlaschengroesse;
    private javax.swing.JLabel lblEuro0;
    private javax.swing.JLabel lblEuro1;
    private javax.swing.JLabel lblFlaschengroesse;
    private javax.swing.JLabel lblFlaschenpreis;
    private javax.swing.JLabel lblPreisProL;
    private javax.swing.JTextField tfFlaschenpreis;
    private javax.swing.JTextField tfPreisProL;
    // End of variables declaration//GEN-END:variables
}
