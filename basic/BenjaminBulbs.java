
// Actually benjamin bulbs work on cycle and  if a number participate in odd num of cycle then it always left on at end and all
// perfect square present odd num of cycle so logic is we just have to print all the perfect sqaure numbers
import java.util.*;

public class BenjaminBulbs {

    public static boolean check(int n) {
        int root = Math.round((int) Math.sqrt(n));
        if (root * root == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void benjbulb(int cycle) {

        System.out.println("Bulbs on When Cycle End");
        for (int i = 1; i <= cycle; i++) {
            if (i * i <= cycle) {
                System.out.print(i * i + " ");
            }
        }
    }

    public static void benjbulboff(int cycle) {

        System.err.println("Bulb left Off when Cycle End");
        for (int i = 1; i <= cycle; i++) {
            if (!check(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Cycles");
        int x = sc.nextInt();

        benjbulb(x);
        System.out.println();
        benjbulboff(x);

        sc.close();
    }
}
