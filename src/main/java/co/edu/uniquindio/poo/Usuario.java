package co.edu.uniquindio.poo;

public class Usuario {
    /**
     * nombre de usuario
     */
    private String nombre;

    /**
     * apellido del usuario
     */
    private String apellido;

    /**
     * numero de identificacion
     */
    private String identificacion;

    /**
     * crear un usuario
     * 
     * @param identificacion numero de identificacion
     * @param nombre nombre del usuario
     * @param apellido apellido del usuario
     */
    public Usuario(String identificacion, String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    /**
     * obtiene el nombre completo del usuario
     * @return nombre y apellido
     */
    public String nombreCompleto() {
        return nombre + ' ' + apellido;
    }

    /**
     * obtiene el nombre del usuario
     * @return nombre del usuario
     */
    public String nombre() {
        return nombre;
    }

    /**
     * obtiene el apellido del usuario
     * @return apellido de usuario
     */
    public String apellido() {
        return apellido;
    }

    /**
     * obtiene el numero de identificacion del usuario
     * @return numero de identificacion
     */
    public String identificacion() {
        return identificacion;
    }
}