
package poo.CuentasAhorro;

public class Test {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos","123456");
        System.out.println(p.toString());
        CuentaCorriente cc = new CuentaCorriente(10000,123456789,p);
        System.out.println("CC0: "+cc.toString());
        cc.ingresar(5000);
        System.out.println("CC1: "+cc.toString());
        cc.ingresar(2500);
        System.out.println("CC2: "+cc.toString());
        cc.retirar(1750);
        System.out.println("CC3: "+cc.toString());
    }
    
}
