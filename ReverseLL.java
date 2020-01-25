 import java.util.*;
public class ReverseLL {

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
	public static ReverseLL insert(ReverseLL li,int data)
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
	
	
	public static void display(ReverseLL li)
	{
		Node current=li.head;
		System.out.println("The LinkedList is:");
		while(current.next!=null)
		{
			System.out.print(current.data+"->");
		   current=current.next;
		}
		System.out.println(current.data+"->"+"NULL");
		
	}
	public static ReverseLL reverse(ReverseLL li)
	{
		Node curr=li.head;
		Node prev=null;
		Node last=null;
		while(curr!=null)
		{
			last=curr.next;
			curr.next=prev;
			prev=curr;
			curr=last;
			
		}
		li.head=prev;
		return li;
	}
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
		ReverseLL li=new ReverseLL();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			li.insert(li, a);
		}
		li.reverse(li);
		li.display(li);

	}

}
