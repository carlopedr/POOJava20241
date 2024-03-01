
package talleres;

import java.util.Scanner;

public class mf {
    public static void main(String[] args) {
        String sexo;
        int naciminetos, totalna = 0, masculinos = 0, femeninos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dgita la cantidad total de nacimientos");
        naciminetos = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= naciminetos; i++) {
            System.out.println("nombre del bebé " + i);
            sc.nextLine();

            do {
                System.out.println("de que sexo es el bebé?, (m/f)");
                sexo = sc.nextLine();
                System.out.println("Sexo:"+sexo+"-"+"m".equals(sexo));
            } while (!"m".equals(sexo) && !"f".equals(sexo));
            if ("m".equals(sexo)) {
                masculinos++;
            } else {
                femeninos++;
            }
            totalna++;
        }
        System.out.println("Cantidad de bebés nacidos:");
        System.out.println("Masculinos: " + masculinos);
        System.out.println("Femeninos: " + femeninos);
        System.out.println("Total: " + totalna);
    }
}
