package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mendoza Soledispa Wesner
 */
public class Tabla_Notas extends AbstractTableModel{
    private final String[] columnNames = {"Cédula", "Apellido", "Nombre", "Materia", "Parcial1","Parcial2","Promedio","Estado"};
    private List<DatosEstudiantes> datosE;
    
    public Tabla_Notas(List<DatosEstudiantes> datosE) {
        this.datosE = datosE;
    }
    
    @Override
    public int getRowCount() {
        return datosE.size();
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
        DatosEstudiantes Destudiante = datosE.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return Destudiante.getCedula();
            case 1:
                return Destudiante.getApellido();
            case 2:
                return Destudiante.getNombre();
            case 3:
                return Destudiante.getmateria();
            case 4:
                return Destudiante.getParcial1();
            case 5:
                return Destudiante.getParcial2();
            case 6:
                return Destudiante.getPromedio();
            case 7:
                return Destudiante.getEstado();
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
            case 7:
                return String.class;
            case 4:
            case 5:
            case 6:
                return Float.class;
            default:
                return Object.class;
        }
    }
    public void addnotasEstudiantes(DatosEstudiantes NotasE) {
        datosE.add(NotasE);
        fireTableRowsInserted(datosE.size() - 1, datosE.size() - 1);
    }
}
