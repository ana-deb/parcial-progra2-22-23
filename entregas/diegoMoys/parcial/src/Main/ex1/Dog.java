package Main.ex1;

public class Dog extends Pet{


    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public String getName() {
        return this.name;
    }
}
