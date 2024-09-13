package _coding.strings;

public class CountOccurancesOfACharInString {
    public static void main(String[] args) {
        String str = "Find Occurances of c in this string";
        char ch = 'c';
        int count=0;
        for (int i = 0; i < str.length() - 1; i++) {
           if(str.charAt(i)==ch){
               count++;
           }
        }
        System.out.println("Occurances of c :"+count);
    }
}
