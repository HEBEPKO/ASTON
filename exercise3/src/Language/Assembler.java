package Language;

import Interfase.MachineDependent;
import Interfase.Procedural;

public class Assembler extends ProgramLanguages implements Procedural, MachineDependent {
    public Assembler(String name) {
        super(name);
    }

    @Override
    public void methodProceduralLang() {
        System.out.println("Я " + super.getName() + " - процедурный, низкоуровневый(машинозависимый) язык программирования");
    }
}
