
package Vistas;


public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumnos = new javax.swing.JMenu();
        jMenuItemAlu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemFormMaterias = new javax.swing.JMenuItem();
        jMenuInscripciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuAlumnosXmateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jMenuAlumnos.setText("Alumno");

        jMenuItemAlu.setText("Formulario de Alumnos");
        jMenuItemAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAluActionPerformed(evt);
            }
        });
        jMenuAlumnos.add(jMenuItemAlu);

        jMenuBar1.add(jMenuAlumnos);

        jMenu2.setText("Materia");

        jMenuItemFormMaterias.setText("Formulario de Materias");
        jMenuItemFormMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemFormMaterias);

        jMenuBar1.add(jMenu2);

        jMenuInscripciones.setText("Administracion");

        jMenuItem1.setText("Manejo de Inscripciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuInscripciones.add(jMenuItem1);

        jMenuNotas.setText("Manipulacion de Notas");
        jMenuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNotasActionPerformed(evt);
            }
        });
        jMenuInscripciones.add(jMenuNotas);

        jMenuBar1.add(jMenuInscripciones);

        jMenu4.setText("Consultas");

        jMenuAlumnosXmateria.setText("Alumnos por materia");
        jMenuAlumnosXmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlumnosXmateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuAlumnosXmateria);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemSalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripcion iv=new VistaInscripcion();
        iv.setVisible(true);
        escritorio.add(iv);
        escritorio.moveToFront(iv);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaCargaNotas vcn=new VistaCargaNotas();
        vcn.setVisible(true);
        escritorio.add(vcn);
        escritorio.moveToFront(vcn);
    }//GEN-LAST:event_jMenuNotasActionPerformed

    private void jMenuItemAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAluActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnos va=new VistaAlumnos();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
        
    }//GEN-LAST:event_jMenuItemAluActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemFormMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaMaterias vm=new VistaMaterias();
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
    }//GEN-LAST:event_jMenuItemFormMateriasActionPerformed

    private void jMenuAlumnosXmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlumnosXmateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnosMaterias vam=new VistaAlumnosMaterias();
        vam.setVisible(true);
        escritorio.add(vam);
        escritorio.moveToFront(vam);
    }//GEN-LAST:event_jMenuAlumnosXmateriaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuAlumnos;
    private javax.swing.JMenuItem jMenuAlumnosXmateria;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInscripciones;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAlu;
    private javax.swing.JMenuItem jMenuItemFormMaterias;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuNotas;
    // End of variables declaration//GEN-END:variables
}
