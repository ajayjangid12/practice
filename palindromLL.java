 import java.util.*;

public class palindromLL {

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
	public static palindromLL insert(palindromLL li,int data)
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


	public static void display(palindromLL li)
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
    
	
		
	public static void palindrom(palindromLL li)
	{
		int count=0;
		Node temp=li.head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		int arr[]=new int[count];
		Node tempp=li.head;
		for(int i=0;i<count;i++)
		{
			arr[i]=tempp.data;
			tempp=tempp.next;
		}
		int flag=0;
		for(int i=0;i<=count/2;i++)
		{
			if(arr[i]==arr[count-1-i])
			{
				flag=0;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
	   
		palindromLL li=new palindromLL();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			li.insert(li,a);
		}
		li.palindrom(li);
		
		li.display(li);
		

	}

}
