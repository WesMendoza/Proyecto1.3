package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Mendoza Soledispa Wesner
 */
public class DatosEstudiantes {
    private String cedula;
    private String nombre;
    private String apellido;
    private String materia;
    private Float parcial1;
    private Float parcial2; 
    private Float promedio;
    private String estado;

    public DatosEstudiantes (String cedula, String apellido, String nombre, String materia, float parcial1,float parcial2, float promedio,String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.promedio = promedio;
        this.estado = estado;
    }
     // Getters y setters
    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) { 
        this.apellido = apellido;
    }
    public String getmateria(){
        return materia;
    }
    public void setmateria(String materia) {
        this.materia = materia;
    }
    public float getParcial1() {
        return parcial1;
    }
    public void setParcial1(float Parcial1) {
        this.parcial1 = Parcial1;
    }
     public float getParcial2() {
        return parcial2;
    }
    public void setParcial2(float Parcial2) {
        this.parcial2 = Parcial2;
    }
    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float Promedio) {
        this.promedio = Promedio;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String Estado) {
        this.estado = Estado;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DatosEstudiantes that = (DatosEstudiantes) obj;
        return cedula.equals(that.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }

}
