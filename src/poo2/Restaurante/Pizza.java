package poo2.Restaurante;

public class Pizza extends Receta {

    public Pizza(String nombre, String[] ingredientes, String[] pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        return (2+getNombre().length());
    }

    @Override
    public boolean isVegetariano() {
        for(String i:getIngredientes()){
            System.out.println(i);
            if(i!=null){
                return !(i.toLowerCase().contains("carne"));
            }
        }
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "horno";
    }
    
}
