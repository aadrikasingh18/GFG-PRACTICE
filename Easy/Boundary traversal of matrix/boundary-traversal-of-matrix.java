//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int mat[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        // Single row matrix ----
        if(n == 1)
        {
            for(int i=0; i<m; i++)
            arr.add(mat[0][i]);
        }
        else if(m == 1) //  Single Column Matrix
        {
            for(int i=0; i<n; i++)
            arr.add(mat[i][0]);
        }
        else{                   
            for (int j = 0; j < m; j++) {     // Traverse top row
                arr.add(mat[0][j]);
            }
            for (int i = 1; i < n; i++) {     // Traverse last column
                arr.add(mat[i][m - 1]);
            }
            // Traverse last row (if there's more than 1 row)
            if (n > 1) {
                for (int j = m - 2; j >= 0; j--) 
                    arr.add(mat[n - 1][j]);
            }
            // Traverse 1st column (if there's more than 1 column)
            if (m > 1) {
                for (int i = n - 2; i >= 1; i--) 
                    arr.add(mat[i][0]);
            }
        }
        return arr;
        
        
        
    }
}
