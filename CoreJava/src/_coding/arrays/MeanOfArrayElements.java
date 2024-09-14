package _coding.arrays;

public class MeanOfArrayElements {

    // Mean = sort array and find the average
    public static double meanCalculation(int[] arr){

        int sum =0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        double meanArray = (double) sum/arr.length;

        return  meanArray;
        //System.out.println("Mean:"+mean);
    }

    public static void main(String[] args) {

        int arr[] = {4,6,1,7,3,9,7};
        double mean = meanCalculation(arr);
        System.out.println("Mean:"+mean);
    }

}
