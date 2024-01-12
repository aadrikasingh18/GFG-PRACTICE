//{ Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 


// } Driver Code Ends

class Solution 
{
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    int a[] = new int[n];
	    int k = 0;
	    for(int i=n-1; i>=0; i--)
	    {
	        a[i] = arr[k];
	        k++;
	    }
	    k = n-1;
	    ArrayDeque<Integer> st = new ArrayDeque<>();
	    for(int i=0; i<n; i++)
	    {
	        while((!st.isEmpty()) && (st.peek()>=a[i]))
	        {
	            st.pop();
	        }
	        if(st.isEmpty())
	        {
	            arr[k] = -1;
	        }
	        else
	        {
	            arr[k] = st.peek();
	        }
	        k--;
	        st.push(a[i]);
	    }
	    return arr;
	} 
}
