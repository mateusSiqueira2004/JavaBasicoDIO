package collection.exemplo_map.ordenacao;

public class Evento {
    private String atracao, nome;

    public Evento(String nome, String atracao) {
        this.atracao = atracao;
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\n\nEvento [atracao=" + atracao + ", nome=" + nome + "]";
    }

    
}
