/*Crear una clase llamada Alumno con los atributos privados:
• String nombre
• double[] notas (array que tendrá 3 elementos, y que va a guardar 
las notas de cada una de las tres evaluaciones del alumno)
Implementa el siguiente constructor:
• Alumno (String nombre) (el constructor no recibe el array de 
notas, sino que lo crea. Al crearse un array Java lo rellena 
automáticamente con 0, así que de este modo se va a considerar 
que una evaluación no tiene nota aún si en el array, en su 
posición, hay un cero)
Implementa los siguientes métodos públicos:
• Getter y setter para el atributo nombre.
• int numeroNotas( ). Devuelve el número de notas del alumno.
• double notaMaxima( ). Devuelve la nota máxima del alumno. -1 si no tiene notas.
• boolean tieneNota(int evaluacion). Da true si el alumno tiene nota para la evaluación
indicada. False si no, o número de evaluación no válida.
• double getNota(int evaluacion). Devuelve la nota de la evaluación pasada como
parámetro. -1 si la evaluación no es válida o no hay nota
Crea una clase Prueba con un main y con un array con varios alumnos para probar todas las
funcionalidades de la clase Alumno a través de sus métodos.*/
package poo.Alumno;

public class Alumno {

    private String nombre;
    private double[] notas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        notas = new double[3];

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas[0] + "-" + notas[1] + '-' + notas[2] + '}';
    }

    /*
boolean ponerNota(int evaluacion, double nota). 
Guardará la nota correspondiente a la evaluación indicada. 
Las notas van del 1 al 10 y las evaluaciones del 1 al 3. 
Devuelve false si los parámetros no son válidos.
     */
    public boolean ponerNota(int evaluacion, double nota) {
        int pos;
        //Validar evaluación
        switch (evaluacion) {
            case 1:
            case 2:
            case 3:
                pos = evaluacion - 1;
                break;
            default:
                return false;
        }
        //Validar nota
        if (nota >= 1 & nota <= 10) {
            notas[pos] = nota;
            return true;
        } else {
            return false;
        }
    }

    /*
• boolean borrarNota(int evaluacion). 
Borra la nota de la evaluación indicada. Da false si
los parámetros no son válidos.
     */
    public boolean borrarNota(int evaluacion) {
        //Validar evaluación
        switch (evaluacion) {
            case 1:
            case 2:
            case 3:
                notas[evaluacion - 1] = 0;
                return true;
            default:
                return false;
        }
    }

    /*
• double getNota(int evaluacion). Devuelve la nota de la 
evaluación pasada como parámetro. -1 si la evaluación no es válida o no hay nota    
     */
    public double getNota(int evaluacion) {
         //Validar evaluación
        switch (evaluacion) {
            case 1:
            case 2:
            case 3:
                return notas[evaluacion - 1];
            default:
                return -1;
        }

    }
}
