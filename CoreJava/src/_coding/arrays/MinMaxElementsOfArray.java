package _coding.arrays;

public class MinMaxElementsOfArray {

    public static void main(String[] args) {

        int arr[] = {10,5,90,-8,0,-34,1};
        int min = arr[0];
        int max = arr[0];

        // regular for loop
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);

        // for each loop
        for(int i : arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
}
