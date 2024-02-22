/*
Hacer un bucle que genere 10 números enteros (de 1 a 10) y los almacene en un array,
y que se calcule posteriormente 
- la suma de los números que sean pares 
- la suma de los números que sean impares
- diga por pantalla cual de las dos sumas es mayor 
*/
package Lang;

public class ParesImpares {
    public static void main(String[] args) {
        int nums [] = new int[10];
        for(int i =0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*(11));
            System.out.println("nums["+i+"]="+nums[i]);
        }
        int acumPares=0,acumImpares=0;
        for(int n:nums){
            int res=n%2;
            if(res==0){
                acumPares+=n;
            }
            else{
                acumImpares+=n;
            }
        }
        System.out.println("Acum Pares: "+acumPares);
        System.out.println("Acum Impares:"+acumImpares);
    }
}
