//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve 
{
    int[] findTwoElement(int a[], int n) 
    {
        // code here
        int missing = -1;
        int repeating = -1;
        int hash[] = new int[n+1];
        for(int i=0; i<n; i++)
        {
            hash[a[i]]++;
        }
        for(int i=1; i<=n; i++)
        {
            if(hash[i] == 2)
            repeating = i;
            else if(hash[i] == 0)
            missing = i;
            
            if(repeating != -1 && missing != -1)
            break;
        }
        int ans[] = {repeating, missing};
        return ans;
    }
}