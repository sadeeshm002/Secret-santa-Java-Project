package com.demo.learning.dsa;

public class LinkedListNodeTest {

	public Node  hasCycle(Node head) {

		Node slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow=head;
				while(slow!=fast) {
					slow=slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}

		return null;

	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n2;

		LinkedListNodeTest sol = new LinkedListNodeTest();
		Node hasCycle = sol.hasCycle(n1);

		System.out.println(hasCycle.data);
	}
}

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}

}