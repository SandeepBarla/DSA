package queue;

public class Main {

	public static void main(String[] args) {

		
//		Intcq cq=new Intcq(4);
//		cq.Enq(5);
//		cq.Enq(6);
//		cq.Enq(7);
//		cq.Enq(10);
//		cq.showAll();
//		cq.Deq();
//		cq.Deq();
//		cq.Deq();
//		cq.Deq();
//		cq.Enq(10);
//		cq.Deq();
		Personcq pcq = new Personcq(3);
		Person p1 = new Person("Abhi","1233");
		Person p2 = new Person("Nani","3321");
		Person p3 = new Person("Teja","5521");
		Person p4 = new Person("HArsha","4521");
		
		pcq.Enq(p1);
		pcq.Enq(p2);
		pcq.Enq(p3);
		pcq.Enq(p4);
		pcq.Deq();
		pcq.Deq();
		pcq.Deq();
		pcq.Deq();
		pcq.Enq(p4);
		pcq.Deq();
		pcq.Deq();
		
	
//		pq.Enq(p1);
//		pq.Enq(p2);
//		pq.Enq(p3);
//		pq.Enq(p4);
//		
//		pq.Deq();
//		pq.Deq();pq.Deq();pq.Deq();
		
	
	}

}
