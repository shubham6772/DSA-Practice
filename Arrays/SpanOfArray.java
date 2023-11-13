package Arrays;

import java.util.*;

public class SpanOfArray {

    public static void spanUsingSort(int arr[], int size) {

        // By soritng 
        // Note: .sort() uses quickSort() algorithm.
        Arrays.sort(arr);
        int val = arr[size - 1] - arr[0];
        
        System.err.println("Your span is : " +val);
    }


    public static void spanWithoutSort(int arr[], int size){

        int small = arr[0];
        int large = arr[size-1];

        for(int i=1; i<size-1; i++){
             if(arr[i] < small){
                small = arr[i];
             }

            if(arr[i]>large){
                large = arr[i];
            }
        }

        int result = large - small;
        System.out.println("Your value is: " + result);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.err.println("Enter the " + i + " Value");
            arr[i] = sc.nextInt();
        }

        spanWithoutSort(arr, size);

        sc.close();
    }
}
