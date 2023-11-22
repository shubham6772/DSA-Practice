package Stack;

import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreater(int arr[]) {
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();
 
        st.push(arr[arr.length - 1]);
        result[arr.length - 1] = -1;

        for(int i=arr.length - 2; i >= 0; i--) {
            
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }

           if(st.size() == 0){
              result[i] = -1;
           }else{
               result[i] = st.peek();
           }

           st.push(arr[i]);

        }
        
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 5, 9, 3, 1, 12, 6, 8, 7 };

        int res[] = nextGreater(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.err.print(arr[i] + " ") ;
        }

        System.out.println();

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }

    }
}
