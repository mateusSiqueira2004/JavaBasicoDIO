package exemplos.exemplo_interface.equipamentos.impressora;

public class Laser implements Impressora {
    @Override
    public void imprimir(){
        System.out.println("imprimindo com Laser Jet");
    }
}
