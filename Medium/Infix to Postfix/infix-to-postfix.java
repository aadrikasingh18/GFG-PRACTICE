//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
         Map<Character,Integer> priority=new HashMap<>();
      priority.put('+',1);
      priority.put('-',1);
      priority.put('*',2);
      priority.put('/',2);
      priority.put('^',3);
      priority.put('(',0);
      Stack<Character> st=new Stack<>();
      String ans="";
 
      for(int i=0;i<exp.length();i++)
      {
          char c=exp.charAt(i);
          
          //case 1
          if(c=='(')
          st.push(c);
          //case 2
          else if(c==')')
          {
             while(st.peek()!='(')
             ans+=st.pop();
             
              st.pop();
          }
          //case3
          else if(c=='+' || c=='-' || c=='*' || c=='^' || c=='/')
          {
              while(!st.isEmpty() && priority.get(st.peek())>=priority.get(c))
              ans+=st.pop();
              
              st.push(c);
          }
          //case4
          else
              ans+=c;
      }
      
      while(!st.isEmpty())
          ans+=st.pop();
      
      
      
     return ans;
    }
}