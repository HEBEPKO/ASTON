package Animal;

import Interfase.Habitat;

public class Fish extends Animals implements Habitat {
    @Override
    public void habitat() {
        System.out.println("Живёт в воде");
    }
}
