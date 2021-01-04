package stack;

public class PersonStack {
	private Person[] stack;
	private int size;
	private int top;
	public PersonStack(int size) {
		top=-1;
		this.size = size;
		stack = new Person[this.size];
	}
	public boolean isFull() {
		return top==stack.length-1;
	}
	public void push(Person person) {
		if(!isFull()) {
			top++;
			stack[top]=person;
		}else {
			System.out.println("Stack is FULL");
		}
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void pop() {
		if(!isEmpty()) {
			System.out.println(stack[top--]);
		}else {
			System.out.println("Stack is EMPTY");
		}
	}
	
}
