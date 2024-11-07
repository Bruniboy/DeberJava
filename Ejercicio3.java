package Ejercicio3;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int motor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de motor"));
        int ventanas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas ventanas tiene el vehiculo"));
        int puertas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas puertas tiene el vehiculo"));
        String marca = JOptionPane.showInputDialog("Cual es la marca del vehiculo");
        String modelo = JOptionPane.showInputDialog("Cual es el modelo del vehiculo");
        float kinicial = Float.parseFloat(JOptionPane.showInputDialog("Cual es el kilometraje Inicial"));
        float kfinal = Float.parseFloat(JOptionPane.showInputDialog("Cual es el kilometraje final"));

        if (kfinal < kinicial) {
            JOptionPane.showMessageDialog(null, "Error: El kilometraje final no puede ser menor que el inicial.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            float ktotal = kfinal - kinicial;
            JOptionPane.showMessageDialog(null, "Numero de motor: " + motor +
                    "\nEl número de ventanas es: " + ventanas +
                    "\nLa cantidad de puertas: " + puertas +
                    "\nMarca: " + marca +
                    "\nModelo: " + modelo +
                    "\nKilometraje Inicial: " + kinicial +
                    "\nKilometraje Final: " + kfinal +
                    "\nKilometraje recorrido: " + ktotal);
        }
    }
}
