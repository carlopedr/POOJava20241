package poo.Restaurante;

public class Test {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        String ingp[] = new String[4];
        ingp[0] = "Harina";
        ingp[1] = "Ketchup";
        ingp[2] = "Queso";
        ingp[3] = "Carne de ternera";

        String ings[] = new String[3];
        ings[0] = "Pan";
        ings[1] = "queso";
        ings[0] = "Lechuga";

        String recp[] = new String[3];
        String recs[] = new String[3];

        Pizza pizza = new Pizza("Pollo1a", ingp, recp);
        System.out.println("Pizza: " + pizza.toString());
        System.out.println("La pizza es vegetariana? " + pizza.isVegetariano());

        Sandwich sandwich = new Sandwich("Vegetariano1e", ings, recs);
        System.out.println("Sandwich:" + sandwich.toString());
        System.out.println("Sandwich vegetariano? " + sandwich.isVegetariano());

        restaurante.crearReceta("Pizzaollo1", pizza);
        restaurante.crearReceta("Pizza crne1", pizza);
        restaurante.crearReceta("Sandwich egetariano1", sandwich);
        restaurante.crearReceta("Sandwich getariano2", sandwich);
        restaurante.crearReceta("Sandwich tariano3", sandwich);
        restaurante.crearReceta("Pizza po2", pizza);
        restaurante.crearReceta("Pizza car3", pizza);
        restaurante.crearReceta("Sandwich Vegeiano4", sandwich);
        restaurante.crearReceta("Sandwich Vegeno5", sandwich);
        restaurante.crearReceta("Sandwich Vegeno6", sandwich);
        restaurante.crearReceta("Sandwich Vegeno5", sandwich);
        restaurante.crearReceta("Sandwich Vegeno6", sandwich);

        restaurante.anadirRecetaAlMenu(pizza);
        restaurante.anadirRecetaAlMenu(pizza);
        restaurante.anadirRecetaAlMenu(sandwich);
        restaurante.anadirRecetaAlMenu(sandwich);
        restaurante.anadirRecetaAlMenu(sandwich);
        restaurante.anadirRecetaAlMenu(pizza);
        restaurante.anadirRecetaAlMenu(pizza);
        restaurante.anadirRecetaAlMenu(sandwich);
        restaurante.anadirRecetaAlMenu(sandwich);
        restaurante.anadirRecetaAlMenu(sandwich);
        restaurante.anadirRecetaAlMenu(sandwich);
        restaurante.anadirRecetaAlMenu(sandwich);

        System.out.println("Tiempo medio de preparación: " + restaurante.tiempoMedio() + " minutos");
        System.out.println("Porcentaje de elementos vegetarianos: " + restaurante.porcentajeVegetariano() + "%");
    }
}
