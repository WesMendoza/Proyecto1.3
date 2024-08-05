package Model;

import Control.DatosEstudiante;
import java.util.List;

/**
 *
 * @author Mendoza Soledispa Wesner Daniel
 */
public class BuscarEstudiantes {
     private List<Estudiantes> estudiantes;
/**
 *Este metodo busca estudiantes registrado y carga los datos
 * 
 */
    public BuscarEstudiantes() {
        this.estudiantes = DatosEstudiante.getEstudiantes(); // Cargar datos al inicio
    }

    public Estudiantes buscarEstudiantePorCedula(String cedula) {
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null; // Retorna null si no se encuentra el estudiante
    }
}
