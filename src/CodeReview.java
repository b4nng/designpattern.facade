public class CodeReview extends Processo{
    private static CodeReview codeReview = new CodeReview();

    private CodeReview(){}
    public static CodeReview getInstance(){
        return codeReview;
    }
}
