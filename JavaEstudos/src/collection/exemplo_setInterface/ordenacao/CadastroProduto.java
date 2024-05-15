package collection.exemplo_setInterface.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);

        return produtoPorNome;
    }
    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("nome 1", 123456, 20.5, 99);
        cadastroProduto.adicionarProduto("nome 2", 123457, 26.5, 19);
        cadastroProduto.adicionarProduto("nome 3", 123458, 30.1, 22);
        cadastroProduto.adicionarProduto("nome 4", 123459, 50.99, 56);

        cadastroProduto.exibirProdutoPorNome();

        cadastroProduto.exibirProdutoPorPreco();
    }
    
}
