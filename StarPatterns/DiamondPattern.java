package StarPatterns;

import java.util.*;

//          *       
//      *   *   *
//  *   *   *   *   *
//      *   *   *
//          *

public class DiamondPattern {

    public static void printDiamondPatter(int x) {
        int space = x / 2;
        int star = 1;

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }

            System.out.println();

            if (i <= x / 2) {
                space--;
                star += 2;
            }else{
                space ++;
                star -= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int x = sc.nextInt();

        printDiamondPatter(x);

        sc.close();
    }
}
