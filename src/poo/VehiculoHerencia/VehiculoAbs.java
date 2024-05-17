
package poo.VehiculoHerencia;


public abstract class VehiculoAbs {
    private String marca;
    private String color;
    private int velocidad;

    public VehiculoAbs(String marca, String color, int velocidad) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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

    public void combinarColor (String color){
        this.color=this.color+"+"+color;
    }
    
    public abstract void parar();

    @Override
    public String toString() {
        return "VehiculoAbs{" + "marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + '}';
    }
    
    
    
    
}
