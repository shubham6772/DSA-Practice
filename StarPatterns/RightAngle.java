package StarPatterns;
import java.util.*;

                                                                        //                  *
                                                                        //              *   *
                                                                        //          *   *   *
                                                                        //      *   *   *   *
                                                                        // *    *   *   *   *

public class RightAngle {

    public static void printRightAngle(int x) {
                                                                       
        int space = x-1;
        int star = 1;
        for(int i=1; i<=x; i++){
            
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }

            for(int j=1; j<=star; j++){
                System.out.print("*\t");
            }

            System.err.println();

            space--;
            star++;
        }


    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int x = sc.nextInt();
       
        printRightAngle(x);


        sc.close();
    }
}
