package BT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCreate {

	class Node{
		int data;
		Node left;
		Node right;
	}
	
	Node root = null;
	
	public void create(int[] arr)
	{
		this.root = create(arr, 0, arr.length-1);
	}
	
	private Node create(int[]arr,int si,int ei)
	{
		if(si > ei)
			return null;
		else
		{
			int mid = (si+ei)/2;
			
			Node nn =new Node();
			nn.data = arr[mid];
			
			nn.left = create(arr,si,mid-1);
			nn.right = create(arr,mid+1,ei);
			return nn;
		}
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
	
	public void levelOrder()
	{
		Queue<Node> qt = new LinkedList<Node>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node n = qt.remove();
			System.out.println(n.data+" ");
			if(n.left != null) qt.add(n.left);
			if(n.right != null) qt.add(n.right);
		}
	}
	
	public int max()
	{
		return max(root);
	}
	
	private int max(Node n)
	{
		if(n == null) return Integer.MIN_VALUE;
		else
			return Math.max(n.data, Math.max(max(n.left), max(n.right)));
	}
	
	public int ht()
	{
		return ht(root);
	}
	
	private int ht(Node n)
	{
		if(n == null) return -1;
		else
			return Math.max(ht(n.left),ht(n.right))+1;
	}
	
	public void printPaths()
	{
		
	}
	private void printPaths(Node root,String ans)
	{
		if(root == null)
		{
			return;
		}
		if(root.left == null && root.right == null)
		{
			System.out.println(ans+" "+root.data);
			return;
		}
		else {
			printPaths(root.left,ans+" "+root.data);
			printPaths(root.right,ans+" "+root.data);
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTreeCreate bt = new BinaryTreeCreate();
		bt.create(new int[] {4,2,1,3,5,6,7});
		bt.display();
	}
}
