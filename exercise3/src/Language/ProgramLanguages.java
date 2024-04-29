package Language;

public abstract class ProgramLanguages {
    String name;

    public ProgramLanguages(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
