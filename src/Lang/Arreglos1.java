package Lang;

public class Arreglos1 {

    public static void main(String[] args) {
        int na[] = new int[5];
        int numeroMinimo = 1, numeroMaximo = 10;
        for (int i = 0; i < na.length; i++) {
            System.out.print("i:" + i);
            na[i] = (int) (Math.random() * ((numeroMaximo + 1) - numeroMinimo) + numeroMinimo);
            System.out.println(" na: " + na[i]);

        }
        int acum = 0;
        for (int n : na) {
            System.out.println(" n: " + n);
            acum += n;
            System.out.println("acum: " + acum);
        }
        System.out.println("acum final:" + acum);
    }
}
