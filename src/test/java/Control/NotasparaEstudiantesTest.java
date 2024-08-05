/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Control;

import Model.DatosEstudiantes;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wesner Daniel Mendoza Soledispa
 */
public class NotasparaEstudiantesTest {

    @Before
    public void setUp() {
        // Limpia la lista de estudiantes antes de cada prueba
        NotasparaEstudiantes.clearDestudiantes();
    }

    @After
    public void tearDown() {
        // Limpia la lista de estudiantes después de cada prueba
        NotasparaEstudiantes.clearDestudiantes();
    }

    @Test
    public void testAdd() {
        System.out.println("Registrar notas");
        DatosEstudiantes estudiante = new DatosEstudiantes(
                "0941687907",
                "wesner",
                "mendoza",
                "matematica",
                10.0f,
                10.0f,
                10.0f,
                "aprobado"
        );
        NotasparaEstudiantes.add(estudiante);
        // Verificar que el estudiante se haya agregado correctamente
        List<DatosEstudiantes> estudiantes = NotasparaEstudiantes.getDestudiantes();
        assertTrue(estudiantes.contains(estudiante));
    }

    @Test
    public void testGetDestudiantes() {
        System.out.println("getDestudiantes");
        List<DatosEstudiantes> expResult = List.of();
        List<DatosEstudiantes> result = NotasparaEstudiantes.getDestudiantes();
        assertEquals(expResult, result);
        
        // Agregar un estudiante y verificar que la lista no esté vacía
        DatosEstudiantes estudiante = new DatosEstudiantes(
                "0941687907",
                "wesner",
                "mendoza",
                "matematica",
                10.0f,
                10.0f,
                10.0f,
                "aprobado"
        );
        NotasparaEstudiantes.add(estudiante);
        result = NotasparaEstudiantes.getDestudiantes();
        assertFalse(result.isEmpty());
        assertEquals(1, result.size()); // Verifica que solo hay un estudiante en la lista
        assertTrue(result.contains(estudiante)); // Verifica que el estudiante agregado está en la lista
    }
}
