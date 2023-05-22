public class HyperPar {
    public static boolean HyperPar(long numeroValor) {
        boolean HyperPar = false;
        String numero = String.valueOf(numeroValor);

        for (int i = 0; i < numero.length(); i++) {
            if (Integer.parseInt(String.valueOf(numero.charAt(i))) % 2 == 0) {
                HyperPar = true;
            } else {
                HyperPar = false;
            }
        }
        return HyperPar;
    }

}
