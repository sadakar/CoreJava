package _coding.arrays;

public class SumOfNumbersInArray {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40};

        int sum=0;
        for (int i = 0; i <=arr.length-1; i++) {
            sum = sum+arr[i];
        }
        System.out.println("Sum of elements of array:"+sum);
    }
}
