import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner cute = new Scanner (System.in);
        
   System.out.println ("Ingrese un numero: ");
        double num1 = cute.nextDouble();
     System.out.println("Numero 1: "+num1);
          System.out.println ("****************");
  System.out.println ("Ingrese otro numero: ");
       double num2 = cute.nextDouble();
  System.out.println("Numero 2: "+num2);

        System.out.println("Suma: " + suma(num1, num2));
        System.out.println("Resta: " + resta(num1, num2));
        System.out.println("Multiplicación: " + multiplicacion(num1, num2));
        System.out.println("División: " + division(num1, num2));
    }
     // Método para realizar la operación de suma
    public static double suma(double a, double b) {
        return a + b;
    }

    // Método para realizar la operación de resta
    public static double resta(double a, double b) {
        return a - b;
    }

    // Método para realizar la operación de multiplicación
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    // Método para realizar la operación de división
    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
    }
}