package Model;

/**
 *
 * @author Axell Castro
 */
public class Materia {

    private int id;
    private String nombre;
    private int creditos;
    private String profesor;
    private String descripcion;

    public Materia() {
    }

    public Materia(String nombre, int creditos, String profesor, String descripcion) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.descripcion = descripcion;
    }

    public Materia(int id, String nombre, int creditos, String profesor, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public String getProfesor() { return profesor; }
    public void setProfesor(String profesor) { this.profesor = profesor; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
       
}
