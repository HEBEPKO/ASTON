package Animal;

import Interfase.Habitat;

public class Whale extends Mammals implements Habitat {
    public Whale(boolean spine) {
        super(spine);
    }

    @Override
    public void habitat() {
        System.out.println("Живёт в воде");
    }
}
