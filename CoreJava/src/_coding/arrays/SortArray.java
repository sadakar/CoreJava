package _coding.arrays;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int arr[] ={-5,-7,0,4,9,1};
        Arrays.sort(arr);
        System.out.println("Ascending order");
        System.out.println(Arrays.toString(arr));

        System.out.println("Descending order");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }
    }
}
