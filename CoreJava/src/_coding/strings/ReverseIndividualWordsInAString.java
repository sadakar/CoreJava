package _coding.strings;

public class ReverseIndividualWordsInAString {

    public static void main(String[] args) {
        String str = "Hello World";
        String words[] = str.split(" ");
        StringBuilder revString = new StringBuilder();

        // print individual words
        for(String s : words){
            System.out.println(s);
        }

        // print reversed words as a String
        for(String s2 : words){
            revString.append(new StringBuilder(s2).reverse().toString()).append(" ");
        }
        System.out.println(revString);
    }
}
