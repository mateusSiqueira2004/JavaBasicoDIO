package exemplos.exemplocadastro;

public class Pessoa {
    private String nome, cpf, endereco;

    public Pessoa (String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
