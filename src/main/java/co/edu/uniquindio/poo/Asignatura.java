package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

public class Asignatura {
    /**
     * nombre de la asignatura
     */
    private String nombre;

    /**
     * codigo de la asignatura
     */
    private String codigo;

    /**
     * indica la capacidad maxima de estudiantes
     */
    private int capacidad;

    /**
     * indica el estado de apertura de la asignatura
     */
    private boolean apertura;

    /**
     * indica si la asignatura es habilitable
     */
    private boolean esHabilitable;

    /**
     * docente asignado
     */
    private Docente docente;

    /**
     * estudiantes inscriptos
     */
    private Collection<Estudiante> estudiantes;

    /**
     * calificaciones de los estudiantes
     */
    private HashSet calificaciones;

    /**
     * crea una nueva asignatura/materia
     * 
     * @param nombre nombre de la asignatura
     * @param codigo codigo de la asignatura
     * @param capacidad capacidad maxima de estudiantes
     * @param apertura estado de apertura
     * @param esHabilitable indicador para habilitacion
     */
    public Asignatura(String nombre, String codigo, int capacidad, boolean apertura, boolean esHabilitable) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.apertura = apertura;
        this.esHabilitable = esHabilitable;
        this.estudiantes = new ArrayList<>();
    }

    /**
     * crea una nueva asignatura con el estado de habilitacion en true
     * @param nombre nombre de la asignatura
     * @param codigo codigo de la asignatura
     * @param capacidad capacidad maxima de estudiantes
     * @param apertura estado de apertura
     * @return nueva Asignatura
     */
    public static Asignatura nuevaHabilitable(String nombre, String codigo, int capacidad, boolean apertura) {
        return new Asignatura(nombre, codigo, capacidad, apertura, true);
    }

    /**
     * obtiene el nombre de la asignatura
     * @return nombre de la asignatura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * obtiene el codigo de la asignatura
     * @return codigo de la asignatura
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * obtiene la capacidad maxima de estudiante
     * @return numero maximo de estudiantes
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * obtiene el estado de apertura
     * @return estado de apertura
     */
    public boolean isApertura() {
        return apertura;
    }

    /**
     * comprueba si la asignatura es habilitable
     * @return indicador de habilitacion
     */
    public boolean isHabilitable() {
        return esHabilitable;
    }

    /**
     * obtiene el docente de la asignatura
     * @return docente asignado
     */
    public Optional<Docente> getDocente() {
        return Optional.ofNullable(docente);
    }

    /**
     * obtiene los estudiantes actualmente inscriptos
     * @return estudiantes inscriptos
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
