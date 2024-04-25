package AreCommonClass;

public class Person {
    private String name;
    private String surname;
    private String fullName;
    private String pilotRank;

    public Person(String name, String surname, String pilotRank) {
        this.name = name;
        this.surname = surname;
        this.pilotRank = pilotRank;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String name, String surname) {
        this.fullName = name + surname;
    }

    public String getPilotRank() {
        return pilotRank;
    }

    public void setPilotRank(String pilotRank) {
        this.pilotRank = pilotRank;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Person{").append("fullName='")
                .append(getFullName()).append(", pilotRank='").append(pilotRank).append('}'));
    }
}
