/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Control;

import Model.Estudiantes;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jonat
 */
public class DatosEstudianteTest {
/**
     * Tear down method executed after each test method. This method is used to
     * perform any necessary cleanup operations after each test.
     */
    public DatosEstudianteTest() {
    }

    /**
     * Tear down method executed after each test method. This method is used to
     * perform any necessary cleanup operations after each test.
     */
    @BeforeAll
    public static void setUpClass() {
    }

    /**
     * Tear down method executed after each test method. This method is used to
     * perform any necessary cleanup operations after each test.
     */
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Tear down method executed after each test method. This method is used to
     * perform any necessary cleanup operations after each test.
     */
    @BeforeEach
    public final void setUp() {
        // Limpiar la lista de estudiantes antes de cada prueba
        DatosEstudiante.getEstudiantes().clear();
    }

    /**
     * Tear down method executed after each test method. This method is used to
     * perform any necessary cleanup operations after each test.
     */
    @AfterEach
    public void tearDown() {
        // No se requieren operaciones de limpieza adicionales
    }

    /**
     * Test del método add.
     * PEREZ FRANCO JONATHAN RUBEN
     */
    @Test
    public final void testAdd() {
        System.out.println("Registrar Estudiante");
        Estudiantes estudiante = new Estudiantes(
                "0941687907",
                "Jonathan",
                "Perez",
                "Software",
                1
        );
        DatosEstudiante.add(estudiante);

        // Verificar que el estudiante se haya agregado correctamente
        List<Estudiantes> estudiantes = DatosEstudiante.getEstudiantes();
        assertTrue(estudiantes.contains(estudiante));
    }

    /**
     * Test del método getEstudiantes.
     *PEREZ FRANCO JONATHAN RUBEN
     */
    @Test
    public final void testGetEstudiantes() {
        System.out.println("Verificar estudiante registrado");

        // Verificar que la lista de estudiantes esté vacía al principio
        List<Estudiantes> expResult = List.of(); // Lista vacía
        List<Estudiantes> result = DatosEstudiante.getEstudiantes();
        assertEquals(expResult, result);

        // Agregar un estudiante y verificar que la lista no esté vacía
        Estudiantes estudiante = new Estudiantes(
                "0941687907",
                "Jonathan",
                "Perez",
                "Software",
                1
        );
        DatosEstudiante.add(estudiante);
        result = DatosEstudiante.getEstudiantes();
        assertFalse(result.isEmpty());
    }
}