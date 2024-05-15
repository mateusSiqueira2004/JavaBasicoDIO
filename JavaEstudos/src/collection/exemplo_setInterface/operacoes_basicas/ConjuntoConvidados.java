package collection.exemplo_setInterface.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codConvite){
        convidadoSet.add(new Convidado(nome, codConvite));
    }
    public void removerConvidadoPorCodConvite(int codConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodConvite() == codConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set");

        conjuntoConvidados.adicionarConvidado("Nome 1", 1234);
        conjuntoConvidados.adicionarConvidado("Nome 2", 1235);
        conjuntoConvidados.adicionarConvidado("Nome 3", 1236);
        conjuntoConvidados.adicionarConvidado("Nome 4", 1237);

        
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodConvite(1237);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set");

        conjuntoConvidados.exibirConvidados();
    }
}
