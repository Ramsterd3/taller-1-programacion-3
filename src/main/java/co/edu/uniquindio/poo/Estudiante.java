package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;

public class Estudiante extends Usuario {
    /**
     * fecha de nacimiento del estudiante
     */
    private LocalDate fechaNacimiento;

    /**
     * crea un nuevo estudiante
     * 
     * @param identificacion numero de identificacion
     * @param nombre nombre(s)
     * @param apellido apellido(s)
     * @param fechaNacimiento fecha de nacimiento
     */
    public Estudiante(String identificacion, String nombre, String apellido, LocalDate fechaNacimiento) {
        super(identificacion, nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * calcula la edad del estudiante
     * 
     * @return edad actual del estudiante
     */
    public int edad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}