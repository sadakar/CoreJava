package _coding.strings;

import java.util.Arrays;

public class SortStringArray {

    public static void main(String[] args) {
        String strArray[] = {"sadakar","hasini","gopal","amul"};

        // ascending order
        System.out.println("Ascending order:");
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        // descending order
        System.out.println("Descending order:");
        for(int i=strArray.length-1;i>=0;i--){
            System.out.print(" "+strArray[i]);
        }
    }
}
