
package boletin2.pkg4;

import java.util.Scanner;

public class Boletin24 
{
    public static void main(String[] args) 
    {
        float n1, n2;
        System.out.println("Introducir primer numero");
        Scanner dato = new Scanner(System.in);
        n1=dato.nextFloat();
        System.out.println("Introducir segundo numero");
        n2=dato.nextFloat();
        System.out.println("Suma = "+(n1+n2)+"\n2Resta = "+(n1-n2)+"\nProducto = "+(n1*n2)+"\nDivision = "+(n1/n2));
    }
    
}
