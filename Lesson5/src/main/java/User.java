public class User {
    public int age;
    public String surname;
    public String name;
    public char gender;


    public User() {
        this(0, "Иванов", "Иван", 'm');
    }

    public User(int age, String surname, String name, char gender) {
        this.age = age;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
    }

    public User(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getNameAndSurname() {
        return surname + name;
    }

    public void incAge() {
        age++;
    }

    @Deprecated
    public String getInfo() {
        return name + " " + surname + " " + age + " " + gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
