
package poo.Alumno;

public class Test {
    public static void main(String[] args) {
        Alumno a = new Alumno("Fabian");
        System.out.println(a.toString());
        System.out.println("Res: "+a.ponerNota(1, 8.4));
        a.ponerNota(2, 9.1);
        a.ponerNota(3, 5.3);
        System.out.println(a.toString());
        System.out.println(a.borrarNota(6));
        System.out.println(a.toString());
        System.out.println("Nota: "+a.getNota(4));
        
    }
    
}
