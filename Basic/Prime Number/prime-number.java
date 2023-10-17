//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends

class Solution{
    static int isPrime(int n){
        // code here
        if(n==1)return 0;
        if(n==2|| n==3) return 1;
        if(n%2==0|| n%3==0) return 0;
        for(int i =5;i*i<=n;i=i+6){
            if(n%i==0|| n%(i+2)==0)
            return 0;
        }return 1;
    }
}