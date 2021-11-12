package com.linkedlist;

public class LinkedList {

	public static void main(String args[]) {
		Node firstNode = new Node(56);
		Node secondNode = new Node(30);
		Node thirdNode = new Node(70);

		Node head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		Node tail = thirdNode;

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

class Node {
	int data;
	Node next;

	public Node(int info) {
		this.data = info;
	}
}
