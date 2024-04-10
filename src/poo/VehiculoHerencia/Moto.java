package poo.VehiculoHerencia;

public class Moto extends Vehiculo{
    private int numCadena;

    public Moto(int numCadena, String marca, String color) {
        super(marca, color);
        this.numCadena = numCadena;
    }

    public int getNumCadena() {
        return numCadena;
    }

    public void setNumCadena(int numCadena) {
        this.numCadena = numCadena;
    }

    @Override
    public String toString() {
        return "Moto{" + "numCadena=" + numCadena + '}';
    }
    
    
}
