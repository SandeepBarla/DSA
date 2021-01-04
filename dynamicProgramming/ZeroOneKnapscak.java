package dynamicProgramming;
import java.util.*;
public class ZeroOneKnapscak {
	public static void main(String[] args) {
		int p[] = { 0, 1, 2, 5, 6 };
		int wt[] = { 0, 2, 3, 4, 5 };
		int n = 4;
		int m = 8;
		int k[][] = new int[n + 1][m + 1];
		for (int i = 1; i <= 4; i++) {
			for (int w = 0; w <= 8; w++) {
				if(i==0 || w==0) k[i][w]=0;
				else if (wt[i]<=w)
					k[i][w] = Math.max(k[i - 1][w], k[i - 1][w - wt[i]] + p[i]);
				else {
					k[i][w] = k[i - 1][w];
				}
			}
		}
		ArrayList<Integer> l=new ArrayList<>();
		int i = n, j = m;
		while (i > 0 && j >=0) {
			if (k[i][j] == k[i - 1][j]) {
				System.out.println(p[i]+" is not included");
				l.add(0);
				i--;
			} else {
				System.out.println(p[i]+" is included");
				l.add(1);
				j=j-wt[i];
				i--;
			}
		}
		Collections.reverse(l);
		System.out.println(l);
//		i = n;j = m;
//		while(i>=0 || j>=0) {
//			while(k[i][j]==k[i-1][j]) {
//				System.out.println(p[i]+" is not included");
//				i--;
//			}
//			j=j-p[i];
//			System.out.println(p[i]+" is included");
//			i--;
//		}
	}
}
