//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution 
{
    public static int[] asteroidCollision(int n, int[] a) 
    {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=0; i<n; i++)
        {
            // if stack is empty or there is a positive value 
            // then perform blind insertion
            if(st.isEmpty() || a[i] > 0) 
            st.push(a[i]);
            else
            {
                // ab jo value aa rhi hai voh negative hai
                while(!st.isEmpty())
                {
                    int top = st.peek();
                    if(top < 0)
                    {
                        st.push(a[i]); // top bhi -ive and jo aarhi voh bhi -ve so push 
                        break;
                    }
                    else
                    {
                        // top vli positive and jo aarhi voh negative
                        int mod = Math.abs(a[i]); 
                        if(mod == top)
                        {
                            st.pop();
                            break;
                        }
                        else if(mod < top)
                        {
                            break;
                        }
                        else
                        {
                            st.pop();
                            if(st.isEmpty())
                            {
                                st.push(a[i]);
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        int size = st.size();
        int ans[] = new int [size];
        for(int i=size-1; i>=0; i--)
        {
            ans[i] = st.pop();
        }
        return ans;
    }
}
