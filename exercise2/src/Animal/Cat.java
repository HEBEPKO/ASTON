package Animal;

public class Cat extends Mammals{
    private boolean wool;

    public Cat(boolean spine) {
        super(spine);
    }

    public Cat(boolean spine, boolean wool) {
        super(spine);
        this.wool = wool;
    }

    public boolean isWool() {
        return wool;
    }

    public void setWool(boolean wool) {
        this.wool = wool;
    }
}
