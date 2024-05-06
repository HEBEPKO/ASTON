package Animal;

import Interfase.Habitat;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Bear extends Mammals implements Habitat {
    private static AtomicInteger idGenerator = new AtomicInteger(0);
    Integer id;
    private boolean wool;
    private String color;

    public Bear(boolean spine) {
        super(spine);
        this.id = Integer.valueOf(generateId());
    }

    public Bear(boolean spine, boolean wool) {
        super(spine);
        this.wool = wool;
        this.id = Integer.valueOf(generateId());
    }

    public Bear(boolean spine, boolean wool, String color) {
        super(spine);
        this.wool = wool;
        this.color = color;
        this.id = Integer.valueOf(generateId());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWool() {
        return wool;
    }

    public void setWool(boolean wool) {
        this.wool = wool;
    }

    private int generateId() {
        return idGenerator.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    @Override
    public void habitat() {
        System.out.println("Живет в лесу");
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Bear bear)) return false;
//        return isWool() == bear.isWool() && getColor().equals(bear.getColor());
//    }
//
//    @Override
//    public int hashCode() {
//        int result = 21;
//        result = result*31 + (color != null? color.hashCode() :0);
//        result = result*31 + getId();
//        result = result*31 + (wool?21:0);
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bear bear)) return false;
        if (!super.equals(o)) return false;
        return isWool() == bear.isWool() && Objects.equals(getId(), bear.getId()) && Objects.equals(getColor(), bear.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), isWool(), getColor());
    }
}
