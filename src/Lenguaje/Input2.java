
package Lenguaje;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Numero 1: ");
        num1 = in.nextInt();
        System.out.print("Numero 2: ");
        num2 = in.nextInt();
        System.out.println("Suma = "+(num1+num2));
    }
}
