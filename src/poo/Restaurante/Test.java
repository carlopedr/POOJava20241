package poo.Restaurante;

public class Test {
    public static void main(String[] args) {
        String ingp[]=new String[4];
        ingp[0]="Harina";
        ingp[1]="Ketchup";
        ingp[2]="Queso";
        ingp[3]="Carne de ternera";
        String ings[]=new String[3];
        ings[0]="Pan";
        ings[1]="Carne molida";
        ings[0]="Lechuga";
        String recp[]=new String[3];
        String recs[]=new String[3];
        Pizza p = new Pizza("Hawaiana",ingp,recp);
        System.out.println("P:"+p.toString());
        Sandwich s = new Sandwich("Cubano",ings,recs);
        System.out.println("S:"+s.toString());
        System.out.println("PV:"+p.isVegetariano());
        System.out.println("SV:"+s.isVegetariano());
    }
}
