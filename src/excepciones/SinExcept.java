
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinExcept {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        System.out.println("escribe un numero entero...");
        String numeroS;
        numeroS = entrada.next();
        numero=Integer.parseInt(numeroS);
        int cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es " + cuadrado);

    }
}
