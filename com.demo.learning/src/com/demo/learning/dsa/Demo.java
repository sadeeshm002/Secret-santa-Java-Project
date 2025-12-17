package com.demo.learning.dsa;

import com.demo.learning.dsa.BinaryTreeExample.Node;

public class Demo {
	public static void main(String[] args) {

		BinaryTreeExample binaryTree = new BinaryTreeExample(10);

		Node root = binaryTree.root;

		binaryTree.insertLeft(root, 5);
		binaryTree.insertLeft(root.left, 3);
		binaryTree.insertRight(root.left, 8);
		binaryTree.insertRight(root, 15);
		binaryTree.insertLeft(root.right, 12);
//
//		BinaryTreeExample.preOrder(root);
//		System.out.println();
		BinaryTreeExample.inOrder(root);
		System.out.println();
//		BinaryTreeExample.postOrder(root);
//		System.out.println();

//		BinarySearchTreeExample bst = new BinarySearchTreeExample(50);
//		bst.insert(20);
//		bst.insert(70);
//		bst.insert(10);
//		bst.insert(25);
//		bst.insert(60);
//		bst.insert(90);

//		bst.inOrder(bst.root);
//
//		if (bst.search(bst.root, 30) == null) {
//			System.out.println("Not Found");
//		} else {
//			System.out.println("found");
//		}
//		
//		bst.delete(50);
//		bst.inOrder(bst.root);

//		AVLTreeExample acl = new AVLTreeExample();
//		acl.insert(50);
//		acl.insert(20);
//		acl.insert(60);
//		acl.insert(10);
//		acl.insert(30);
//		acl.insert(40);
//		acl.inOrder(acl.node);
		
		System.out.println(binaryTree.levelOrder(root));

	}

}
