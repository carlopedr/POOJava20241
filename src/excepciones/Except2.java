
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except2 {

    public static void main(String[] args) {
        prueba();
        
        try {
            cuadrado();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
            System.out.println("Error, no se introdujo un numero");
        } catch (NumberFormatException ex) {
            System.out.println("Error, el numero tiene formato erroneo");
        } catch (Exception ex) {
            System.out.println("Error general, no especifico");
        }
    }

    public static void cuadrado() throws InputMismatchException, NumberFormatException {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        numero = entrada.nextInt();
        int cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es " + cuadrado);
    }
    
    public static void prueba(){
        cuadrado();
        
    }
  
}   
