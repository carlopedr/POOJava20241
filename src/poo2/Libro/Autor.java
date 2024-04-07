package poo2.Libro;

import java.util.Objects;

public class Autor {

    private String nombreAu;
    private int dni;

    public Autor(String nombreAu, int dni) {
        this.nombreAu = nombreAu;
        this.dni = dni;
    }

    public String getNombreAu() {
        return nombreAu;
    }

    public void setNombreAu(String nombreAu) {
        this.nombreAu = nombreAu;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombreAu=" + nombreAu + ", dni=" + dni + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return Objects.equals(this.nombreAu, other.nombreAu);
    }
    
    
}
