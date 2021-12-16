package etiquetas;

import Beans.bnCentroCosto;
import Beans.bnEtiquetas;
import Beans.bnEtiquetas2;
import Clases.clsEtiquetas;
import Clases.renderTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class frmBuscarCentroCosto extends javax.swing.JDialog {

    private String[] respuesta = new String[3];
    private DefaultTableModel miTabla;
    private ResultSet rs;
    private clsEtiquetas etiquetas = new clsEtiquetas();

    List<bnCentroCosto> datos = new ArrayList<bnCentroCosto>();

    public frmBuscarCentroCosto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        miTabla = (DefaultTableModel) tblTabla.getModel();
        tblTabla.setDefaultRenderer(Object.class, new renderTable());
        tblTabla.getTableHeader().setReorderingAllowed(false);

        tblTabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tblTabla.getColumnModel().getColumn(0).setMinWidth(0);
        tblTabla.getColumnModel().getColumn(0).setPreferredWidth(0);

        TableColumnModel columnModel = tblTabla.getColumnModel();
        columnModel.getColumn(1).setPreferredWidth(40);
        columnModel.getColumn(2).setPreferredWidth(430);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Centro de Costo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        tblTabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIPO UBICACION", "CODIGO UBICACION", "DEPENDENCIA"
            }
        ));
        tblTabla.setRowHeight(22);
        tblTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblTabla);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(txtBuscar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        llenarTabla();
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int count = 0;
        for (int i : tblTabla.getSelectedRows()) {
            respuesta[0] = tblTabla.getValueAt(i, 0).toString();
            respuesta[1] = tblTabla.getValueAt(i, 1).toString();
            respuesta[2] = tblTabla.getValueAt(i, 2).toString();
            count++;
        }
        if (count != 0) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una dependencia");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void llenarTabla() {
        rs = etiquetas.mostrarCentroCosto();
        datos.clear();
        limpiarTabla();
        try {
            while (rs.next()) {
                datos.add(new bnCentroCosto(rs.getString("TIPO_UBICAC"), rs.getString("COD_UBICAC"), rs.getString("UBICAC_FISICA")));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "mal");
            // Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (txtBuscar.getText().equals("")) {
            for (int i = 0; i < datos.size(); i++) {
                Object[] fila = new Object[3];
                fila[0] = datos.get(i).getTipoUbicac();
                fila[1] = datos.get(i).getCodUbicac();
                fila[2] = datos.get(i).getUbicacFISICA();

                miTabla.addRow(fila);
            }
            tblTabla.setModel(miTabla);
            return;
        }

        if (!txtBuscar.getText().equals("")) {
            for (int i = 0; i < datos.size(); i++) {
                if (datos.get(i).getUbicacFISICA().startsWith(txtBuscar.getText().toUpperCase())) {
                    Object[] fila = new Object[3];
                    fila[0] = datos.get(i).getTipoUbicac();
                    fila[1] = datos.get(i).getCodUbicac();
                    fila[2] = datos.get(i).getUbicacFISICA();
                    miTabla.addRow(fila);
                }
            }

            tblTabla.setModel(miTabla);
            return;
        }

    }

    public void limpiarTabla() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
            int filas = tblTabla.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[] getRespuesta() {
        return respuesta;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmBuscarCentroCosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarCentroCosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarCentroCosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarCentroCosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBuscarCentroCosto dialog = new frmBuscarCentroCosto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
