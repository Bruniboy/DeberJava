package Ejercicio2;


import javax.swing.*;

public class Ejercicio2{
    public static void main(String[] args) {
        float num1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
        float num2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Que operacion quiere realizar" +
                "1) Suma 2) Resta 3)Multiplicacion 4) Division"));
        float resultado;
        switch (opc){
            case 1:
                resultado=num1+num2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+resultado);
                break;
            case 2:
                resultado=num1-num2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+ resultado);
                break;
            case 3:
                resultado=num1*num2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: "+ resultado);
                break;
            case 4:
                resultado=num1/num2;
                JOptionPane.showMessageDialog(null,"El resultado de la division es: "+resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null,"No existe esta opcion");
                break;

        }

    }
}
