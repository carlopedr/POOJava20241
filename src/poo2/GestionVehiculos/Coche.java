package poo2.GestionVehiculos;

public class Coche extends Vehiculo{
    private int numPlazas;

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
        setColor("Blanco"+color);
    }
    
    public void combinarColor(int valor, String color){
        super.combinarColor(color);
    }
    @Override
    public String toString() {
        return "Coche{" + "numPlazas=" + numPlazas + " marca:"+getMarca()+" color: "+getColor()+'}';
    }
    
    
    
}
