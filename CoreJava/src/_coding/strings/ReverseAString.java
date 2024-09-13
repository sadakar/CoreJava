package _coding.strings;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "Welcome";
        // Using String Builder
        StringBuilder stringBuilder = new StringBuilder(str);
        String strRev = stringBuilder.reverse().toString();
        System.out.println("Reversed String:"+strRev);

        // Using while loop
        int i=0;
        int j= str.length()-1;
        char reverseString[] = new char[j+1];

        while (i<=j){
            reverseString[j] = str.charAt(i);
            reverseString[i]=str.charAt(j);
            i++;
            j--;
        }
        System.out.println(String.valueOf(reverseString));
    }
}
