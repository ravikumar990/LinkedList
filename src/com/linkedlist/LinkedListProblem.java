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

		System.out.println("Delete Last Node");
		ListOperations.deleteLastData();
		System.out.println("\n===================");

		System.out.println("Find Node By Value");
		ListOperations.findNodeByValue();
		System.out.println("===================");
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
