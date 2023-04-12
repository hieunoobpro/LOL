package Entity;

public class Champain {
String name;
String potition;

    public Champain(String name, String potition) {
        this.name = name;
        this.potition = potition;
    }

    @Override
    public String toString() {
        return "\nChampain{" +
                "name = '" + name + '\'' +
                ", potition = '" + potition + '\'' +
                '}';
    }
}

