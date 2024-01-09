//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;

class elements
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            Stack<Integer> st = new Stack<Integer>();
            int n = sc.nextInt();
            int temp = 0;
            for(int i = 0; i < n; i++)
            {
                temp = sc.nextInt();
                st.push(temp);
            }
            GFG gfg = new GFG();
            if(gfg.pairWiseConsecutive(st) == true)
            System.out.println("Yes");
            else
            System.out.println("No");
            
        }
    }
}

// } Driver Code Ends

class GFG
{
    public static boolean pairWiseConsecutive(Stack<Integer> st)
    {
        if(st.size() % 2 != 0)
        {
            st.pop();
        }
        while(!st.isEmpty() && st.size() > 1)
        {
            int n = st.pop();
            if(st.peek()+1 != n)
            return false;
        }
        return true;
	}
}