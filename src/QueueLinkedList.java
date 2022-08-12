
public class QueueLinkedList {
	
	Node front, rear;
	int key;
	
	public QueueLinkedList() {
		this.front = null;
		this.rear = null;
	}
	
	void enqueue(int key) {
		Node newNode = new Node(key);
		if(this.rear == null) {
			this.front=this.rear=newNode;
			return;
		}
		this.rear.next = newNode;
		this.rear = newNode;
	}
	
	Node  dequeue() {
		if(this.rear == null) {
			return null;
		}
		Node newNode = this.front;
		this.front = this.front.next;
		if(this.front == null) {
			this.rear = null;
		}
		return newNode;
	}
	
	public static void printList(QueueLinkedList list) {
		Node currentNode = list.front;
		System.out.println("The Elements in the list are : ");
		while(currentNode != null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		QueueLinkedList q = new QueueLinkedList();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		printList(q);
		System.out.println("Dequeued Element is "+q.dequeue().data);
		printList(q);
	}

}
