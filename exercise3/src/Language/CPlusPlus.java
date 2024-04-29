package Language;

import Interfase.Non_Procedural;
import Interfase.ObjectOriented;

public class CPlusPlus extends ProgramLanguages implements Non_Procedural, ObjectOriented {
    public CPlusPlus(String name) {
        super(name);
    }

    @Override
    public void methodNonProceduralLang() {
        System.out.println("Я " + super.getName() + " - НЕпроцедурный, обьектноореентированный язык программирования");
    }
}
