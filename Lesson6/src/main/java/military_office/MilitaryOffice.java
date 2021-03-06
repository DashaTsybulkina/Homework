package military_office;

public class MilitaryOffice {
    private Person[] personRegistry;

    public MilitaryOffice(Person[] personRegistry) {
        this.personRegistry = personRegistry;
    }

    private boolean isFitPerson(Person person) {
        boolean isFit = false;
        if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender() == 'm') {
            isFit = true;
        }
        return isFit;
    }

    public void findFitPerson() {
        System.out.println("Годные к службе:");
        for (Person person : personRegistry) {
            if (isFitPerson(person)) {
                System.out.println(person);
            }
        }
    }

    public void findPersonForCity(String nameCity) {
        int count = 0;
        for (Person person : personRegistry) {
            if (isFitPerson(person) && person.getAddress().getCity().equals(nameCity)) {
                count++;
            }
        }
        System.out.println("Количество годных призывников в городе: " + count);
    }

    public void findPersonForAge() {
        int count = 0;
        for (Person person : personRegistry) {
            if (person.getAge() >= 25 && person.getAge() <= 27 && person.getGender() == 'm') {
                count++;
            }
        }
        System.out.println("Количество годных призывников от 25 до 27 лет: " + count);
    }

    public void findPersonForName(String name) {
        int count = 0;
        for (Person person : personRegistry) {
            if (isFitPerson(person) && person.getName().equals(name)) {
                count++;
            }
        }
        System.out.println("Количество годных призывников c именем " + name + " " + count);
    }
}
