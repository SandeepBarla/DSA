package stack;

public class Main {
	public static void main(String args[]) {
//		IntStack intstack=new IntStack(3);
//		if(!intstack.isFull()) {
//			intstack.push(6);
//			intstack.push(11);
//			intstack.push(9);
//			intstack.push(8);
//		}
//		intstack.pop();
		
		PersonStack personStack=new PersonStack(3);
		Person p1 = new Person("Abhi","1233");
		Person p2 = new Person("Nani","3321");
		Person p3 = new Person("Teja","5521");
		Person p4 = new Person("HArsha","4521");
		
		personStack.push(p1);
		personStack.push(p2);
		personStack.push(p3);
		personStack.push(p4);
		
		personStack.pop();
		personStack.pop();
		personStack.pop();
		
	}
}
