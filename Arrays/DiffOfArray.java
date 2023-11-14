package Arrays;

import java.util.Scanner;

public class DiffOfArray {

    public static void Diff(int arr1[], int arr2[], int arr3[]) {

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr3.length - 1;

        int carry = 0;

        while (k >= 0) {

            int d = 0;

            int arr1v = i >= 0 ? arr1[i] : 0;

            if (arr2[j] + carry >= arr1v) {

                d = arr2[j] + carry - arr1v;
                carry = 0;

            } else {

                d = arr2[j] + 10 + carry - arr1v;
                carry = -1;

            }

            arr3[k] = d;

            i--;
            j--;
            k--;

        }

        int index = 0;
        while (index < arr3.length) {
            if(arr3[index] == 0){
                index++;
            }else{
                break;
            }
        }

        while (index < arr3.length) {
             System.out.println(arr3[index]);
             index++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter the Size of second Array");
        int s2 = sc.nextInt();

        int arr2[] = new int[s2];
        for (int i = 0; i < s2; i++) {
            System.err.println("Enter the " + i + " index Value");
            arr2[i] = sc.nextInt();
        }

        System.out.println("Enter the Size of First Array");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];
        for (int i = 0; i < s1; i++) {
            System.err.println("Enter the " + i + " index Value");
            arr1[i] = sc.nextInt();
        }

        int arr3[] = new int[s2 > s1 ? s2 : s1];

        Diff(arr1, arr2, arr3);

        sc.close();
    }

}
