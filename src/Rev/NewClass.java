
package Rev;

public class NewClass {
    public static void main(String[] args) {

        int numpc = 0;
        if (numpc < 5) {
            System.out.println("Se cumple el descuento del 10% sobre el total de la compra");
        } 
        else if (numpc<10){
            System.out.println("Se otorga un 20% de descuento");
        }
        else{
            System.out.println("Se les otorga un 40% de descuento");
        }
    }
}
