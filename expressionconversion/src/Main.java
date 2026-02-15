import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  int priority(char ch){
        switch(ch){
            case '$':return 1;
            case '/':return 20;
            case '*':return 30;
            case '%':return 40;
            case '+':return 40;
            case '-':return 50;
        }
        return 0;
    }
    public static String infixToPostfix(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i< infix.length();i++){
            char ch = infix.charAt(i);
            if(Character.isDigit(ch)){
                sb.append(ch);

            }
            else if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(stack.peek() != '('){
                    sb.append(stack.pop());
                    stack.pop();
                }

                while(!stack.isEmpty())
                    sb.append(stack.pop());
                sb.reverse();
                return sb.toString();
            }else{
                while(!stack.isEmpty() && priority(stack.peek()) == priority(ch)){
                    sb.append(stack.pop());
                    stack.push(ch);
                }
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String infix = "1$9+3*4-(6+8/2)+7";

        System.out.println(infixToPostfix(infix));
        String postfix=infixToPostfix(infix);
        System.out.println(postfix);

        String prefix=infixToPostfix(infix);
        System.out.println(prefix);




        }
    }
