package Model;

import Vista.Estudiante;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *@author Perez Franco Jonathan
 */
public class Tabla_estudiante extends AbstractTableModel {
     private final String[] columnNames = {"Cédula", "Nombre", "Apellido", "Carrera", "Semestre"};
    private List<Estudiantes> estudiantes;

    public Tabla_estudiante(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public int getRowCount() {
        return estudiantes.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estudiantes estudiante = estudiantes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return estudiante.getCedula();
            case 1:
                return estudiante.getNombre();
            case 2:
                return estudiante.getApellido();
            case 3:
                return estudiante.getCarrera();
            case 4:
                return estudiante.getSemestre();
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
            case 1:
            case 2:
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            default:
                return Object.class;
        }
    }

    public void addEstudiante(Estudiantes estudiante) {
        estudiantes.add(estudiante);
        fireTableRowsInserted(estudiantes.size() - 1, estudiantes.size() - 1);
    }
}
