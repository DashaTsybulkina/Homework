package military_office;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество людей: ");
        int count = inputCount(scan);
        Person[] personRegistry = new Person[count];
        String name;
        int age;
        char gender;
        String city;
        String country;
        for (int i = 0; i < count; i++) {
            name = inputString(scan);
            age = inputCount(scan);
            gender = inputChar(scan);
            city = inputString(scan);
            country = inputString(scan);
            Address address = new Address(country, city);
            personRegistry[i] = new Person(name, age, gender, address);
        }
        MIlitaryOffice mIlitaryOffice = new MIlitaryOffice(personRegistry);
        mIlitaryOffice.findFitPerson();
        mIlitaryOffice.findPersonForAge();
        mIlitaryOffice.findPersonForCity("Минск");
        mIlitaryOffice.findPersonForName("Александр");
    }

    private static char inputChar(Scanner scan) {
        char gender;
        String data;
        do {
            data = scan.next();
        } while (!data.equals("m") && !data.equals("w"));
        gender = data.charAt(0);
        return gender;
    }

    private static String inputString(Scanner scan) {
        String data = "";
        do {
            data = scan.nextLine();
        } while (data.equals("") || data.contains(" "));
        return data;
    }

    private static int inputCount(Scanner scan) {
        int choice = 0;
        do {
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                scan.next();
            }
        } while (choice < 1);
        return choice;
    }

}