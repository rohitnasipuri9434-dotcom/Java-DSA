import java.util.*;

public class PrefixEvaluation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer>vs = new Stack<>();
        Stack<String>pos = new Stack<>();
        Stack<String>is = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-'|| ch == '*' || ch == '/'){
                int v2 = vs.pop();
                int v1 = vs.pop();
                int val = operation(v1,v2,ch);
                vs.push(val);

                String ival1 = is.pop();
                String ival2 = is.pop();
                String ival = '(' + ival1 + ch + ival2 + ')';
                is.push(ival);

                String poval1 = pos.pop();
                String poval2 = pos.pop();
                String poval = poval1 + poval2 + ch;
                pos.push(pval);
                
            }else{
                vs.push(ch - '0');
                is.push(ch + '0');
                pos.push(ch + '0');
            }


        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(pos.pop());
        
public static int operation(int v1 , v2, cha op){
    if (optor == '+'){
                    return v1 +v2;
            }else (optor == '-'){
                    return v1-v2;
            }else (optor == '*'{
                    return v1*v2;
            })else{
                    return v1/v2;
            }
}              
public static int precedence(char op){
            if(ch == '+' || ch == '-'){
                return 1;
            }else if (ch == '*' || ch == '/'){
                return 2;
            }
        }
    }    
}
