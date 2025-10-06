package Assignment8Oct7;

import java.util.Stack;

public class Simplify_Path {
    public static void main(String[] args) {
        String s="/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(s));
    }
    public static String simplifyPath(String s){
        Stack<String> st=new Stack<>();
        String[] ar=s.split("/");
        for (String ss:ar){
            if(ss.equals("")||ss.equals(".")) continue;
            else if(ss.equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(ss);
        }
        String ans="";
        if(st.isEmpty()) ans+="/";
        while (!st.isEmpty()){
            ans="/"+st.pop()+ans;
        }
        return ans;
    }
}
