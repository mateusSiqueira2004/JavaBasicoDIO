package condicionais;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        int nota;
        Scanner terminal = new Scanner(System.in);

        while(true){
            System.out.println("Digite a nota: ");
            nota = Integer.parseInt(terminal.nextLine());

            if(nota > 7)
                System.out.println("passou!");
            else if(nota >= 5 && nota <=7)
                System.out.println("Prova de recuperação");
            else
                System.out.println("reprovou!");
            

            System.out.println("Deseja continuar? (S/N)");
            String continua = terminal.nextLine();
            if(continua.equalsIgnoreCase("N"))
                break;
            
        }

        terminal.close();
    }
}
