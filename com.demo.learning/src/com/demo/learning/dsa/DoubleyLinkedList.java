package com.demo.learning.dsa;

public class DoubleyLinkedList {

	class Node {
		Node prev, next;
		int val;

		public Node(int val) {
			prev = null;
			next = null;
			this.val = val;
		}
	}

	Node head, tail;

	public DoubleyLinkedList() {
		head = null;
		tail = null;
	}

	public void insertAtBegining(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		if (head == null) {
			tail = newNode;
		} else {
			head.prev = newNode;
		}
		head = newNode;
	}
	
	public void insertAtEnd(int val) {
		Node newNode = new Node(val);
		newNode.prev=tail;
		tail=newNode;
	}

}
