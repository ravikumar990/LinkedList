package com.linkedlist;

public class ListOperations {

	public static void addData() {
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		list.print();
	}

	public static void appendData() {
		LinkedList list = new LinkedList();
		list.append(56);
		list.append(30);
		list.append(70);
		list.print();
	}

	public static void insertData() {
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(56);
		list.insertNode(list.head, 30);
		list.print();
	}

	public static void deleteFirstData() {
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		list.pop();
		list.print();
	}

	public static void deleteLastData() {
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		list.popLast();
		list.print();
	}

	public static void findNodeByValue() {
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		list.findNode(30);
	}

	public static void insertDataAtGivenNode() {
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		list.insertNode(list.head.next, 40);
		list.print();
	}
}