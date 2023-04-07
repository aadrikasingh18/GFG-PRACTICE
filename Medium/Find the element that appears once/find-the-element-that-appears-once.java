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
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int nums[], int n) 
    {
          int t = 0;
          
          if(n == 1)
              return nums[0];
          else
          {
              Arrays.sort(nums);
              if(nums[0] != nums[1])
                return nums[0];
              else if(nums[n-2] != nums[n-1])
                return nums[n-1];
              else
              {
                for(int i=1; i<n-2; i++)
                {
                        if((nums[i-1] != nums[i]) && (nums[i] != nums[i+1]))
                        {
                                t = nums[i];
                                break;
                        }
                 }
              }
          }
            return t;
    }
}