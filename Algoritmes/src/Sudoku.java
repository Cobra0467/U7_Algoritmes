import java.util.HashSet;
import java.util.Set;


/**
 * Clase que representa un juego de Sudoku.
 * Permite verificar si un Sudoku está correctamente resuelto y si está completo.
 */
public class Sudoku {
    private int[][] grid;

    /**
     * Verifica si el Sudoku está correctamente resuelto.
     * @param grid Una matriz 9x9 que representa el Sudoku completo.
     * @return {@code true} si el Sudoku es válido, {@code false} en caso contrario.
     */
    public Sudoku(int[][] grid) {
        // Implementación del constructor

        this.grid = grid;
    }

    public boolean esCorrecte() {
        // Implementación del método esCorrecto

        // Comprobar filas
        for (int i = 0; i < 9; i++) {
            if (!esFilaCorrecta(i)) {
                return false;
            }
        }

        // Comprobar columnas
        for (int j = 0; j < 9; j++) {
            if (!esColumnaCorrecta(j)) {
                return false;
            }
        }

        // Comprobar regiones
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!esRegionCorrecta(i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Verifica si una fila del Sudoku es correcta.
     * @param fila El número de la fila a verificar.
     * @return {@code true} si la fila es válida, {@code false} en caso contrario.
     */
    private boolean esFilaCorrecta(int fila) {
        // Implementación del método esFilaCorrecta

        Set<Integer> numeros = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            int numero = grid[fila][j];
            if (numero < 1 || numero > 9 || numeros.contains(numero)) {
                return false;
            }
            numeros.add(numero);
        }
        return true;
    }

    /**
     * Verifica si una columna del Sudoku es correcta.
     * @param columna El número de la columna a verificar.
     * @return {@code true} si la columna es válida, {@code false} en caso contrario.
     */
    private boolean esColumnaCorrecta(int columna) {
        // Implementación del método esColumnaCorrecta

        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            int numero = grid[i][columna];
            if (numero < 1 || numero > 9 || numeros.contains(numero)) {
                return false;
            }
            numeros.add(numero);
        }
        return true;
    }

    /**
     * Verifica si una región del Sudoku es correcta.
     * @param filaInicial La fila inicial de la región.
     * @param columnaInicial La columna inicial de la región.
     * @return {@code true} si la región es válida, {@code false} en caso contrario.
     */
    private boolean esRegionCorrecta(int filaInicial, int columnaInicial) {
        // Implementación del método esRegionCorrecta

        Set<Integer> numeros = new HashSet<>();
        for (int i = filaInicial; i < filaInicial + 3; i++) {
            for (int j = columnaInicial; j < columnaInicial + 3; j++) {
                int numero = grid[i][j];
                if (numero < 1 || numero > 9 || numeros.contains(numero)) {
                    return false;
                }
                numeros.add(numero);
            }
        }
        return true;
    }

    /**
     * Verifica si el Sudoku está completo, es decir, si no contiene casillas vacías.
     * @return {@code true} si el Sudoku está completo, {@code false} en caso contrario.
     */
    public boolean esSudokuCompleto() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    return false; // Si hay una casilla vacía, el sudoku no está completo
                }
            }
        }
        return true; // Si no se encontraron casillas vacías, el sudoku está completo
    }

}
