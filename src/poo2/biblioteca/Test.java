package poo2.biblioteca;

public class Test {

    public static void main(String[] args) {
        Libro l = new Libro("Cien Años Soledad", "GGM", 10, 10);
        System.out.println("# prestados: " + l.prestados);
        if (l.prestar()) {
            System.out.println("Prestamo exitoso");
            System.out.println("# prestados: " + l.prestados);
        } else {
            System.out.println("No se puede prestar");
            System.out.println("# prestados: " + l.prestados);
        }
    }

}
