package Language;

import Interfase.Non_Procedural;
import Interfase.ObjectOriented;

public class Basic extends ProgramLanguages implements Non_Procedural, ObjectOriented {
    public Basic(String name) {
        super(name);
    }

    @Override
    public void methodNonProceduralLang() {
        System.out.println("Я " + super.getName() + " - НЕпроцедурный, обьектноореентированный язык программирования");
    }
}
