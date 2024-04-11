package poo2.GestionVehiculos;

public class Test {
    public static void main(String[] args) {
        Coche c = new Coche(5,"BMW","Negro");
        System.out.println("C1:"+c.toString());
        c.setColor("Amarillo");
        System.out.println("C2:"+c.toString());
        Vehiculo v = new Vehiculo("MB","Gris");
        System.out.println("V1:"+v.toString());
        v.combinarColor("Verde");
        System.out.println("V2:"+v.toString());
        Moto m = new Moto(32);
        System.out.println("M"+m.toString());
        c.combinarColor("Azul");
        System.out.println("C3:"+c.toString());
        c.combinarColor(1,"Purpura");
        System.out.println("C4:"+c.toString());
    }
}
