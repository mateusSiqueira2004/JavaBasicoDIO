package exemplos.exemplo_capsulamento;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("151515");
        jeep.ligar();
        Moto z400 = new Moto();
        z400.setChassi("151561");
        z400.ligar();
    }
}
