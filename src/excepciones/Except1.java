
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        try {
            String numeroS;
            //numeroS = entrada.next();
            //numero = Integer.parseInt(numeroS);
            numero=entrada.nextInt();
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es " + cuadrado);
            int div = 0;
            int res=cuadrado/div;
        } catch (InputMismatchException e) {
            System.out.println("Error, no se introdujo un numero");
        } catch (NumberFormatException e) {
            System.out.println("Error, el numero tiene formato erroneo");
        } catch (Exception e){
            System.out.println("Se presentó otro error!!");
            System.out.println("El error es:");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Salida siempre por aqui");
        }
    }
}
