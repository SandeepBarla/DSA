package binarySearch;
import java.util.*;

public class binarySearchIterative {
	
	public static int bsi(ArrayList<Integer> l,int n,int key) {
		int low=0;
		int up=n-1;
		while(low<=up) {
			int mid=(low+up)/2;
			if(key==l.get(mid)) return mid;
			if(key<l.get(mid)) up=mid-1;
			else low=mid+1;
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();

		l.add(3);
		l.add(6);
		l.add(8);
		l.add(12);
		l.add(14);
		l.add(17);
		l.add(25);
		l.add(29);
		l.add(31);
		l.add(36);
		l.add(42);
		l.add(47);
		l.add(53);
		l.add(55);
		l.add(62);
		int i=bsi(l,l.size(),58);
		System.out.println(i);
		
		
	}

}
