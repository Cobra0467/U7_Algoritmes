import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase Sudoku.
 * Contiene pruebas unitarias para verificar el comportamiento de la clase Sudoku.
 * @author Iván Ibáñez
 * @title Tasca3 EEDD
 */
public class SudokuTest {

    /**
     * Prueba que verifica un Sudoku correctamente resuelto.
     */
    @Test
    void testSudokuCorrecte() {
        int[][] grid = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        // Ejecución del caso de prueba
        Sudoku sudoku = new Sudoku(grid);
        Assertions.assertTrue(sudoku.esCorrecte());
    }

    /**
     * Prueba que verifica un Sudoku incorrectamente resuelto.
     */
    @Test
    void testSudokuIncorrecte() {
        // Configuración del caso de prueba
        int[][] grid = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 2} // Número repetido (2) en la última casilla
        };

        // Ejecución del caso de prueba
        Sudoku sudoku = new Sudoku(grid);
        Assertions.assertFalse(sudoku.esCorrecte());
    }

    /**
     * Prueba adicional que verifica un Sudoku correctamente resuelto.
     */
    @Test
    void testSudokuCorrecte2() {
        // Configuración del caso de prueba

        int[][] grid = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        // Ejecución del caso de prueba

        Sudoku sudoku = new Sudoku(grid);
        Assertions.assertTrue(sudoku.esCorrecte());
    }

    /**
     * Prueba adicional que verifica un Sudoku incorrectamente resuelto.
     */
    @Test
    void testSudokuIncorrecte2() {
        // Configuración del caso de prueba

        int[][] grid = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 2} // Número repetido (2) en la última casilla
        };

        // Ejecución del caso de prueba
        Sudoku sudoku = new Sudoku(grid);
        Assertions.assertFalse(sudoku.esCorrecte());
    }


    /**
     * Prueba que verifica un Sudoku completo correctamente resuelto.
     */
    @Test
    void testSudokuCompleto() {
        int[][] grid = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        // Ejecución del caso de prueba
        Sudoku sudoku = new Sudoku(grid);
        Assertions.assertTrue(sudoku.esSudokuCompleto());
    }

    /**
     * Prueba que verifica un Sudoku incompleto correctamente detectado.
     */
    @Test
    void testSudokuNoCompleto() {
        // Configuración del caso de prueba
        int[][] grid = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 0} // Casilla vacía representada por 0
        };

        // Ejecución del caso de prueba
        Sudoku sudoku = new Sudoku(grid);
        Assertions.assertFalse(sudoku.esSudokuCompleto());
    }
}
