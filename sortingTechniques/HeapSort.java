package sortingTechniques;

public class HeapSort {
	
	public static void HS(int a[],int n) { 
		
		int temp;
		for(int i=(n/2)-1;i>=0;i--) {
			heapify(a,n,i);
		}
		for(int i=n-1;i>0;i--) {
			temp=a[i];
			a[i]=a[0];
			a[0]=temp;
			heapify(a,i,0);
		}
	}
	public static void heapify(int a[],int n,int i) {
		int max=i;
		int l=2*i+1;
		int r=(2*i)+2;
		int temp;
		if(l<n && a[l]>a[max]) {
			max=l;
		}
		if(r<n && a[r]>a[max]) {
			max=r;
		}
		if(max!=i) {
			temp=a[max];
			a[max]=a[i];
			a[i]=temp;
			heapify(a,n,max);
		}
	}
	public static void main(String[] args) {
		int a[]= {5,11,32,6,24,1,89};
		int n=a.length;
		HS(a,n);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
