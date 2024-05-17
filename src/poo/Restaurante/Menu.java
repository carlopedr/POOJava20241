/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.Restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dc558
 */
public class Menu {
    private List<IFastFood> elementos;

    public Menu() {
    this.elementos = new ArrayList<>();
    }

    public void setElementos(List<IFastFood> elementos) {
        this.elementos = elementos;
    }

    public List<IFastFood> getElementos() {
        return elementos;
    }
    
}
