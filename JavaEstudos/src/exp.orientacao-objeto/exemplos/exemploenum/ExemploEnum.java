package exemplos.exemploenum;

public enum ExemploEnum {
    SAO_PAULO ("SP","São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "Maranhão"),
    CEARA ("CE", "Ceará")
    ;

    private String nome, sigla;

    private ExemploEnum(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
