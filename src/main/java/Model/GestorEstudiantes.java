package Model;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.List;

/**
 *
 * @author Mendoza Wesner
 */
public class GestorEstudiantes {
    // Método para buscar un estudiante por cédula y llenar los campos de texto correspondientes
    public static boolean buscarEstudiante(List<Estudiantes> estudiantes, String cedula,
                                           JTextField txtNombre, JTextField txtApellido,
                                           JTextField txtCarrera, JTextField txtSemestre) {
        boolean encontrado = false;
        
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                txtNombre.setText(estudiante.getNombre());
                txtApellido.setText(estudiante.getApellido());
                txtCarrera.setText(estudiante.getCarrera());
                txtSemestre.setText(String.valueOf(estudiante.getSemestre()));
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No existe la cédula. Vuelva a intentar.",
                                          "Error", JOptionPane.ERROR_MESSAGE);
            limpiarCampos(txtNombre, txtApellido, txtCarrera, txtSemestre);
        }
   
        return encontrado;
    }
    // Método para limpiar los campos de texto
    public static void limpiarCampos(JTextField txtNombre, JTextField txtApellido,
                                     JTextField txtCarrera, JTextField txtSemestre) {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCarrera.setText("");
        txtSemestre.setText("");
    }
}
