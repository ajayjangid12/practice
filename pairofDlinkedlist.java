import java.util.Scanner;

public class pairofDlinkedlist{

	static Node head;
	static class Node
	{
		int data;
	    Node next;
	    Node prev;
	    Node(int d)
	    {
	    	data=d;
	    }
	}
	public static pairofDlinkedlist insert(pairofDlinkedlist li,int data)
	{
		Node newnode=new Node(data);
	   newnode.next=null;
	   newnode.prev=null;
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
		   newnode.next=null;
		   newnode.prev=last;
	   }
	   return li;
	}
	
	public static void pair(pairofDlinkedlist li,int k)
	{
		Node curr=li.head;
		int n=0;
		while(curr!=null)
		{
			n++;
			curr=curr.next;
		}
		int arr[]=new int[n];
		int j=0;
		Node curr1=li.head;
		while(curr1!=null)
		{
			arr[j]=curr1.data;
			curr1=curr1.next;
			j++;
		}
		int flag=0;
		for(int i=0;i<n;i++)
		{
			for(int p=i+1;p<n;p++)
			{
				int sum=arr[i]+arr[p];
				if(sum==k)
				{ flag=1;
					System.out.print("("+arr[p]+","+arr[i] +")");
				}
				
			}
		}
		if(flag==0)
		{
			System.out.print("No Pair");
		}
		
	}
	public static void display(pairofDlinkedlist li)
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
	
	public static void main(String[] args) {
	   
		pairofDlinkedlist li=new pairofDlinkedlist();
		
		Scanner sc=new Scanner(System.in);
		
			int x=sc.nextInt();
	for(int i=0;i<x;i++)
	{
		int a=sc.nextInt();
		li.insert(li,a);
	}
   int s=sc.nextInt();
   li.pair(li,s);
	
	}
}
