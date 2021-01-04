package queue;

public class Intq {
	private int[] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	public Intq() {
		size=50;
		front=0;
		rear=0;
		total=0;
		q=new int[50];
	}
	public Intq(int size) {
		this.size=size;
		front=0;
		rear=0;
		total=0;
		q=new int[this.size];
	}
	public boolean isFull() {
		return total==size;
	}
	public void Enq(int item) {
		if(!isFull()) {
			total++;
			q[rear]=item;
			rear++;
		}else {
			System.out.println("Queue is FULL");
		}
	}
	public boolean isEmpty() {
		return total==0;
	}
	public void Deq() {
		if(!isEmpty()) {
			total--;
			System.out.println(q[front]);
			front++;
		}else {
			System.out.println("Queue is Empty");
		}
	}
}
