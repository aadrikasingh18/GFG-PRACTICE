//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			insertion llist = new insertion(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		head = ob.insertionSort(llist.head);
		llist.printList(head);
		
        t--;		
        }
    }}
// } Driver Code Ends

class Solution
{
    public static Node insertionSort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node temp = head.next;
        Node sortedTail = head;
        while(temp != null)
        {
            if(temp.data >= sortedTail.data)
            {
                sortedTail = sortedTail.next;
                temp = temp.next;
                continue;
            }
            sortedTail.next = temp.next;
            Node prev = null;
            Node t = head;
            while(t != sortedTail.next)
            {
                if(t.data >= temp.data)
                {
                    break;
                }
                prev = t;
                t = t.next;
            }
            if(prev == null)
            {
                temp.next = head;
                head = temp;
            }
            else
            {
                temp.next = prev.next;
                prev.next = temp;
            }
            temp = sortedTail.next;      
        }
        return head;
    }
}