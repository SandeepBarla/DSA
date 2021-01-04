package binarySearch;

import java.util.ArrayList;

public class binarySearchRecursive {

	public static int bsr(ArrayList<Integer> a,int l,int h,int key) {
		int mid=(l+h)/2;
		if(l==h) {
			if(a.get(mid)==key) return mid;
			else return -1; //when we dont find the key in our list
		}else if(l<h){
			if(key==a.get(mid)) return mid;
			else if(key<a.get(mid)) return bsr(a,l,mid-1,key);
			else return bsr(a,mid+1,h,key);
		}else return -2; //when l>h
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
		int i=bsr(l,0,l.size()-1,628);
		System.out.println(i);
	}
}
