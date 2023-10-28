//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.sum(head, k));
		}
	}
}
// } Driver Code Ends


/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution 
{
    public int sum(Node head, int k)
    {
        if(head == null)
        return -1;
        
        Node first = head;
        Node second = head;
        for(int i=0; i<k; i++)
        {
            first = first.next;
        }
        
        
        while(first != null)
        {
            first = first.next;
            second = second.next;
        }
        
        int sum = 0;
        while(second != null)
        {
            sum = sum + second.data;
            second = second.next;
        }
        
        return sum;
    }
}