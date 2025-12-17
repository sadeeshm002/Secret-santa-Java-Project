package com.demo.learning.dsa;

public class CircularLinkedList {

	ListNode last;

	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}

	}

	public CircularLinkedList() {
		last = null;
	}

	public void inserAtBegining(int val) {
		ListNode newNode = new ListNode(val);
		if (last == null) {
			newNode.next = newNode;
			last = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
		}
	}

	public void display() {

		ListNode temp = last.next;

		do {
			System.out.println(last.val);
			temp = temp.next;
		} while (temp != last.next);

	}

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();

		list.inserAtBegining(10);
		list.inserAtBegining(20);
		list.inserAtBegining(30);

		list.display();
	}
}
