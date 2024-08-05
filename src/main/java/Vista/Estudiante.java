package Vista;

import Model.Estudiantes;
import Model.Tabla_estudiante;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
import Control.DatosEstudiante;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *@author Perez Franco Jonathan Ruben
 */
public class Estudiante extends javax.swing.JFrame {
    private List<Estudiantes> estudiantes;
    private Tabla_estudiante modeloTabla;
     /**
     * Constructor
     */
    public Estudiante() {
     initComponents();
        estudiantes = DatosEstudiante.getEstudiantes();
        modeloTabla = new Tabla_estudiante(estudiantes);
        jtbEstudiantes.setModel(modeloTabla);
        btnActualizar.setVisible(false);
    } 
    /**
     * Método para agregar un nuevo estudiante
     */
    private void agregarEstudiante() {
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String carrera = (String) jcCarrera.getSelectedItem();
        int semestre = jcSemestre.getSelectedIndex() + 1;

        Estudiantes estudiante = new Estudiantes(cedula, nombre, apellido, carrera, semestre);
        modeloTabla.addEstudiante(estudiante);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bttRegresarestudiantes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jcCarrera = new javax.swing.JComboBox<>();
        jcSemestre = new javax.swing.JComboBox<>();
        bttRegistrarEstudiantes = new javax.swing.JButton();
        bttborrarEstudiante = new javax.swing.JButton();
        bttEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbEstudiantes = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estudiantes");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estudiantes");

