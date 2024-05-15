package collection.exemplo_setInterface.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Nome 1", 123456781);
        agendaContato.adicionarContato("Nome 2", 123456782);
        agendaContato.adicionarContato("Nome 3", 123456783);
        agendaContato.adicionarContato("Nome 4", 123456784);
        agendaContato.adicionarContato("Nome 5", 123456785);

        agendaContato.exibirContato();
        System.out.println("\n\nPesquisando Contato");
        agendaContato.pesquisarPorNome("Nome 5");
        agendaContato.exibirContato();
        
        System.out.println("\n\nAtualizando Contato");
        agendaContato.atualizarNumeroContato("Nome 5", 123456786);
        agendaContato.exibirContato();
    }
}
