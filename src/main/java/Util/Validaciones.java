package Util;

/**
 *
 * @author Axell Castro
 */
public class Validaciones {

    private static boolean validarEmpty(String param) {
        return (param == null || param.isEmpty());
    }

    public String validarMateria(String nombre, String creditos, String profesor, String descripcion) {
        if (validarEmpty(nombre)
                || validarEmpty(creditos)
                || validarEmpty(profesor)
                || validarEmpty(descripcion)) {
            return "Campos vacíos";
        }

        String nombreError = validarString("Nombre", nombre);
        if (!nombreError.isEmpty()) {
            return nombreError;
        }

        String creditosError = validarInt("Creditos", creditos);
        if (!creditosError.isEmpty()) {
            return creditosError;
        }

        String profesorError = validarString("Profesor", profesor);
        if (!profesorError.isEmpty()) {
            return profesorError;
        }

        return "";
    }

    public String validarString(String campo, String param) {
        return param.matches("[a-zA-ZÀ-ÿ\\s]*") ? "" : campo + ": Solo permite letras.";
    }

    public String validarInt(String campo, String param) {
        return param.matches("\\d+") ? "" : campo + ": Solo permite números.";
    }

}
