public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? \n" + smartTv.ligada);
        System.out.println("\nCanal atual: \n" + smartTv.canal);
        System.out.println("\nVolume atual: \n" + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nTV ligada? \n" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("\nTV ligada? \n" + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("\nVolume atual: \n" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("\nCanal atual: \n" + smartTv.canal);
    }
}
