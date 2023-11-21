//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int findMax(int a[],int n) 
    {
        int max = a[0];
        for(int i=1; i<n; i++)
        {
            if(max < a[i])
            max = a[i];
        }
        return max;
    }
    public static int findMin(int a[],int n) 
    {
        int min = a[0];
        for(int i=1; i<n; i++)
        {
            if(min > a[i])
            min = a[i];
        }
        return min;
    }
    public static int findSum(int a[],int n) 
    {
        int max = findMax(a,n);
        int min = findMin(a,n);
        int sum = max + min;
        return sum;
    }
}
