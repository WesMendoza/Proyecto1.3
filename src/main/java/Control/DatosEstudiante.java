/**
 *@author Perez Franco Jonathan
 */
package Control;
import Model.Estudiantes;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jonat
 */
public class DatosEstudiante{
      private static List<Estudiantes> estudiantes = new ArrayList<>();

    public static void add(Estudiantes estudiante) {
        estudiantes.add(estudiante);
    }

    public static List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }
    public static void clearEstudiantes() {
        estudiantes.clear();
    }
    public static void setEstudiantes(List<Estudiantes> estudiantes) {
        DatosEstudiante.estudiantes = estudiantes;
    }
}
