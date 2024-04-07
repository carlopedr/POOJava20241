/*
Crea una clase llamada Libro que guarde la información de cada uno 
de los libros de una biblioteca.
La clase debe guardar el título del libro, autor/a, número de 
ejemplares del libro (número de ejemplares totales de un determinado 
libro) y número de ejemplares prestados (irá cambiando a
medida que prestamos/devolvemos libros).
*/
package poo2.biblioteca;

public class Libro {
    //atributos
    String titulo;
    String autor;
    int ejemplares;
    int prestados;
    //constructores
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public Libro() {
    }
    //métodos
    /*
    Método prestar() que incremente el atributo correspondiente 
    cada vez que se realice un préstamo del libro. No se podrán 
    prestar libros de los que no queden ejemplares disponibles 
    para prestar. Devuelve true si se ha podido realizar la operación
    y false en caso contrario.
    */
    public boolean prestar(){
        if (this.prestados<this.ejemplares){
            this.prestados++;
            return true;
        }
        else
            return false;
    }
}
