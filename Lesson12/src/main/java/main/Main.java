package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.*;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static final String OUTPUT1_FILE = "Lesson12/src/main/resources/output1.txt";
    public static final String OUTPUT2_FILE = "Lesson12/src/main/resources/output2.txt";
    public static final String INPUT1_FILE = "Lesson12/src/main/resources/input1.txt";
    public static final String INPUT2_FILE = "Lesson12/src/main/resources/input2.txt";

    public static <Gson> void main(String[] args) throws IOException {
        TextFormatter formatter = new TextFormatter();
        String lineText;
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT1_FILE)); BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT1_FILE))) {
            while ((lineText = reader.readLine()) != null) {
                if (formatter.isPalindrome(lineText)) {
                    writer.write(lineText + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT2_FILE)); BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT2_FILE))) {
            while ((lineText = reader.readLine()) != null) {
                String[] sentences = lineText.split("\\.|\\?|!");
                for (String sentence : sentences) {
                    if (formatter.palindromeSearch(sentence) || (formatter.wordCount(sentence) >= 3 && formatter.wordCount(sentence) <= 5)) {
                        writer.write(sentence + "\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader readerBlackList = new BufferedReader(new FileReader("lesson12/src/main/resources/blackList.txt")); BufferedReader reader = new BufferedReader(new FileReader("lesson12/src/main/resources/input3.txt"));) {
            String text = "";
            String blackList = "";
            while ((lineText = reader.readLine()) != null) {
                text += lineText;
            }
            String[] sentences = text.split("\\.|\\?|!");
            ArrayList<String> words = new ArrayList<>();
            while ((lineText = readerBlackList.readLine()) != null) {
                words.add(lineText.toLowerCase());
            }
            TextFormatter.checkText(words, sentences);

        } catch (Exception e) {
            e.printStackTrace();
        }


        Car car = new Car("Opel", new Engine("Opel engine", 4), new Tank("Gas", 62), 300, 50000);
        try (ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream("lesson12/src/main/resources/car.txt"));) {
            objectStream.writeObject(car);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (ObjectInputStream objectStream = new ObjectInputStream(new FileInputStream("lesson12/src/main/resources/car.txt"));) {
            Car carFile = (Car) objectStream.readObject();
            System.out.println(carFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            var objectMapper = new ObjectMapper();
            CarTask5 carNew = objectMapper.readValue(new File("Lesson12/src/main/resources/car.json"), CarTask5.class);
            System.out.println(carNew);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}