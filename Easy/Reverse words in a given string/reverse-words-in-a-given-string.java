//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
        int n = s.length();
        int k = 0;
        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '.')
            k++;
        }
        if(k == 0)
        return s;
        String y="";
        int l = s.lastIndexOf(".");
        String newSt = s.substring(l+1);
        y = y + newSt;
        s = s.substring(0,l);
        k--;
        while(k > 0)
        {
            l = s.lastIndexOf(".");
            newSt = s.substring(l);
            y = y + newSt;
            s = s.substring(0,l);
            k--;
        }
        y = y + "." + s;
        return y;
    }
}