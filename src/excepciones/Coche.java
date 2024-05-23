
package excepciones;

public class Coche {

    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar(int cuanto) throws ExcesoVelocidadException {
        this.velocidad = this.velocidad + cuanto;
        if(this.velocidad>120){
            this.velocidad=120;
            ExcesoVelocidadException err = new ExcesoVelocidadException();
            throw err;
        }
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + '}';
    }
    
    
}
