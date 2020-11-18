// Problem link : https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1#
import java.util.Stack;

public class ParenthesisChecker {
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        int len = x.length();

        if(len%2==1){
            return false;
        }

        Stack<Character> stk = new Stack<Character>();
        int i=0;
        Character temp;
        while(i<len){
            Character ch = new Character(x.charAt(i));

            if( ch.equals('(') || ch.equals('{') || ch.equals('[') ){
                stk.push(ch);
            }

            else if( ch.equals(')') && stk.peek().equals('(') ){
                temp=stk.pop();
            }

            else if( ch.equals('}') && stk.peek().equals('{') ){
                temp=stk.pop();
            }

            else if( ch.equals(']') && stk.peek().equals('[') ){
                temp=stk.pop();
            }

            else{
                return false;
            }

            i++;
        }
        return true;
    }

    // Driver code
    public static void main(String args[]) {
        System.out.println(ispar("([]"));
    }
}
