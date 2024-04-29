package AreCommonClass;

public class Wheels {
    private Integer diameter;
    private String nameBrand;


    public Wheels(Integer diameter, String nameBrand) {
        this.diameter = diameter;
        this.nameBrand = nameBrand;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Wheels{").append("diameter=")
                .append(diameter).append(" дюймом, nameBrand='").append(nameBrand)
                .append('\'').append('}'));
    }
}
