package _coding.arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {10,5,-1,0,56};

        // using regular for loop
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }

    }
}
