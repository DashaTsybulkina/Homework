package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text1 = "cab, ccab, cccab";
        String versions = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        String text2 = "One two three раз два три one1 two2 123 ";
        Pattern pattern1 = Pattern.compile("c*ab");
        Pattern pattern2 = Pattern.compile("Java \\d+");
        Matcher matcher1 = pattern1.matcher(text1);
        Matcher matcher2 = pattern2.matcher(versions);
        while (matcher1.find()) {
            System.out.println(text1.substring(matcher1.start(), matcher1.end()));
        }
        while (matcher2.find()) {
            System.out.println(versions.substring(matcher2.start(), matcher2.end()));
        }
        System.out.println(text2.split("[A-Za-z]+\\b").length - 1);
        System.out.println(validate("erfft"));
    }

    public static boolean validate(String str) {
        return str.matches("[a-z[1][5]]{4,20}\\b");
    }
}

