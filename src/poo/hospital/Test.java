package poo.hospital;

public class Test {

    public static void main(String[] args) {
        Hospital h1 = new Hospital(1, "Salud y Vida", "Centro", "6088548978", 20, 0);
        System.out.println("Hospital A: " + h1.toString());
        h1.setCodHospital(2);
        h1.setHabitacionesOcupadas(25);
        System.out.println("Hospital B: " + h1.toString());
        System.out.println("Estado: " + h1.isEstado());

        Hospital[] listaH = new Hospital[5];
        Hospital h2 = new Hospital(3, "Misericordia", "Sur", "6", 15, 0);
        listaH[0] = h1;
        listaH[1] = h2;
        for (Hospital h : listaH) {
            if (h != null) {
                System.out.println(h.toString());
            }
        }
        h1.numCamasUrgencia=15;
        System.out.println("Despues de modificar el atributo static");
        for (Hospital h : listaH) {
            if (h != null) {
                System.out.println(h.toString());
            }
        }
        h2.numCamasUrgencia=20;
        System.out.println("Despues de modificar el atributo static");
        for (Hospital h : listaH) {
            if (h != null) {
                System.out.println(h.toString());
            }
        }
        Hospital.numCamasUrgencia=25;
        System.out.println("Despues de modificar el atributo static");
        for (Hospital h : listaH) {
            if (h != null) {
                System.out.println(h.toString());
            }
        }
        Hospital.ejemploStatic("Clase Hospital");
    }

}
