package exemplos.exemploenum;

public class SistemaIbge {
    public static void main(String[] args) {
        for(ExemploEnum e: ExemploEnum.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        ExemploEnum ee = ExemploEnum.PIAUI;
        System.out.println(ee.getNome());
        System.out.println(ee.getSigla());
        System.out.println(ee.getNomeMaiusculo());
    }
}
