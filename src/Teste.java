public class Teste extends Processo{
    private static Teste teste = new Teste();

    private Teste(){}
    public static Teste getInstance(){
        return teste;
    }
}
