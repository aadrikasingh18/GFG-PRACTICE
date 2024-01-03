//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends

class Solution 
{ 
    boolean isMatching(char top, char ch)
    {
        return((top == '(' && ch == ')') || 
           (top == '{' && ch == '}') ||
           (top == '[' && ch == ']'));
    }
    boolean valid(String s) 
    { 
        ArrayDeque<Character> st = new ArrayDeque<Character>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                return false;
                else if(isMatching(st.peek(), ch) == false)
                {
                    return false;
                }
                else
                {
                    st.pop();
                }
            }
        }
        return (st.isEmpty() == true);
    }
} 