package poo2.GestionVehiculos;

public class Moto {
    private int numCadena;

    public Moto(int numCadena) {
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
