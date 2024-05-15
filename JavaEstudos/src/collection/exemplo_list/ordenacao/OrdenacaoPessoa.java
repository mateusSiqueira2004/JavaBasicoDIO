package collection.exemplo_list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);

        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.76);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.60);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 35, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.89);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 15, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 6", 60, 1.60);

        System.out.println("ordenando por Idade: "+ordenacaoPessoa.ordenarPorIdade());

        System.out.println("ordenando por Altura: "+ordenacaoPessoa.ordenarPorAltura());
    }
    
}
