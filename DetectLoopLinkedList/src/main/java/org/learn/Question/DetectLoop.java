package org.learn.Question;

import org.learn.List.Node;

public class DetectLoop {
	public static boolean isLooped(Node head) {		
		if( null == head) {
			System.out.println("Linked list is empty");
			return false;
		}		
		
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null) {
			
			fast = fast.next;
			if(slow == fast) {
				System.out.println("Loop found in linked list");
				return true;
			}
			fast = fast.next;
			if(slow == fast) {
				System.out.println("Loop found in linked list");
				return true;
			}
			slow = slow.next;
		}
		System.out.println("No loop found in linked list");
		return false;
	}
	
	public static Node insert(Node head, int data) {
		while(head.next != null) 
			head = head.next;
		head.next = new Node(data);
		return head.next;
	}	
}
