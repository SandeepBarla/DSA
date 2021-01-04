package sortingTechniques;

public class QuickSort {
	public static int pivot(int a[], int lb, int ub) {
		int p = a[lb];
		int start = lb;
		int end = ub;
		int temp, temp1;
		while (start < end) {
			while (a[start] <= p) {
				start++;
			}
			while (a[end] > p) {
				end--;
			}
			if (start < end) {
				temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
		}
		temp1 = a[end];
		a[end] = a[lb];
		a[lb] = temp1;
		return end;

	}

	public static void QS(int a[], int lb, int ub) {
		int mid;
		if (lb < ub) {
			mid = pivot(a, lb, ub);
			QS(a, lb, mid - 1);
			QS(a, mid + 1, ub);
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 11, 32, 6, 5, 32, 89 };
		int n = a.length;
		int lb = 0;
		int ub = n - 1;
		QS(a, lb, ub);
		for (int i : a) {
			System.out.print(i + " ");
		}

	}
}
