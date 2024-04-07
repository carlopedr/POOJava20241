/*Dada la clase
class Persona {
char estadocivil; //se codificará asi: c=casada, s=soltera, v=viuda
int sueldo;
boolean mujer;
construir una clase GrupoPersonas que permita almacenar los datos de 100 personas y que posea
métodos para calcular:
– El número de mujeres
– El número de hombres casados
– Si el sueldo medio de los hombres solteros es mayor que el de los hombres casados.
 */
package poo2.GestionPersonas;

public class Persona {

    private char estadoCivil;
    private int sueldo;
    private boolean mujer;

    public Persona(char estadoCivil, int sueldo, boolean mujer) {
        this.estadoCivil = estadoCivil;
        this.sueldo = sueldo;
        this.mujer = mujer;
    }

    public Persona() {
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        //Código para validar que solo tenga c=casada, s=soltera, v=viuda
        //if (estadoCivil == 'c' || estadoCivil == 's' || estadoCivil == 'v') {
        //    this.estadoCivil = estadoCivil;
        //}
        //this.estadoCivil = estadoCivil;
        switch (estadoCivil) {
            case 'c':
            case 's':
            case 'v':
                this.estadoCivil = estadoCivil;
                break;
            default:
                System.out.println("Error.Solo se permiten 'c', 's', o 'v' como respuesta");
        }
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isMujer() {
        return mujer;
    }

    public void setMujer(boolean mujer) {
        this.mujer = mujer;
    }

    @Override
    public String toString() {
        return "Persona{" + "estadoCivil=" + estadoCivil + ", sueldo=" + sueldo + ", mujer=" + mujer + '}';
    }

}
