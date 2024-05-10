package exemplos.exemplo_interface.equipamentos.impressora;

public class Deskjet implements  Impressora{
    @Override
    public void imprimir(){
        System.out.println("imprimindo com Desk Jet");
    }
}
