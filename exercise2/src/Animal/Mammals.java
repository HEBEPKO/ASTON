package Animal;

public class Mammals extends Animals {
    private boolean spine = true;

    public Mammals(boolean spine) {
        this.spine = spine;
    }

    public boolean isSpine() {
        return spine;
    }
}
