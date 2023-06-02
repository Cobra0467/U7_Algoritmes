public class SumaDescendent {
        public int suma(long numero) {
            String numeroString = String.valueOf(numero);
            int longitudNumero = numeroString.length();
            int sumaTotal = 0;

            for (int i = 0; i < longitudNumero; i++) {
                String subNumeroString = numeroString.substring(i);
                int digito = Integer.parseInt(subNumeroString);
                sumaTotal += digito;
            }

            return sumaTotal;
        }
}



