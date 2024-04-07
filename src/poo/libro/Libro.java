
package poo.libro;

public class Libro {
//Atributos
    String titulo;
    String autor;
    int ejemplares;
    int prestamos;

    public Libro(String titulo, String autor, int ejemplares, int prestamos) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestamos = prestamos;
    }

    public Libro() {
    }

/*Método prestar() que incremente el atributo 
correspondiente cada vez que se realice un préstamo
del libro. No se podrán prestar libros de los que 
no queden ejemplares disponibles para prestar.
Devuelve true si se ha podido realizar la operación 
y false en caso contrario.    
*/
    public boolean prestar(){
        this.prestamos++;
        if(this.prestamos>this.ejemplares){
            System.out.println("No hay ejemplares para prestamos");
            this.prestamos--;
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestamos=" + prestamos + '}';
    }

/*
    Método devolver() que decrementa el atributo correspondiente cuando se produzca la devolución
de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
    */    
    
    
    
    
}
