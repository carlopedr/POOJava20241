package poo2.Hospital;

import java.util.Objects;

public class Hospital {

    private int codHospital;
    private String nombreHospital;
    private String direccion;
    private String telefono;
    private int habitacionesTotales;
    private int habitacionesOcupadas;
    private boolean tieneUCI;
    public static int cantPediatras;
    public static final String TIPO="Público";

    public Hospital(int codHospital, String nombreHospital, String direccion, String telefono, int habitacionesTotales, int habitacionesOcupadas) {
        this.codHospital = codHospital;
        this.nombreHospital = nombreHospital;
        this.direccion = direccion;
        this.telefono = telefono;
        this.habitacionesTotales = habitacionesTotales;
        this.habitacionesOcupadas = habitacionesOcupadas;
    }

    public Hospital(int codHospital, String nombreHospital, String direccion, String telefono, int habitacionesTotales, int habitacionesOcupadas, boolean tieneUCI) {
        this.codHospital = codHospital;
        this.nombreHospital = nombreHospital;
        this.direccion = direccion;
        this.telefono = telefono;
        this.habitacionesTotales = habitacionesTotales;
        this.habitacionesOcupadas = habitacionesOcupadas;
        this.tieneUCI = tieneUCI;
    }

    public Hospital() {
    }
    
    //Métodos getters y setters

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
        this.habitacionesOcupadas = habitacionesOcupadas;
    }

    public boolean isTieneUCI() {
        return tieneUCI;
    }

    public void setTieneUCI(boolean tieneUCI) {
        this.tieneUCI = tieneUCI;
    }

    /*
    Método ingreso() que incrementa las habitaciones ocupadas. No puede 
    realizarse el ingreso si las habitaciones ocupadas son iguales a las 
    habitaciones totales del hospital. Devuelve true si se ha podido realizar
    el ingreso.
    */
    public boolean ingreso(){
        boolean respuesta=false;
        if((this.habitacionesOcupadas+1)<=this.habitacionesTotales)
        {
            this.habitacionesOcupadas++;
            respuesta=true;
            //int var=0;
            //var++;
        }
        else{
            respuesta=false;
            //var++;
        }
            
        return respuesta;
    }
    
    public static void mensaje(String msg){
        System.out.println(msg);
    }
    
    @Override
    public String toString() {
        return "Hospital{" + "codHospital=" + codHospital + ", nombreHospital=" + nombreHospital + ", direccion=" + direccion + ", telefono=" + telefono + ", habitacionesTotales=" + habitacionesTotales + ", habitacionesOcupadas=" + habitacionesOcupadas + ", tieneUCI=" + tieneUCI + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospital other = (Hospital) obj;
        if (this.codHospital != other.codHospital) {
            return false;
        }
        return Objects.equals(this.nombreHospital, other.nombreHospital);
    }
    

   
    
    
    
}
