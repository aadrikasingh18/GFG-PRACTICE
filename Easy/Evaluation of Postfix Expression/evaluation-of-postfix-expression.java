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
    public static int evaluatePostFix(String s)
    {
        // Your code here
        ArrayDeque<Integer> st = new ArrayDeque<Integer>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                int val = Character.getNumericValue(ch);
                st.push(val);
            }
            else
            {
                int sec = st.pop();
                int first = st.pop();
                int result = 0;
                
                if(ch == '+')
                result = first + sec;
                
                else if(ch == '-')
                result = first - sec;
                
                else if(ch == '*')
                result = first * sec;
                
                else if(ch == '/')
                result = first / sec;
                
                st.push(result);
            }
        }
        return st.pop();
    }
}