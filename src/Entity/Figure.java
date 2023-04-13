package Entity;

public class Figure {
String name;
String potition;

    public Figure (String name, String potition) {
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

