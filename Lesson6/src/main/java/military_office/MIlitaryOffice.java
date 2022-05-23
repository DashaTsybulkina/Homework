package military_office;

public class MIlitaryOffice {
    private Person[] PersonRegistry;

    public MIlitaryOffice(Person[] personRegistry) {
        PersonRegistry = personRegistry;
    }

    public void findFitPerson() {
        System.out.println("Годные к службе:");
        for (Person person : PersonRegistry) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender() == 'm') {
                System.out.println(person);
            }
        }
    }

    public void findPersonForCity(String nameCity) {
        int count = 0;
        for (Person person : PersonRegistry) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender() == 'm' && person.getAddress().getCity().equals(nameCity)) {
                count++;
            }
        }
        System.out.println("Количество годных призывников в городе: " + count);
    }

    public void findPersonForAge() {
        int count = 0;
        for (Person person : PersonRegistry) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && person.getGender() == 'm') {
                count++;
            }
        }
        System.out.println("Количество годных призывников от 25 до 27 лет: " + count);
    }

    public void findPersonForName(String name) {
        int count = 0;
        for (Person person : PersonRegistry) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender() == 'm' && person.getName().equals(name)) {
                count++;
            }
        }
        System.out.println("Количество годных призывников c именем " + name + " " + count);
    }
}
