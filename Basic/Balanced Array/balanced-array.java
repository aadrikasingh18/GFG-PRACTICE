//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        long sum1 = 0;
        for(int i=0; i<n/2; i++)
        {
            sum1 = sum1 + a[i];
        }
        long sum2 = 0;
        for(int i=n/2; i<n; i++)
        {
            sum2 = sum2 + a[i];
        }
        long diff = 0;
        diff = sum1 - sum2;
        if(diff > 0)
        return diff;
        else
        return -1*diff;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            
            long ans=ob.minValueToBalance(a,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends