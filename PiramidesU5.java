import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
         Scanner cute = new Scanner(System.in);
        
          System.out.println("********************************");
        System.out.println(" Bienvenido ");

        boolean meH = true;

        do {
            System.out.println("---------------------------------");
            System.out.println("Selecciona una opcion:");
            System.out.println("---------------------------------");
            System.out.println(" 1. Piramide asterisco");
            System.out.println(" 2. Piramide Letras y numeros");
            System.out.println(" 3. Salir");

            int opcion = cute.nextInt();
            cute.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("1. Piramide de asteriscos");
                    System.out.println("Ingresa el numero de filas que deseas para la piramide: ");
                    int numF = cute.nextInt();
                    for (int i = 1; i <= numF; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("2. Piramide de Letras y numeros");
                    System.out.println("Ingresa el numero de filas que deseas para la piramide: ");
                    int numFilas = cute.nextInt();
                    int valorN = 1;
                    char vL = 'A';
                    for (int i = 1; i <= numFilas; i++) {
                        for (int j = 0; j < i; j++) {
                            if (i % 2 == 1) {
                                System.out.print(valorN++);
                            } else {
                                System.out.print(vL++);
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    meH = false;
                    System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }         
         while (meH);
         cute.close();
    }
}