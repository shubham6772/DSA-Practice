package Arrays;

import java.util.*;

public class SumofArrays {

    public static void sum(int arr1[], int arr2[], int arr3[]) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr3.length - 1;

        int c = 0;
        while (k >= 0) {

            int d = c;

            if (i >= 0) {
                d += arr1[i];
            }

            if (j >= 0) {
                d += arr2[j];
            }

            c = d / 10;
            d = d % 10;

            arr3[k] = d;

            i--;
            j--;
            k--;
        }

        
        for (int val : arr1) {
            System.out.print(val + " ");
        }
        
        System.out.println();
        
        for (int val : arr2) {
            
            System.out.print(val + ' ');
        }
        
        System.out.println();
        
        if (c > 0) {
            System.out.print(c + " ");
        }
        
        for (int val : arr3) {
            System.out.print(val + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the size of array");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];

        for (int i = 0; i < s1; i++) {
            System.err.println("Enter the " + i + " Value");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the Size of Second Array");
        int s2 = sc.nextInt();

        int arr2[] = new int[s2];

        for (int i = 0; i < s2; i++) {
            System.err.println("Enter the " + i + " Value");
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[s2 > s1 ? s2 : s1];

        sum(arr1, arr2, arr3);

        sc.close();

    }
}
