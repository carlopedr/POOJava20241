
package poo2.GestionPersonas;

import static poo2.GestionPersonas.GrupoPersonas.CANTIDAD;

public class Test {
    public static Persona [] gp;
    public static void main(String[] args) {
        Persona p = new Persona('c',1000,true);
        System.out.println(p.toString());
        p.setEstadoCivil('x');
        System.out.println(p.toString());
        GrupoPersonas g = new GrupoPersonas();
        gp=g.getGrupo();
        System.out.println("L:"+gp.length);
        //creaGrupo();
        for(Persona p1:gp){
            System.out.println(p1.toString());
        }
        System.out.println("Cantidad Mujeres: "+ g.cantidadMujer());
        System.out.println("Cantidad Hombres Casados: "+ g.cantidadHombreCasado());
        System.out.println("El promedio de sueldo de las mujeres es mayor o igual que el de los hombres? :"+g.comparaSueldoMedioHombreMujer());
    }
      
    
}
