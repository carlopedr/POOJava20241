/*CrearCrear un objeto llamado Hospital con las siguientes 
propiedades y métodos:
Atributos:
int codHospital
String nombreHospital
String dirección
String telefono
int habitacionestotales
int habitacionesocupadas

 */
package poo.hospital;

/**
 *
 * @author Usuario
 */
public class Hospital {

    //Atributos
    private int codHospital;
    private String nombreHospital;
    private String direccion;
    private String telefono;
    private int habitacionesTotales;
    private int habitacionesOcupadas;
    private boolean estado;
    static int numCamasUrgencia=10;

    public Hospital(int codHospital, String nombreHospital, String direccion, String telefono, int habitacionesTotales, int habitacionesOcupadas) {
        this.codHospital = codHospital;
        this.nombreHospital = nombreHospital;
        this.direccion = direccion;
        this.telefono = telefono;
        this.habitacionesTotales = habitacionesTotales;
        this.habitacionesOcupadas = habitacionesOcupadas;
    }
    //getters y setters

    public int getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(int codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getHabitacionesTotales() {
        return habitacionesTotales;
    }

    public void setHabitacionesTotales(int habitacionesTotales) {
        this.habitacionesTotales = habitacionesTotales;
    }

    public int getHabitacionesOcupadas() {
        return habitacionesOcupadas;
    }

    public void setHabitacionesOcupadas(int habitacionesOcupadas) {
        if (habitacionesOcupadas > this.habitacionesTotales) {
            System.out.println("No es posible asignar el valor");
        } else {
            this.habitacionesOcupadas = habitacionesOcupadas;
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public static void ejemploStatic(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Hospital{" + "codHospital=" + codHospital + ", nombreHospital=" + nombreHospital + ", direccion=" + direccion + ", telefono=" + telefono + ", habitacionesTotales=" + habitacionesTotales + ", habitacionesOcupadas=" + habitacionesOcupadas + ", estado=" + estado + ",numCamasUrgencia="+numCamasUrgencia;
    }

    
    

}
