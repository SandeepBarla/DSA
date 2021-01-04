package sortingTechniques;

public class MergeSort {
	public static void merge(int a[],int lb,int mid,int ub) {
		int n1=mid-lb+1;
		int n2=ub-mid;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=a[lb+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=a[mid+1+j];
		}
		int i=0;int j=0;int k=lb;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				a[k]=L[i];
				i++;
			}else {
				a[k]=R[j];
				j++;
			}
			k++;
		}
//		if(i==n1-1) {
//			while(j<n2) {
//				a[k]=R[j];
//				j++;k++;
//			}
//		}else {
//			while(i<n1) {
//				a[k]=L[i];
//				i++;k++;
//			}
//		}
		while(i<n1) {
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=R[j];
			j++;
			k++;
		}
		
		
	}
	public static void MS(int a[],int lb,int ub) {
		if(lb<ub) {
			int mid=(lb+ub)/2;
			MS(a,lb,mid);
			MS(a,mid+1,ub);
			merge(a,lb,mid,ub);
		}
	}
	public static void main(String[] args) {
		int a[]= {5,11,89,6,6,1,89};
		int n=a.length;
		int lb=0;
		int ub=n-1;
		MS(a, lb, ub);
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
