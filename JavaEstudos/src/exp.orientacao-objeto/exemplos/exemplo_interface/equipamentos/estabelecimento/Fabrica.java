package exemplos.exemplo_interface.equipamentos.estabelecimento;

import exemplos.exemplo_interface.equipamentos.copiadora.Copiadora;
import exemplos.exemplo_interface.equipamentos.digitalizadora.Digitalizadora;
import exemplos.exemplo_interface.equipamentos.multifuncional.EquipamentoMultiFuncional;
import exemplos.exemplo_interface.equipamentos.impressora.Deskjet;
import exemplos.exemplo_interface.equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
        
    }
}
