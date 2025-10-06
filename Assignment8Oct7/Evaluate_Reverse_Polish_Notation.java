package Assignment8Oct7;
import java.util.*;
public class Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        String[] ar={"2","1","+","3","*"};
        System.out.println(evalRPN(ar));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                st.push(st.pop()+st.pop());
            }
            else if(s.equals("*")){
                st.push(st.pop()*st.pop());
            }
            else if(s.equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
