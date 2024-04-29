package Language;

import Interfase.BrainTeaser;
import Interfase.Declarative;
import Interfase.Non_Procedural;

public class Prologue extends ProgramLanguages implements Non_Procedural, Declarative, BrainTeaser {
    public Prologue(String name) {
        super(name);
    }

    @Override
    public void methodNonProceduralLang() {
        System.out.println("Я " + super.getName() + " - НЕпроцедурный, декларотивный, логический язык программирования");
    }
}
