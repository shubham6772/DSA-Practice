public class RotateNum {

    public static void rotation(int num, int rot) {

        int rotatedValue = 0;
        int answer = 0;
        int value = num;
        int length = 0;
        while (rot != 0) {

            int rem = num % 10;
            rotatedValue = rotatedValue * 10 + rem;
            value = value /10;

            rot--;
        }

        while(value != 0){
            value = value /10;
            length++;
        }

        answer = rotatedValue * (int) Math.pow(10, length) + value;

        System.err.println(answer);
        

    }

    public static void main(String[] args) {

        rotation(21534, 2);

    }
}
