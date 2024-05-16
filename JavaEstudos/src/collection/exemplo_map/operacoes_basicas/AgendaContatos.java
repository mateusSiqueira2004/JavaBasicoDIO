package collection.exemplo_map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("nome 1", 123456);
        agendaContatos.adicionarContato("nome 2", 123457);
        agendaContatos.adicionarContato("nome 3", 123458);
        agendaContatos.adicionarContato("nome 4", 123459);


        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisaPorNome("nome 2"));
        
        agendaContatos.removerContato("nome 3");

        agendaContatos.exibirContato();
    }
}
