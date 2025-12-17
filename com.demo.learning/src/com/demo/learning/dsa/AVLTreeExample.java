package com.demo.learning.dsa;

public class AVLTreeExample {

	class Node {
		int data;
		Node left, right;
		int height;

		public Node(int data) {
			this.data = data;
			left = right = null;
			height = 0;
		}
	}

	Node node;

	public AVLTreeExample(int val) {
		node = new Node(val);
	}

	public AVLTreeExample() {
		node = null;
	}

	public void insert(int val) {
		node = insert(node, val);
	}

	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.println(node.data + " and height is " + node.height);
			inOrder(node.right);
		}
	}

	public Node insert(Node node, int val) {
		if (node == null) {
			return new Node(val);
		}
		if (node.data > val) {
			node.left = insert(node.left, val);
		} else if (node.data < val) {
			node.right = insert(node.right, val);
		} else {
			return node;
		}

		node.height = 1 + max(getHeight(node.right), getHeight(node.left));

//		if (val == 40) {
//			System.out.println("height of " + node.data + "is updated to " + node.height);
//		}

		int balanceFactor = getBalanceFactor(node);

		// LL
		if (balanceFactor > 1 && val < node.left.data) {
			return rightRotate(node);
		}
		// LR
		if (balanceFactor > 1 && val > node.left.data) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		// RR
		if (balanceFactor < -1 && val > node.right.data) {
			return leftRotate(node);
		}
		// RL
		if (balanceFactor < -1 && val < node.right.data) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;

	}

//check notes for future understanding
	public Node leftRotate(Node nodeX) {
		Node nodeY = nodeX.right;
		Node nodeYLeftChild = nodeY.left;

		nodeY.left = nodeX;
		nodeX.right = nodeYLeftChild;

		nodeX.height = 1 + max(getHeight(nodeX.right), getHeight(nodeX.left));
		nodeY.height = 1 + max(getHeight(nodeY.right), getHeight(nodeY.left));

		return nodeY;
	}

	public Node rightRotate(Node nodeZ) {
		Node nodeY = nodeZ.left;
		Node nodeYRightChild = nodeY.right;

		nodeY.right = nodeZ;
		nodeZ.left = nodeYRightChild;

		nodeZ.height = 1 + max(getHeight(nodeZ.right), getHeight(nodeZ.left));
		nodeY.height = 1 + max(getHeight(nodeY.right), getHeight(nodeY.left));

		return nodeY;
	}

	public int getBalanceFactor(Node node) {
		if (node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}

	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public int getHeight(Node node) {
		if (node == null) {
			return -1;
		}
		return node.height;
	}

}
