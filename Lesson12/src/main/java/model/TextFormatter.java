package model;

import java.util.List;

public class TextFormatter {

    public boolean isPalindrome(String line) {
        StringBuilder buffer = new StringBuilder(line);
        buffer.reverse();
        return line.equalsIgnoreCase(buffer.toString());

    }

    public int wordCount(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    public boolean palindromeSearch(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() > 1) {
                StringBuffer rev = new StringBuffer(word).reverse();
                String strRev = rev.toString();
                if (word.equalsIgnoreCase(strRev)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void checkText(List<String> blackList, String[] sentences) {
        int counterWrongSentences = 0;
        for (String sentence : sentences) {
            if (checkSentence(blackList, sentence)) {
                System.out.println(sentence + ".");
                counterWrongSentences++;
            }
        }
        if (counterWrongSentences > 0) {
            System.out.println("Количество предложений не прошедших проверку " + counterWrongSentences);
        } else {
            System.out.println("Текст прошел проверку");
        }
    }

    private boolean checkSentence(List<String> blackList, String sentence) {
        for (String word : blackList) {
            if (sentence.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}
