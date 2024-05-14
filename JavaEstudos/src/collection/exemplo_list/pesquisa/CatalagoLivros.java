package collection.exemplo_list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;
    public CatalagoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLibros(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo =l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLibros("titulo 1", "autor 1", 2022);
        catalagoLivros.adicionarLibros("titulo 2", "autor 1", 2023);
        catalagoLivros.adicionarLibros("titulo 3", "autor 2", 2010);
        catalagoLivros.adicionarLibros("titulo 4", "autor 3", 2016);
        catalagoLivros.adicionarLibros("titulo 4", "autor 4", 2022);

        System.out.println(catalagoLivros.pesquisarPorAutor("autor 2"));
        System.out.println(catalagoLivros.pesquisarPorAutor("autor 1"));

        System.out.println(catalagoLivros.pesquisarPorIntervaloDeAnos(2022, 2023));

        System.out.println(catalagoLivros.pesquisarPorTitulo("titulo 4"));
    }
}
