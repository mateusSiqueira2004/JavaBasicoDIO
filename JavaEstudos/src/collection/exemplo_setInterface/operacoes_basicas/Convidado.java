package collection.exemplo_setInterface.operacoes_basicas;

public class Convidado {
    private String nome;

    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    @Override
    public String toString() {
        return "\n\nConvidado [nome=" + nome + ", codConvite=" + codConvite + "]";
    }
    
}
