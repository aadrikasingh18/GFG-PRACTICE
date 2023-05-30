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


class Solution 
{
    // Function to convert an infix expression to a postfix expression.
    public static int precedence(int ch)
    {
        if(ch == '+' || ch == '-')
        return 1;
        
        else if(ch == '*' || ch == '/')
        return 2;
        
        else if (ch == '^')
        return 3;
        
        else 
        return -1;
    }
    public static StringBuilder infixToPostfix(String exp) 
    {
        // Your code here
        StringBuilder result = new StringBuilder();
        ArrayDeque <Character> stack = new ArrayDeque<>();
        for(int i=0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch == '(')
            stack.push('(');
            
            else if(Character.isLetterOrDigit(ch))
            result.append(ch);
            
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    result.append(stack.pop());
                }
                stack.pop();
            }
           
            else 
            {
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }
        return result;
    }
}