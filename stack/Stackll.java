package stack;
public class Stackll{
	
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	Node head=null;
	public  void push(int data) {
		Node newNode= new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void pop() {
		System.out.println();
		Node tempNode=head;
		head=head.next;
		System.out.println("Popped Element is :"+tempNode.data);
	}
	
	public void printList() {
		System.out.print("Stack Elements are");
		Node currentNode=head;
		while(currentNode!=null) {
			System.out.print(" "+ currentNode.data);
			currentNode=currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		Stackll list=new Stackll();
		list.push(1);
		list.push(11);
		list.push(10);
		list.push(4);
		list.push(5);
		list.printList();
		list.pop();
		list.printList();

//		push(list2,5);
//		push(list2,6);
//		push(list2,8);
//		pop(list2);
//		printList(list2);
	}
}