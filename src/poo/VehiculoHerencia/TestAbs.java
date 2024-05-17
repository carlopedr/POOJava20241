
package poo.VehiculoHerencia;

public class TestAbs {
    public static void main(String[] args) {
        //VehiculoAbs va = new VehiculoAbs("Mazda","Azul",80);
        Camion c = new Camion("Foton","Blanco",60);
        System.out.println("Cam:"+c.toString());
        c.parar();
        System.out.println("Cam:"+c.toString());
            }
}
