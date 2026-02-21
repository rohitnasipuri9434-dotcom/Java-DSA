package stack;
import java.util.*;

public class Celebrity {
public static void findCelebrity(int[][],arr){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i< arr.length; i++){
            st.push(i);
        }
        while(st.size() >= 2) {
            int a = st.pop();
            int b = st.pop();

           if(M[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int pot = st.pop();
        for(int i = 0; i< arr.length; i++){
            if(i == pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("none");
                    return;
            }
            }   

        }
        System.out.println(pot);

}
}
    


