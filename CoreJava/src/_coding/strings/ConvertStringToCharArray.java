package _coding.strings;

import java.util.Arrays;

public class ConvertStringToCharArray {
    public static void main(String[] args) {
        String str = "Hello World";
        char strAsCharArray[] = str.toCharArray();

        // Print character array with for each loop
        for(char ch : strAsCharArray){
            System.out.println(ch);
        }
        // Print character array with Arrays
        System.out.println(Arrays.toString(strAsCharArray));

    }
}
