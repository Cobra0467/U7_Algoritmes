public class SumaDescendent {
        private long numero;

        public SumaDescendent(long numero) {
            this.numero = numero;
        }

        public long suma() {
            String numeroString = String.valueOf(numero);
            long sumaDescendent = 0;

            for (int i = 0; i < numeroString.length(); i++) {
                String subNumeroString = numeroString.substring(i);
                long subNumero = Long.parseLong(subNumeroString);
                sumaDescendent += subNumero;
            }

            return sumaDescendent;
        }

}

