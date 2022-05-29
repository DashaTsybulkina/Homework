package Lesson;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Cat("Барсик");
        animals[1] = new Cow("Мурка");
        animals[2] = new Dog("Тузик");
        for (Animals animal : animals) {
            System.out.println(animal.getName());
            animal.speak();
        }
    }
}
