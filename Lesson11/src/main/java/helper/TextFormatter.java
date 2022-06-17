package helper;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TextFormatter {

    public String cutSubstring(String string, char startChar, char endChar) {
        int startIndex = string.indexOf(startChar);
        int endIndex = string.lastIndexOf(endChar);
        if (startIndex != -1 && endIndex != -1) {
            return string.substring(startIndex, endIndex);
        } else {
            return "нет такой подстроки";
        }
    }

    public String replaceChar(String string) {
        return string.replace(string.charAt(0), string.charAt(3));
    }

    public String returnTwoCharacters(String word) {
       return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
    }

    public String[] getSentences(String text) {
        return text.split("\\.");
    }

    public void examinationSentences(String[] sentences) {
        for (String sentence : sentences) {
            int result = getWordCount(sentence);
            if (hasPalindromeInSentence(sentence) || (result >= 3 && result <= 5)) {
                System.out.println(sentence);
            }
        }
    }

    public int getWordCount(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    public boolean hasPalindromeInSentence(String text) {
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

    public int getCountWordsLatinChar(String sourceString) {
        int count = 0;
        String[] strings = sourceString.split(" ");

        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                count++;
            }
        }
        return count;
    }
}
