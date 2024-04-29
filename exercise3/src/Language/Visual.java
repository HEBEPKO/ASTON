package Language;

import Interfase.Non_Procedural;
import Interfase.ObjectOriented;

public class Visual extends ProgramLanguages implements Non_Procedural, ObjectOriented {

    public Visual(String name) {
        super(name);
    }



    @Override
    public void methodNonProceduralLang() {
        System.out.println("Я " + super.getName() + " - НЕпроцедурный, обьектноореентированный язык программирования");
    }
}
