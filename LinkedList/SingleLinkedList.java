package LinkedList;
public class SingleLinkedList{
	Node head;
	public static SingleLinkedList insert(SingleLinkedList list,int data) {
		Node newNode= new Node(data);
		newNode.next=null;
		if(list.head==null) {
			list.head=newNode;
		}else {
			Node currenttNode=list.head;
			while(currenttNode.next != null) {
				currenttNode=currenttNode.next;
			}
			currenttNode.next=newNode;
		}
		return list;
	}
	
	public static SingleLinkedList deleteByKey(SingleLinkedList list, int key) {
		System.out.println();
		Node currentNode=list.head;
		Node prevNode=null;
		if(currentNode!=null && currentNode.data==key) {
			list.head=currentNode.next;
			System.out.println(currentNode.data+" found and deleted");
		}else {
			while(currentNode!=null && currentNode.data!=key) {
				prevNode=currentNode;
				currentNode=currentNode.next;
			}
			if(currentNode!=null) {
				prevNode.next=currentNode.next;
				System.out.println(currentNode.data+" found and deleted");

			}
			if(currentNode==null) {
				System.out.println("Not Found");
			}
		}
		return list;
	}
	
	public static void printList(SingleLinkedList list) {
		System.out.print("SingleLinked List Elements are");
		Node currentNode=list.head;
		while(currentNode!=null) {
			System.out.print(" "+ currentNode.data);
			currentNode=currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		SingleLinkedList list=new SingleLinkedList();
		insert(list,1);
		insert(list,11);
		insert(list,10);
		insert(list,4);
		insert(list,5);
		printList(list);
		deleteByKey(list,4);
		printList(list);
	}
}