package collection.exemplo_map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
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
            for(Produto p = estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
