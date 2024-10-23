package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Ingrese que figura quiere calcular el area y perimetro 1)Triangulo 2) Cuadrado 3) Rectangulo");
        String Opcion="";
        Opcion=br.readLine();
        int opcion=Integer.parseInt(Opcion);


        switch (opcion)
        {
            case 1:
                System.out.println("Ingrese el valor de la altura");
                String Altura=br.readLine();
                float altura=Float.parseFloat(Altura);
                System.out.println("Ingrese el valor de la base");
                String Base = br.readLine();
                float base=Float.parseFloat(Base);
                System.out.println("Ingrese el valor del lado 1");
                String Lado1= br.readLine();
                float lado1=Float.parseFloat(Lado1);
                System.out.println("Ingrese el valor del lado 2");
                String Lado2=br.readLine();
                float lado2=Float.parseFloat(Lado2);

                float perimetro, area;
                area=(base*altura)/2;
                perimetro=lado1+lado2+base;
                System.out.println("El Área del triangulo es: "+area);
                System.out.println("El perimetro del triangulo es " + perimetro);
                break;
            case 2:
                System.out.println("Ingrese el valor de los lados");
                float ladoc=Float.parseFloat(br.readLine());
                perimetro=ladoc*4;
                area=ladoc*ladoc;
            case 3:
                System.out.println("Ingrese el valor de los lados verticales");
                float ladov=Float.parseFloat(br.readLine());
                System.out.println("Ingrese el valor de los lados horizontales");
                float ladoh=Float.parseFloat(br.readLine());
                perimetro=(ladov*2)+(ladoh*2);
                area=(ladov*ladoh);

            default:
                System.out.println("No es una opcion valida");
                break;

        }
    }
}