package Language;

import Interfase.MachineIndependent;
import Interfase.Procedural;

public class Fortran extends ProgramLanguages implements Procedural, MachineIndependent {
    public Fortran(String name) {
        super(name);
    }

    @Override
    public void methodProceduralLang() {
        System.out.println("Я " + super.getName() + " - процедурный, высокоуровневый(машинонезависимый) язык программирования");
    }
}
