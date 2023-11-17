package Stack;

import java.util.*;

public class StockSpan {

    public static void solve(int arr[]){
        Stack<Integer> st = new Stack<Integer>();
        int result[] = new int[arr.length];


         st.push(0);
         result[0] = 1;

        for(int i = 1; i < arr.length; i++){

            while (st.size()> 0 && arr[i] > arr[st.peek()]) {
                 st.pop();
            }

            if(st.size() == 0){
                
                result[i] = i + 1;

            }else{

                result[i] = i - st.peek();

            }

            st.push(i);

        } 


        for(int i = 0; i < result.length; i++) {
       System.out.print(result[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 1, 2, 1, 2, 3, 9, 1, 1, 2, 3, 5, 1, 1 };

        solve(arr);
    }
}
