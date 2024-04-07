package poo2.coche;

public class MiClaseCoche {

    

    //atributos de la clase
    String marca;
    String color;
    String matricula;
    int cilindrada;
    //métodos constructores

    public MiClaseCoche(String marca, String color, String matricula, int cilindrada) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public MiClaseCoche() {
    }

    public MiClaseCoche(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    

    //métodos de la clase
    public void dimeSiEsMetalizado() {
        if (color.equals("Negro")) {
            System.out.println("El coche tiene pintura metalizada");
        } else {
            System.out.println("El coche NO tiene pintura metalizada");
        }
    }

    public void cambiarMatricula(String matriculaNueva) {
        matricula = matriculaNueva;
    }

    public boolean altaCilindrada() {
        if (cilindrada > 3000) {
            return true;
        } else {
            return false;
        }
    }
}
