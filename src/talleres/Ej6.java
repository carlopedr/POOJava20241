package talleres;

public class Ej6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Cual es su nivel de hemmoglobina?: ");
        double hemo = in.nextDouble();

        System.out.println("Ingrese su edad en meses: ");
        double edad = in.nextDouble();
        if (edad > 0) {
            if (edad <= 1) {
                if (hemo < 13) {
                    System.out.println("Positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else if (edad <= 6) {

            } else if
        } else {
            System.out.println("Error en la edad!");
        }

        if (edad >= 0 && edad
                <= 1) {
            if (hemo < 13) {
                System.out.println("Positivo para anemia");
            } else {
                System.out.println("Negativo para anemia");
            }
        } else if (edad > 1 && edad
                <= 6) {
            if (hemo < 10) {
                System.out.println("Positivo para anemia");
            } else {
                System.out.println("Negativo para anemia");
            }
        } else if (edad > 6 && edad
                <= 12) {
            if (hemo < 11) {
                System.out.println("Positivo para anemia");
            } else {
                System.out.println("Negativo para anemia");
            }
        } else if (edad > 12 && edad
                <= 60) {
            if (hemo < 11.5) {
                System.out.println("Positivo para anemia");
            } else {
                System.out.println("Negativo para anemia");
            }
        } else if (edad > 60 && edad
                <= 120) {
            if (hemo < 12.6) {
                System.out.println("Positivo para anemia");
            } else {
                System.out.println("Negativo para anemia");
            }
        } else if (edad > 120 && edad
                <= 180) {
            if (hemo < 13) {
                System.out.println("Positivo para anemia");
            } else {
                System.out.println("Negativo para anemia");
            }
        } else {
            System.out.print("Ingrese sexo (1)hombre, (2)mujer: ");
            int sexo = in.nextInt();
            if (sexo == 2) {
                if (hemo < 12) {
                    System.out.println("positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            } else if (sexo == 1) {
                if (hemo < 14) {
                    System.out.println("positivo para anemia");
                } else {
                    System.out.println("Negativo para anemia");
                }
            }
        }
    }
}
