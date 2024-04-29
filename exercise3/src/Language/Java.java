package Language;

import Interfase.Non_Procedural;
import Interfase.ObjectOriented;

public class Java extends ProgramLanguages implements Non_Procedural, ObjectOriented {
    public Java(String name) {
        super(name);
    }

    @Override
    public void methodNonProceduralLang() {
        System.out.println("Я " + super.getName() + " - НЕпроцедурный, обьектноореентированный язык программирования");
    }
}
