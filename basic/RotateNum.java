public class RotateNum {

    public static void rotation(int num, int rot) {
        int value = num;
        int numOfDigit = 0;
        while (num != 0) {
            num = num / 10;
            numOfDigit++;
        }

        int rem = value % (int) Math.pow(10, rot);

        int mul = (int) Math.pow(10, numOfDigit - rot);
        value = value / (int) Math.pow(10, rot);
       
        int rotatedNum = rem * mul + value ;

        System.err.println(rotatedNum);

    }

    public static void main(String[] args) {

        rotation(21534, 3);

    }
}
