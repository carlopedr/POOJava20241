package poo.Restaurante;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dc558
 */
public class Restaurante {

    private Map<String, IFastFood> mapaRecetasRestaurante;
    private Menu menu;

    public Restaurante() {
        this.mapaRecetasRestaurante = new HashMap<>();
        this.menu = new Menu();
    }

    public void crearReceta(String nombre, IFastFood receta) {
        mapaRecetasRestaurante.put(nombre, receta);
        System.out.println("THM:" + mapaRecetasRestaurante.size());

    }

    public void anadirRecetaAlMenu(IFastFood receta) {
        menu.getElementos().add(receta);
    }

    public double tiempoMedio() {
        List<IFastFood> recetas = menu.getElementos();
        if (recetas.isEmpty()) {
            return -1;
        }
        int totalTiempo = 0;
        for (IFastFood receta : recetas) {
            totalTiempo += receta.tiempoDePreparacion();
        }
        return (double) totalTiempo / (double) recetas.size();
    }

    public double porcentajeVegetariano() {
        List<IFastFood> recetas = menu.getElementos();
        if (recetas.isEmpty()) {
            return 0;
        }
        int vegetarianoCount = 0;

        for (IFastFood receta : recetas) {
            if (receta.isVegetariano()) {
                vegetarianoCount++;
            }
        }
        return ((double) vegetarianoCount / recetas.size()) * 100;
    }
}
