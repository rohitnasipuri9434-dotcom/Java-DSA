import java.util.*;

public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer>opnds = new Stack<>();
        Stack<Character>optors = new Stack<>();
        for(int i = 0; i <exp.length; i++){
            char ch = exp.charAt(i);

            if(ch == '('){
                optors.push(ch);
            }else if(ch == + || ch = '-' || ch == '*' || ch = '/'){
                while(optors.size()>0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())){ // main three reason
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    char opv = operation(v1,v2,optor);
                    opnds.push(opv);
                }
                optors.push(ch);
            }else if (ch == ')'){
                while(optors.peek( != '(')){
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    char opv = operation(v1,v2,optor);
                    opnds.push(opv);
                }
            optors.pop();
            }else if(Character.isDigit(ch)){ //for denote single digit
                opnds.push(ch - '0'); // char to int
            }
        }
         while(optors.size()!=0){
                char optor = optors.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                char opv = operation(v1,v2,optor);
                opnds.push(opv);

            System.out.println(opnds.peek());

        public static int precedence(char optor){ // set piority oder
            if (optor == '+'){
                    return 1;
            }else (optor == '-'){
                    return 1;
            }else (optor == '*'{
                    return 2;
            })else{
                    return 2;
            }
        }

        public static int operation(int v1, int v2, char optor){
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
    }
}
}
