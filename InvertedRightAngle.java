import java.util.*;

public class InvertedRightAngle {

    public static void printInvertedAngle(int x) {

        int space = 0;
        int star = x;

        for(int i = 1; i <= x; i++) {
            
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }

            for(int j=1; j<=star; j++){
                System.out.print("*\t");
            }

            System.out.println();

            star--;
            space++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int x = sc.nextInt();

        printInvertedAngle(x);
        sc.close();
    }
}
