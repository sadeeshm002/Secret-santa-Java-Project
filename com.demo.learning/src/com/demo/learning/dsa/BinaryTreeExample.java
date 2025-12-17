package com.demo.learning.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeExample {

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	public BinaryTreeExample(int data) {
		this.root = new Node(data);
	}

	public void insertLeft(Node root, int data) {
		Node newNode = new Node(data);
		root.left = newNode;
	}

	public void insertRight(Node root, int data) {
		Node newNode = new Node(data);
		root.right = newNode;
	}

	public static void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data);
			inOrder(root.right);
		}
	}

	public static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data);
		}
	}
	
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> resultList = new ArrayList<>();
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node poll = queue.poll();
				level.add( poll.data);

				if (poll.left != null) {
					queue.offer(poll.left);
				}
				if (poll.right != null) {
					queue.offer( poll.right);
				}
			}

			resultList.add(level);
		}
		return resultList;
	}
}
