package com.linkedlist;

public class LinkedListProblem {
	public static void main(String args[]) {
		System.out.println("Welcome To Linked List Problem");

		System.out.println("\n===================");

		System.out.println("Add Nodes");
		ListOperations.addData();
		System.out.println("\n===================");

		System.out.println("Append Nodes");
		ListOperations.appendData();
		System.out.println("\n===================");

		System.out.println("Insert Nodes");
		ListOperations.insertData();
		System.out.println("\n===================");

		System.out.println("Delete First Node");
		ListOperations.deleteFirstData();
		System.out.println("\n===================");
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
