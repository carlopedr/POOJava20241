package poo2.Libro;

public class Libro {

    private String titulo;
    private int numpaginas;
    private Autor aut;

    public Libro(String titulo, int numpaginas, Autor aut) {
        this.titulo = titulo;
        this.numpaginas = numpaginas;
        this.aut = aut;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public Autor getAut() {
        return aut;
    }

    public void setAut(Autor aut) {
        this.aut = aut;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", numpaginas=" + numpaginas + ", aut=" + aut + '}';
    }
    
    

}
