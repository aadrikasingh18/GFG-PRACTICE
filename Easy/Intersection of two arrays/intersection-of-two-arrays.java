//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking count of total testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            int n, m;

            // taking count of elements in array a
            n = sc.nextInt();

            // taking count of elements in array b
            m = sc.nextInt();

            // Creating 2 arrays of n and m
            int a[] = new int[n];
            int b[] = new int[m];

            // inserting elements to array a
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // inserting elements to array b
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling NumberofElementsInIntersection method
            // and printing the result
            System.out.println(ob.NumberofElementsInIntersection(a, b, n, m));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) 
    {
        int count = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        while(i<n && j<m)
        {
            if(i>0 && a[i] == a[i-1])
            {
                i++;
                continue;
            }
            if(j>0 && b[j] == b[j-1])
            {
                j++;
                continue;
            }
            if(a[i] < b[j])
            i++;
            else if(a[i] > b[j])
            j++;
            else
            {
                i++;
                j++;
                count++;
            }
        }
        return count;
    }
};
