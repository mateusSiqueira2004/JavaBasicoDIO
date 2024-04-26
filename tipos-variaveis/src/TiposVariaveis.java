public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        System.out.println(numero);

        numero = 2;

        System.out.println(numero);

        final int NUMERO_IMUTAVEL = 1;

        System.out.println(NUMERO_IMUTAVEL);
        
        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);

    }
}
