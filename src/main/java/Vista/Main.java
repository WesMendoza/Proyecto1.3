package Vista;

import Control.NotasparaEstudiantes;
import Model.DatosEstudiantes;
import java.util.List;

/**
 *
 * @author Wesner Mendoza
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Crear una instancia de la ventana principal (Main)
        Main mainFrame = new Main();
        // Hacer visible la ventana principal
        mainFrame.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttMateria = new javax.swing.JButton();
        bttEstudiantes = new javax.swing.JButton();
        bttNotas = new javax.swing.JButton();
        bttMostrar = new javax.swing.JButton();
        bttSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion-Academica-Grupo#1");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grupo # 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion Academica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        bttMateria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttMateria.setText("Materia");
        bttMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttMateriaActionPerformed(evt);
            }
        });

        bttEstudiantes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttEstudiantes.setText("Estudiantes");
        bttEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEstudiantesActionPerformed(evt);
            }
        });

        bttNotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttNotas.setText("Notas");
        bttNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNotasActionPerformed(evt);
            }
        });

        bttMostrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttMostrar.setText("Mostrar");
        bttMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttMostrarActionPerformed(evt);
            }
        });

        bttSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttSalir.setText("Salir");
        bttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(bttMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(bttEstudiantes)
                .addGap(18, 18, 18)
                .addComponent(bttNotas)
                .addGap(18, 18, 18)
                .addComponent(bttMostrar)
                .addGap(44, 44, 44)
                .addComponent(bttSalir)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttMateria)
                    .addComponent(bttEstudiantes)
                    .addComponent(bttNotas)
                    .addComponent(bttMostrar)
                    .addComponent(bttSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEstudiantesActionPerformed
        // TODO add your handling code here:
        Estudiante abrirEstudiantes= new Estudiante();
        abrirEstudiantes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttEstudiantesActionPerformed

    private void bttMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttMateriaActionPerformed
        // TODO add your handling code here:
        MateriaVista abrirMaterias= new MateriaVista(this, true);
        abrirMaterias.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttMateriaActionPerformed

    private void bttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bttSalirActionPerformed

    private void bttNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNotasActionPerformed
        // TODO add your handling code here:
        NotasEstudiantes abrirNotas= new NotasEstudiantes();
        abrirNotas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttNotasActionPerformed

    private void bttMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttMostrarActionPerformed
       List<DatosEstudiantes> listaEstudiantes = NotasparaEstudiantes.getDestudiantes();

        Mostrar abrirMostrar= new Mostrar(listaEstudiantes);
        abrirMostrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bttMostrarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttEstudiantes;
    private javax.swing.JButton bttMateria;
    private javax.swing.JButton bttMostrar;
    private javax.swing.JButton bttNotas;
    private javax.swing.JButton bttSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
