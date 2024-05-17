
package colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Auto a1 = new Auto(5,"ERT678","Blanco");
        Auto a2 = new Auto(15,"TGB987","Azul");
        Auto a3 = new Auto(1,"QWA234","Verde");
        Auto a4 = new Auto(23,"GFT321","Amarillo");
        Auto a5 = new Auto(4,"XCD190","Negro");
        List<Auto> lA = new ArrayList<>();
        lA.add(a1);
        lA.add(a2);
        lA.add(a3);
        lA.add(a4);
        lA.add(a5);
        System.out.println("Antes de ordenar:");
        for(Auto a:lA){
            System.out.println(a.toString());
        }
        Collections.sort(lA);
        System.out.println("Después de ordenar:");
        for(Auto a:lA){
            System.out.println(a.toString());
        }
    }
    
}
