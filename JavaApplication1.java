package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {

        int[][] agua = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40},};

        ConsumoAguaC(agua);
        ConsumoAguaD(agua);
    }

    public static void ConsumoAguaC(int[][] agua) {
            System.out.println("                     TOTAL DE CONSUMO POR CASA");

        for (int i = 0; i < agua.length; i++) {
            int sumaC = 0;
            for (int j = 0; j < agua[0].length; j++) {
                sumaC += agua[i][j];
            }
            int sumaTotal = sumaC;
            System.out.println("_______________________________________________________________________");
            System.out.println("     La suma total del consumo de agua en la casa "+(i+1)+" es de " + sumaTotal + " litros");
            
        }
        System.out.println("_______________________________________________________________________");
           System.out.println("***********************************************************************");
    }

    public static void ConsumoAguaD(int[][] agua) {
        System.out.println("                       TOTAL DE CONSUMO POR DIA");
        for (int j = 0; j < agua[0].length; j++) {
            int sumaD = 0;
            for (int i = 0; i < agua.length; i++) {
                sumaD += agua[i][j];
            }
            int sumaTotalD = sumaD;
            System.out.println("_______________________________________________________________________");
            System.out.println("    La suma total del consumo de agua por el dia "+(j+1)+" es de " + sumaTotalD + " litros");
            
        }
        System.out.println("_______________________________________________________________________");
    }
   
}
