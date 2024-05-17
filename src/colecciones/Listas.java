package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> miArrayList = new ArrayList<>(); // CREAMOS un ArratList
        miArrayList.add("HOLA"); // AÑADIMOS varios elementos al ArrayList
        miArrayList.add("ADIOS");
        miArrayList.add("BUENAS");
        miArrayList.add("HELLO");
        miArrayList.add("CIAO");
        System.out.println("Tam:" + miArrayList.size());
        System.out.println("Pos 3:" + miArrayList.get(3));
        miArrayList.add(3, "BUENAS");
        System.out.println("Tam:" + miArrayList.size());
        System.out.println("Pos 3ADD:" + miArrayList.get(3));
        System.out.println("Pos 4:" + miArrayList.get(4));
        miArrayList.set(2, "HALLO"); //SUSTITUIMOS el valor de posicion 2 por otro nuevo
        System.out.println("Pos 2:" + miArrayList.get(2));
        System.out.println(miArrayList.size()); // CONSULTAMOS que TAMAÑO tiene
        miArrayList.remove(2); // ELIMINAMOS el elemento que esta en la posición 2
        System.out.println("Tam:" + miArrayList.size());
        miArrayList.add("HELLO");
        System.out.println("Tam:" + miArrayList.size());
        miArrayList.remove("HELLO"); // ELIMINAMOS el elemento con valor "HELLO"
        System.out.println("Tam:" + miArrayList.size());
// Solo la primera ocurrencia que haya "HELLO"
        System.out.println(miArrayList.get(3)); // OBTENEMOS el VALOR del elemento de la posicion 3
        System.out.println("For");
        for (int i = 0; i < miArrayList.size(); i++) { // RECORREMOS el ArrayList para ver sus valores:
            String cadaelemento = miArrayList.get(i); // Modo bucle normal
            System.out.println(cadaelemento);
        }
        System.out.println("ForEach");
        for (String cadaelemento : miArrayList) { // RECORREMOS el ArrayList para ver sus valores:
            System.out.println(cadaelemento); // Modo bucle for-each
        }
        
        boolean esta = miArrayList.contains("HOLA"); // COMPROBAMOS si existe un valor en el arraylist
        System.out.println("ResBusca:"+esta);
        //miArrayList.clear(); // BORRAMOS TODOS los elementos del arraylist
        //System.out.println("TamClear:" + miArrayList.size());
        
        Iterator<String> it = miArrayList.iterator(); // ITERATOR: crear un iteraror
        while (it.hasNext()) { // recorrer un iteraror con un bucle
            String s = it.next(); // extraer elemento dentro del bucle
            if (s.startsWith("H")) {
                it.remove(); // eliminar el elemento que actualmente se esta iterando
            }
        }
        System.out.println("Despues de borrar:");
        for (String cadaelemento : miArrayList) { // RECORREMOS el ArrayList para ver sus valores:
            System.out.println(cadaelemento); // Modo bucle for-each
        }
         
    }
}
