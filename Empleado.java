package Ejercicio5;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    // Atributos del empleado
    private int cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private float salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    // Constructor de la clase Empleado
    public Empleado(int cedula, String nombre, String apellido, String genero, float salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        // Asignación de valores a los atributos mediante this
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    // Método para modificar salario
    public void modificarSalario(float nuevoSalario) {
        this.salario = nuevoSalario;  // Uso de this para referirse al atributo de clase
    }

    // Método para calcular la edad
    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        return Period.between(this.fechaNacimiento, hoy).getYears();  // Uso de this
    }

    // Método para calcular la antigüedad
    public int calcularAntiguedad() {
        LocalDate hoy = LocalDate.now();
        return Period.between(this.fechaIngreso, hoy).getYears();  // Uso de this
    }

    // Método para calcular las prestaciones
    public float calcularPrestaciones() {
        int antiguedad = this.calcularAntiguedad();  // Uso de this
        return (antiguedad * this.salario) / 12;  // Uso de this
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Cédula: " + this.cedula);
        System.out.println("Género: " + this.genero);
        System.out.println("Salario: " + this.salario);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
        System.out.println("Fecha de ingreso: " + this.fechaIngreso);
        System.out.println("Edad: " + this.calcularEdad());
        System.out.println("Antigüedad: " + this.calcularAntiguedad());
        System.out.println("Prestaciones: " + this.calcularPrestaciones());
    }
}
