import Animal.Animals;
import Animal.Bear;

public class Main {
    public static void main(String[] args) {
        Bear newBear = new Bear(true,true,"brown");
        Bear newBear1 = newBear;
        Bear newBear2 = new Bear(true,true,"brown");
        Bear newBear3 = new Bear(true,true,"brownLight");
        Animals newBear4 = new Bear(true,false,"white");
        newBear.habitat();

        System.out.println("newBear hash = " + newBear.hashCode() + ", " + newBear.getId());
        System.out.println("newBear1 hash = " + newBear1.hashCode() + ", " + newBear1.getId());
        System.out.println(newBear1.equals(newBear2));
        System.out.println("newBear2 hash = " + newBear2.hashCode() + ", " + newBear2.getId());
        System.out.println("newBear3 hash = " + newBear3.hashCode() + ", " + newBear3.getId());
        System.out.println("newBear4 hash = " + newBear4.hashCode());
    }
}