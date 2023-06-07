import java.util.HashSet;
import java.util.Set;

public class Sudoku {
    private int[][] grid;

    public Sudoku(int[][] grid) {
        this.grid = grid;
    }

    public boolean esCorrecte() {
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

    private boolean esFilaCorrecta(int fila) {
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

    private boolean esColumnaCorrecta(int columna) {
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

    private boolean esRegionCorrecta(int filaInicial, int columnaInicial) {
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
