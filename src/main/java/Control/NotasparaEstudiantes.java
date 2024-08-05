package Control;

import Model.DatosEstudiantes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mendoza Soledispa Wesner Daniel
 */
public class NotasparaEstudiantes {
    private static List<DatosEstudiantes> Destudiantes = new ArrayList<>();
/**
 *
 * parametros Destudiante.
 */
    public static void add(DatosEstudiantes Destudiante) {
        Destudiantes.add(Destudiante);
    }
/**
 *
 * @return.
 */
    public static List<DatosEstudiantes> getDestudiantes() {
        return Destudiantes;
    }
/**
 * metodo estatico para limpiar estudiantes.
 */
    public static void clearDestudiantes() {
        Destudiantes.clear();
    }
}
