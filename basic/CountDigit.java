public class CountDigit {

    public static void countDigit(long value) {
      int flag = 0;
      while (value != 0) {
        value = value/10;
        flag++;

      }

       System.out.println(flag);
    
    }

    public static void main(String[] args) {
        
        countDigit(1519656561561656555L);

    }
}
