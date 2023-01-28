package DataStructure;

public class LinkedList {
	
	class Node{
		int data;
		Node next;
	
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head;
	public Node tail;
	
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
		ll.printList();
	}

}
