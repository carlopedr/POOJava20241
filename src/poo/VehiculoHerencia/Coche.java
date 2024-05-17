
package poo.VehiculoHerencia;

public abstract class Coche extends Vehiculo implements IMovimientos{
    private int numPlazas;
    //private int color;

    public Coche(int numPlazas, String marca, String color) {
        super(marca, color);
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    
    @Override
    public void combinarColor(String color){
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "Coche{" + "numPlazas=" + numPlazas + '}';
    }

    
    
    
}
