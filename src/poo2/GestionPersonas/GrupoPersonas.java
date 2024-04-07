/*construir una clase GrupoPersonas que permita almacenar los datos de 100 personas
y que posea métodos para calcular:
– El número de mujeres
– El número de hombres casados
– Si el sueldo medio de los hombres solteros es mayor que el de los hombres casados.*/
package poo2.GestionPersonas;

public class GrupoPersonas {

    private Persona[] grupo;//= new Persona[CANTIDAD];;
    public static final int CANTIDAD = 100;

    public GrupoPersonas() {
        grupo = new Persona[CANTIDAD];
        this.creaGrupo();
    }

    public GrupoPersonas(Persona[] grupo) {
        this.grupo = grupo;
    }

    public Persona[] getGrupo() {
        return grupo;
    }

    public void setGrupo(Persona[] grupo) {
        this.grupo = grupo;
    }

    public void creaGrupo() {
        char estadoCivil = ' ';
        int sueldo;
        boolean mujer;
        for (int i = 0; i < CANTIDAD; i++) {
            //(Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;
            switch (((int) (Math.random() * 11)) % 3) {
                case 0:
                    estadoCivil = 'c';
                    break;
                case 1:
                    estadoCivil = 's';
                    break;
                case '2':
                    estadoCivil = 'v';
                    break;
            }
            sueldo = (int) (Math.random() * 2000);
            mujer = (((int) (Math.random() * 11)) % 2) == 0;
            grupo[i] = new Persona(estadoCivil, sueldo, mujer);
        }
    }

    public int cantidadMujer() {
        int cantidadMujer = 0;
        for (Persona p : grupo) {
            if (p.isMujer()) {
                cantidadMujer++;
            }
        }
        return cantidadMujer;
    }
    
    public int cantidadHombreCasado() {
        int cantidadHombreCasado = 0;
        for (Persona p : grupo) {
            if (!p.isMujer() && p.getEstadoCivil()=='c') {
                cantidadHombreCasado++;
            }
        }
        return cantidadHombreCasado;
    }
    
    public boolean comparaSueldoMedioHombreMujer() {
        int acumSueldoMujer = 0, acumSueldoHombre=0;
        int cantMujer=0,cantHombre=0;
        for (Persona p : grupo) {
            if (p.isMujer()) {
                acumSueldoMujer+=p.getSueldo();
                cantMujer++;
            }
            else{
                acumSueldoHombre+=p.getSueldo();
                cantHombre++;
            }
        }
        System.out.println("PM: "+acumSueldoMujer/cantMujer);
        System.out.println("PH: "+acumSueldoHombre/cantHombre);
        return ((acumSueldoMujer/cantMujer)>=(acumSueldoHombre/cantHombre));
    }
}
