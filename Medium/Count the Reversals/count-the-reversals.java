//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends

class Sol
{
    int countRev (String s)
    {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        
        if(s.length() % 2 != 0)
        return -1;
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '{')
            {
                stack.push(ch);
            }
            else
            {
                // ch => }
                
                if(stack.isEmpty() || stack.peek() == '}')
                {
                    stack.push(ch);
                }
                else
                {
                    // top = {
                    stack.pop();
                }
            }
        }
        
        int o = 0;
        int c = 0;
        int ans = 0;
        while(!stack.isEmpty())
        {
            char ch = stack.pop();
            if(ch == '{')
            o++;
            else
            c++;
        }
        ans = (int)(Math.ceil(o/2.0) +  Math.ceil(c/2.0));
        return ans;
    }
}