public class Main {

    public static boolean Prime(int value) {
        if (value > 0) {
            for (int i = 2; i * i <= value; i++) { // i < value (time complaxity == n) i*i <=value (time complaxity ==
                                                   // n/2)
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void allPrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        
        // if(Prime(4) == false){
        //     System.out.println("Not Prime");
        // }
        // else{
        //    System.err.println("Prime");
        // }
     
     System.out.print("Your Prime Numbers are: ");
     allPrime(1,10);


    }
}
