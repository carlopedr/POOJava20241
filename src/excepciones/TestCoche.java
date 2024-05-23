
package excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCoche {

    public static void main(String[] args)  {
        Coche c = new Coche("OPEL", "INSIGNIA");
        System.out.println("CAAc: "+c.toString());
        //c.acelerar(180);
        try {
            c.acelerar(180);
        } catch (ExcesoVelocidadException ex) {
            System.out.println(ex.getMessage());
            
        }
        System.out.println("CDAc: "+c.toString());
    }
}
