 import java.util.*;

import linkedList.Node;
public class removeDup {

	static Node head;
	static class Node
	{
		int data;
	    Node next;
	    Node(int d)
	    {
	    	data=d;
	    	next=null;
	    }
	}
	public static removeDup insert(removeDup li,int data)
	{
		Node newnode=new Node(data);
	   newnode.next=null;
	   if(li.head==null)
	   {
		   li.head=newnode;
	   }
	   else
	   {
		   Node last=li.head;
		   while(last.next!=null)
		   {
			   last=last.next;
		   }
		   last.next=newnode;
	   }
	   return li;
	}


	public static void display(removeDup li)
	{
		Node current=li.head;
		System.out.println("The LinkedList is:");
		while(current.next!=null)
		{
			System.out.println(current.data);
		   current=current.next;
		}
		System.out.println(current.data);
	}
    
	
		
	public static removeDup removeDup(removeDup li)
	{
		Node curr=li.head;
		while(curr!=null)
		{
                  Node temp=curr;
                  while(temp!=null&&temp.data==curr.data)
                 {
                   temp=temp.next;

                 }
                  curr.next=temp;
                  curr=curr.next;			
		}
		return li;
	}

	public static void main(String[] args) {
	   
		removeDup li=new removeDup();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			li.insert(li,a);
		}
		li.removeDup(li);
		
		li.display(li);
		

	}

}
