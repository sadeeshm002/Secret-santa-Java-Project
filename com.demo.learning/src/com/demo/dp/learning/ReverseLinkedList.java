package com.demo.dp.learning;

public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {
		
//		ListNode current = null, temp=null;
//		while (head != null) {
//			temp = current;
//			current = new ListNode();
//			current.val = head.val;
//			current.next = temp;
//			head = head.next;
//		}
		
		ListNode current = head, prev=null;
		
		while(current !=null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}
	
	public static void print(ListNode head) {
		
		while (head !=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
//	   print(n1);
	   
	   print(reverseList(n1));
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
