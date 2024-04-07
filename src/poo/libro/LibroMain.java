package poo.libro;

public class LibroMain {
    public static void main(String[] args) {
        Libro l = new Libro("100AS","GGM",10,9);
        System.out.println(l.toString());
        l.prestar();
        System.out.println(l.toString());
        System.out.println(l.prestar());
        System.out.println(l.toString());
    }
    
}
