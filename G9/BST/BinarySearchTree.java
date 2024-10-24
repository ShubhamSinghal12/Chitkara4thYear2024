package BST;

public class BinarySearchTree {

	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data,Node l,Node r)
		{
			this.data = data;
			this.left = l;
			this.right = r;
		}
		Node(int data)
		{
			this(data,null,null);
		}
	}
	
	Node root = null;
	
	public void create(int[] arr)
	{
		this.root = create(arr, 0,arr.length-1) ;
	}
	private Node create(int[] arr,int si,int ei)
	{
		if(si > ei)
		{
			return null;
		}
		else
		{
			int mid = (si+ei)/2;
			Node n = new Node(arr[mid]);
			n.left = create(arr, si, mid-1);
			n.right = create(arr,mid+1,ei);
			return n;
		}
	}
	
	public void add(int n)
	{
//		add(root,n);
//		this.root = add2(root, n);
	}
	private void add(Node root,int n)
	{
		if(root == null)
		{
			this.root = new Node(n);
			return;
		}
		if(root.data >= n)
		{
			if(root.left == null)
			{
				root.left = new Node(n);
			}
			else
				add(root.left,n);
		}
		else
		{
			if(root.right == null)
			{
				root.right = new Node(n);
			}
			else
				add(root.right,n);
		}
	}
	
	private Node add2(Node root,int n)
	{
		if(root == null)
		{
			return new Node(n);
		}
		else if(root.data >= n)
		{
			root.left= add2(root.left,n);
		}
		else
		{
			root.right = add2(root.right,n);
		}
		return root;
		
	}
	
	public void delete(int n)
	{
		
	}
	private Node delete(Node root,int n)
	{
		if(root == null)
			return null;
		else if(root.data != n)
		{
			if(root.data >= n) root.left = delete(root.left, n);
			else root.right = delete(root.right, n);
		}
		else
		{
			if(root.left == null && root.right == null)
			{
				return null;
			}
			if(root.left == null)
			{
				return root.right;
			}
			else if(root.right == null)
			{
				return root.left;
			}
			else
			{
				int t = max(root.left);
				root.data = t;
				root.left = delete(root.left,t);
			}
		}
		return root;
	}
		
	
	public void printDec()
	{
		
	}
	private void printDec(Node root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			printDec(root.right);
			System.out.print(root.data+" ");
			printDec(root.left);
		}
	}
	private int max(Node root)
	{
		if(root.right == null)
		{
			return root.data;
		}
		else return max(root.right);
	}
	
	
	
	
	
	
	
	public void display()
	{
		display(this.root);
	}
	private void display(Node n)
	{
		if(n == null)
			return;
		else
		{
			String st = "";
			if(n.left == null)
				st += ". -> ";
			else 
				st += n.left.data+" -> ";
			
			st += n.data;
			
			if(n.right == null)
				st += " <- . ";
			else 
				st += " <- "+n.right.data;
			
			System.out.println(st);
			
			display(n.left);
			display(n.right);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.create(new int[] {10,20,30,40,50,60,70});
		bst.display();

	}

}
