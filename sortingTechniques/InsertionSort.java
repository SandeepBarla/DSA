package sortingTechniques;

public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {5,11,32,6,24,1,89};
		int n=a.length;
		int j,temp;
		for(int i=1;i<n-1;i++) {
			temp=a[i];
			j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int k:a) {
			System.out.print(k+" ");
		}
	}

}
