package Lang;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }
    
}
