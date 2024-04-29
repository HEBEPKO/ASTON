package Language;

import Interfase.MachineIndependent;
import Interfase.Procedural;

public class Ci extends ProgramLanguages implements Procedural, MachineIndependent {
    private String peculiarity;

    public Ci(String name) {
        super(name);
        this.peculiarity = "machine-oriented";
    }

    @Override
    public void methodProceduralLang() {
        System.out.println("Я Си - особенный, машиноореентированый, процедурный, высокоуровневый(машинонезависимый) " +
                "язык программирования");
    }
}
