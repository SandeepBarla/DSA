package LinkedList;

public class DoubleLinkedList {
	Node head;
	
	public static DoubleLinkedList insert(DoubleLinkedList list, int data) {
		Node newNode=new Node(data);
		newNode.prev=null;
		newNode.next=null;
		if(list.head==null) {
			list.head=newNode;
		}else {
			Node currentNode=list.head;
			while(currentNode.next!=null) {
				currentNode=currentNode.next;
			}
			currentNode.next=newNode;
			newNode.prev=currentNode;
		}
		return list;
	}
	
	public static DoubleLinkedList deleteByKey(DoubleLinkedList list,int key) {
		System.out.println();
		Node prevNode=null;
		Node currentNode=list.head;
		if(currentNode!=null && currentNode.data==key) {
			list.head=currentNode.next;
			list.head.prev=null;
			System.out.println(key+ " found and deleted");
		}else {
			while(currentNode!=null && currentNode.data!=key) {
				prevNode=currentNode;
				currentNode=currentNode.next;
			}
			if(currentNode!=null && currentNode.next!=null) {
				prevNode.next=currentNode.next;
				currentNode.next.prev=prevNode;
				System.out.println(key+ " found and deleted");
			}
			if(currentNode!=null && currentNode.next==null) {
				prevNode.next=currentNode.next;
//				currentNode.next.prev=prevNode;
				System.out.println(key+ " found and deleted");
			}
			if(currentNode==null) {
				System.out.println("Element Not found in list");
			}
		}
		
		return list;
	}
	
	public static void printList(DoubleLinkedList list) {
		System.out.print("Elements in Double linked list are:");
		Node currentNode=list.head;
		while(currentNode!=null) {
			System.out.print(" "+currentNode.data);
			currentNode=currentNode.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		DoubleLinkedList list= new DoubleLinkedList();
		
		insert(list,1);
		insert(list,8);
		insert(list,6);
		insert(list,5);
		printList(list);
		deleteByKey(list,5);
		printList(list);
	}

}
