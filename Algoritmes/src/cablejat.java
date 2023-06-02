import java.util.ArrayList;

public class cablejat {
    public boolean esPotConnectar(ArrayList<String> cables) {
        int contadorHembras = 0;
        int contadorMachos = 0;

        for (String cable : cables) {
            for (int i = 0; i < cable.length(); i++) {
                String digito = String.valueOf(cable.charAt(i));
                if (digito.equalsIgnoreCase("M")) {
                    contadorMachos++;
                } else if (digito.equalsIgnoreCase("F")) {
                    contadorHembras++;
                }
            }
        }

        return contadorMachos == contadorHembras;
    }
}
