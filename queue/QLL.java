package queue;

public class QLL {
	Node front, rear;

	public QLL() {
		front = null;
		rear = null;
	}

	public void enq(int value) {
		Node newNode = new Node(value);
		newNode.next = null;
		if (front == null & rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public void dq() {
		System.out.println();
		System.out.println("Dequeued Element is:" + front.data);
		front=front.next;
	}
	
	public void print() {
		System.out.println("Queue Elements are:");
		Node currentNode=front;
		while(currentNode!=null) {
			System.out.print(currentNode.data+ " ");
			currentNode=currentNode.next;
		}
	}

	public static void main(String[] args) {
//		Stackll s1=new Stackll();
		QLL q = new QLL();
		q.enq(5);
		q.enq(6);
		q.enq(10);
		q.enq(150);q.enq(65);
		q.print();
		q.dq();q.dq();q.print();
		
	}
}
