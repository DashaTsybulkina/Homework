package military_office;

public class Person {
    private String name;
    private int age;
    private char gender;
    private Address address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public Person(String name, int age, char gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", возраст: " + age +
                ", пол: " + gender +
                ", адрес: " + address;
    }
}
