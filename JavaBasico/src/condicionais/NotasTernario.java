package condicionais;

import java.util.Scanner;

public class NotasTernario {
    public static void main(String[] args) {
        int nota;
        Scanner terminal = new Scanner(System.in);

        while(true){
            System.out.println("Digite a nota: ");
            nota = Integer.parseInt(terminal.nextLine());

            String resultado = nota >= 7 ? "Passou!" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovou";
            
            System.out.println(resultado);
            

            System.out.println("Deseja continuar? (S/N)");
            String continua = terminal.nextLine();
            if(continua.equalsIgnoreCase("N"))
                break;
            
        }

        terminal.close();
    }
}