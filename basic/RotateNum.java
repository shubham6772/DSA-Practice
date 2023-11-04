public class RotateNum {

    public static void rotation(int num, int rotation) {
        int value = num;
        int rot = rotation;
        int numOfDigit = 0;
        while (num != 0) {
            num = num / 10;
            numOfDigit++;
        }

        if(rot > numOfDigit){
            rot = rot % numOfDigit;
        }

        if(rot < 0) {
            rot = numOfDigit + rot;
        }

          
            int rem = value % (int) Math.pow(10, rot);

            int mul = (int) Math.pow(10, numOfDigit - rot);
            value = value / (int) Math.pow(10, rot);

            int rotatedNum = rem * mul + value;

            System.err.println(rotatedNum);


    }

    public static void main(String[] args) {

        rotation(21534, -1);

    }
}
