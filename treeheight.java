package tree;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int d)
	{
		data=d;
		left=null;
		right=null;
	}
}


public class treeheight {


static Node root;

public treeheight()
{
root=null;
}
public treeheight(int k)
{
 root=new Node(k);
}
public static void inorder(Node temp)
{
	if(temp!=null)
	{
		inorder(temp.left);
		System.out.print(" --> "+temp.data);
		inorder(temp.right);
	}
	return;
}



public static void insertt(int d)
{
	root=insert(root,d);
}
public static Node insert(Node root,int d)
{
	if(root==null)
	{
		root=new Node(d);
		return root;
	}
	else if(root.data>d)
		{
			root.left=insert(root.left,d);
		
		}
		else if(root.data<d)
		{
			root.right=insert(root.right,d);
		
		}
	return root;
}


public static int height(Node root)
{
	
	if(root==null)
	{
		return 0;
		
	}
	else
	{
		int lheight=height(root.left);
		int rheight=height(root.right);
		if(lheight>rheight)
		{
			return(lheight+1);
		}
		else
		{
			return(rheight+1);
			
		}
	}
}
public static void main(String[] args) {

treeheight bt=new treeheight();
bt.insertt(1);
bt.insertt(2);
bt.insertt(3);
bt.insertt(4);
bt.insertt(5S);

System.out.print("Inorder");
inorder(root);
System.out.println();
int h=bt.height(root)-1;
System.out.println("height="+h);

}

}
