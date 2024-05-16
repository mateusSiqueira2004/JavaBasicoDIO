package collection.exemplo_map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutoMap);
    }
    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProduto(123, "nome 1", 30, 15.0);
        estoqueProduto.adicionarProduto(124, "nome 2", 20, 20.0);
        estoqueProduto.adicionarProduto(125, "nome 3", 60, 19.99);
        estoqueProduto.adicionarProduto(126, "nome 4", 35, 20.50);

        estoqueProduto.exibirProduto();

        String valorFormatado = String.format("%.2f", estoqueProduto.calculaValorTotalEstoque());
        System.out.println(valorFormatado);

        System.out.println(estoqueProduto.obterProdutoMaisCaro());
        
    }
}
