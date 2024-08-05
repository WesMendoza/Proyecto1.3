package Model;

/**
 *
 * @author Perez Franco Jonathan Ruben
 */
public class Estudiantes {
    private String Cedula;
    private String Nombre;
    private String apellido;
    private String carrera;
    private int semestre;
    
    public Estudiantes(String cedula, String nombre, String apellido, String carrera, int semestre) {
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
     // Getters y setters
    public String getCedula() { 
        return Cedula; 
    }
    public void setCedula(String cedula) { 
        this.Cedula = cedula; 
    }
    public String getNombre() { 
        return Nombre; 
    }
    public void setNombre(String nombre) { 
        this.Nombre = nombre; 
    }
    public String getApellido() { 
        return apellido; 
    }
    public void setApellido(String apellido) { 
        this.apellido = apellido; 
    }
    public String getCarrera() { 
        return carrera; 
    }
    public void setCarrera(String carrera) { 
        this.carrera = carrera; 
    }
    public int getSemestre() { 
        return semestre; 
    }
    public void setSemestre(int semestre) { 
        this.semestre = semestre; 
    }
    
}

