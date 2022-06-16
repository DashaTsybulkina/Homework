package main;

import helper.TextFormatter;
import model.Employee;
import model.Report;

public class Main {
    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatter();

        //task1
        System.out.println(textFormatter.cutSubstring("Вырезать подстроку из строки ", 'а', 'о'));
        System.out.println(textFormatter.cutSubstring("dsaalammmflaaam", 'a', 'l'));

        //task2
        System.out.println(textFormatter.replaceChar("0npdc0dc00sdcscs0"));

        //task3
        String[] arrString = {"казак", "доход", "мама", "мороз"};
        for (String string : arrString) {
            if (textFormatter.hasPalindromeInSentence(string)) {
                System.out.println(string);
            }
        }

        //task4
        String[] sentences = textFormatter.getSentences("Программи́рование — процесс и искусство создания компьютерных программ с помощью языков программирования[1][2]." +
                "Программирование сочетает в себе элементы искусства, науки, математики и инженерии." +
                "В узком смысле слова, программирование рассматривается как кодирование — реализация одного или нескольких взаимосвязанных алгоритмов на некотором языке программирования. В более широком смысле, программирование — процесс создания программ, то есть разработка программного обеспечения." +
                "Большая часть работы программиста связана с написанием исходного кода на одном из языков программирования");
        textFormatter.examinationSentences(sentences);

        //task5
        System.out.println(textFormatter.returnTwoCharacters("code"));

        //task6
        Employee[] employees = new Employee[]{new Employee("Лев Николаевич Толстой", 250), new Employee("Иван Никитич Николаев", 340)};
        Report report = new Report() {
            @Override
            public void generateReport(Employee[] employees) {
                for (Employee employee : employees) {
                    String[] string = employee.getFullName().split(" ");
                    String resultName = string[0].charAt(0) + "." +
                            string[1].charAt(0) + ". " +
                            string[2];
                    System.out.printf("| " + resultName + "\t | \t" + "%.2f." + "|" + "\n", employee.getSalary());
                }
            }
        };
        report.generateReport(employees);
        //task7
        System.out.println(textFormatter.getCountWordsLatinChar("123 qwe 34r _2_ цук"));
    }
}

