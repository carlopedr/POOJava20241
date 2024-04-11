
package poo2.GestionVehiculos;

public class Vehiculo {
    private String marca;
    private String color;

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void combinarColor(String color){
        this.color=this.color+color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", color=" + color + '}';
    }
    
    
}
