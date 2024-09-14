package _coding.strings;

public class CountNumberOfWordsInAString {

    public static void main(String[] args) {

        String str = "Count the number of worlds in a string";
        String words[] = str.split(" ");
        int count = words.length;
        System.out.println("Number of words in a string:"+count);
    }
}
