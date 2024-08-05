/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WDMS
 */
public class DatosEstudiantesTest {
    
    public DatosEstudiantesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

 @Test
    public void testGettersAndSetters() {
        DatosEstudiantes estudiante = new DatosEstudiantes("0102030405", "Perez", "Juan", "Matematicas", 8.5f, 9.0f, 8.75f, "Aprobado");

        assertEquals("0102030405", estudiante.getCedula());
        assertEquals("Perez", estudiante.getApellido());
        assertEquals("Juan", estudiante.getNombre());
        assertEquals("Matematicas", estudiante.getmateria());
        assertEquals(8.5f, estudiante.getParcial1());
        assertEquals(9.0f, estudiante.getParcial2());
        assertEquals(8.75f, estudiante.getPromedio());
        assertEquals("Aprobado", estudiante.getEstado());

        estudiante.setApellido("Martinez");
        assertEquals("Martinez", estudiante.getApellido());
    }
    
}
