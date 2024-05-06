package Animal;

public abstract class Animals {
    @Override
    public int hashCode() {
        int result = 21;
        result = result*31+super.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
