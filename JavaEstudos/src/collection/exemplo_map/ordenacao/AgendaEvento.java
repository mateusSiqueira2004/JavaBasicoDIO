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
        
    }
}
