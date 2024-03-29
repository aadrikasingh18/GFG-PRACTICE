//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int a[][], int n, int m, int k)
    {
        int ans = 0;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;
        while(top <= bottom && left <= right)
        {
            for(int i=left; i<=right; i++)
            {
                k--;
                if(k == 0)
                {
                    ans = a[top][i];
                    return ans;
                }
            }
            top++;
            for(int i=top; i<=bottom; i++)
            {
                k--;
                if(k == 0)
                {
                    ans = a[i][right];
                    return ans;
                }
            }
            right--;
            if(top <= bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    k--;
                    if(k == 0)
                    {
                        ans = a[bottom][i];
                        return ans;
                    }
                }
                bottom--;
            }
            if(left <= right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    k--;
                    if(k == 0)
                    {
                        ans = a[i][left];
                        return ans;
                    }
                }
                left++;
            }
        }
        return 0;
    }
}