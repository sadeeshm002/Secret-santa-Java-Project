package com.demo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	class Node {
		int key,val;
		Node prev,next;
		
		public Node(int key,int val){
			this.key =key;
			this.val =val;
		}
	}
        int capacity;
	    Map<Integer,Node> map;
	    Node head, tail;

	    public LRUCache(int capacity) {
	    	this.capacity = capacity;
	    	 this.map = new HashMap<>();
	    	 this.head = new Node(0, 0);
	    	 this.tail = new Node(0, 0);
	    	 head.next =tail;
	    	 tail.prev = head;
	        
	    }
	    
	    public int get(int key) {
	        if(!map.containsKey(key)){
	            return -1;
	        }
	        Node node = map.get(key);
	        moveToHead(node);
	        return node.val;
	    }

		private void moveToHead(Node node) {
			removeNode(node);
	        addToHead(node);
		}
	    
	    private void addToHead(Node node) {
          node.prev = head;
          node.next = head.next;
          head.next.prev =node;
          head.next = node;        		 
		}

		private void removeNode(Node node) {
            node.next.prev = node.prev;
            node.prev.next = node.next;
		}

		public void put(int key, int value) {
			if (map.containsKey(key)) {
				Node node = map.get(key);
				node.val=value;
				moveToHead(node);
			}
			else {
				if(map.size() == capacity) {
					Node lru = tail.prev;
					removeNode(lru);
					map.remove(lru.key);
				}
				Node newNode = new Node(key, value);
				addToHead(newNode);
				map.put(key, newNode);
			}
			
	    }
		
		public static void main(String[] args) {
			LRUCache lru = new LRUCache(2);
			lru.put(1, 1);
		}


}
