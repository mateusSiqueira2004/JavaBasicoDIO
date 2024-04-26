public class Operadores {
    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        System.out.println("\n------------------\nAritmetica\n\n");
        int numero = 5;

        System.out.println(- numero);
        System.out.println(numero);

        numero =- numero;

        System.out.println(numero);

        numero = numero *-1;

        System.out.println(numero);
        
        numero = numero + 2;

        System.out.println(numero);

        System.out.println( ++ numero);

        System.out.println("\n------------------\nBooleans\n\n");

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

        System.out.println("\n------------------\nTernários\n\n");

        int a = 5, b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";
        
        System.out.println(resultado);
    }
}
