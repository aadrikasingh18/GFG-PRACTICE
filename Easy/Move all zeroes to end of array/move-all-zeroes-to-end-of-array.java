//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    void pushZerosToEnd(int[] a, int n) 
    {
        
        int j = 0;
        
        for(int k=0; k<n; k++)
        {
            if(a[k] == 0)
            {
                j = k;
                break;
            }
        }
        int i = j+1;
        while(i < n && j < n)
        {
            if(a[i] != 0 && a[j] == 0)
            {
                // swap ele of a[j] & a[i]
                int temp = 0;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
            i++;
        }
    }
}