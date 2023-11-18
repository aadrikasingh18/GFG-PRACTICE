//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int n = Integer.parseInt(br.readLine().trim());
            int[][] pathCoordinates = new int[n][2];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++)
                    pathCoordinates[i][j] = Integer.parseInt(S[j]);
            }
            Solution obj = new Solution();
            int[] ans = obj.findStartingPoint(x, y, pathCoordinates);
            for(int i = 0; i < ans.length; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[] findStartingPoint(int x, int y, int[][] c)
    {
        // x = 2 
        // y = 2
        // 1 0
        // 0 1
        // 1 1
        int n = c.length; //3
        //System.out.println("n is" + n);
        int m = c[0].length; //2
        //System.out.println("m is" + m);
        int sum[] = {0, 0};
        int i = 0;
        int k = 0;
        for(int col=0; col<m; col++)
        {
            for(int row=0; row<n; row++)
            {
                k = k + c[row][col];
            }
            sum[i] = k;
            i++;
            k = 0;
        }
        sum[0] = x - sum[0];
        sum[1] = y - sum[1];
        return sum;
    }
}