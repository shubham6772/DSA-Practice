package Arrays;

import java.util.*;

public class FindElementInArray {

    public static void FindbyLinearSearch(int arr[], int element, int size) {

        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println("Your Element" + arr[i] + "is present at index " + i);
                break;
            }
        }

    }

    public static void FindbyBinarySearch(int arr[], int element, int size) {

        // Binary search only work for the Sorted Array so first

        Arrays.sort(arr);

        int start = 0;
        int end = size;

       while(start <= end){
           int mid = (start + end)/2;

           if(element == arr[mid]){
              System.err.println("Your search " + element + " is present at" + mid);
              break;
           }

           if(element < arr[mid]){
                end = mid - 1;
                System.err.println(arr[mid]);
           }

           if(element > arr[mid]){
                start = mid + 1;
                System.out.println(arr[mid]);
           }
       }

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

        System.out.println("Enter the Element you want to Find");
        int element = sc.nextInt();

        FindbyBinarySearch(arr, element, size);

        sc.close();
    }
}
