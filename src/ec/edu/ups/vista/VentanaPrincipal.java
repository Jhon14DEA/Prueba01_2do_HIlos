/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorGenerico;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Cuenta;
import ec.edu.ups.modelo.Proceso;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    static public ImageIcon icajero = new ImageIcon("src/imagen/cajero.png");
    static public ImageIcon ipersona = new ImageIcon("src/imagen/persona.png");
    static public ImageIcon salida = new ImageIcon("src/imagen/Exit.jpg");
    static public ImageIcon entrada = new ImageIcon("src/imagen/entry.png");
    private ControladorCliente controlador;
    private Proceso imagen;
    private Proceso imagen2;
    int ubicacion_x;
    int ubicacion_y;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.controlador = new ControladorCliente();
        this.imagen = new Proceso();
        this.imagen2 = new Proceso();
        //asignacion de personas para la interfaz
        p10.setIcon(ipersona);
        p9.setIcon(ipersona);
        p8.setIcon(ipersona);
        p7.setIcon(ipersona);
        p6.setIcon(ipersona);
        p5.setIcon(ipersona);
        p4.setIcon(ipersona);
        p3.setIcon(ipersona);
        p2.setIcon(ipersona);
        p1.setIcon(ipersona);
        //asignacion de cajeros para la interfaz
        c1.setIcon(icajero);
        c2.setIcon(icajero);
        c3.setIcon(icajero);
        //asiganacion para las indicaciones de donde sera la entrada y salida de cada persona
        entrad.setIcon(entrada);
        lblSalida.setIcon(salida);
        ubicacion_x = p10.getX();
        ubicacion_y = p10.getY();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        entrad = new javax.swing.JLabel();
        lblSalida = new javax.swing.JLabel();
        lblMP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        c1.setText(".");

        c2.setText(".");

        c3.setText(".");

        p9.setText(".");

        p8.setText(".");

        p7.setText(".");

        p6.setText(".");

        p5.setText(".");

        p4.setText(".");

        p3.setText(".");

        p2.setText(".");

        p1.setText(".");

        p10.setText(".");

        jButton1.setText("Iniciar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        entrad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblMP.setText("Mostras procesos");
        lblMP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));
        lblMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMPActionPerformed(evt);
            }
        });

        jLabel1.setText("Fila de personas");

        jLabel2.setText("Cajeros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(242, 242, 242))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblMP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(entrad, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1)
                    .addComponent(c2)
                    .addComponent(c3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p9)
                    .addComponent(p8)
                    .addComponent(p7)
                    .addComponent(p6)
                    .addComponent(p5)
                    .addComponent(p4)
                    .addComponent(p3)
                    .addComponent(p2)
                    .addComponent(p1)
                    .addComponent(p10))
                .addGap(60, 60, 60)
                .addComponent(entrad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMP)
                        .addGap(130, 130, 130))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);
        boolean[] cajeros = new boolean[3];
        imagen = new Proceso(14, p10, cajeros);
        imagen2 = new Proceso(5, p9, cajeros);
        Proceso imagen3 = new Proceso(6, p8, cajeros);
        Thread hilo2 = new Thread(imagen);
        Thread hilo3 = new Thread(imagen2);
        Thread hilo4 = new Thread(imagen3);
        hilo2.start();
        hilo3.start();
        hilo4.start();

        for (int i = 0; i < 100; i++) {
            Cuenta cuenta = new Cuenta(100);
            Cliente cliente = new Cliente(i, cuenta, 0);
            controlador.create(cliente);
        }
        controlador.getListaGenerica().stream().map(c -> {
            if (c.getId() < 40) {
                Cliente ingresa = new Cliente(c.getId(), c.getCuenta(), 100);
                Thread hilosIngresan100 = new Thread(ingresa);
                hilosIngresan100.start();
                controlador.update(ingresa);

            }
            return c;
        }).map(c -> {
            if (c.getId() > 39 && c.getId() < 60) {
                Cliente ingresa = new Cliente(c.getId(), c.getCuenta(), 50);
                Thread hilosIngresan50 = new Thread(ingresa);
                hilosIngresan50.start();
                controlador.update(ingresa);

            }
            return c;
        }).map(c -> {
            if (c.getId() > 59) {
                Cliente ingresa = new Cliente(c.getId(), c.getCuenta(), 20);
                Thread hilosIngresan20 = new Thread(ingresa);
                hilosIngresan20.start();
                controlador.update(ingresa);

            }
            return c;
        }).filter(c -> (c.getId() > 39 && c.getId() < 60)).map(
                c -> new Cliente(c.getId(), c.getCuenta(), 20)).map(
                        ingresa -> new Thread(ingresa)).map(hilosIngresan20 -> {
            hilosIngresan20.start();
            return hilosIngresan20;
        }).forEachOrdered(_item -> {
        });        
        controlador.getListaGenerica().stream().map(c -> {
            if (c.getId() < 40) {
                Cliente retirar = new Cliente(c.getId(), c.getCuenta(), -100);
                Thread hilosIngresan100 = new Thread(retirar);
                hilosIngresan100.start();
                controlador.update(retirar);

            }
            return c;
        }).map(c -> {
            if (c.getId() > 39 && c.getId() < 60) {
                Cliente retirar = new Cliente(c.getId(), c.getCuenta(), -50);
                Thread hilosIngresan50 = new Thread(retirar);
                hilosIngresan50.start();
                controlador.update(retirar);

            }
            return c;
        }).map(c -> {
            if (c.getId() > 59) {
                Cliente retirar = new Cliente(c.getId(), c.getCuenta(), -20);
                Thread hilosIngresan20 = new Thread(retirar);
                hilosIngresan20.start();
                controlador.update(retirar);

            }
            return c;
        }).filter(c -> (c.getId() > 39 && c.getId() < 60)).map(
                c -> new Cliente(c.getId(), c.getCuenta(), -20)).forEachOrdered(retirar -> {
            Thread hilosIngresan20 = new Thread(retirar);
            hilosIngresan20.start();
            controlador.update(retirar);
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMPActionPerformed
        vtnMostrarDatos datos = new vtnMostrarDatos(controlador.getListaGenerica());
        datos.setVisible(true);
    }//GEN-LAST:event_lblMPActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel entrad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lblMP;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
