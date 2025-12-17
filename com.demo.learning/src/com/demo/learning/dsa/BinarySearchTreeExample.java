package com.demo.learning.dsa;

public class BinarySearchTreeExample {

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	public BinarySearchTreeExample(int val) {
		root = new Node(val);
	}

	public BinarySearchTreeExample() {
		root = null;
	}

	public Node insert(int val) {
		return insert(root, val);
	}

	public Node insert(Node root, int val) {
		if (root == null) {
			return new Node(val);
		}
		if (root.data > val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}

		return root;
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data);
			inOrder(root.right);
		}
	}

	public Node search(Node root, int val) {
		if (root == null || val == root.data) {
			return root;
		}
		if (root.data > val) {
			return search(root.left, val);
		}

		return search(root.right, val);

	}
	
	public int min(Node root) {
		int minVal = root.data;
		
		while(root.left !=null) {
			minVal = root.left.data;
			root = root.left;
		}
		
		return minVal;
	}
	
	public Node delete(int val) {
		root = delete(root,val);
		return root;
	}
	
	public Node delete(Node root,int val) {
		
		if(root == null) {
			return root;
		}
		
		if(root.data > val) {
			root.left = delete(root.left,val);
		}
		else if(root.data< val) {
			root.right = delete(root.right,val);
		}
		else {
			if(root.left == null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}
			root.data = min(root.right);
			root.right=delete(root.right,root.data);
		}
		
		return root;
	}

}
