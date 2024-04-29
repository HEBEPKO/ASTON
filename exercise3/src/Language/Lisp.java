package Language;

import Interfase.Declarative;
import Interfase.Functional;
import Interfase.Non_Procedural;

public class Lisp extends ProgramLanguages implements Non_Procedural, Declarative, Functional {
    public Lisp(String name) {
        super(name);
    }

    @Override
    public void methodNonProceduralLang() {
        System.out.println("Я " + super.getName() + " - НЕпроцедурный, декларотивный, функциональный язык программирования");
    }
}
