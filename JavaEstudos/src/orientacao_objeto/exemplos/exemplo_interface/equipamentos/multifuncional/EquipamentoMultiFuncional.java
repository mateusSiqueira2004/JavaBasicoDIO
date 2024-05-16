package exemplos.exemplo_interface.equipamentos.multifuncional;

import exemplos.exemplo_interface.equipamentos.copiadora.Copiadora;
import exemplos.exemplo_interface.equipamentos.digitalizadora.Digitalizadora;
import exemplos.exemplo_interface.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Impressora, Copiadora, Digitalizadora{
    public void imprimir(){
        System.out.println("imprimindo pela multifuncional");
    }
    public void copiar(){
        System.out.println("Copiando pela multifuncional");
    }
    public void digitalizar(){
        System.out.println("Digitalizando pela multifuncional");
    }
    
}
