package com.linkedlist;

public class LinkedList {
	Node head;
	Node tail;

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = tail;
			this.tail = newNode;
			temp.next = newNode;
		}
	}

	public void insertNode(Node prev_node, int newNode) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_Node = new Node(newNode);
		new_Node.next = prev_node.next;
		prev_node.next = new_Node;
	}

	public void pop() {
		if (this.head != null) {
			Node temp = this.head;
			this.head = this.head.next;
			temp = null;
		}
	}

	public void popLast() {
		Node temp = head;
		while (!temp.next.equals(tail)) {
			temp = temp.next;
		}
		this.tail = temp;
		temp.next = null;
	}

	public void findNode(int value) {
		Node tempNode = head;
		int index = 1;
		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (tempNode != null) {
				if (tempNode.data == value) {
					flag = true;
					break;
				}
				index++;
				tempNode = tempNode.next;
			}
		}
		if (flag == true) {
			System.out.println("The Value (" + value + ") you are searching is present at Index : " + (index - 1)
					+ " in the list.");
		} else {
			System.out.println("Element is not present in the list");
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
}