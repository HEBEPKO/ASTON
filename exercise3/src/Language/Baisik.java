package Language;

import Interfase.MachineIndependent;
import Interfase.Procedural;

public class Baisik extends ProgramLanguages implements Procedural, MachineIndependent {
    public Baisik(String name) {
        super(name);
    }

    @Override
    public void methodProceduralLang() {
        System.out.println("Я Бейсик - процедурный, высокоуровневый(машинонезависимый) язык программирования");
    }
}
