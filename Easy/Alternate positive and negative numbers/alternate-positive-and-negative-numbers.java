//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution 
{
    void rearrange(int a[], int n) 
    {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++)
        {
            if(a[i] >= 0)
            pos.add(a[i]);
            else
            neg.add(a[i]);
        }
        
        int psize = pos.size();
        int nsize = neg.size();
        
        int t = 0;
        int i;
        if(psize >= nsize)
        {
            for(i=0; i<nsize; i++)
            {
                a[2*i] = pos.get(i);
                a[2*i + 1] = neg.get(i);
            }
            t = i;
            for(int k = 2*nsize; k < n; k++)
            {
                a[k] = pos.get(t);
                t++;
            }
        }
        else
        {
            for(i=0; i<psize; i++)
            {
                a[2*i] = pos.get(i);
                a[2*i + 1] = neg.get(i);
            }
            t = i;
            for(int k = 2*psize; k < n; k++)
            {
                a[k] = neg.get(t);
                t++;
            }
        }
    }
}