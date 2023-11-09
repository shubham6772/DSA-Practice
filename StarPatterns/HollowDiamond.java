package StarPatterns;

import java.util.*;

// *  *  *      *  *  *  
// *  *            *  *
// *                  *
// *  *            *  *
// *  *  *      *  *  *

public class HollowDiamond {

    public static void printHollow(int x) {
        int space = 1;
        int star = x/2+1;

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            System.out.println();

            if (i <= x / 2) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int x = sc.nextInt();

        printHollow(x);
        sc.close();
    }
}
