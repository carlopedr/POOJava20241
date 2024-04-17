package poo.Restaurante;

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
        for (String s : getIngredientes()) {
            if (s != null) {
                if (s.toLowerCase().contains("carne")) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "horno";
    }
    

}
