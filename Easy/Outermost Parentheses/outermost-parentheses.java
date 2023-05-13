//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int start=0;
        int flag=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                flag++;
            }else flag--;
            
            if(flag==0){
                sb.append(s.substring(start+1, i));
                start = i+1;
            }
        }
        return new String(sb);
    }
}
