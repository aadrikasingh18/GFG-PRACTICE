//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int n)
    {
        // your code here
        int count = 0;
        int element = 0;
        for(int i=0; i<n; i++)
        {
            if(count == 0)
            element = a[i];
            
            if(element == a[i])
            count++;
            else
            count--;
        }
        int count_ele = 0;
        for(int i=0; i<n; i++)
        {
            if(a[i] == element)
            count_ele++;
        }
        if(count_ele > n/2)
        return element;
        else
        return -1;
    }
}