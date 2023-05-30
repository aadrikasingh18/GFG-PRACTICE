//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String exp)
    {
        // Your code here
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for(int i=0; i<exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch))
            {
                int val = Character.getNumericValue(ch);
                stack.push(val);
            }
            else
            {
                int sec = stack.pop();
                int first = stack.pop();
                int result = 0;
                
                if(ch == '+')
                result = first + sec;
                
                else if(ch == '-')
                result = first - sec;
                
                else if(ch == '*')
                result = first * sec;
                
                else if(ch == '/')
                result = first / sec;
                
                stack.push(result);
            }
        }
        return stack.pop();
    }
}