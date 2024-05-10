package exemplos.exemplo_capsulamento;

public class Carro extends Veiculo {
    
    @Override
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("ligado");
    }
    public void confereCombustivel(){
        System.out.println("conferindo combustivel");
    }
    public void confereCambio(){
        System.out.println("conferindo cambio");
    }
}
