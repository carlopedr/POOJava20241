
package talleres;

import java.util.Random;


public class Eval1 {
     public static void main(String[] args) {
        String[] jockeys = {"Ana", "Pedro", "Juan", "Cesar", "Diana", "Maria"};
        
        int[][] carreras = generarDatosCarrerasAleatorias(jockeys);
        int[][] resultados = calcularResultados(carreras, jockeys);
        int[] puntuacion = calcularPuntuacion(resultados);
        int[] podio = calcularPodio(jockeys, resultados);
        
        System.out.println("Resultados del torneo:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Carrera " + i + ":");
            System.out.println("Primer lugar: " + jockeys[resultados[i][0]]);
            System.out.println("Segundo lugar: " + jockeys[resultados[i][1]]);
            System.out.println("Tercer lugar: " + jockeys[resultados[i][2]]);
        }
        
        System.out.println("\nPuntuación de los jockeys:");
        for (int i = 0; i < puntuacion.length; i++) {
            System.out.println(jockeys[i] + " - Carreras ganadas: " + resultados[i][3] +
                    ", Segundos lugares: " + resultados[i][4] + ", Terceros lugares: " + resultados[i][5] +
                    ", Puntaje total: " + puntuacion[i]);
        }
        
        System.out.println("\nPodio del torneo hípico:");
        for (int i = 0; i < podio.length; i++) {
            System.out.println((i+1) + ". " + jockeys[podio[i]]);
        }
    }

    public static int[][] generarDatosCarrerasAleatorias(String[] jockeys) {
        Random rand = new Random();
        int nCarreras = rand.nextInt(20) + 1;
        int[][] carreras = new int[nCarreras][3]; 

        for (int i = 0; i < nCarreras; i++) {
            carreras[i][0] = rand.nextInt(jockeys.length);
            carreras[i][1] = rand.nextInt(jockeys.length);
            carreras[i][2] = rand.nextInt(jockeys.length); 
        }

        return carreras;
    }

    public static int[][] calcularResultados(int[][] carreras, String[] jockeys) {
        int[][] resultados = new int[jockeys.length][6]; 
        for (int[] carrera : carreras) {
            int ganador = carrera[0];
            int segundo = carrera[1];
            int tercero = carrera[2];
            resultados[ganador][3]++; 
            resultados[segundo][4]++; 
            resultados[tercero][5]++; 
        }

        return resultados;
    }

    public static int[] calcularPuntuacion(int[][] resultados) {
        int[] puntajes = new int[resultados.length];

        for (int i = 0; i < resultados.length; i++) {
            puntajes[i] = resultados[i][3] * 5 + resultados[i][4] * 3 + resultados[i][5];
        }

        return puntajes;
    }

    public static int[] calcularPodio(String[] jockeys, int[][] resultados) {
        int primero = 0;
        int segundo = -1;
        int tercero = -1;

        for (int i = 1; i < resultados.length; i++) {
            if (resultados[i][3] > resultados[primero][3]) {
                tercero = segundo;
                segundo = primero;
                primero = i;
            } else if (segundo == -1 || resultados[i][3] > resultados[segundo][3]) {
                tercero = segundo;
                segundo = i;
            } else if (tercero == -1 || resultados[i][3] > resultados[tercero][3]) {
                tercero = i;
            }
        }

        int[] podio = {primero, segundo, tercero};
        return podio;
    }
}
