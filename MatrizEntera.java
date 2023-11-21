import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * MatrizEntera es una clase que encapsula una matriz de
 * numeros enteros, con funcionalidades para inicializar
 * aleatoriamente la matriz, imprimirla por pantalla o
 * en fichero y trasponerla.
 *
 * @author Mónica
 * @author Alicia Garcia
 * @version 1.0
 */
    public class MatrizEntera {
    /**
     * Numero de filas de la matriz
     */
        private final int FILAS;
    /**
     * Numero de columnas de la matriz
     */
        private final int COLUMNAS;
    /**
     * Matriz de enteros
     */
        private int[][] matriz;

    /**
     * Instancia una nueva matriz entera de tamaño
     * filas por columnas
     *
     * @param filas el numero de filas de la matriz
     * @param columnas el numero de columnas de la matriz
     */
        public MatrizEntera(int filas, int columnas) {
            this.COLUMNAS = columnas;
            this.FILAS = filas;
            matriz = new int[filas][columnas];
        }
        public int getValor(int fila, int columna) {
            return matriz[fila][columna];
        }
        public void iniciarAleatorio(Random rand) {
            for (int f=0; f<FILAS; f++)
                for (int c=0; c<COLUMNAS; c++) {
                    matriz[f][c] = rand.nextInt();
                }
        }

    public void imprimir() {
        for (int f=0; f<FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
    public void imprimirEnFichero(String fichero) throws IOException {
        PrintWriter pw = new PrintWriter(fichero);
        for (int f=0; f<FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                pw.print(matriz[f][c] + " ");
            }
            pw.println();
        }
        pw.close();
    }

    /**
     * Traspone la matriz de enteros.
     * Para ello se lleva a cabo un recorrido por la matriz
     * y se intercambian los valores de la diagonal
     * superior con los de la diagonal inferior.
     */
    public void transponer() {
        for (int f=0; f<FILAS; f++)
            for (int c=0; c<COLUMNAS; c++) {
                int aux = matriz[f][c];
                matriz[f][c]=matriz[c][f];
                matriz[c][f]=aux;
            }
    }
}