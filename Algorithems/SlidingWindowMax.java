
import java.util.*;

public class SlidingWindowMax {

    public static void slidingMax(int arr[], int k) {
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[arr.length];

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }

        

        int j = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            if(j < i){
                j = i;
            }

            while(nge[j] < i + k) {
                j = nge[i];
                
            }
            System.out.print(arr[j] + " ");

        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 7, 19, 8, 12, 6 };

        slidingMax(arr, 4);
    }
}
