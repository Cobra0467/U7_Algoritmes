import java.util.ArrayList;
import java.util.List;


/**
 * La clase `calculMental` realiza cálculos mentales basados en una secuencia de operaciones.
 * @author Iván Ibáñez
 * @title Tasca3 EEDD
 */

public class calculMental {
    private String secuencia;

    /**
     * Construye un objeto `calculMental` con la secuencia de operaciones especificada.
     *
     * @param secuencia La secuencia de operaciones a utilizar.
     */
    public calculMental(String secuencia) {
        this.secuencia = secuencia;
    }

    /**
     * Realiza los cálculos mentales basados en la secuencia de operaciones y devuelve una lista de resultados parciales.
     *
     * @return Una lista de resultados parciales de cada operación.
     */
    public List<Integer> calcula() {
        List<Integer> resultados = new ArrayList<>();
        String[] operaciones = secuencia.split("[+-]");

        int resultado = Integer.parseInt(operaciones[0].trim());
        int j = 1;

        for (char operador : secuencia.toCharArray()) {
            if (operador == '+') {
                resultado += Integer.parseInt(operaciones[j].trim());
                resultados.add(resultado);
                j++;
            } else if (operador == '-') {
                resultado -= Integer.parseInt(operaciones[j].trim());
                resultados.add(resultado);
                j++;
            }
        }

        return resultados;
    }
}
