//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse (Node head)
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
    
    static Node addTwoLists(Node first, Node second)
    {
        first = reverse(first);
        second = reverse(second);
        
        int carry = 0;
        
        Node dummy = null; //sum vli node
        
        //using a loop till both lists and carry gets exhausted.
        while(first != null || second != null || carry != 0)
        {
            int sum = 0;
            if(first != null)
            {
                sum = sum + first.data;
                first = first.next;
            }
            if(second != null)
            {
                sum = sum + second.data;
                second = second.next;
            }
            sum = sum + carry;
            carry = sum / 10;
            
            
            Node newNode = new Node(sum % 10);
            newNode.next = dummy; 
            dummy = newNode;
            
        }
        
        return dummy;
    }
}