        bttRegresarestudiantes.setText("Regresar");
        bttRegresarestudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRegresarestudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttRegresarestudiantes)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(bttRegresarestudiantes)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setText("Carrera:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel6.setText("Semestre:");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jcCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software", "TI", "Civil", " " }));

        jcSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ro", "2do", "3ro", "4to", "5to", "6to", "7to", "8vo", "9no", "10mo" }));
        jcSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSemestreActionPerformed(evt);
            }
        });

        bttRegistrarEstudiantes.setText("Registrar");
        bttRegistrarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttRegistrarEstudiantesActionPerformed(evt);
            }
        });

        bttborrarEstudiante.setText("Borrar");
        bttborrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttborrarEstudianteActionPerformed(evt);
            }
        });

        bttEditar.setText("Editar");
        bttEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEditarActionPerformed(evt);
            }
        });

        jtbEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Carrera", "Semestre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbEstudiantes);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 63, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttRegistrarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttborrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttRegistrarEstudiantes)
                            .addComponent(bttEditar)
                            .addComponent(bttborrarEstudiante)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void bttRegresarestudiantesActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
        Main regresar = new Main();
        regresar.setVisible(true);
        //this.setVisible(false);
        dispose();
    }                                                      

    private void jcSemestreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void bttRegistrarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {                                                        
       
       // Verificar si todos los campos están llenos
    if (txtCedula.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || jcCarrera.getSelectedIndex() == -1 || jcSemestre.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Registro de Estudiante", JOptionPane.INFORMATION_MESSAGE);
    } else {
        agregarEstudiante();
    }
    }                                             

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {                                   
         // Obtener el texto actual en el campo de la cédula
    String currentText = txtCedula.getText();

    // Obtener el carácter que se está ingresando
    char c = evt.getKeyChar();

    // Verificar si el carácter es un dígito y si la longitud actual es menor que 10
    if (!Character.isDigit(c) || currentText.length() >= 10) {
        // Si el carácter no es un dígito o la longitud excede 10, consumir el evento
        evt.consume();
    }
    }                                  

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {                                   
          // Obtener el texto actual en el campo de nombre
    String currentText = txtNombre.getText();

    // Verificar si la longitud actual es igual o mayor a 25
    if (currentText.length() >= 25) {
        // Si la longitud excede 25, consumir el evento para evitar que se escriba más
        evt.consume();
    }

    }                                  

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {                                     
           // Obtener el texto actual en el campo de apellido
    String currentText = txtApellido.getText();

    // Verificar si la longitud actual es igual o mayor a 25
    if (currentText.length() >= 25) {
        // Si la longitud excede 25, consumir el evento para evitar que se escriba más
        evt.consume();
    }

    }                                    

    private void bttEditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
             // Obtener el índice de la fila seleccionada en la tabla
    int selectedRow = jtbEstudiantes.getSelectedRow();

    // Verificar si hay una fila seleccionada
    if (selectedRow != -1) {
        // Obtener los datos de la fila seleccionada
        String cedula = (String) jtbEstudiantes.getValueAt(selectedRow, 0);
        String nombre = (String) jtbEstudiantes.getValueAt(selectedRow, 1);
        String apellido = (String) jtbEstudiantes.getValueAt(selectedRow, 2);
        String carrera = (String) jtbEstudiantes.getValueAt(selectedRow, 3);
        int semestre = (int) jtbEstudiantes.getValueAt(selectedRow, 4);

        // Llenar los campos de texto con los datos de la fila seleccionada
        txtCedula.setText(cedula);
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        jcCarrera.setSelectedItem(carrera);
        jcSemestre.setSelectedIndex(semestre - 1);

        // Desactivar el botón de registrar mientras se edita
        bttRegistrarEstudiantes.setEnabled(false);

        // Mostrar el botón de actualizar
        btnActualizar.setVisible(true);
    } else {
        // Si no hay una fila seleccionada, mostrar un mensaje al usuario
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para editar.", "Editar Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    }                                         

    private void bttborrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
         // Obtener el índice de la fila seleccionada en la tabla
    int selectedRow = jtbEstudiantes.getSelectedRow();

    // Verificar si hay una fila seleccionada
    if (selectedRow != -1) {
        // Mostrar un mensaje de confirmación
        int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas borrar este estudiante?", "Confirmar Borrado", JOptionPane.YES_NO_OPTION);
        
        // Verificar si el usuario confirmó el borrado
        if (option == JOptionPane.YES_OPTION) {
            // Obtener el estudiante correspondiente al índice seleccionado
            Estudiantes estudiante = DatosEstudiante.getEstudiantes().get(selectedRow);
            
            // Eliminar el estudiante de la lista
            DatosEstudiante.getEstudiantes().remove(estudiante);
            
            // Notificar al modelo de la tabla que el estudiante ha sido eliminado
            modeloTabla.fireTableRowsDeleted(selectedRow, selectedRow);
        }
    } else {
        // Si no hay una fila seleccionada, mostrar un mensaje al usuario
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un estudiante para borrar.", "Borrar Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }
    }                                                   

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
          // Obtener el índice de la fila seleccionada en la tabla
    int selectedRow = jtbEstudiantes.getSelectedRow();

    // Verificar si hay una fila seleccionada
    if (selectedRow != -1) {
        // Obtener los nuevos datos ingresados en los campos de texto
        String nuevaCedula = txtCedula.getText();
        String nuevoNombre = txtNombre.getText();
        String nuevoApellido = txtApellido.getText();
        String nuevaCarrera = (String) jcCarrera.getSelectedItem();
        int nuevoSemestre = jcSemestre.getSelectedIndex() + 1;

        // Obtener el estudiante correspondiente al índice seleccionado
        Estudiantes estudiante = DatosEstudiante.getEstudiantes().get(selectedRow);

        // Actualizar los datos del estudiante
        estudiante.setCedula(nuevaCedula);
        estudiante.setNombre(nuevoNombre);
        estudiante.setApellido(nuevoApellido);
        estudiante.setCarrera(nuevaCarrera);
        estudiante.setSemestre(nuevoSemestre);

        // Notificar al modelo de la tabla que los datos han sido actualizados
        modeloTabla.fireTableRowsUpdated(selectedRow, selectedRow);

        // Limpiar los campos de texto y seleccionar el botón de registrar
        limpiarCampos();
        bttRegistrarEstudiantes.setEnabled(true);

        // Ocultar el botón de actualizar
        btnActualizar.setVisible(false);
    } else {
        // Si no hay una fila seleccionada, mostrar un mensaje al usuario
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para actualizar.", "Actualizar Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }
    }                                             

    private void limpiarCampos() {
    txtCedula.setText("");
    txtNombre.setText("");
    txtApellido.setText("");
    jcCarrera.setSelectedIndex(0);
    jcSemestre.setSelectedIndex(0);
}

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton bttEditar;
    private javax.swing.JButton bttRegistrarEstudiantes;
    private javax.swing.JButton bttRegresarestudiantes;
    private javax.swing.JButton bttborrarEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCarrera;
    private javax.swing.JComboBox<String> jcSemestre;
    private javax.swing.JTable jtbEstudiantes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration                   
}
