//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends

// LINKS ARE CHANGED
class Solution
{
    static Node segregate(Node head)
    {
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;
        
        Node curr = head;
        while(curr != null)
        {
            if(curr.data == 0)
            {
                zeroTail.next = curr;
                zeroTail = zeroTail.next;
            }
            
            else if(curr.data == 1)
            {
                oneTail.next = curr;
                oneTail = oneTail.next;
            }
            
            else
            {
                twoTail.next = curr;
                twoTail = twoTail.next;
            }
            curr = curr.next;
        }
        //MERGING LISTS
        if(oneHead.next != null)//1 VLI LIST MIE ELEMENT PRESENT HAI
        {
            zeroTail.next = oneHead.next;
        }
        else//1 VLI LIST MIE ELEMENT PRESENT NHI HAI
        {
            zeroTail.next = twoHead.next;
        }
        
        oneTail.next = twoHead.next;
        twoTail.next = null;
        return zeroHead.next;
    }
}

// DATA IS CHANGED
// class Solution
// {
//     static Node segregate(Node head)
//     {
//         int zero = 0;
//         int one = 0;
//         int two = 0;
//         Node curr = head;
//         while(curr != null)
//         {
//             if(curr.data == 0)
//             zero++;
//             else if(curr.data == 1)
//             one++;
//             else 
//             two++;
            
//             curr = curr.next;
//         }
//         curr = head;
//         while(zero != 0)
//         {
//             curr.data = 0;
//             zero--;
//             curr = curr.next;
//         }
//         while(one != 0)
//         {
//             curr.data = 1;
//             one--;
//             curr = curr.next;
//         }
//         while(two != 0)
//         {
//             curr.data = 2;
//             two--;
//             curr = curr.next;
//         }
//         return head;
//     }
// }


