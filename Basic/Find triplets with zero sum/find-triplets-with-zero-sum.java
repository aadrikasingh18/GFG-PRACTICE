//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        if(arr[0] > 0 || arr[n-1] < 0)
        return false;
        
        for(int i=0; i<n; i++)
        {
            int left = i+1;
            int right = n-1;
            while(left < right)
            {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0)
                return true;
                else if(sum > 0)
                right--;
                else
                left++;
            }
        }
        return false;
    }
}