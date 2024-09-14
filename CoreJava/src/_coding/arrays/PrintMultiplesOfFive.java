package _coding.arrays;

public class PrintMultiplesOfFive {

    public static void main(String[] args) {
        int arr[] = {10,0,-5,2,1,56};

        // regular for loop
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("***********************");
        // for each loop logic
        for (int i : arr){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
}
