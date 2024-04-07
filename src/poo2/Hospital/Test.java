package poo2.Hospital;

public class Test {
    public static void main(String[] args) {
        int cantP=5;
        Hospital h=new Hospital(100,"San Pedro","Av 1 4 56","311452857",20,0,true);
        System.out.println(h.toString());
        //h.habitacionesocupadas=100;
        System.out.println("Cant. hab ocupadas: "+h.getHabitacionesOcupadas());
        h.setHabitacionesOcupadas(10);
        System.out.println(h.toString());
        Hospital.cantPediatras=3;
        System.out.println("CP:"+h.cantPediatras);
        Hospital h2=new Hospital(200,"Santa Ana","K 45 67 34","311987654",25,25,false);
        System.out.println(h2.toString());
        System.out.println("CP H2:"+h2.cantPediatras);
        System.out.println(h2.ingreso());
        System.out.println("Despues de ingreso: ");
        System.out.println(h2.toString());
        Hospital.mensaje("Listado desde un arreglo...");
        Hospital[] listaHospitales = new Hospital[2];
        listaHospitales[0]=h;
        listaHospitales[1]=h2;
        for(Hospital hn:listaHospitales){
            System.out.println(hn.toString());
        }
        System.out.println("Tipo: "+Hospital.TIPO);
        //Hospital.TIPO="Privado";
    }
}
