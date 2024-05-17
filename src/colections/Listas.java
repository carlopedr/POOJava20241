package colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> miAL = new ArrayList<>(); // CREAMOS un ArratList
        miAL.add("HOLA"); // AÑADIMOS varios elementos al ArrayList
        miAL.add("ADIOS");
        miAL.add("BUENAS");
        miAL.add("HELLO");
        miAL.add("CIAO");
        System.out.println("Tam1:"+miAL.size());
        System.out.println("Pos 3:"+miAL.get(3));
        miAL.add(3, "Que hubo");
        System.out.println("Tam2:"+miAL.size());
        System.out.println("Pos 3:"+miAL.get(3));
        System.out.println("Pos 4:"+miAL.get(4));
        System.out.println("Recorrido de la colección con for");
        for(int i=0;i<miAL.size();i++){
            System.out.println(i+"-"+miAL.get(i));
        }
        System.out.println("Recorrido de la colección con for-each");
        for(String s:miAL){
            System.out.println(s);
        }
        //Remove** Es adecuado hacer con interator
        miAL.remove(2);
        System.out.println("Recorrido 2...");
        for(String s:miAL){
            System.out.println(s);
        }
        boolean esta = miAL.contains("HoLA");
        System.out.println("Res1:"+esta);
        //miAL.clear();
        System.out.println("TamClear:"+miAL.size());
        //Actualizar
        miAL.set(4,"SUMERCE");
        System.out.println("Recorrido 3...");
        for (String s : miAL) {
            System.out.println(s);
        }
        //Con Iterator
        System.out.println("Iterator");
        Iterator<String> iter = miAL.iterator();
        while (iter.hasNext()) {
            String unElemento = iter.next();
            System.out.println(unElemento);
        }
             
        Iterator<String> iter1 = miAL.iterator();
        while (iter1.hasNext()) {
            String unElemento = iter1.next();
            if (unElemento.startsWith("H")) {
                iter1.remove();
            }
        }
        System.out.println("Recorrido 4...");
        for(String s:miAL){
            System.out.println(s);
        }
        
    }
}
