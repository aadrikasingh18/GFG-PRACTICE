//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution 
{
    public Node insertInMid(Node head, int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            head = temp;
            return head;
        }
        Node curr = head;
        int k = 1;
        while(curr.next != null)
        {
            k++;
            curr = curr.next;
        }
        int d = k/2;
        curr = head;
        if(k%2 != 0)
        {
            for(int i=0; i<d; i++)
            {
               curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
            return head;
        }
        else
        {
            for(int i=0; i<(d-1); i++)
            {
               curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
            return head;
        }
    }
}