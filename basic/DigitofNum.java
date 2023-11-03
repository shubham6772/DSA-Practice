public class DigitofNum {
    
    public static void digitPrinter(int value){
        int printvalue = 0;
          while (value!=0) {
              int rem = value%10;
              printvalue = printvalue *  10 + rem;
              value  = value/10;
          }

          while (printvalue!=0) {
             System.out.println(printvalue%10 + " ");
             printvalue = printvalue/10;
          }
    }

    public static void main(String[] args) {
        digitPrinter(239823);
    }
}

