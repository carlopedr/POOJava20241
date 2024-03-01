package talleres;

import java.util.Scanner;

public class Ej4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("cuantos kilos de manzana compro:");
        double kilos = scanner.nextDouble();
       if (kilos > 10.0) {
            System.out.println("descuento del 20%");
        } else if (kilos > 5.0) {
            System.out.println("descuento del 15%");
        } else if (kilos > 2.0) {
            System.out.println("descuento del 10%");
        } else if (kilos > 0.0) {
            System.out.println("descuento del 5%");
        }
       scanner.close();
    }
}
