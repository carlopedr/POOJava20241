package poo.VehiculoHerencia;

public class Moto extends Vehiculo implements IMovimientos{
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

    @Override
    public void acelerar(double aceleracion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void girar(char sentido, int grado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
