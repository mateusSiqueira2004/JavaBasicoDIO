package collection.exemplo_map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento(){this.eventoMap = new HashMap<>();}

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoOrdenado = new TreeMap<>(eventoMap);
        System.out.println(eventoOrdenado);
    }
    public void obterProximoEvento(){
       LocalDate dataAtual = LocalDate.now();
       Map<LocalDate, Evento> eventoOrdenado = new TreeMap<>(eventoMap);
       for (Map.Entry<LocalDate, Evento> entry : eventoOrdenado.entrySet()) {
           if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: "+ entry.getValue() + " acontecera na data " + entry.getKey());
                break;
           }
       }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        agendaEvento.adicionarEvento(LocalDate.of(2024, 12, 10), "nome 1", "atracao 1");
        agendaEvento.adicionarEvento(LocalDate.of(2024, 11, 30), "nome 2", "atracao 2");
        agendaEvento.adicionarEvento(LocalDate.of(2024, 12, 15), "nome 3", "atracao 3");

        agendaEvento.exibirAgenda();

        agendaEvento.obterProximoEvento();
    }
}
