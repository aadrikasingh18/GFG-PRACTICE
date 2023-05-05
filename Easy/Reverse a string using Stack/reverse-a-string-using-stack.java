//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String s)
    {
        //code here
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            st.push(ch);
        }
        String y="";
        while(!st.isEmpty())
        {
            y = y + st.peek();
            st.pop();
        }
        return y;
    }

}