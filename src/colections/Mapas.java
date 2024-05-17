package colections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        Map<Integer, String> miMapa = new HashMap<>();
        miMapa.put(29, "Ana");
        miMapa.put(17, "Mercedes");
        miMapa.put(31, "Maria");
        // Lo mas habitual:
        // Usando en el for-each el método values()
        for (String cadavalor : miMapa.values()) {
            System.out.println(cadavalor);
        }
// --------------------------------------------------------
// Otra opción mas detallada
// Creando un objeto Collection y usándolo en for-each
        Collection<String> losvalores = miMapa.values();
        for (String cadavalor : losvalores) {
            System.out.println(cadavalor);
        }
        
        // Lo mas habitual:
// Usando en el for-each el método keySet()
        for (Integer cadaclave : miMapa.keySet()) {
            System.out.println(cadaclave);
        }
// --------------------------------------------------------
// Otra opción mas detallada
// Creando un objeto Collection y usándolo en for-each
        Collection<Integer> lasclaves = miMapa.keySet();
        for (Integer cadaclave : lasclaves) {
            System.out.println(cadaclave);
        }
        //Map.Entry
        for (Map.Entry<Integer, String> cadaEntry : miMapa.entrySet()) {
            System.out.println ("clave = " + cadaEntry.getKey() + ", valor = " + cadaEntry.getValue());
}
        
    }

}
