package main.ex1;

public class Dog extends Pet{

    String name;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public String getName() {
        return name;
    }
}
