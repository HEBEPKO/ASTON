package Animal;

import Interfase.Habitat;

public class Bear extends Mammals implements Habitat {
    private boolean wool;

    public Bear(boolean spine) {
        super(spine);
    }

    public Bear(boolean spine, boolean wool) {
        super(spine);
        this.wool = wool;
    }

    public boolean isWool() {
        return wool;
    }

    public void setWool(boolean wool) {
        this.wool = wool;
    }

    @Override
    public void habitat() {
        System.out.println("Живет в лесу");
    }
}
