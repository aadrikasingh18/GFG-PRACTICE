//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse (Node head)
    {
        Node curr = head;
        Node prev = null;
        while(curr != null)
        {
            Node dummy = curr.next;
            curr.next = prev;
            prev = curr;
            curr = dummy;
        }
        return prev;
    }
    public static Node addOneCarry(Node head)
    {
        
        Node curr = head;
        Node temp = null;
        int carry = 1, sum = 0; 
        
        while (head != null)
        { 
            sum = carry + head.data; 
            carry = (sum >= 10)? 1 : 0; 
            
            // update sum if it is greater than 10 
            sum = sum % 10; 
 
            // Create a new node with sum as data 
            head.data = sum; 
 
            // Move head and second pointers to next nodes 
            temp = head; 
            head = head.next; 
        } 
 
        // if some carry is still there, add a new node to 
        // result list. 
        if (carry > 0) 
        {
            temp.next = new Node(carry); 
        }
 
        // return head of the resultant list 
        return curr; 
    }
    
    public static Node addOne(Node head) 
    { 
        //code here.
        if(head == null)
        return null;
        
        Node revHead = reverse(head);
        head = addOneCarry(revHead);
        revHead = reverse(head);
        
        return revHead;
    }
    
}
