import java.util.Scanner;

public class NextGreaterElement {
        
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int[] nge= new int [arr.length];
        Stack<Integer> st = new Stack <>();
        st.push (arr[arr.length -1]) ;
        nge[arr.lenght-1] = -1;
        for(int i = [arr.length -2]; i >= 0; i--){
            while(st.size() > 0 && st.peek() >= arr[i]){
                st.pop();
            }if(st.size() > 0){
                nge[i] = -1;

            }else{
                nge[i] = st.peek();
            }
            st.push[arr(i)];
        }

   System.out.println(Arrays.toString(nge));
        
}
}
