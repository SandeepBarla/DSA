package sortingTechniques;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {5,11,32,6,24,1,89};
		int n=a.length;
		int count,temp;
		for(int i=0;i<n-1;i++) {
			count=0;
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					count=1;
				}
			}
			if(count==0) break;
		}
		for(int k: a) {
			System.out.print(k+" ");
		}
	}
}
