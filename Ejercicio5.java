package Ejercicio5;

import javax.swing.*;
import java.time.LocalDate;

public class Ejercicio5 {
    public static void main(String[] args) {
       String nombre= JOptionPane.showInputDialog("Ingrese el nombre del empleado");
       String apellido=JOptionPane.showInputDialog("Ingrese el apellido del empleado");
       int cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula"));
       String genero=JOptionPane.showInputDialog("Escriba su genero");
       float salario=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cual es el salario: "));
        LocalDate fechaNacimiento=LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de su nacimiento: aaaa-mm-dd"));
        LocalDate fechaIngreso=LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de ingreso: aaaa-mm-dd"));

        Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);
        empleado.mostrarInformacion();

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea modificar el salario?");
        if (opcion == JOptionPane.YES_OPTION) {
            float nuevoSalario = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo salario: "));
            empleado.modificarSalario(nuevoSalario);
        }

        // Mostrar la información actualizada
        empleado.mostrarInformacion();



    }
}
