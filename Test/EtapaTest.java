import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

public class EtapaTest {
    @Test
    public void deveFalharNaExecucaoPorFaltaDeTeste(){
        Etapa etapa = new Etapa();
        Teste.getInstance().addEtapaPendente(etapa);
        Assertions.assertEquals(false, etapa.executar());
    }
    @Test
    public void deveFalharNaExecucaoPorFaltaDeCheckBranches(){
        Etapa etapa = new Etapa();
        CheckBranches.getInstance().addEtapaPendente(etapa);
        Assertions.assertEquals(false, etapa.executar());
    }
    @Test
    public void deveFalharNaExecucaoPorFaltaDeCodeReview(){
        Etapa etapa = new Etapa();
        CodeReview.getInstance().addEtapaPendente(etapa);
        Assertions.assertEquals(false, etapa.executar());
    }
    @Test
    public void deveExecutar(){
        Etapa etapa = new Etapa();
        Assertions.assertEquals(true, etapa.executar());
    }
}
