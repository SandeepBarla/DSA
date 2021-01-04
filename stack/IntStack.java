package stack;

public class IntStack {
		private int top;
		private int stack[];
		private int size;
		public IntStack() {
			top=-1;
			size=50;
			stack= new int[50];
		}
		public IntStack(int size) {
			top=-1;
			this.size=size;
			stack= new int[this.size];
		}
		public boolean isFull() {
			return top==stack.length -1;
		}
		public void push(int item) {
			if(!isFull()) {
			top++;
			stack[top]=item;
			 }
			else {System.out.println("Is Full");}}
		public boolean isEmpty() {
			return top==-1;
		}
		public void pop() {
			if(isEmpty()) {
				System.out.println("Empty");;
			}else {
			System.out.println(stack[top--]);}
		}
		
}
