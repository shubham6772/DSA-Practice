package Arrays;

import java.util.Scanner;

public class BarChart {

    public static void drawBarChart(int arr[], int size) {

        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        ;

        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.err.print("\t");
                }
            }
            System.out.println();
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

        drawBarChart(arr, size);

        sc.close();
    }
}
