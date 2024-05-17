
package crudfiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, IOException {
        List<Persona> listaP = new ArrayList<>();
        Persona p1= new Persona("Luis", "Ruiz",21);
        Persona p2= new Persona("Cesar", "Perez",10);
        Persona p3= new Persona("Pablo", "Martinex",15);
        Persona p4= new Persona("Alberto", "Lopez",17);
        Persona p5= new Persona("María", "Salas",23);
        GestorArchivoPersona fileP = new GestorArchivoPersona("persona.dat");
        fileP.guardarObjeto(p1);
        listaP=fileP.obtenerTodosLosObjetos();
        for (var p: listaP){
            System.out.println(p.toString());
        }
            
      
        
    }
}
