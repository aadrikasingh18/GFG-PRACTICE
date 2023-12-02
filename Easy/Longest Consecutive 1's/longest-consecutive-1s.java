//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int n) 
    {
        // Your code here
        ArrayList <Integer> a = new ArrayList<Integer>();
        while(n != 0)
        {
            int r = n % 2;
            n = n / 2;
            a.add(r);
        }
        
        int count = 0;
        int max = 0;
        for(int i=0; i<a.size(); i++)
        {
            if(a.get(i) == 1)
            {
                count++;
                if(count > max)
                {
                    max = count;
                }
            }
            else
            count = 0;
        }
        return max;
    }
}



//{ Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}



// } Driver Code Ends