
package colections;

public class Auto implements Comparable<Auto> {
    private int id;
    private String placa;
    private String color;

    public Auto(int id, String placa, String color) {
        this.id = id;
        this.placa = placa;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", placa=" + placa + ", color=" + color + '}';
    }

    @Override
    public int compareTo(Auto o) {
        return this.getId()-o.getId();
        
        
    }
    
    
}
