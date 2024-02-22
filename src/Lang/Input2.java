package Lang;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero1=sc.nextInt();
        System.out.print("Ingresa otro número: ");
        int numero2=sc.nextInt();
        System.out.println("La suma es: "+(numero1+numero2));
    }
}
