//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {   
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.minimumNumberOfSwaps(S));
        }
    }
}

// } Driver Code Ends

class Solution
{
    static int minimumNumberOfSwaps(String s)
    {
        int open = 0;
        int close = 0;
        int ubc = 0;
        int swap = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '[')
            {
                open++;
                if(ubc > 0)
                {
                    swap = swap + ubc;
                    ubc--;
                }
            }
            else
            {
                // ch = ]
                close++;
                ubc = close - open;
            }
        }
        return swap;
    }
}