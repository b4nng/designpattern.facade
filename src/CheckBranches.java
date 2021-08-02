public class CheckBranches extends Processo{
    private static CheckBranches checkBranches = new CheckBranches();

    private CheckBranches(){}
    public static CheckBranches getInstance(){
        return checkBranches;
    }
}
