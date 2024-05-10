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

        System.out.println("\n------------------\nOperadores\n\n");
        int numero1 = 1, numero2 = 2; 

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2?\n" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente a numero2?\n" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior a numero2?\n" + simNao);

        if(numero1 < numero2){
            System.out.println("numero1 é menor que numero2");
        }

        String nome1 = "Mateus";
        String nome2 = new String("Mateus");

        System.out.println(nome1.equals(nome2));

        System.out.println("\n------------------\nOperadores Lógicos\n\n");

        boolean condicional1 = true;
        boolean condicional2 = false;

        if(condicional1 && (7>4)){
            System.out.println("são verdadeiras");
        }
        if(condicional1 || condicional2){
            System.out.println("uma das condicoes é verdadeira");
        }

    }
}
