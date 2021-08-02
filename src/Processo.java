import java.util.ArrayList;
import java.util.List;

public abstract class Processo {
    private List<Etapa> etapasPendentes = new ArrayList<Etapa>();

    public void addEtapaPendente(Etapa etapa) { this.etapasPendentes.add(etapa); }

    public boolean verificaEtapaPendente(Etapa etapa) {return etapasPendentes.contains(etapa);};
}
