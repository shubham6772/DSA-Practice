/**
 * FibonacciSeries
 */
public class FibonacciSeries {

    public static void Series(int value) {
        int a = 0;
        int b = 1;
        System.err.print(a + " ");
        System.err.print(b + " ");
        for (int i = 0; i < value-2; i++) {
            System.err.print(a + b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }


    // By Recursion

    public static int series(int value){
       
        if(value == 0){
            return 0;
        }
        if(value == 1){
            return 1;
        } 
        return series(value-1) + series(value-2);
    }

    public static void main(String[] args) {

        Series(10);
        System.err.println();
        for(int i = 0; i < 10; i++){
            System.err.print(series(i) + " ");
        }

    }
}