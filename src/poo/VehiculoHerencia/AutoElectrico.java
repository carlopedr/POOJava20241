
package poo.VehiculoHerencia;

public class AutoElectrico extends Coche{

    public AutoElectrico(int numPlazas, String marca, String color) {
        super(numPlazas, marca, color);
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
