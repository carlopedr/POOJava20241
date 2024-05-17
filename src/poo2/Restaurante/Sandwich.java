package poo2.Restaurante;

public class Sandwich extends Receta {

    public Sandwich(String nombre, String[] ingredientes, String[] pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        String cadena = getNombre();
        int numV=0;
        for (int x = 0; x < cadena.length(); x++) {
            char actual = cadena.toLowerCase().charAt(x);
            switch (actual) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numV++;
                    break;
                default:
                    break;
            }
        }
        return numV+2;
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "plancha";
    }
    
}
