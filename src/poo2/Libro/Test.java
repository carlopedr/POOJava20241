package poo2.Libro;

public class Test {

    public static void main(String[] args) {
        Autor a1 = new Autor("GGM", 1234);
        Libro l = new Libro("Cien años de soledad", 500, a1);
        System.out.println(a1.toString());
        System.out.println(l.toString());
        
        //Comparación entre objetos
        
        Autor a2 = new Autor("JER",8976);
        System.out.println("Compara a1 y a2");
        if(a1==a2){
            System.out.println("Son iguales");
        }
        else
            System.out.println("No son iguales");
        
        Autor a3=a1;
        System.out.println("Compara a1 y a3");
        if(a1==a3){
            System.out.println("Son iguales");
        }
        else
            System.out.println("No son iguales");
        
        Autor a4 = new Autor("GGM", 1234);
        System.out.println("Compara a1 y a4");
        if(a1.equals(a4)){
            System.out.println("Son iguales");
        }
        else
            System.out.println("No son iguales");
    }

}
