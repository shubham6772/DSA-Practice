public class InverseNum {
    
     public static void inverse(int num){
        
        int originalPlace = 1;
        int inverseValue = 0;

        while (num != 0) {
            
            int originalDigit = num % 10;
            int invertedPlace = originalDigit;
            int invertedDigit = originalPlace;

            inverseValue += (invertedDigit * (int) Math.pow(10, invertedPlace - 1));

            num = num /10;
            originalPlace++;
        }

        System.out.println(inverseValue);

    }


    public static void main(String[] args) {
        inverse(21453);
    }
}
