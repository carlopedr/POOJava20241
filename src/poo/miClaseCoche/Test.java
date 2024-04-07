package poo.miClaseCoche;

public class Test {

    public static void main(String[] args) {
        MiClaseCoche coche1 = new MiClaseCoche();
        coche1.marca = "BMW";
        coche1.color = "Negro";
        coche1.cilindrada = 2500;
        coche1.matricula = "FDC456";

        System.out.println("Datos del coche:");
        System.out.println("Marca: " + coche1.marca);
        System.out.println("Color: " + coche1.color);
        System.out.println("Matricula: " + coche1.matricula);
        coche1.dimeSiEsMetalizado();
        coche1.matricularCoche("XYZ123");
        System.out.println("Matricula: " + coche1.matricula);

        System.out.println("Coche 2");
        MiClaseCoche coche2 = new MiClaseCoche("TESLA", "Blanco", "TRF678", 1230);
        System.out.println("Datos del coche 2:");
        System.out.println("Marca: " + coche2.marca);
        System.out.println("Color: " + coche2.color);
        System.out.println("Matricula: " + coche2.matricula);

        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        MiClaseCoche coche3 = new MiClaseCoche();
        coche3.marca = "BMW";
        coche3.color = "Negro";
        coche3.cilindrada = 2000;
        coche3.matricula = "XYZ123";
        System.out.println(coche3.toString());
        if (coche1 == coche3) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        if (coche1.equals(coche3)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

    }
}
