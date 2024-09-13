package _coding.strings;

import java.util.Arrays;

public class ConvertStringToStringArray {

    public static void main(String[] args) {

        String str = "Convert this string to String Array";
        String strArray[] = {};
        strArray = str.split(" ");

        // print the string array -- regular for loop
        for(String s : strArray){
            System.out.println(s);
        }

        // print the string array -- using Arrays
        System.out.println(Arrays.toString(strArray));

    }
}
