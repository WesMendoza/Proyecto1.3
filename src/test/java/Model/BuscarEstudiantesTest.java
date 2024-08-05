package Model;

import Control.DatosEstudiante;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterEach;

/**
 *
 * @author WDMS
 */
public class BuscarEstudiantesTest {

    private BuscarEstudiantes buscarEstudiantes;
    private List<Estudiantes> mockEstudiantes;

    @BeforeEach
    public void setUp() {
        // Crear una lista de estudiantes de prueba
        mockEstudiantes = new ArrayList<>();
        mockEstudiantes.add(new Estudiantes("1234567890", "Juan", "Perez", "matematica", 10));
        mockEstudiantes.add(new Estudiantes("4567891230", "Ana", "Gomez", "matematica", 10));
        
        // Sobrescribir el método getEstudiantes para que retorne nuestra lista de prueba
        DatosEstudiante.setEstudiantes(mockEstudiantes);

        // Inicializar la clase a probar
        buscarEstudiantes = new BuscarEstudiantes();
    }

    @AfterEach
    public void tearDown() {
        // Puedes limpiar o reiniciar recursos aquí si es necesario
    }

    @Test
    public void testBuscarEstudiantePorCedulaNoExistente() {
        Estudiantes estudiante = buscarEstudiantes.buscarEstudiantePorCedula("000");
        assertNull(estudiante, "El estudiante no debería existir en la lista");
    }

    @Test
    public void testBuscarEstudiantePorCedulaEnListaVacia() {
        // Sobrescribir el método getEstudiantes para que retorne una lista vacía
        DatosEstudiante.setEstudiantes(new ArrayList<>());
        buscarEstudiantes = new BuscarEstudiantes();

        Estudiantes estudiante = buscarEstudiantes.buscarEstudiantePorCedula("123");
        assertNull(estudiante, "El estudiante no debería existir en una lista vacía");
    }

    @Test
    public void testBuscarEstudiantePorCedula() {
        String cedula = "1234567890";
        Estudiantes expResult = mockEstudiantes.get(0); // Estudiante con la cédula proporcionada
        Estudiantes result = buscarEstudiantes.buscarEstudiantePorCedula(cedula);
        assertEquals(expResult, result, "El estudiante encontrado debería coincidir con el esperado");
    }
}
