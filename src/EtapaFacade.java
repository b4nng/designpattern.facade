public class EtapaFacade {
    public static boolean verificarPendenciasExecucao(Etapa etapa){
        if (CodeReview.getInstance().verificaEtapaPendente(etapa)){
            return false;
        }
        if (CheckBranches.getInstance().verificaEtapaPendente(etapa)){
            return false;
        }
        if (Teste.getInstance().verificaEtapaPendente(etapa)){
            return false;
        }
        return true;
    }
}
