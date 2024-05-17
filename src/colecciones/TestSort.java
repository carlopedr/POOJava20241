package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {

    public static void main(String[] args) {
        List<Persona> p = new ArrayList<>();
        p.add(new Persona("Luis", "Ruiz",21));
        p.add(new Persona("Pablo", "Martinex",15));
        p.add(new Persona("Alberto", "Lopez",17));
        p.add(new Persona("Cesar", "Perez",10));
        Collections.sort(p);
        for (Persona persona : p) {
            System.out.println(persona.toString());
        }
    }
}
