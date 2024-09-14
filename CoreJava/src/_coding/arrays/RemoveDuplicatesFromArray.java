package _coding.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int arr[] = {10,10,4,4,-1,3,0,55};

        Set<Integer> set = new HashSet<Integer>();

        // Logic with regular for loop
        for (int i=0;i<=arr.length-1;i++){
            set.add(arr[i]);
        }
        System.out.println("Array without duplicates - regular for loop:"+set);

        // Logic with for each loop
        int arr2[] = {10,10,4,4,-1,3,0,55};
        Set<Integer> set2 = new HashSet<Integer>();
        for(int n : arr2){
            set2.add(n);
        }
        System.out.println("Array without duplicates - for each loop:"+set2);
    }
}
