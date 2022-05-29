package Lesson;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("гав");
    }
}
