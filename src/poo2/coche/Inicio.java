package poo2.coche;

public class Inicio {

    public static void main(String[] args) {
        MiClaseCoche coche1 = new MiClaseCoche();
        MiClaseCoche coche2 = new MiClaseCoche("MB","Plata","DSC213",2300);
        coche1.marca = "BMW";
        coche1.color = "Negro";
        coche1.matricula = "RFG564";
        coche1.cilindrada = 4000;

        System.out.println("Marca: " + coche1.marca);
        System.out.println("Color antes: " + coche1.color);
        coche1.dimeSiEsMetalizado();

        coche1.color = "Blanco";
        System.out.println("Color después:" + coche1.color);
        coche1.dimeSiEsMetalizado();

        System.out.println("Matrícula antes: " + coche1.matricula);
        coche1.cambiarMatricula("ABC098");
        System.out.println("Matrícula despúes: " + coche1.matricula);

        if (coche1.altaCilindrada()) {
            System.out.println("Coche con alta cilindrada");
        } else {
            System.out.println("Coche de baja cilindrada");
        }
        
        System.out.println("Coche 2");
        System.out.println("Color: "+coche2.color);

        
    }
}
