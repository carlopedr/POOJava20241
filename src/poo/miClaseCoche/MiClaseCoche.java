package poo.miClaseCoche;

import java.util.Objects;

public class MiClaseCoche {
//Atributos
    String marca;
    String color;
    String matricula;
    int cilindrada;

//Constructores    
    public MiClaseCoche(String marca,String color,String matricula,int cilindrada){
        this.marca=marca;
        this.color=color;
        this.matricula=matricula;
        this.cilindrada=cilindrada;
    }
    public MiClaseCoche(){
        
    }
    public MiClaseCoche(String marca,String matricula,int cilindrada){
        this.marca=marca;
        this.color=color;
        this.matricula=matricula;
        this.cilindrada=cilindrada;
    }

//Métodos    
    void dimeSiEsMetalizado() {
        {
            if (color.equals("Negro")) {
                System.out.println("El coche tiene pintura metalizada");
            } else {
                System.out.println("El coche NO tiene pintura metalizada");
            }
        }
    }

    void matricularCoche(String matriculaAPoner) {
        matricula = matriculaAPoner;
    }

    @Override
    public String toString() {
        return "MiClaseCoche{" + "marca=" + marca + ", color=" + color + ", matricula=" + matricula + ", cilindrada=" + cilindrada + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiClaseCoche other = (MiClaseCoche) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

   
    
    

}
