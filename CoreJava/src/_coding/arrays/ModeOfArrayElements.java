package _coding.arrays;

import java.util.Arrays;

// Mean = sort array and find the average
// Median = sort array, if the no of elements is odd then Median = middle number
//          and if the no of elements is even the median = avg of middle two numbers
// Mode = 3*Median - 2* Mean


public class ModeOfArrayElements {

    public static double calculateMean(int[] arr){

        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        return (double) sum/2;
    }
    public static double calculateMedian(int[] arr){
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
        double median=0;
        int arrayLength = arr.length;
        for(int i=0;i<arr.length-1;i++){
            if(arrayLength%2==0){
                median =  (arr[arrayLength/2 -1] + arr[arrayLength/2] ) / 2.0 ;
            } else {
                median = arr[arrayLength/2];
            }
        }
        return  median;
    }
    public static void main(String[] args) {

        int arr[] = {7,2,5,8,1,0,2,6};

        double mean = calculateMean(arr);
        double median = calculateMedian(arr);
        double mode = 3*median - 2*mean;

        System.out.println("Mean:"+mean);
        System.out.println("Median:"+median);
        System.out.println("Mode:"+mode);
    }
}
