import java.util.*;

public class InfixConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<String>pre = new Stack<>();
        Stack<String>post = new Stack<>();
        Stack<Character>ops = new Stack<>();
        for(int i = 0; i <exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == '('){
                ops.push();

            }else if(ch>= '0' && ch<= '9')||(ch>= 'a' && ch<= 'z') || (ch>= 'A' && ch<= 'Z'){
                prefix.push(ch + "");
                postfix.push(ch + "");
            }else if(ch == ')'){
                while(ops.peek()!= '('){
                    char op = ops.pop();
                    String postv2 = postfix.pop();
                    String prev1 = prefix.pop();
                    String postv = postv1+postv2+op;
                    postfix.push(postv);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = prev1+prev2+op;
                    prefix.push(prev);
                }ops.pop();
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(optors.size()>0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())){
                 char op = ops.pop();
                    String postv2 = postfix.pop();
                    String prev1 = prefix.pop();
                    String postv = postv1+postv2+op;
                    postfix.push(postv);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = op+ prev1 + prev2;
                    prefix.push(prev);
                }
                ops.push(ch);
            }
        }
            while(ops.size()>0){
                    char op = ops.pop();
                    String postv2 = postfix.pop();
                    String prev1 = prefix.pop();
                    String postv = postv1+postv2+op;
                    postfix.push(postv);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = op + prev1 + prev2;
                    prefix.push(prev);
                }
        System.out.println(opnds.peek());
        public static int precedence(char op){
        if(ch == '+'){
            return 2;
        }else if(ch == '-'){
            return 2;
        }else if(cha == '*'){
            return 1;
        }else if(ch == '/'){
            return 1;
        }else{
            return 0;
        }
        
    }

    }
}