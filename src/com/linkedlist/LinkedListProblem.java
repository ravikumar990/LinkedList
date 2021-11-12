package com.linkedlist;

public class LinkedListProblem {
	public static void main(String args[]) {
		System.out.println("Welcome To Linked List Problem");

		ListOperations.addData();
		System.out.println("");
		System.out.println("===================");
		ListOperations.appendData();
	}
}

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
