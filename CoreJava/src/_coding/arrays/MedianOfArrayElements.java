package _coding.arrays;

import java.util.Arrays;
// Median = sort array, if the no of elements is odd then Median = middle number
//          and if the no of elements is even the median = avg of middle two numbers
public class MedianOfArrayElements {

    public static double testMedian(int arr[]){

        Arrays.sort(arr);
        System.out.println("Sorted Array:"+Arrays.toString(arr));
        int arrLength = arr.length;
        double medianValue;
        if(arrLength%2==0){
            medianValue = (arr[arrLength/2 - 1] + arr[arrLength/2])/2.0;
        }else {
            medianValue = arr[arrLength/2];
        }
        return medianValue;
    }
    public static void main(String[] args) {

        // test-1 -> Array with even length
        int arr1[] = {53,65,34,98,12,87,0,98};
        double median1 = testMedian(arr1);
        System.out.println("Median of array1:"+median1);

        // test-2 -> Array with odd length
        int arr2[] = {5,7,3,8,9,1,3};
        double median2 = testMedian(arr2);
        System.out.println("Median of arry2:"+median2);
    }
}
