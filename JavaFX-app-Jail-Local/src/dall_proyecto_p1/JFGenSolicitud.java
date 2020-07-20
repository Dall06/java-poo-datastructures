package dall_proyecto_p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class JFGenSolicitud extends javax.swing.JFrame {
    JFInicio frmprinc;
    Solicitud objSolicitud = new Solicitud();
    String Texto = null;
    String Fecha = null;
    
    public JFGenSolicitud() 
    {
        initComponents();
        frmprinc.setLocationRelativeTo(null);
    }
    
    public JFGenSolicitud(Solicitud solicitud,JFInicio fr) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        frmprinc=fr;
        objSolicitud = solicitud;
        Fecha = JOptionPane.showInputDialog("Ingresa la fecha de hoy(DD/MM/AA)");
        GenerarSolicitud();
        System.out.print(Texto);
        txaSol.setText(Texto);
        
    }
    
    public void GenerarSolicitud()
    {
        Texto = "--INSITUTO DE INVESTIGACION EN CIENCIA Y MEDICINA--\n\n" + "SOLICITUD ELAVORADA\n" + "Fecha: " + Fecha +"\n******************\n\n" +
                "\n*********Detalles de solicitud*********\n" +
                "Tipo de solicitud: " + objSolicitud.getTipo() + "\n" +
                "Area que solicita el procedimiento: " + objSolicitud.getArea() + "\n" +
                "Fecha de la consulta: " + objSolicitud.getFecha() + "\n" +
                "Razón: " + objSolicitud.getDescripcion() +
                "\n\n*********Datos del paciente*********\n" +
                "Nombre: " + objSolicitud.getnPersona().getNombre() + "\n" +
                "Edad: " + objSolicitud.getnPersona().getEdad() + "\n" +
                "Fecha de nacimiento: " + objSolicitud.getnPersona().getFecha() + "\n" +
                "Tipo sanguineo: " + objSolicitud.getnPersona().getSangre() + "\n" +
                "Genero: " + objSolicitud.getnPersona().getGenero() + "\n" +
                "Contacto: " + objSolicitud.getnPersona().getTelefono();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSol = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardar.setBackground(new java.awt.Color(204, 204, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(0, 153, 0));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/checked.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txaSol.setColumns(20);
        txaSol.setRows(5);
        jScrollPane2.setViewportView(txaSol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String aux = null, texto = null;

        try
        {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();
            if(guarda != null)
            {
                FileWriter save = new FileWriter(guarda);
                save.write(txaSol.getText() + ".txt");
                save.close();
                JOptionPane.showMessageDialog(null, "\nArchivo Guardado","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex + ""
                + "\nNo se ha guardado el archivo","Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //new JFInicio(objSolicitud).setVisible(true);
        frmprinc.agregarTable(objSolicitud);
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JFGenSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGenSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGenSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGenSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGenSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaSol;
    // End of variables declaration//GEN-END:variables
}
