import Language.Basic;
import Language.Java;
import Language.ProgramLanguages;

public class Main {
    public static void main(String[] args) {
        Basic newBasic = new Basic("Basic");
        newBasic.methodNonProceduralLang();
        Java java = new Java("Java");
        java.methodNonProceduralLang();
    }
}