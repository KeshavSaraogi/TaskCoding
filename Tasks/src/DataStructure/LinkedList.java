package DataStructure;

public class LinkedList {
	
	static class Node{
		int data;
		Node next;
	
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head;
	public Node tail;
	
	//adds at the end of the list
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			 tail = newNode;
		}
	}
	
	//deletes the last node of the list
	public Node deleteLast() {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
		return curr;
	}
	
	public Node deleteFirst() {
		if (head == null) {
			return null;
		}
		
		if (head.next == null) {
			return null;
		}
		
		Node curr = head;
		head = head.next;
		
		return head;
	}
	
	//prints the entire list
	public void printList() {
		Node curr = this.head;
		if (curr == null) {
			System.out.println("Empty LinkedList");
			return;
		}
		else {
			while (curr != null) {
				System.out.print(curr.data);
				curr = curr.next;
				System.out.print(" ");
			}
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.addNode(0);
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.deleteLast();
		ll.deleteFirst();
		
		ll.printList();
	}

}
