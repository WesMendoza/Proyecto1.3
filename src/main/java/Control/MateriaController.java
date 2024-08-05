package Control;

import Model.Materia;
import Util.Validaciones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Axell Castro
 */
public class MateriaController {

    private final List<Materia> materias;
    private final Validaciones validacion;

    public MateriaController() {
        this.materias = new ArrayList<>();
        this.validacion = new Validaciones();
        this.materias.add(new Materia(1, "Matemáticas", 4, "Profesor A", "Curso de Matemáticas Avanzadas"));
        this.materias.add(new Materia(2, "Historia", 5, "Profesor B", "Curso de Historia Universal"));
    }

    public List<Materia> getAllMaterias() {
        return materias;
    }

    public Materia getMateriaById(int id) {
        for (Materia materia : materias) {
            if (materia.getId() == id) {
                return materia;
            }
        }
        return null;
    }

    public String addMateria(String nombre, String creditos, String profesor, String descripcion) {
        String validationResult = validacion.validarMateria(nombre, creditos, profesor, descripcion);
        if (!validationResult.isEmpty()) {
            return validationResult;
        }

        int creditosInt = Integer.parseInt(creditos);

        Materia materia = new Materia(nombre, creditosInt, profesor, descripcion);
        materias.add(materia);
        return "Materia agregada exitosamente.";
    }

    public String updateMateria(int id, String nombre, String creditos, String profesor, String descripcion) {
        String validationResult = validacion.validarMateria(nombre, creditos, profesor, descripcion);
        if (!validationResult.isEmpty()) {
            return validationResult;
        }

        int creditosInt = Integer.parseInt(creditos);

        for (int i = 0; i < materias.size(); i++) {
            if (materias.get(i).getId() == id) {
                materias.set(i, new Materia(id, nombre, creditosInt, profesor, descripcion));
                return "Materia actualizada exitosamente.";
            }
        }
        return "Materia no encontrada.";
    }

    public String deleteMateria(int id) {
        for (int i = 0; i < materias.size(); i++) {
            if (materias.get(i).getId() == id) {
                materias.remove(i);
                return "Materia eliminada exitosamente.";
            }
        }
        return "Materia no encontrada.";
    }
public List<String> getMateriasNombres() {
    List<String> nombres = new ArrayList<>();
    for (Materia materia : materias) {
        nombres.add(materia.getNombre());
    }
    return nombres;
}
}
