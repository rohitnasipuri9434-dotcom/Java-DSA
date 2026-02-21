  import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int j = scn.nextInt();
        

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack <>();
        st.push (arr.length -1) ;
        nge[arr.length-1] = arr.length;
        for(int i = arr.length -2 ; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }if(st.size() == 0){
                nge[i] = arr.length;

            }else{
                nge[i] = st.peek();
            }
            st.push(i);
        }
        int j =0;
        for (int i = 0; i<= arr.length -x  ;i++){
            if(j<i){
                j = i;
            }
                while(nge[j]<j+x){
                    j = nge[j];
                }
            
        }  
            
        }

    
    System.out.println(arr[j]);
}



