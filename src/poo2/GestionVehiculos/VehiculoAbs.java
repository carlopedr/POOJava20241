package poo2.GestionVehiculos;

public abstract class VehiculoAbs {
    private String marca;
    private String color;

    public VehiculoAbs(String marca, String color) {
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

    public abstract void iniciar();
    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", color=" + color + '}';
    }
    
    
    
}
