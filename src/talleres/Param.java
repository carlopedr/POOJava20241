
package talleres;

public class Param {
    public static int vfuera;
    public static void main(String[] args) {
         vfuera=1;
         principal(vfuera);
         System.out.println(vfuera);
         
    }
    
    public static void principal(int vdentro){
        vdentro++;
    }
   
    
    
    
}
