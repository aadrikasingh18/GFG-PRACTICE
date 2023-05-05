//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] a, int n)
    { 
        // Your code here
        Deque<Long> s = new ArrayDeque<>();
        long b[] = new long[n];
        int k = n-1;
        for(int i=n-1; i>=0; i--)
        {
            while(!s.isEmpty() && s.peek() <= a[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                b[k] = -1;
                k--;
            }
            else
            {
                b[k] = s.peek();
                k--;
            }
            s.push(a[i]);
        }
        return b;
    } 
}