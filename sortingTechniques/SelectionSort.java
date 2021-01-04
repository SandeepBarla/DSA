package sortingTechniques;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {5,11,32,6,24,1,89};
		int n=a.length;
		int min,temp;
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					temp=a[j];
					a[j]=a[min];
					a[min]=temp;
				}
			}
		}
		for(int i: a) {
			System.out.print(i+" ");
		}
	}
}
