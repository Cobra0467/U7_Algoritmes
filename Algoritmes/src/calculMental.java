import java.util.ArrayList;
import java.util.List;

public class calculMental {
    private String secuencia;

    public calculMental(String secuencia) {
        this.secuencia = secuencia;
    }

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
