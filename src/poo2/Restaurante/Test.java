
package poo2.Restaurante;

public class Test {
       public static void main(String[] args) {
           String[] ip= new String[4];
           ip[0]="Queso";
           ip[1]="Harina";
           ip[3]="Ketchup";
           ip[2]="Carne molida";
           String[] is= new String[4];
           is[0]="Queso";
           is[1]="Pan";
           is[3]="Ketchup";
           is[2]="Lechuga";
           String [] pasos=new String[4];
           
           Pizza p = new Pizza("Ranchera",ip,pasos);
           System.out.println("Veg:"+p.isVegetariano());
           System.out.println("TipoP:"+p.tipoPreparacion());
           System.out.println("TimeP:"+p.tiempoDePreparacion());
           Sandwich s = new Sandwich("Classic",is,pasos);
           System.out.println("Veg:"+s.isVegetariano());
           System.out.println("TipoP:"+s.tipoPreparacion());
           System.out.println("TimeP:"+s.tiempoDePreparacion());
           
           
           
           
        
    }
}

    

