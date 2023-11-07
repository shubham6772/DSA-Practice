// All the factor which devide any number;

import java.util.Scanner;

public class PrimeFactorization{
    
    public static void primeFact(int value){
          for(int i=2 ; i * i <= value   ; i++){
              while(value % i == 0){
                 value = value / i;
                 System.out.println(i + "=>" + value);
              }
          }

          if(value != 1){
            System.out.println(value + "=>" + 1);
          }
          
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value which factor you want to");
        int x = sc.nextInt();
        
         long startTime = System.nanoTime();
         primeFact(x);
         long endTime = System.nanoTime();
         long totaltime = endTime - startTime;
         double elapsedTimeInSecond =  (double) totaltime / 1000000000;
         System.out.println(elapsedTimeInSecond);
         sc.close();
    }
}
