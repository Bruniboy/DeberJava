package Ejercicio4;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        String producto=sc.nextLine();
        System.out.println("Que valor tiene el producto?");
        float precio=Float.parseFloat(sc.nextLine());
        System.out.println("Su producto tiene IVA? 1)SI 2)NO *Escribir el numero*");
        int opc=sc.nextInt();
        double pfinal;
        double piva;
        switch (opc){
            case 1:
                if (precio>0 && precio<=500)
                {
                    piva=precio*0.12;
                    pfinal=piva+precio;
                    System.out.println("El valor del producto mas su respectivo IVA es de: "+pfinal);
                } else if (precio>500 && precio<=1500) {
                    piva=precio*0.14;
                    pfinal=piva+precio;
                    System.out.println("El valor del producto mas su respectivo IVA es de: "+pfinal);
                } else if (precio>1500) {
                    piva=precio*0.15;
                    pfinal=piva+precio;
                    System.out.println("El valor del producto mas su respectivo IVA es de: "+pfinal);
                }
                break;
            case 2:
                System.out.println("El producto no tiene IVA, el valor a pagar es: "+precio);
        }



        /*InputStreamReader isr=new InputStreamReader(System.in);
         BufferedReader br= new BufferedReader(isr);*/




    }

}
