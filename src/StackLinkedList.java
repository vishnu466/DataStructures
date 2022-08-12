
public class StackLinkedList {
	
	private static Node first = null;
	static StackLinkedList list = new StackLinkedList();
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = first;
		first = newNode;
	}
	
	public void pop() {
		Node temp = first;
		first = first.next;
		System.out.println("Removed Element :" +temp.data);
	}
	
	public static void printList(StackLinkedList list) {
		Node currentNode = first;
		System.out.println("Linked list elements : ");
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}System.out.println();
	}

	public static void main(String[] args) {
		list.push(4);
		list.push(6);
		list.push(1); 
		printList(list);
		list.pop();
		printList(list);
		
		

	}

}
