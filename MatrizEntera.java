import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * MatrizEntera es
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
     * @param filas
     * @param columnas
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
    public void transponer() {
        for (int f=0; f<FILAS; f++)
            for (int c=0; c<COLUMNAS; c++) {
                int aux = matriz[f][c];
                matriz[f][c]=matriz[c][f];
                matriz[c][f]=aux;
            }
    }
}