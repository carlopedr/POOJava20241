package poo.VehiculoHerencia;

public class Camion extends VehiculoAbs{

    public Camion(String marca, String color, int velocidad) {
        super(marca, color, velocidad);
    }

    //@Override
    public void parar(int velMin) {
        setVelocidad(0);
    }

    @Override
    public void parar() {
        setVelocidad(0);
    }
    
}
