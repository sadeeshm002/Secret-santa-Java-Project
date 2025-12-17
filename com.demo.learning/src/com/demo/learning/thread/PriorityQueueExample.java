package com.demo.learning.thread;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

class Player {
	String name;
	Integer score;

	public Player(String name, Integer score) {
		this.name = name;
		this.score = score;
	}
}

public class PriorityQueueExample {

	public static void main(String[] args) {

//		PriorityQueue<String> queue = new PriorityQueue<>();
//		
//		queue.add("sadeesh");
//		queue.offer("ak");
//		queue.add("Arun");
//		queue.add("Karan");    
//        queue.add("Jai");    
//        queue.add("Rahul"); 
//        queue.add("Kasi");

//		System.out.println(queue.peek());
//		System.out.println(queue.element());
//		
//		Iterator<String> iterator = queue.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

//        System.out.println(queue.remove());
//	   queue.poll();
//	   System.out.println();
//		Iterator<String> iterator1 = queue.iterator();
//	   while(iterator1.hasNext()) {
//			System.out.println(iterator1.next());
//		}

//		PriorityQueue<Player> queue = new PriorityQueue<>((p1, p2) -> p1.score - p2.score);
//
//		Player player1 = new Player("arun", 2);
//		Player player2 = new Player("ram", 1);
//		Player player3 = new Player("laks", 3);
//		queue.offer(player1);
//		queue.add(player2);
//		queue.add(player3);
//		
//		System.out.println(queue.poll().name);
//		 System.out.println();
//		
//		Iterator<Player> iterator1 = queue.iterator();
//		   while(iterator1.hasNext()) {
//				System.out.println(iterator1.next().name);
//			}
//		System.out.println(queue.poll().name);   
		
		Deque<String> deque = new ArrayDeque<>();
//		deque.addFirst("sarun");
//		deque.addFirst("ram");
		deque.add("ak");
		deque.add("ak");
		deque.add("Raj");
//		deque.addLast("AAbi");
		System.out.println(deque.peek());

		deque.removeFirst();

		Iterator<String> iterator1 = deque.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		

	}

}
