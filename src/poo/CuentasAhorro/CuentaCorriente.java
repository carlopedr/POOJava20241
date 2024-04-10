package poo.CuentasAhorro;

public class CuentaCorriente extends Cuenta {

    private double maximoRetirable;

    public CuentaCorriente(double maximoRetirable, long numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && x <= getSaldo() && x <= maximoRetirable) {
            setSaldo(getSaldo() - x);
        } else {
            System.out.println("Valor retirar no valido");
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "maximoRetirable=" + maximoRetirable + ' ' + super.toString() + '}';
    }

}
