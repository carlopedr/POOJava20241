package poo.CuentasAhorro;

public class CuentaAhorro extends Cuenta{
    private double saldoMinimo;

    public CuentaAhorro(double saldoMinimo, long numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && (getSaldo()- x) >= saldoMinimo) {
            setSaldo(getSaldo() - x);
        } else {
            System.out.println("Valor retirar no valido");
        }
    }
    
    @Override
    public String toString() {
        return "CuentaAhorro{" + "saldoMinimo=" + saldoMinimo + ' ' + super.toString() +'}';
    }
    
    
}
